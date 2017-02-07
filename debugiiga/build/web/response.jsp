<%-- 
    Document   : response
    Created on : Feb 5, 2017, 10:19:56 PM
    Author     : vadivel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="./css/buttonstyle.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>response</title>
    </head>
    <body>
        <form action="starttest" >

            <center>
                <h1>Registered Sucessfully</h1><br>

                <h3>
                    <table >
                        <thead>
                            <tr>
                                <th>Yuddhavarna_id</th>
                                <th><label for="yid"><%=request.getAttribute("yid")%></label>
                                    <input type="hidden" value="<%=request.getAttribute("yid")%>" name="yid"></th>

                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>Name</td>
                                <td>: <label for="name"><%=request.getAttribute("name")%></label>
                                    <input type="hidden" value="<%=request.getAttribute("name")%>" name="name"></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>



                </h3>

                <%-- <div class="button" style="vertical-align: middle">
                     <span><a href="test.jsp">Start the test</a> </span>
                 </div>*/--%>
                <input type="submit" value="Start Test" >


            </center>
        </form>
    </body>
</html>
