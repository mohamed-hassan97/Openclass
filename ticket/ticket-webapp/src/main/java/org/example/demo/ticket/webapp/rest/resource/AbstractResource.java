package org.example.demo.ticket.webapp.rest.resource;

import org.example.demo.ticket.business.contract.ManagerFactory;

import javax.inject.Inject;

public abstract class AbstractResource {

    private static ManagerFactory managerFactory;

    protected static ManagerFactory getManagerFactory() {
        return managerFactory;
    }
    @Inject
    public static void setManagerFactory(ManagerFactory pManagerFactory) {
        managerFactory = pManagerFactory;
    }
}
