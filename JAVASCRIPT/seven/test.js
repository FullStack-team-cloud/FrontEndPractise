function hiThere() {
    document.write("This is button onclick even and calling hiThere function");
    alert('Hi there!');
}

function submit1(){
event.preventDefault();
var a = +document.getElementById("number1").value;
// console.log(typeof(a));
var b = parseInt(document.getElementById("number2").value);
// console.log(typeof(b));
var c = (isNaN(a) ? 0 : parseInt(a)) +  (isNaN(b) ? 0 : parseInt(b));
console.log("Result is :" +c);
document.getElementById("screen1").innerHTML=c;
}
