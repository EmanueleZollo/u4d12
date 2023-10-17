package Emanuele;


import Emanuele.entities.Evento;
import Emanuele.entities.EventoDAO;
import Emanuele.entities.TipoEvento;

import javax.persistence.EntityManager;
import static Emanuele.utils.JpaUtil.getEntityManagerFactory;

public class Application {

    public static void main(String[] args) {
    EntityManager entityManager = getEntityManagerFactory().createEntityManager();

        EventoDAO ed = new EventoDAO(entityManager);
         Evento gala = new Evento("Gran Gala", 2023-03-21,
                 "grande ballo per festeggiare l'anniversario della filarmonica",
                TipoEvento.PRIVATO, 200 );



    }
}
