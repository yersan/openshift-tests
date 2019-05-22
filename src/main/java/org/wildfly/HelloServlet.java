package org.wildfly;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = "/")
public class HelloServlet extends HttpServlet {
    static String PAGE_HEADER = "<html><head><title>helloworld</title></head><body>";
    static String PAGE_FOOTER = "</body></html>";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println(PAGE_HEADER);
        writer.println("<h1> Hello " + System.currentTimeMillis() + "</h1>");
        writer.println(PAGE_FOOTER);
        writer.close();
    }
}
