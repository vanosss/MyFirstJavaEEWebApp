package com.andreev;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i+j;

        Cookie cookie = new Cookie("k", k + "");
        res.addCookie(cookie);


        res.sendRedirect("sq");

        //RequestDispatcher rd = req.getRequestDispatcher("/sq");
        //rd.forward(req, res);

    }

}
