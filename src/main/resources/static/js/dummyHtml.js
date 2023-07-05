window.onload = function () {
    dummy.init();
};

const dummy = {
    init: function () {
        dummy.eventBinding();
    },
    eventBinding: function () {
        const btn = document.getElementById("dummyBtn");
        btn.addEventListener("click", dummy.getDummy);
    },
    getDummy: function () {
        const category = document.getElementById("category").value;

        $.ajax(`/dummy/get/${category}`, {
            type: 'GET',
            dataType: 'json'
        }).done(function (data) {
            const dummyStr = JSON.stringify(data);
            document.getElementById("dummyDiv").textContent = dummyStr;
        }).fail(function (error) {
            alert(JSON.stringify(error));

        });
    },
}