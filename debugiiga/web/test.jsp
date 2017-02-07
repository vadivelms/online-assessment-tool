<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<html>
    <head>
        <title>TestPage</title>
        <style type="text/css">
            body {
                background-color: powderblue;
            }

            div {
                border: 1px solid black;

                background-color: lightblue;
                margin-left: 15%;
                margin-right: 15%;
            }
            .header{
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                margin-left: 15%;
                margin-right: 15%;
                position: fixed;
                top: 0;
                width: 68.7%;

            }
            .questions{
                background-color: silver;
            }
            .button{
                background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 15px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
                -webkit-transition-duration: 0.4s; /* Safari */
                transition-duration: 0.4s;
            }
            .button{
                box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
            }

        </style>
        <script>
            if (document.layers) {
                //Capture the MouseDown event.
                document.captureEvents(Event.MOUSEDOWN);

                //Disable the OnMouseDown event handler.
                document.onmousedown = function () {
                    return false;
                };
            } else {
                //Disable the OnMouseUp event handler.
                document.onmouseup = function (e) {
                    if (e != null && e.type == "mouseup") {
                        //Check the Mouse Button which is clicked.
                        if (e.which == 2 || e.which == 3) {
                            //If the Button is middle or right then disable.
                            return false;
                        }
                    }
                };
            }

//Disable the Context Menu event.
            document.oncontextmenu = function () {
                return false;
            };
            window.onload = function WindowLoad() {
                var ul = document.querySelector('ul');
                for (var i = ul.children.length; i >= 0; i--) {
                    ul.appendChild(ul.children[Math.random() * i | 0]);
                }
            }
            window.onload = function () {
                window.setTimeout(document.test.submit.bind(document.test), 5000);
            };
        </script>
    </head>
    <body>

        <form action="TestServelet" name="test" id="test">
            <div class="header" data-position="fixed">
                <h3 fixed>Yuddhavarna_id:<%=request.getAttribute("yid")%></label>
                    <input type="hidden" value="<%=request.getAttribute("yid")%>" name="yid"><br>
                    Name         :<label for="name"><%=request.getAttribute("name")%></label>
                    <input type="hidden" value="<%=request.getAttribute("name")%>" name="name"><br>
                </h3>         
            </div>
            <pre>
                    


            </pre>
            <div class="questions">


                <ul>
                    <li id="q1">
                        <p>Which four options describe the correct default values for
                            array elements of the types indicated?
                        <ol>
                            <li>int -> 0</li>
                            <li>String -> "null"</li>
                            <li>Dog -> null</li>
                            <li>char -> '\u0000'</li>
                            <li>float -> 0.0f</li>
                            <li>boolean -> true</li>
                        </ol>

                        <ol>
                            <input type="radio" name="q11" value="1" required> 1, 2, 3, 4
                            <br>
                            <input type="radio" name="q11" value="2"> 1, 3, 4, 5
                            <br>
                            <input type="radio" name="q11" value="3"> 2, 4, 5, 6
                            <br>
                            <input type="radio" name="q11" value="4"> 3, 4, 5, 6
                            <br>

                        </ol>

                    </li>
                    <li id="q2">
                        <p>Which one of these lists contains only Java programming
                            language keywords?
                        <ol>
                            <input type="radio" name="q21" value="1" required=""> class, if, void, long, Int,
                            continue
                            <br>
                            <input type="radio" name="q21" value="2"> goto, instanceof, native,
                            finally, default, throws
                            <br>
                            <input type="radio" name="q21" value="3"> try, virtual, throw, final,
                            volatile, transient
                            <br>
                            <input type="radio" name="q21" value="4"> strictfp, constant, super,
                            implements, do
                            <br>
                            <input type="radio" name="q21" value="5"> byte, break, assert,
                            switch, include
                            <br>

                        </ol>

                    </li>
                    <li id="q3">
                        <p>Which will legally declare, construct, and initialize an
                            array?
                        <ol>
                            <input type="radio" name="q31" value="1" required=""> int [] myList = {"1", "2", "3"};

                            <br>
                            <input type="radio" name="q31" value="2"> int [] myList = (5, 8, 2);

                            <br>
                            <input type="radio" name="q31" value="3"> int myList [] [] = {4,9,7,0};

                            <br>
                            <input type="radio" name="q31" value="4"> int myList [] = {4, 3, 7};
                        </ol>

                    </li>
                    <li id="q4">
                        <p>Which is a reserved word in the Java programming language?

                        <ol>
                            <input type="radio" name="q41" value="1" required=""> method
                            <br>
                            <input type="radio" name="q41" value="2"> native
                            <br>
                            <input type="radio" name="q41" value="3"> subclasses
                            <br>
                            <input type="radio" name="q41" value="4"> reference
                            <br>
                            <input type="radio" name="q41" value="5"> array
                        </ol>

                    </li>
                    <li id="q5">
                        <p>Which is a valid keyword in java?

                        <ol>
                            <input type="radio" name="q51" value="1" required=""> interface

                            <br>
                            <input type="radio" name="q51" value="2"> string


                            <br>
                            <input type="radio" name="q51" value="3"> Float

                            <br>
                            <input type="radio" name="q51" value="4"> unsigned
                        </ol>

                    </li>
                </ul>
                <center>
                    <input type="submit" value="Submit the test" ><!-- &nbsp;<input type="cancel" value="cancel" > -->
                </center>
            </div>
        </form>

    </body>
</html>