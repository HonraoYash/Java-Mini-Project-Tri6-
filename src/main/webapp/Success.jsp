<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operation Successful</title>
<style>
body  {
     background-image: url("piggy2.jpg");
     background-color: #FFFFE0;
     background-size: 100%;
     background-repeat: no-repeat;
     background-position: center center;
   }
  .grid-container{
    display:grid;
    justify-content:center;
    align-items:space between;
    margin-top:300px;
  }
  .container
  {
   width:70%;
   display:grid;
   justify-content: center;
   align-items:center;
   border: 2px solid red;
   margin:0px 20px 10px 20px;
   padding:0px 20px 10px 20px;
  }
 .box{
   border: 15px green;
 }
 
</style>
</head>
<body>
   <div class="grid-container">
    <div class="container"><h1>Success!</h1></div>
    
    
    <div class="container">
    <button type="button" onclick=""> <a href="http://localhost:8080/Piggy_Bank/Home.jsp"><- Home</a></button>
    </div>
    </div>
</body>
</html>