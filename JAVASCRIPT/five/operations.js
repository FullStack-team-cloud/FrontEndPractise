function add() {
    event.preventDefault();
    var a=+document.getElementById("fn").value;
    var b=+document.getElementById("sn").value;
    var c= a+b;
    console.log("Result :", c)
    document.getElementById("result").innerHTML=c;
}

function sub() {
    event.preventDefault();
    var a=+document.getElementById("fn").value;
    var b=+document.getElementById("sn").value;
    var c= a-b;
    console.log("Result :", c)
    document.getElementById("result").innerHTML=c;
}

function mul() {
    event.preventDefault();
    var a=+document.getElementById("fn").value;
    var b=+document.getElementById("sn").value;
    var c= a*b;
    console.log("Result :", c)
    document.getElementById("result").innerHTML=c;
}

function div() {
    event.preventDefault();
    var a=+document.getElementById("fn").value;
    var b=+document.getElementById("sn").value;
    var c= a/b;
    console.log("Result :", c)
    document.getElementById("result").innerHTML=c;
}

function res() {
    var c="";
    document.getElementById("result").innerHTML=c;
}