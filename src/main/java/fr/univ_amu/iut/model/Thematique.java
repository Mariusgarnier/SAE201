package fr.univ_amu.iut.model;

import jakarta.persistence.*;

@NamedQueries({
        @NamedQuery(name = "Thematique.findAll", query = "SELECT p FROM Thematique p"),
})
@Entity
public class Thematique {
    @Transient
    public static Thematique ClasseInversee = new Thematique("Classe inversée");
    @Transient
    public static Thematique CreationNumerique = new Thematique("Création numérique");
    @Transient
    public static Thematique DifferenciationPedagogique = new Thematique("Différenciation pédagogique");
    @Transient
    public static Thematique EcoleInclusive = new Thematique("École inclusive");
    @Transient
    public static Thematique CitoyenneteNumerique = new Thematique("EMI citoyenneté numérique (Se protéger)");
    @Transient
    public static Thematique EnseignerADistance = new Thematique("Enseigner à distance");
    @Transient
    public static Thematique ExpressionOrale = new Thematique("Expression orale/podcast");
    @Transient
    public static Thematique Evaluation = new Thematique("Évaluation");
    @Transient
    public static Thematique FormationAuxOutilsNumeriques = new Thematique("Formation aux outils numériques");
    @Transient
    public static Thematique FormerADistance = new Thematique("Former à distance");
    @Transient
    public static Thematique Hybridation = new Thematique("Hybridation");
    @Transient
    public static Thematique Ludification = new Thematique("Ludification");
    @Transient
    public static Thematique PedagogieDeProjet = new Thematique("Pédagogie de projet");
    @Transient
    public static Thematique Programmation = new Thematique("Programmation/Codage/Robotique");
    @Transient
    public static Thematique RealiteVirtuelle = new Thematique("Réalité virtuelle et augmentée");
    @Transient
    public static Thematique ReseauxSociaux = new Thematique("Réseaux sociaux");
    @Transient
    public static Thematique SExercerSentrainer = new Thematique("S’exercer/s’entraîner");
    @Transient
    public static Thematique TiersLab = new Thematique("Tiers lab");
    @Transient
    public static Thematique TNE = new Thematique("TNE");
    @Transient
    public static Thematique TravailCollaboratif = new Thematique("Travail collaboratif/mutualisation");
    @Transient
    public static Thematique TravailEntrePairs = new Thematique("Travail entre pairs");
    @Transient
    public static Thematique WebRadio = new Thematique("Webradio");

    @Id
    @GeneratedValue
    int id;
    String nom;

    public Thematique(String nom) {
        this.nom = nom;
    }

    public Thematique() {
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }
}
