<!DOCTYPE html>
<html>
<head>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
</head>
<body>
    <div class="w3-top">
        <div class="w3-bar w3-white w3-wide w3-padding w3-card">
          <a href="#home" class="w3-bar-item w3-button"><b>Thanaphat</b></a>
          <div class="w3-right w3-hide-small">
            <a href="index.html" class="w3-bar-item w3-button">index</a>
            <a href="java.html" class="w3-bar-item w3-button">java</a>
            <a href="api.html" class="w3-bar-item w3-button">api</a>
          </div>
        </div>
    </div>
<header class="w3-container w3-theme w3-padding" id="myHeader">
  <div class="w3-center"><br><br><br>
  <h4>The Document Object</h4>
  <h1 class="w3-xxxlarge w3-animate-bottom">Lab</h1>
</header>
<div class="w3-row-padding w3-center w3-margin-top">
<div class="w3-third">
  <div class="w3-card w3-container" style="min-height:460px"><br><br><br>
    <h2>Login Feature</h2>
    <p>username : admin</p>
    <p>password : P@ssw0rd</p>
    <input type="text" name="username" id="username" placeholder="username"><br><br>
    <input type="password" name="password" id="password" placeholder="password"><br><br>
    <button onclick="login()">Log in</button>
    <button onclick="resetLogin()">Reset</button>
    <p id="demo3">Status</p>
  </div>
</div>
<div class="w3-third">
  <div class="w3-card w3-container" style="min-height:460px"><br><br><br>
  <h2>Say Hello</h2><br><br><br>
  <input type="text" name="Name" id="Name" placeholder="Enter Your Name"><br><br><br>
  <button onclick="sayHello()">Submit</button>
  <button onclick="resetHello()">Reset</button><br><br>
  <p id="demo2">Result</p>
  </div>
</div>
<div class="w3-third">
  <div class="w3-card w3-container" style="min-height:460px"><br><br><br>
  <h2>Fahrenheit To Celsius</h2><br><br><br>
  <input type="number" name="fahrenheitInput" id="fahrenheitInput" placeholder="Enter temperature"><br><br>
  <button onclick="convertTemperature()">Submit</button>
  <button onclick="resetFahrenheit()">Reset</button><br><br>
  <p id="demo7">Result</p>
  </div>
</div>
</div>

<div class="w3-container">
<hr>
<div class="w3-center w3-row">
  <h2>Days to Second</h2>
  <div class="w3-blue-gray"><br>
    <input type="number" name="daysInput" id="daysInput" min="0" placeholder="Enter Days"><br><br>
    <button onclick="DaysToSecond()">Submit</button>
    <button onclick="resetInput()">Reset</button>
    <p id="demo6">Result</p>
  </div>
</div>
<hr>
<div class="w3-center">
  <h2>Click To Change</h2>
  <p id="demo">Change Text</p>
  <button onclick="myFunction()">Change</button>
  <button onclick="resetFunction()">Reset</button>
</div>
<br>
<footer class="w3-container w3-theme-dark w3-padding-16">
  <h3>Footer</h3>
  <p>Powered by <a href="https://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
  <div style="position:relative;bottom:55px;" class="w3-tooltip w3-right">
    <span class="w3-text w3-theme-light w3-padding">Go To Top</span>    
    <a class="w3-text-white" href="#myHeader"><span class="w3-xlarge">
    <i class="fa fa-chevron-circle-up"></i></span></a>
  </div>
  <p>Remember to check out our  <a href="w3css_references.asp" class="w3-btn w3-theme-light" target="_blank">W3.CSS Reference</a></p>
</footer>
<script>
  function login() {
    let usernameInput = document.getElementById("username");
    let passwordInput = document.getElementById("password");
    let demo3 = document.getElementById("demo3");

    let username = usernameInput.value;
    let password = passwordInput.value;

    if (username === 'admin' && password === 'P@ssw0rd') {
        demo3.innerHTML = "Login Successful";
    } else {
        demo3.innerHTML = "Invalid Username or Password";
    }
}
function resetLogin() {
    document.getElementById("username").value = "";
    document.getElementById("password").value = "";
    document.getElementById("demo3").innerHTML = "Status";
}
function sayHello() {
    let NameInput = document.getElementById("Name");
    let demo2 = document.getElementById("demo2");
    let name = NameInput.value;
    demo2.innerHTML = ('Hello, ' + name);
}
function resetHello() {
    document.getElementById("Name").value = "";
    document.getElementById("demo2").innerHTML = "Result";
}
function DaysToSecond() {
    let daysInput = document.getElementById("daysInput");
    let demo6 = document.getElementById("demo6");
    document.getElementById("demo6").innerHTML = "Days To Second";
    const daysToSeconds = (days) => {
        const secondsInMinute = 60;
        const minutesInHour = 60;
        const hoursInDay = 24;
        const seconds = days * hoursInDay * minutesInHour * secondsInMinute;
        return seconds;
    }
    let days = parseFloat(daysInput.value);
    if (!isNaN(days)) {
        const result = daysToSeconds(days);
        demo6.innerHTML = `${days} วัน = ${result} วินาที`;
    } else {
        demo6.innerHTML = "กรุณาใส่จำนวนวันที่ถูกต้อง";
    }
}
function resetInput() {
    document.getElementById("daysInput").value = "";
    document.getElementById("demo6").innerHTML = "Result";
}
function FahrenheitToCelsius(fahrenheit) {
    const celsius = (fahrenheit - 32) * (5 / 9);
    return celsius;
}
function convertTemperature() {
    let fahrenheitInput = document.getElementById("fahrenheitInput");
    let demo7 = document.getElementById("demo7");
    let temperatureF = parseFloat(fahrenheitInput.value);
    if (!isNaN(temperatureF)) {
        let temperatureC = FahrenheitToCelsius(temperatureF);
        demo7.innerHTML = `${temperatureF} Fahrenheit = ${temperatureC.toFixed(2)} Celsius`;
    } else {
        demo7.innerHTML = "Please enter a valid Fahrenheit temperature";
    }
}
function resetFahrenheit() {
    document.getElementById("fahrenheitInput").value = "";
    document.getElementById("demo7").innerHTML = "Result";
}
function myFunction() {
    document.getElementById("demo").innerHTML = "Hello MySite Final";
}
function resetFunction() {
    document.getElementById("demo").innerHTML = "Change Text";
}
</script>
</body>
</html>
