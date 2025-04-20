
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Piggy_Bank/Home</title>
<style>
body  {
     background-image: url("piggyhome.jpg");
     background-color: #FFFFE0;
     background-size: 100%;
     background-repeat: no-repeat;
     background-position: center center;
   }
  .grid-container{
    display:grid;
    justify-content:center;
    align-items:space between;
    margin-top:40px;
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
  <div class="grid-container" >
    <font color="#8B0000"><h1 class="container">Welcome to Piggy Bank online services !</h1> </font> 
     
     <div class="container"> 
     <h3 >Cash Deposit</h3>
     <form action="CashDeposit">
              Enter your Account number : <input type="text" name="acnt"> <br>
              Enter Cash you want to Deposit : <input type="text" name="cash"> <br>
              Enter your Password : <input type="password" name="pass"> <br>
              <input type="submit" value="Deposit" >
     </form> 
     </div>
     
     <div class="container"> 
     <h3>View Balance</h3>
     <form action="Balance">
              Enter your Account number : <input type="text" name="acnt"> <br>
              Enter your Password : <input type="password" name="pass"> <br>
              <input type="submit" value="Check Balance" onclick="http://localhost:8080/Piggy_Bank/ViewBalance.jsp" >
     </form>
     </div>
     
     <div class="container"> 
     <h3>Transfer Money </h3>
       <form action="Transfer">
              Enter your Account number : <input type="text" name="acnt"> <br>
              Enter Cash you want to Transfer : <input type="text" name="cash"> <br>
              Enter Beneficiary account Number : <input type="text" name="acnt2"> <br>
              Enter your Password : <input type="password" name="pass"> <br>
              <input type="submit" value="Transfer" >
     </form> 
     </div>
     
      </div>
</body>
</html>