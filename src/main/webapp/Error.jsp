<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error</title>
<style>
body  {
     background-image: url("sadpig.jpg");
     background-color: #000000;
     background-size: auto-fit;
     background-repeat: no-repeat;
     background-position: top center;
     background-margin:100px;
   }
  .grid-container{
    display:grid;
    flex-direction:column;
    justify-content:center;
    align-items:space between;
    align-itself:center;
    margin-top:300px;
    margin-left:-400px;
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
   <h1 class="container"> <font color="red">Error :(</font></h1>
    
    <button type="button" onclick="" > <a href="http://localhost:8080/Piggy_Bank/Home.jsp">Try Again?</a></button>
</div>
</body>
</html>