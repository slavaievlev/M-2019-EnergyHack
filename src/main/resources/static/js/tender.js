function addsubscribe(tenderid) {
    var login = "dwa";   //TODO

    var data = {
        contractorLogin: login,
        tenderId: tenderid
    };

    $.ajax({
        url: '/tenders/subscribe',
        type: 'POST',
        data: JSON.stringify(data),
        contentType:"application/json; charset=utf-8",
        dataType:"json",
        complete: function (result) {
            window.open(result.responseText, "_self");
        }
    });
}