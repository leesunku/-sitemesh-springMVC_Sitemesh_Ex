<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" 	uri="http://www.opensymphony.com/sitemesh/decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><decorator:title default="SitemeshLayout"/></title>
<style type="text/css">
a{text-decoration:none; color:#000000;}		 
a:hover{color:#ff0000;} 		
ul{padding-top:10px;} 		       
ul li {
	display:inline-block; 			    
	border-left:1px solid #999; 		
	font:bold 12px Dotum; 			
	padding:0 10px; 				
}
ul li:first-child{border-left:none;}
</style>
</head>
<body>
<ul>
	<li><a href="index">index</a><br></li>
	<li><a href="first">first</a><br></li>
	<li><a href="socialAnalysisMain">socialAnalysis</a><br></li>
	<li><a href="thr">thr</a><br></li>
</ul>
<ul>
<li><a href="socialAnalysisMain">socialAnalysisMain</a><br></li>
<li><a href="socialAnalysisFirst">socialAnalysisFirst</a><br></li>
<li><a href="socialAnalysisSec">socialAnalysisSec</a><br></li>
</ul>
<decorator:body />
</body>
</html>