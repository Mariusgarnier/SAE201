package fr.univ_amu.iut.dao.jpa;

import fr.univ_amu.iut.dao.*;
import fr.univ_amu.iut.dao.factory.DAOFactory;

public class DAOFactoryJPA implements DAOFactory {

    @Override
    public DAOAcademie createDAOAcademie() {
        return new DAOAcademieJPA();
    }

    @Override
    public DAOActeur createDAOActeur() {
        return new DAOActeurJPA();
    }

    @Override
    public DAODiscipline createDAODiscipline() {
        return new DAODisciplineJPA();
    }

    @Override
    public DAORegionAcademique createDAORegionAcademique() {
        return new DAORegionAcademiqueJPA();
    }

    @Override
    public DAORessource createDAORessource() {
        return new DAORessourceJPA();
    }

    @Override
    public DAOThematique createDAOThematique() {
        return new DAOThematiqueJPA();
    }

    @Override
    public DAOTypeActeur createDAOTypeActeur() {
        return new DAOTypeActeurJPA();
    }

    @Override
    public DAOTypeRessource createDAOTypeRessource() {
        return new DAOTypeRessourceJPA();
    }

    @Override
    public DAOUsage createDAOUsage() {
        return new DAOUsageJPA();
    }
}
