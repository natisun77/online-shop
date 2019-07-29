package service.impl;

import dao.GoodDao;
import dao.impl.GoodDaoImpl;
import model.Good;
import service.GoodService;

import java.util.List;

public class GoodServiceImpl implements GoodService {

    private static final GoodDao goodDao = new GoodDaoImpl();

    @Override
    public void addGood(Good good) {
        goodDao.addGood(good);
    }

    @Override
    public List<Good> getAllGoods() {
        return goodDao.getAllGoods();
    }
}
