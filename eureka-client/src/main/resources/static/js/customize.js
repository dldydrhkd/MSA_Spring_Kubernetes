function loadDoc(){
    const xhttp = new XMLHttpRequest();
    xhttp.onload = function(){
        var data = this.responseText;
        return data;
    }
    xhttp.open("GET", "hello", true);
    xhttp.send();
}