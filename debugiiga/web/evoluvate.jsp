<%-- 
    Document   : evoluvate
    Created on : Feb 6, 2017, 3:22:41 PM
    Author     : vadivel
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Evolution</title>
    </head>
    <body>
        <form action="generatelist">

            <center>
                <h3>
                    Average:&nbsp;<input tepe="text" name="mark">
                </h3>
                <input type="submit" value="Get Results" />
            </center>
        </form>

    </body>

</html>
