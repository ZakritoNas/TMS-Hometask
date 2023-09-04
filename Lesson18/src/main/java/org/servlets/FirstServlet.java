package org.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

        @Override
        public void init(ServletConfig config) throws ServletException {
            super.init(config);
        }

        @Override
        public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
            super.service(req, res);
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            PrintWriter writer = resp.getWriter();
            writer.println("Hello from FirstServlet");

            resp.addCookie(new Cookie("cookieK", "cookieV"));
        }

        @Override
        public void destroy() {
            super.destroy();
        }

    }
