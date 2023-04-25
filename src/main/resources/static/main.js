window.onload = function() {
    $(".like").click((e) => {
        var btn = $(e.currentTarget);
        var postId = btn.attr("data-post-id");
        btn.attr("disabled", "disabled");
        $.ajax({
            url: "/delete/" + postId,
            type: "DELETE",
            success: (data) => {
                btn.text("" + data + "❌");
                btn.removeClass("btn-secondary");
                btn.addClass("btn-danger");
            }
        });
    });
};