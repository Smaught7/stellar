package net.atos.model.dao;

import net.atos.model.Constellation;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JPAConstellationsDAO implements ConstellationsDAO {

    @PersistenceContext(name="stellar")
    private EntityManager em;

    @Override
    public List<Constellation> getConstellation(String query) {
        return em.createQuery("SELECT c FROM Constellation c where c.name like :param")
                .setParameter("param", "%" + query + "%")
                .getResultList();
    }

    @Override
    public List<Constellation> getAllConstellations() {
        return em.createQuery("SELECT c from Constellation c").getResultList();
    }

    @Override
    public Constellation addNewConstelation(Constellation constellation) {
        em.persist(constellation);
        return constellation;
    }
}
