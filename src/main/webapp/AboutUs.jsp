<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us</title>
 <link rel="stylesheet" type="text/css" href="Style.css">
 <style>
   body  {
     background-image: url("piggy2.jpg");
     background-color: #FFFFE0;
     background-size: 100%;
     background-repeat: no-repeat;
     background-position: center center;
   }
  .grid-container{
    display:flex;
    justify-content:center;
    align-items:space between;
    margin-top:60px;
    margin-left:300px;
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
    <div class="about">
        <div class="inner-section">
        
        <div class="container"><font color="green"><h1>About Us..</h1></font></div>
            
            <div class="container">
            <p class="text">
               "Piggy Bank" is onestyle="color:blue" of the leading private sector Bank with presence acorss the Country.
               <br>
                    <p>At Piggy Bank,<br> 
                    we believe in giving back to the society we live in. Thorugh the CSR initiatives,
               the bank takes consistent strides in ensuring sustainable development for the making society it socially,
               culturlly and economically empowered.
               <br>
               <br>
               Founder : Mr. Yash Honrao<br>
	       Co-founder: Ms. Namira Mulla<br>
               Manager: Ms. Chhavi Mandowara<br>
	       Associative: Manager: Raunak Nair<br>
            </p>
            </div>
            
            <div class="container">
            <div class="skills">
              <font color="red">
                 Contact Us: 
              </font>
                      <br>
                          <p style="text-align:left;"><a href = "mailto: namiramulla1103@gmail.com">Send Email</a></p>
            </div>
            </div>
        </div>
    </div>
    </div>
</body>
</html>