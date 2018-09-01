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