<%@ page language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="context" value="${pageContext.request.contextPath}" />
<html>
<Title>Json Editor</Title>
<head>
<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-126737713-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-126737713-1');
</script>

<link rel="shortcut icon" type="image/x-icon" href="${context}/resources/img/favicon.ico"/>
  <link rel = "stylesheet"
         href = "https://fonts.googleapis.com/icon?family=Material+Icons" />
      <link rel = "stylesheet"
         href = "https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css" />
      <script type = "text/javascript"
         src = "https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script src = "https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js">
      </script>
	  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700" type="text/css" />

    <!-- when using the mode "code", it's important to specify charset utf-8 -->
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">

    <link href="${context}/resources/css/jsoneditor.min.css" rel="stylesheet" type="text/css">
    <script src="${context}/resources/js/jsoneditor.min.js"></script>
	
</head>
  <nav>
    <div class="nav-wrapper">
      <a href="/" class="brand-logo">JsonEditor</a>
      <ul id="nav-mobile" class="right hide-on-med-and-down">
        <li><a class="btn-floating btn-large cyan pulse modal-trigger"
        href="#modal2"><i class=" material-icons">person_pin</i></a>
      </ul>
    </div>
  </nav>
<body class="grey lighten-5">
 <div class="row">
 
 <div class="col s6">
    <form class="col s12">
      <div class="row">
        <div class="input-field col s12">
        
          <textarea id="textarea1" class="materialize-textarea green-text darken-2"
		  style="max-height: 400px; min-height: 300px; overflow-y: scroll; background-color: black">
		  <c:if test="${not empty data}">${data}</c:if></textarea>
          <label for="textarea1">Textarea</label>
		 <a class="waves-effect waves-light btn" onClick="setValuetoEditor();">JSonify</a>
		 <a class="waves-effect waves-light btn" onClick="clearInput();">Clear</a>
        </div>
      </div>
      <div class="row">
	  </div>
    </form>
</div>


    <div id="jsoneditor" class="col s6" >
	
	</div>
</div>
	<div id="modal1" class="modal">
		<div class="modal-content">
			<i class="medium blue-text material-icons align right">message</i>
			<p>Please Enter Valid JSON String</p>
			<p>
				<br />
			</p>
		</div>
		<div class="modal-footer">
			<a href="#!" class="modal-close waves-effect waves-green btn-flat">
				OK </a> <br />
		</div>
	</div>
	
	<div id="modal2" class="modal">
		<div class="modal-content">
		<h3>About
		<a href="https://materializecss.com/">
			<img src="${context}/resources/img/material.png"
			width="100px" height="100px" class="align right" title="Made with Materialize CSS ">
			</a></h3>
			
			<p>
				This Page is made with Material Design .<br />
			</p>
			
			<p>
				Hosted on Google Cloud Platform , this is a Json Editor . 
			</p>
			<p class="align right">
				<iframe class="align right "src="https://githubbadge.appspot.com/anshulkatta" 
			style="border: 0;height: 142px;width: 200px;overflow: hidden;" frameBorder="0"></iframe><br/>
				<br />
			</p>
			
			
		</div>
		<div class="modal-footer">
			<button  class="blue align left modal-close waves-effect waves-green btn">
				OK </button> <br />
		</div>
	</div>
	<script src="${context}/resources/js/katta.min.js"></script>

</body>
</html>