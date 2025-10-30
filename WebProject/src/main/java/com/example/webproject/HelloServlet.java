package com.example.webproject;

import java.io.*;
import java.util.Enumeration;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        Enumeration<String> e = request.getHeaderNames();
        out.println("<TABLE>");
        while (e.hasMoreElements()) {
            String header = e.nextElement();
            out.println("<TR><TD>" + header + "</TD>");
            out.println("<TD>" + request.getHeader(header) + "</TD></TR>>");
        }
        out.println("</TABLE>");
    }

    public void destroy() {
    }
}