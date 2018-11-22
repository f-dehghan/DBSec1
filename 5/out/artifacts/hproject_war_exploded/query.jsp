<%@ page import="model.users" %><%--
  Created by IntelliJ IDEA.
  User: Fatemeh
  Date: 11/21/2018
  Time: 5:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>quenry page</title>
</head>
<body>
    <%
        if (session.getAttribute("user")!=null ){
            users u1 = (users) session.getAttribute("user") ;
            String usrname=u1.getUsername();

            System.out.println(usrname);
        %>
        <p>welcome            <%=usrname%></p>
        <p>
            <form action="/../queryServlet" method="post">
                <textarea rows="5" cols="50" name="query"  onfocus="this.value=''">Enter your query here...</textarea>
                <button class="btn btn-info btn-block login" type="submit">execute</button>
            </form>


        </p>
    <%}%>

</body>
</html>
