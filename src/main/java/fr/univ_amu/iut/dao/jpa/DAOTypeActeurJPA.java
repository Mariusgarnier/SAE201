package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOTypeActeur;
import fr.univ_amu.iut.model.TypeActeur;

import java.util.List;

public class DAOTypeActeurJPA implements DAOTypeActeur {
    @Override
    public boolean delete(TypeActeur obj) {
        return false;
    }

    @Override
    public List<TypeActeur> findAll() {
        return null;
    }

    @Override
    public TypeActeur getById(int id) {
        return null;
    }

    @Override
    public TypeActeur insert(TypeActeur obj) {
        return null;
    }

    @Override
    public boolean update(TypeActeur obj) {
        return false;
    }
}
