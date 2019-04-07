function update_customer() {
    var login = $("#exampleInputEmail1").val();
    var password = $("#exampleInputPassword1").val();
    var name = $("#exampleTextarea1").val();
    var Place = $("#exampleTextarea2").val();

    var data = {
        login: login,
        password: password,
        fio: name,
        place: Place
    };

    $.ajax({
        url: '/customers',
        type: 'POST',
        data: JSON.stringify(data),
        contentType:"application/json; charset=utf-8",
        dataType:"json",
        complete: function (result) {
            window.open(result.responseText, "_self");
        }
    });



    var workPlace = $("#exampleTextarea3").val();
    var concreteWorkPlace = $("#concretePlace_TextArea").val();
    var date = $("#exampleTextarea5").val();
    var pay = $("#exampleTextarea6").val();

    data = {
        place: workPlace,
        date: new Date(),
        pay: pay,
        Place: Place,
        customerLogin: login,
        description: "Дескрипшен"
    };

    $.ajax({
        url: '/tenders',
        type: 'POST',
        data: JSON.stringify(data),
        contentType:"application/json; charset=utf-8",
        dataType:"json",
        complete: function (result) {
            window.open(result.responseText, "_self");
        }
    });
}