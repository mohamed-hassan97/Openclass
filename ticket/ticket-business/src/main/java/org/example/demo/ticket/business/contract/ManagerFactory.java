package org.example.demo.ticket.business.contract;

public interface ManagerFactory {
    ProjetManager getProjetManager();

    void setProjetManager(ProjetManager pProjetManager);

    TicketManager getTicketManager();

    void setTicketManager(TicketManager pTicketManagerImpl);
}
