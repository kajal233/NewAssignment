<html>
<head>
<title>
This is simple data base example in JSP</title>
</title>
</head>
<body bgcolor="yellow">
<%!String uname,pwd;%>

uname=request.getParameter("user");
pwd=request.getParameter("pwd");
  try
{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection con=DriverManager.getConnection("jdbc:oracle:thin:@195.100.101.158:1521:CCLAB","scott","tiger");
  Statement st=con.createStatement();
  ResultSet rs=st.executeQuery("select name,password from personal where name='"+uname+"' and password='"+pwd+"'");
  if(rs.next())
{
out.println("Authorized person");
}
else
{
out.println("UnAuthorized person");
}
con.close();
}
catch(Exception e){out.println(""+e);}
%>
</body>
</html>