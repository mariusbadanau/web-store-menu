<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
		<title>Pizza Drinks Web Store</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="">
<!--[if ie]><meta content='IE=8' http-equiv='X-UA-Compatible'/><![endif]-->
		<!-- bootstrap -->
		<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">      
		<link href="resources/bootstrap/css/bootstrap-responsive.min.css" rel="stylesheet">		
		<link href="resources/css/bootstrappage.css" rel="stylesheet"/>
		
		<!-- global styles -->
		<link href="resources/css/flexslider.css" rel="stylesheet"/>
		<link href="resources/css/main.css" rel="stylesheet"/>

		<!-- scripts -->
		<script src="resources/js/jquery-1.7.2.min.js"></script>
		<script src="resources/bootstrap/js/bootstrap.min.js"></script>				
		<script src="resources/js/superfish.js"></script>	
		<script src="resources/js/jquery.scrolltotop.js"></script>
		<!--[if lt IE 9]>			
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
			<script src="js/respond.min.js"></script>
		<![endif]-->
</head>
<body>
<div id="top-bar" class="container">
			<div class="row">
				<div class="span12">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="#">My Account</a></li>
							<li><a href="cart">Your Cart</a></li>
							<li><a href="#">Checkout</a></li>					
							<li><a href="#">Login</a></li>		
						</ul>
					</div>
				</div>
			</div>
		</div>
		
		<div id="wrapper" class="container">
			<section class="navbar main-menu">
				<div class="navbar-inner main-menu">				
					<nav id="menu" class="pull-left">
						<ul>
							<li><a href="home">Home</a></li>															
							<li><a href="pizza">Pizza</a></li>	
							<li><a href="drinks">Drinks</a></li>		
							<li><a href="showcart">Show Cart</a></li>							
						</ul>
					</nav>
				</div>
			
			</section>	
			<section class="header_text sub">
			<img class="pageBanner" src="resources/img/699ANY_SK.jpg" alt="" >
			</section>		
					<section class="header_text">
				We stand for top quality products
			</section>
			
			
			<section class="main-content">
				<div class="row">
					<div class="span12">													
						<div class="row">
							<div class="span12">
								<h4 class="title">
									<span class="pull-left"><span class="text"><span class="line">Pizza <strong>Menu</strong></span></span></span>
									<span class="pull-right">
										<a class="left button" href="#myCarousel" data-slide="prev"></a><a class="right button" href="#myCarousel" data-slide="next"></a>
									</span>
								</h4>
								<div id="myCarousel" class="myCarousel carousel slide">
									<div class="carousel-inner">
										<div class="active item">
											<ul class="thumbnails">												
									
	<c:forEach var="item" items = "${message}">
<li class="span3"  style="height:300px;width:250px">
								<div class="product-box">
									<span class="sale_tag"></span>												
								 <img alt="" src="${item.imagePath} "   style="height:200px;width:250px" ><br/>
									<c:out value = "${item.name}"/><br/>
									<c:out value = "${item.price}"/>$<br/>
<button class="btn btn-inverse" type="submit" id="add"><a href="cart/add/${item.id}">Add to cart</a> </button>
</div>
</li>     
</c:forEach>										
											
											</ul>
										</div>
										<div class="item">
											<ul class="thumbnails">
	

<c:forEach var="item" items = "${message}">
<li class="span3"  style="height:300px;width:250px">
								<div class="product-box">
									<span class="sale_tag"></span>												
									 <img alt="" src="${item.imagePath} "    style="height:200px;width:250px" ><br/>
									<c:out value = "${item.name}"/><br/>
									<c:out value = "${item.price}"/>$<br/>
<button class="btn btn-inverse" type="submit" id="add"><a href="cart/${item.id}">Add to cart</a> </button>
</div>
</li>     
</c:forEach>
																																																		
											</ul>
										</div>
									</div>							
								</div>
							</div>						
						</div>
						<br/>
								
					</div>				
				</div>
			</section>
				
					
			<section id="footer-bar">
				<div class="row">
					<div class="span3">
						<h4>Navigation</h4>
						<ul class="nav">
							<li><a href="home">Homepage</a></li>  
							<li><a href="#">About Us</a></li>
							<li><a href="#">Contac Us</a></li>
							<li><a href="#l">Your Cart</a></li>
							<li><a href="#">Login</a></li>							
						</ul>					
					</div>
					<div class="span4">
						<h4>My Account</h4>
						<ul class="nav">
							<li><a href="#">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
					</div>
									
				</div>	
		</section>
			
		</div>
	
		<script src="resources/js/common.js"></script>
		<script src="resources/js/jquery.flexslider-min.js"></script>
		<script type="text/javascript">
			$(function() {
				$(document).ready(function() {
					$('.flexslider').flexslider({
						animation: "fade",
						slideshowSpeed: 4000,
						animationSpeed: 600,
						controlNav: false,
						directionNav: true,
						controlsContainer: ".flex-container" // the container that holds the flexslider
					});
				});
			});
		</script>
		<script>
			$(document).ready(function() {
				$('#add').click(function (e) {
					alert("Your produs waz add.");
				})
			});
		</script>	
		
    </body>
</body>
</html>
