package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOAcademie;
import fr.univ_amu.iut.model.Academie;

import java.util.List;

public class DAOAcademieJPA implements DAOAcademie {
    @Override
    public boolean delete(Academie obj) {
        return false;
    }

    @Override
    public List<Academie> findAll() {
        return null;
    }

    @Override
    public Academie getById(int id) {
        return null;
    }

    @Override
    public Academie insert(Academie obj) {
        return null;
    }

    @Override
    public boolean update(Academie obj) {
        return false;
    }
}
