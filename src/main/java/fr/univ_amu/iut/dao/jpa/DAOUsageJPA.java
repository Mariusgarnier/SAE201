package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.DAOUsage;
import fr.univ_amu.iut.model.Usage;

import java.util.List;

public class DAOUsageJPA implements DAOUsage {
    @Override
    public boolean delete(Usage obj) {
        return false;
    }

    @Override
    public List<Usage> findAll() {
        return null;
    }

    @Override
    public Usage getById(int id) {
        return null;
    }

    @Override
    public Usage insert(Usage obj) {
        return null;
    }

    @Override
    public boolean update(Usage obj) {
        return false;
    }
}
