function signin() {
    var login = $("#inputLogin").val();
    var password = $("#inputPassword").val();

    var data = {
        login: login,
        password: password
    };

    $.ajax({
        url: '/auth/login',
        type: 'POST',
        data: JSON.stringify(data),
        contentType:"application/json; charset=utf-8",
        dataType:"json",
        complete: function (result) {
            window.open(result.responseText, "_self");
        }
    });
}