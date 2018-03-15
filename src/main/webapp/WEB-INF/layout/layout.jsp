<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<tiles:importAttribute name="title" scope="request"/>
<html>
<head>
    <title>MyApp - <tiles:getAsString name="title"/></title>
    <meta charset="utf-8" />
</head>
<body>
<tiles:insertAttribute name="header"/>
<tiles:insertAttribute name="body"/>
<p>Notice that this is a layout made in JSP</p>
</body>
</html>
