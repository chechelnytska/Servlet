
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/bg.png">

    <title>Магазин еко-продуктів</title>

    <style>
        <%@include file="сss/bootstrap.min.css"%>
        <%@include file="сss/cover.css" %>
        <%@include file="сss/ie10-viewport-bug-workaround.css" %>
        <%@include file="js/bootstrap.min.js" %>
    </style>

</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">CHECHE маркет</h3>
                    <nav>
                        <ul class="nav masthead-nav">
                            <li class="active"><a href="#">Продукти</a></li>
                            <li><a href="#">Послуги</a></li>
                            <li><a href="#">Кошик</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
                <form class="form-signin" action="/login" method="POST">
                    <h2 class="form-signin-heading">Зареєструйтесь, будь ласка</h2>
                    <label for="inputName" class="sr-only" >Name</label>
                    <input type="text" id="inputName" class="form-control" placeholder="Name" name="userName">
                    <p>.</p>
                    <label for="inputEmail" class="sr-only" >Електронна пошта плииз</label>
                    <input type="email" id="inputEmail" class="form-control" placeholder="Email address" name="email" required autofocus>
                    <p>.</p>
                    <label for="inputPassword" class="sr-only">Парольчик</label>
                    <input type="password" id="inputPassword" class="form-control" placeholder="Password" name="password" required>
                    <div class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me"> Пам’ятай мене!
                        </label>
                    </div>
                    <button class="btn btn-lg btn-primary btn-block" type="submit">Pеєстрація</button>
                </form>
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>Сторінка розроблена <a href="https://vk.com/chechelnytska">Марінкою</a>.</p>
                </div>
            </div>

        </div>

    </div>

</div>


<script src="js/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="js/bootstrap.min.js"></script>

<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
