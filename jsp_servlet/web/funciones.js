$(document).ready(()=>{
    $("#nav a").each(()=>{
       let href = $(this).attr("href");  
       $(this).attr("");
    });
});

