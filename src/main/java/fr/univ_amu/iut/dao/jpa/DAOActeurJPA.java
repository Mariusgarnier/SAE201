package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOActeur;
import fr.univ_amu.iut.model.Acteur;

import java.util.List;

public class DAOActeurJPA implements DAOActeur {
    @Override
    public boolean delete(Acteur obj) {
        return false;
    }

    @Override
    public List<Acteur> findAll() {
        return null;
    }

    @Override
    public Acteur getById(int id) {
        return null;
    }

    @Override
    public Acteur insert(Acteur obj) {
        return null;
    }

    @Override
    public boolean update(Acteur obj) {
        return false;
    }
}
