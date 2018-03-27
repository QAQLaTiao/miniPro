<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html lang="en">
<head>
    <title>WelComd!</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Free HTML5 Website Template by uicookies.com" />
    <meta name="keywords" content="free bootstrap 4, free bootstrap 4 template, free website templates, free html5, free template, free website template, html5, css3, mobile first, responsive" />
    <meta name="author" content="uicookies.com" />

    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="/css/icomoon.css">
    <link rel="stylesheet" href="/css/style.css">
    <sm:insert property="css"></sm:insert>
</head>
<body class="hold-transition skin-blue sidebar-mini">


<nav class="navbar navbar-expand-lg navbar-dark bg-dark probootstrap-navabr-dark">
    <div class="container">
        <a class="navbar-brand" href="index.html">WelCome<br/>${user.name}</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#probootstrap-nav" aria-controls="probootstrap-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="probootstrap-nav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active"><a href="/login" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="about.html" class="nav-link">About</a></li>
                <li class="nav-item"><a href="services.html" class="nav-link">Services</a></li>
                <li class="nav-item"><a href="/QR/main" class="nav-link">QR</a></li>
            </ul>
        </div>
    </div>
</nav>

<sm:insert property="content"></sm:insert>



<footer class="probootstrap-footer probootstrap-bg-dark">
    <div class="container">
        <div class="row mb-5">
            <div class="col-md-5 order-md-2 order-1">
                <div class="probootstrap-footer-widget mb-4">
                    <ul class="probootstrap-footer-social list-unstyled float-md-right float-left">
                        <li><a href="#"><span class="icon-twitter"></span></a></li>
                        <li><a href="#"><span class="icon-facebook"></span></a></li>
                        <li><a href="#"><span class="icon-instagram"></span></a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-7 order-md-1 order-2">
                <p>
                    &copy; Present 2017. All Rights Reserved.
                    <br>
                    Made with
                    <span class="icon-heart">
                    </span>
                    by
                    <a href="https://uicookies.com/">
                        uiCookies
                    </a>
                    Demo Images:
                    <a href="https://unsplash.com/" target="_blank">
                        Unsplash
                    </a>
                </p>
            </div>
        </div>
    </div>
</footer>







<script src="/js/jquery-3.2.1.slim.min.js"></script>
<script src="/js/popper.min.js"></script>
<script src="/js/bootstrap.min.js"></script>

<script src="/js/TweenMax.min.js"></script>
<script src="/js/ScrollMagic.min.js"></script>
<script src="/js/debug.addIndicators.min.js"></script>
<script src="/js/animation.gsap.min.js"></script>

<script src="/js/main.js"></script>
<sm:insert property="js"></sm:insert>
</body>
</html>