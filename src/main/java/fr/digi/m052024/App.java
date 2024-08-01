package fr.digi.m052024;

import fr.digi.m052024.entites.Emprunt;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        try(EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-biblio");
            EntityManager em = emf.createEntityManager()) {


            Emprunt emprunt = em.find(Emprunt.class, 2);
            if (null != emprunt) {
                System.out.println(emprunt.getLivres());
            }


        }
    }
}