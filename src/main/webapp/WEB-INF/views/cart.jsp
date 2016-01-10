    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="en">
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
	</head>
    <body>		
		<div id="top-bar" class="container">
			<div class="row">
				<div class="span12">
					<div class="account pull-right">
						<ul class="user-menu">				
							<li><a href="#">My Account</a></li>
							<li><a href="showcart">Your Cart</a></li>
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
				<h4><span>Shopping Cart</span></h4>
			</section>
			<section class="main-content">				
				<div class="row">
					<div class="span9">					
						<h4 class="title"><span class="text"><strong>Your</strong> Cart</span></h4>
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Remove</th>
									<th>Image</th>
									<th>Product Name</th>
									<th>Quantity</th>
									<th>Unit Price</th>
									<th>Total</th>
								
								</tr>
							</thead>
							<tbody>
									<c:forEach var="item" items = "${message}">
									<script>
									var total = "${item.qty}" * "${item.price}"
									$('#td1').html(total);
									</script> 
								<tr>
							
									<td><button class="btn btn-inverse" type="submit" ><a href="deleteItem/${item.id}">Delete</a></button></td>
									<td><img  src=<c:out value = "${item.imagePath}" /> alt="pre mica" width="150" height="100"></td>
									<td><c:out value = "${item.name}"/></td>
									<td><c:out value = "${item.qty}"/></td>
									<td><c:out value = "${item.price}"/></td>
									<td><c:out value = "${item.qty} * ${item.price}" />
									
									</td>
									
								</tr>			  
							</c:forEach>
								<tr>
									
								<tr>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td>&nbsp;</td>
									<td><strong>Total = ${totalPrice}</strong></td>
								</tr>		  
							</tbody>
						</table>
						<hr/>
						<p class="buttons center">				
							<button class="btn" type="button">Continue</button>
							<button class="btn btn-inverse" type="submit" id="checkout">Checkout</button>
						</p>					
					</div>
					
				</div>
			</section>			
			<section id="footer-bar">
				<div class="row">
					<div class="span3">
						<h4>Navigation</h4>
						<ul class="nav">
							<li><a href="./index.html">Homepage</a></li>  
							<li><a href="./about.html">About Us</a></li>
							<li><a href="./contact.html">Contac Us</a></li>
							<li><a href="./cart.html">Your Cart</a></li>
							<li><a href="./register.html">Login</a></li>							
						</ul>					
					</div>
					<div class="span4">
						<h4>My Account</h4>
						<ul class="nav">
							<li><a href="#">My Account</a></li>
							<li><a href="#">Order History</a></li>
							<li><a href="#">Wish List</a></li>
							<li><a href="#">Newsletter</a></li>
						</ul>
					</div>
									
				</div>	
			</section>
			
		</div>
		<script src="themes/js/common.js"></script>
		<script>
		$(document).ready(function() {
			$('#checkout').click(function (e) {
				
				if ("${checkOrder}" == 1 )
					{
					window.confirm("You have placed your order successufily");
					document.location.href = "placeOrder";					
					
					}
				else{
					
					alert("You havent reached the minimum value order.");
				}
			
			})
		});
		</script>	
		
    </body>
</html>