package controller;

import model.Good;
import service.GoodService;
import service.impl.GoodServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/goods")
public class AllGoodsServlet extends HttpServlet {

    private static final GoodService goodService = new GoodServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Good> allGoods = goodService.getAllGoods();
        req.setAttribute("allGoods", allGoods);
        req.getRequestDispatcher("goods.jsp").forward(req, resp);
    }
}
