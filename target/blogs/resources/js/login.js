function login() {
    var sendData = {
        account:$("#account").val(),
        password:$("#password").val()
    }
    $.ajax({
        url: '/blogs/user/login',
        type:'post',
        data:sendData,
        dataType:'json',
        success:function (data) {
            console.log(data);
            if(data.success==false) {
                $("#pop-up").show();
                $("#overlay").show();
                $("#message").html(data.error);
            }
        }
        
    });
}

function closePopUp() {
    $("#pop-up").hide()
    $("#overlay").hide();
}