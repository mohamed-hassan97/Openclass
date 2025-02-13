package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;

import java.util.List;

public interface TicketManager {
    Ticket getTicket(Long tID) throws NotFoundException;
    List<Ticket> getListTicket(RechercheTicket pRechercheTicket);
}
