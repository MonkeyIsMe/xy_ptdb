package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.FactorDAO;
import com.csu.dao.ReferenceDAO;
import com.csu.dao.ScaleDAO;
import com.csu.dao.impl.FactorDAOImpl;
import com.csu.dao.impl.ReferenceDAOImpl;
import com.csu.dao.impl.ScaleDAOImpl;
import com.csu.entity.Factor;
import com.csu.entity.Reference;
import com.csu.entity.ScaleItem;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport{
	
	public String SendReport() {
		HttpServletRequest request= ServletActionContext.getRequest();
		//获取每道题的分数
		String score = request.getParameter("score");
		//System.out.println(score);
		//System.out.println(score.length());
		//记录每一题的得分
		int [] cal = new int [score.length()];
		//记录总得分
		int ans = 0;
		for(int i = 0 ;i<score.length() ; i++) {
			int val = score.charAt(i) - '0';
			cal[i] = val;
			ans += val;
		}
		//System.out.println(cal.length);
		
		//获取题目编号
		HttpServletRequest reqeust = ServletActionContext.getRequest();
		HttpSession session  = reqeust.getSession();
		String scale_id = (String) session.getAttribute("scale_id");
		String patientId = (String) session.getAttribute("use_id");
		int scale = Integer.parseInt(scale_id);
		System.out.println(patientId);
		//获取题目总集合
		ScaleDAO sd = new ScaleDAOImpl();
		List<ScaleItem> list = sd.queryScaleItemByOrder(scale);
		int scale_size = list.size();
		
		//查询结论综合
		FactorDAO fd = new FactorDAOImpl();
		List<Factor> fa = fd.getFactorsBySid(scale);
		int factor_size = fa.size();
		int [] val = new int [factor_size];
		int cnt = 0;
		
		//提取因子总和
		int [] fac = new int [scale_size];
		int t = 0;
		ScaleItem item = list.get(0);
		fac[t] =  item.getI_Factor();
		
		for(int i = 1; i < scale_size ; i++) {
			boolean flag = true;
			for(int j = 0; j < t ; j++) {
				if(list.get(i).getI_Factor() == fac[j]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				//t++;
				fac[t++] = list.get(i).getI_Factor();
			}
		}
		//System.out.println(scale_size);
		//System.out.println(t);
		//提取每一个题目
		int f = fac[0];
		List<ScaleItem> first =sd.queryScaleItemByFactor(scale, f);
		int f_id = first.get(0).getI_ID();
		System.out.println(f_id);
		for(int i = 0 ;i < t ;i++) {
			int i_factor = fac[i];
			//System.out.println("1."+i+" "+t);
			List<ScaleItem> fac_scale =sd.queryScaleItemByFactor(scale, i_factor);
			for(int j = 0 ; j < fac_scale.size() ;j++) {
				//System.out.println("2."+i+" "+j);
				ScaleItem fac_item = fac_scale.get(j);
				int id = fac_item.getI_ID();
				//System.out.println(id+"   "+cnt+"  "+(id-5));
				val[cnt] += cal[(id-f_id)];
				}
			cnt++;
			}
		//System.out.println(cnt);
		/*for(int i = 0 ; i < cnt ;i++) {
			System.out.println(val[i]+" "+cnt);
		}*/
		
		String comments = "指导意见<br>";
		for(int i = 0 ; i < cnt ; i++) {
			//System.out.println(i);
			int f_num = i + 1;
			ReferenceDAO rd = new ReferenceDAOImpl();
			List<Reference> refer_list = rd.getRefer(scale, f_num);
			List<Factor> factor_list = fd.getFactor(scale, f_num);
			comments += f_num;
			comments += ".";
			comments += "内容：  ";
			comments += factor_list.get(0).getF_Content();
			comments += "<br>";
			comments += "说明：  ";
			comments += factor_list.get(0).getF_Info();
			comments += "<br>";
			comments += "得分：  ";
			comments += val[i];
			comments += "<br>";
			for(int j = 0 ; j < refer_list.size() ; j++) {
				Reference refer = refer_list.get(j);
				//System.out.println(refer.getR_Score2() + " " + refer.getR_Score1() +" "+ val[i]);
				if(val[i] <= refer.getR_Score2() && val[i] >= refer.getR_Score1()) {
					//System.out.println(222);
					comments += "建议意见：";
					comments += refer.getR_Suggestion();
					comments += "<br>";
					break;
				}
			}
		}
		comments += "总分：";
		comments += ans;
		session.setAttribute("comments", comments);
		session.setAttribute("s_id", scale_id);
		session.setAttribute("p_id", patientId);
		
		PrintWriter out = null;
		try {
			out = ServletActionContext.getResponse().getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("success");
		out.flush(); 
        out.close(); 
		//System.out.println(comments);
		//System.out.println(111);
		return null;
	}
	
}
