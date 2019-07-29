package dao;

import model.Good;

import java.util.List;

public interface GoodDao {

    void addGood(Good good);
    List<Good> getAllGoods();
}
