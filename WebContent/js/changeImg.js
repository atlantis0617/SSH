/**
 * Created by atlantis0617 on 2016/9/4.
 */
var count = 4;
$(function change(){
    if(count>0){
        $("#show").html("<img src='img/"+count+".png'/>");
        count--;
        setTimeout(change,2000);
    }
    else{
        count=4;
        change();
    }
});
