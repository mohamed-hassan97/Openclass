package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.*;

import javax.inject.Inject;
import javax.inject.Named;

@Named("managerFactory")
public class ManagerFactoryImpl implements ManagerFactory {
    @Inject
    private ProjetManager projetManager;
    @Inject
    private TicketManager ticketManager;

    @Override
    public ProjetManager getProjetManager() {
        return projetManager;
    }

    @Override
    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    @Override
    public TicketManager getTicketManager(){
        return ticketManager;
    }

    @Override
    public void setTicketManager(TicketManager pTicketManagerImpl) {
        ticketManager = pTicketManagerImpl;
    }

}