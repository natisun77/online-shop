package dao.impl;

import dao.GoodDao;
import model.Good;

import java.util.ArrayList;
import java.util.List;

public class GoodDaoImpl implements GoodDao {

    private static List<Good> goodList = new ArrayList<Good>();

    public void addGood(Good good) {
        goodList.add(good);
    }

    public List<Good> getAllGoods() {
        return goodList;
    }
}
