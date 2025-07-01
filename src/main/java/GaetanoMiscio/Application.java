package GaetanoMiscio;

import GaetanoMiscio.DAO.EventoDAO;
import GaetanoMiscio.entities.Evento;
import GaetanoMiscio.entities.TipoEvento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4_W3_D2PU");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO et = new EventoDAO(em);

        Evento party = new Evento("Natale", LocalDate.now(), "free drink", TipoEvento.PRIVATO, 1500);

        et.save(party);
        em.close();
        emf.close();

    }

}
