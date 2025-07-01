package GaetanoMiscio;

import GaetanoMiscio.DAO.EventoDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4_W3_D2PU");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO et = new EventoDAO(em);

        
        em.close();
        emf.close();

    }

}
