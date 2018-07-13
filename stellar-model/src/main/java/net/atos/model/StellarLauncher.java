package net.atos.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StellarLauncher {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("stellar");
        EntityManager em = emf.createEntityManager();

        em.close();
        emf.close();
    }
}
