<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
    <head>
        <title><decorator:title/></title>

<style type="text/css">

input.invalid {
    background-color: #FCC;
    border: 1px solid #F88;
}

input.valid {
    background-color: #CFC;
    border: 1px solid #8F8;
}

</style>

        <decorator:head/>
    </head>
<body>
    <div id="page">
		<h1><decorator:getProperty property="meta.heading"/></h1>
		<decorator:body/>
    </div>
</body>
</html>
