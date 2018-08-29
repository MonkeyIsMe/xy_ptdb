package com.csu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.FactorDAO;
import com.csu.dao.ScaleDAO;
import com.csu.dao.impl.FactorDAOImpl;
import com.csu.dao.impl.ScaleDAOImpl;
import com.csu.entity.Factor;
import com.csu.entity.ScaleItem;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport{
	
	public void SendReport() {
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
		HttpServletRequest reqeust= ServletActionContext.getRequest();
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session  = req.getSession();
		String scale_id = (String) session.getAttribute("scale_id");
		int scale = Integer.parseInt(scale_id);
		
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
		for(int i = 0 ;i < t ;i++) {
			int i_factor = fac[i];
			//System.out.println("1."+i+" "+t);
			List<ScaleItem> fac_scale =sd.queryScaleItemByFactor(scale, i_factor);
			for(int j = 0 ; j < fac_scale.size() ;j++) {
				//System.out.println("2."+i+" "+j);
				ScaleItem fac_item = fac_scale.get(j);
				int id = fac_item.getI_ID();
				//System.out.println(id+"   "+cnt+"  "+(id-5));
				val[cnt] += cal[(id-5)];
				}
			cnt++;
			}
		//System.out.println(cnt);
		for(int i = 0 ; i < cnt ;i++) {
			System.out.println(val[i]+" "+cnt);
		}
	}
	
}
