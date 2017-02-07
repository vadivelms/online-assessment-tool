<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Result</title>
    </head>
    <body><center>
            <form action="TestServelet">
                <h1>Result Page</h1>

                <table border="2px" cellpadding="2px" cellspacing="2px">
                    <tr>
                        <td>Total Marks:</td>

                        <td>5</td>
                    </tr>
                    <tr>
                        <td>Marks Obtained:</td>

                        <td><%=request.getAttribute("score")%></td>
                    </tr>
                </table>
                <br> &nbsp;

            </form>
            <a href="index.jsp">Home</a>
        </center>
    </body>
</html>