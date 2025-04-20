<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "piggy_bank";
String userId = "root";
String password = "Lienel@4858";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>

<style>
body  {
     background-image: url("piggybalance.jpg");
     background-color: #FFFFE0;
     background-size: 100%;
     background-repeat: no-repeat;
     background-position: center center;
   }
  .grid-container{
    display:flex;
    justify-content:flex-start;
    align-items:space between;
    margin-top:100px;
    flex-direction:column;
  }
  .container
  {
   width:40%;
   display:grid;
   justify-content: center;
   align-items:center;
   border: 2px solid red;
   margin:0px 20px 10px 20px;
   padding:0px 20px 10px 20px;
  }
   .container2
  {
   width:43%;
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

<body>
<div class="grid-container">
<h2 align="center" class="container"><font color="#8B0000"><strong>Balance:</strong></font></h2>
<table align="center" cellpadding="10" cellspacing="10" class="container2">
<tr>

</tr>
<tr bgcolor="#FF1493">
<td><b>Account number</b></td>
<td><b>Balance</b></td>
</tr>
<%
try {
connection = DriverManager.getConnection(
connectionUrl + dbName, userId, password);
statement = connection.createStatement();
String sql = "SELECT * FROM balance";

resultSet = statement.executeQuery(sql);
while (resultSet.next()) {
%>
<tr bgcolor="#FFEFD5">

<td><%=resultSet.getInt("accountnumber")%></td>
<td><%=resultSet.getInt("balance")%></td>

</tr>

<%
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>

    <div class="container">
    <button type="button" onclick=""> <a href="http://localhost:8080/Piggy_Bank/Home.jsp"><- Home</a></button>
    </div>


</div>
</body>