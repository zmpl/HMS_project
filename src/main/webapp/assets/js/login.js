(function() {
    'use strict';
    window.addEventListener('load', function() {
        let forms = document.getElementsByClassName('needs-validation');
        let validation = Array.prototype.filter.call(forms, function(form) {
            form.addEventListener('submit', function(event) {
                if (form.checkValidity() === false) {
                    event.preventDefault();
                    event.stopPropagation();
                    form.classList.add('was-validated');
                }else{
                    event.preventDefault();
                    event.stopPropagation();
                }
            },false);
        });
    }, false);
})();
$("#input_submit").on('click',function () {
    let user_account=$("#user_account");
    let user_password=$("#user_password");
    let login_data={'user_account':$(user_account).val(),'user_password':$(user_password).val()};
    let btn_confirm=$(".modal-footer>button");
    $.ajax({
        type:'post',
        url:'http://localhost:2333/user?login',
        contentType:'application/x-www-form-urlencoded',
        data:login_data,
        dataType:'json',
        success:function (data) {
            let login_flag=data;
            console.log("login_flag:"+login_flag)
            if((login_flag === false)){
                $("#login_fail").click();
                $(btn_confirm).on('click',function () {
                    $(user_password).val('');
                })
            }else{
                location.href='http://localhost:2333/back/index.jsp';
            }
        },
        error:function () {
            console.log("请求失败")
        }
    });
})