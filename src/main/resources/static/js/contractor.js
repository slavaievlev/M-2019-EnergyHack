function about(id) {
    window.open("/tender-info?id=" + id, "_self");
}

function update_contractor() {
    var login = $("#exampleInputEmail1").val();
    var password = $("#exampleInputPassword1").val();
    var person = $("#exampleTextarea").val();
    var technical = $("#exampleTextarea1").val();
    var experience = $("#exampleTextarea2").val();

    var data = {
        personsAndTrainingAbout: person,
        technicalAbout: technical,
        login: login,
        password: password
    };

    $.ajax({
        url: '/contractors',
        type: 'POST',
        data: JSON.stringify(data),
        contentType:"application/json; charset=utf-8",
        dataType:"json",
        complete: function (result) {
            window.open(result.responseText, "_self");
        }
    });
}