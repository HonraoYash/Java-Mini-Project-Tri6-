<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Piggy_Bank/Login&Register</title>
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
    margin-top:60px;
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
 
 ul{
list-stylr-type: none;
margin:0;
padding: 0;
overflow: hidden;
background-color:#FFE4C4;
}

li{
float:right;
}

li a{
display:block;
color:black;
text-align: center;
padding: 10px;
text-decoration: none;
}

li a:hover{
backgroung-color:yellow;
}
 
</style>
</head>
<body>

<header style="height:5px;">
		
	<!-- Top header menu containing
		logo and Navigation bar -->
	<div id="top-header">
				
		<!-- Navigation Menu -->
		<nav>
			<ul>
				<!-- Image menu in Header to contain an Image and
		                a sample text over that image -->
		
                        <div id="logo">
			<img src="pigg1.png"  width = "50" height = "50" align = "left">
		        </div>
				<li><a href="AboutUs.jsp">About Us</a></li>
			
			</ul>
		</nav>
	</div>



	</div>
</header>

         <div class="grid-container">
          <h1 class="container"> <font color="#8B0000">Welcome to the Piggy Bank !!!</font> </h1> 
          
          <div class="container"> 
            <h3><font color="#FF1493">Login</font></h3> 
          <%
           String p=(String)request.getAttribute("errlist");
          %>
          <font color="red"> <%=p %></font>
          <% 
          
          %>
               
          <form action="Login">
              Enter your registered Username:  <input type="text" name="uname"> <br>
              Enter Password:<br> <input type="password" name="pass"> <br>
              <div style="justify-content:center"> <input type="submit" value="Login" ></div>
          
          </form>
          </div>
 
          <br>
        
          <div class="container">
          <h3><font color="#FF1493">Register</font></h3> 
          
          <form action="Register">
               Enter your First Name: <input type="text" name="fname"> <br>
               Enter your Last Name: <input type="text" name="lname"> <br>
               Enter your Mobile Number: <input type="text" name="mob"> <br>
               Enter your Account Number: <input type="text" name="acnt"> <br>
               Enter Username: <input type="text" name="uname"> <br>
               Set Password: <input type="password" name="pass"> <br>
               <div style="justify-content:center"> <input type="submit" value="Register" ></div>
          </form>
          </div>
          
          </div>
</body>
</html>