<%--
  Created by IntelliJ IDEA.
  User: Fatemeh
  Date: 11/21/2018
  Time: 5:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <!--<title>RESERVING CLASS SYSTEM</title>-->
    <title>LOGIN</title>
    <link href="login_css.css" rel="stylesheet">
    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/business-casual.css" rel="stylesheet">

    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Slab:100,300,400,600,700,100italic,300italic,400italic,600italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>


    <![endif]-->

  </head>
  <body>
  $END$
  <b>hello</b>
  <div class="container">

    <div class="row">
      <div class="box">
        <div class="col-lg-12 text-center">
          <div class="container">
            <div class="login-container">
              <div id="output"></div>
              <div class="avatar"></div>

              <div class="form-box">
                <form action="../loginServlet" method="post">
                  <input name="username" type="text" placeholder="username">
                  <input name="password" type="password" placeholder="password">
                  <button class="btn btn-info btn-block login" type="submit">Login</button>
                </form>

              </div>
            </div>

          </div>
        </div>
      </div>
    </div>
  </div>
  </body>
</html>
