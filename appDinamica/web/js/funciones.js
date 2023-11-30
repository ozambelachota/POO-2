$(document).ready(function () {
    $("#nav a").each(function () {
        var href = $(this).attr("href");
        $(this).attr({href: "#"});
        $(this).click(function () {
            $("#show").html('<iframe src="' + href + '" \n\
            style="width:800px; height:700px; \n\
            border:none;"></iframe> ');
        });
    });
});


