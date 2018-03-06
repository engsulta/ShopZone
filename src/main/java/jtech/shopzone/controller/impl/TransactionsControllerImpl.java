package jtech.shopzone.controller.impl;

import jtech.shopzone.controller.TransactionsController;
import jtech.shopzone.model.dal.dao.TransactionsDao;
import jtech.shopzone.model.dal.dao.impl.TransactionDaoImpl;
import jtech.shopzone.model.entity.UserProductsEntity;

import java.util.ArrayList;

public class TransactionsControllerImpl implements TransactionsController {
    private TransactionsDao transactionsDao;

    private TransactionsControllerImpl() {
        this.transactionsDao = new TransactionDaoImpl();
    }

    public static TransactionsControllerImpl newInstance() {
        return new TransactionsControllerImpl();
    }

    @Override
    public ArrayList<UserProductsEntity> getUserHistory(int userId) {
        return transactionsDao.getUserHistory(userId);
    }
}
