package service;

import model.Good;

import java.util.List;

public interface GoodService {

    public void addGood(Good good);

    public List<Good> getAllGoods();

}
