<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HappyBank</title>
    <link rel="stylesheet" href="theme/global.css" type="text/css"
	    media="all" charset="utf-8">
    <script type="text/javascript" src="javascript/mootools-1.2.1-core.js"></script>
    <script type="text/javascript" src="javascript/mootools-1.2-more.js"></script>
    <script type="text/javascript" src="javascript/clientcide-1.2.js"></script>
</head>

<body>

<!-- begin wrapper -->
<div id="wrapper">

    <!-- begin inner -->
    <div id="inner">
    
        <!-- begin header -->
        <div id="header">
            <a href="index.jsp" id="logo">Company Logo</a>
            <form action="javascript:alert('This function is not yet available');" 
                method="post" accept-charset="utf-8" id="search" class="search">
	            <input name="q" value="Search" id="searchBox" class="searchBox text" 
	            onfocus="if(this.value=='Search')this.value=''"
	            onblur="if(this.value=='')this.value='Search'" type="text"> 
	            <input class="search" src="theme/button-search.gif" type="image">
	        </form>
            <div id="banner">Online Banking</div>
        </div>
        <!-- end header -->
