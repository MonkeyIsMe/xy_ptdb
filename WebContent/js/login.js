/**
 * 
 */

$("document").ready(function () {
    $("#alert_login").fadeOut(0);
});

function setAlertText(text) {
    var html_text = text;
    var login_alert = $("div[id='alert_login']");
    login_alert.fadeOut(0);
    login_alert.empty();
    login_alert.html(html_text);
    login_alert.fadeIn(1500);
    login_alert.fadeOut(1000);
}

$("#code-img").click(function () {
    resetCode();
});

function resetCode() {
    var date = new Date();
    $("#code_img").attr("src", "SendCode.action?" + date.toString());
}

$("#submit-btn").click(function(){
	//alert(111);
	login();
});

function login(){
	var account = $("#account").val();
	var password = $("#password").val();
	var login_code = $("#login_code").val();
	if(account.length == 0){
		setAlertText("<strong>提示：</strong>请输入您的账号.");
	}
	else if(password.length == 0){
		setAlertText("<strong>提示：</strong>请输入您的密码.");
	}
	else if(login_code.length == 0){
		setAlertText("<strong>提示：</strong>请输入验证码.");
	}
	else{
		$.post(
			"login.action",
			{
				account:account,
				password:password,
				login_code:login_code,
			},
			function(data){
				data = data.replace(/^\s*/, "").replace(/\s*$/, "");
				if(data == "WrongPassword"){
					$("#account").empty();
					$("#password").empty();
					$("#login_code").empty();
					setAlertText("<strong>提示：</strong>密码错误.");
				}
				else if(data == "LoginSuccess"){
					window.self.location = "PatientInfo.jsp";
				}
				else if(data == "NoAccount"){
					setAlertText("<strong>提示：</strong>账号不存在.");
					$("#account").empty();
					$("#password").empty();
					$("#login_code").empty();
				}
				else{
					$("#account").empty();
					$("#password").empty();
					$("#login_code").empty();
					setAlertText("<strong>提示：</strong>验证码错误.");
				}
			}
		)
	}
}