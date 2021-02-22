package org.example.demo.ticket.business.contract;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface ProjetManager {
    Projet getProjet(Integer pId) throws NotFoundException;
    List<Projet> getListProjet();
}
