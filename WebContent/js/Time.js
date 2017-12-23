/**
 * Created by atlantis0617 on 2016/9/4.
 */
$(function(){
    $("#time").append(getNowFormatDate());
});
function getNowFormatDate() {
    var date = new Date();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    var a = new Array("日", "一", "二", "三", "四", "五", "六");
    var week =date.getDay();
    var strweek = "星期"
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + "年" + month + "月" + strDate
        + "日" +"   " +strweek+a[week];
    return currentdate;
}
