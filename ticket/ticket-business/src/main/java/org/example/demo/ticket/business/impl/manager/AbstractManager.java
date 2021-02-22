package org.example.demo.ticket.business.impl.manager;

public class AbstractManager {
    private DaoFacotry daoFacotry;

    protected DaoFacotry getDaoFacotry() {
        return daoFacotry;
    }

    public void setDaoFacotry(DaoFacotry daoFacotry) {
        this.daoFacotry = daoFacotry;
    }
}
