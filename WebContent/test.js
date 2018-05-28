/*入力判定アラート*/
window.onload = function() {

    document.getElementById("trueFalse").onclick = function() {
        //useridテキストボックスの値を取得
        var userId = document.getElementById("userId").value;
        //passwordテキストボックスの値を取得
        var passWord = document.getElementById("passWord").value;
        //一致した場合
        if (userId == "userid" && passWord == "password") {
            alert('あたり!');
        } else if (userId == "" || passWord == "") { //空の場合
            alert('入力してね');
        } else {
            alert('違うよ');
        }
        ;

    };

};
