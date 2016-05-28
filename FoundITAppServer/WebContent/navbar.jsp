<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="navbar">
<nav class="navbar-default navbar-fixed-top">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <a class="navbar-brand" href="#">FoundIT App</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
      <!--
        <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
        <li><a href="#">Link</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Dropdown <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="#">Action</a></li>
            <li><a href="#">Another action</a></li>
            <li><a href="#">Something else here</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">Separated link</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="#">One more separated link</a></li>
          </ul>
        </li>
        -->
        <%
        //For candidates
        if(session.getAttribute("role") != null && session.getAttribute("role").equals("candidate")){
        	out.print("<li><a href=\"search\">Search Jobs</a></li>");
        }        
        %>        
      
      </ul>
      <% 
      //if(session.getAttribute("role") != null && session.getAttribute("role").equals("candidate")){
      	//out.print("<form class=\"navbar-form navbar-left\" role=\"search\"><div class=\"form-group\"><input type=\"text\" class=\"form-control\" placeholder=\"Search\"></div><button type=\"submit\" class=\"btn btn-default\">Submit</button></form>");
      //}
      %>
      <ul class="nav navbar-nav navbar-right">
      	<%
      		if(session.getAttribute("userName") != null){
      			out.print("<li><a href=\"#\">"+session.getAttribute("role")+"</a></li>");
      		}
      	%>                
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Account <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="register">Register</a></li>
            <li><a href="login">Login</a></li>          
            <li role="separator" class="divider"></li>
            <li><a href="logout">Logout</a></li>
          </ul>
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>



</div>