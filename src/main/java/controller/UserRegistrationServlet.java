package controller;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class UserRegistrationServlet extends HttpServlet {

    private static final UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String repeatedPassword = req.getParameter("repeatedPassword");
        String message = null;

        if (password.equals(repeatedPassword)) {
            User user = new User(1L, email, password);
            System.out.println(user);
            userService.addUser(user);
            req.setAttribute("message", message);
            resp.sendRedirect(req.getContextPath() + "/users");

        } else {
            message = "Ошибка регистрации. Попробуйте снова";
            req.setAttribute("email", email);

            req.setAttribute("message", message);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/register.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
