package net.atos.model.dao;

import net.atos.model.Star;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class JPAStarsDAO implements StarsDAO {

    @PersistenceContext(name = "stellar")
    private EntityManager em;


    @Override
    public List<Star> getStarForConstellation(String constellationAbbreviation) {
        return em.createQuery("SELECT s FROM Star s WHERE s.constellation.abbreviation LIKE :param")
                .setParameter("param", constellationAbbreviation)
                .getResultList();
    }

    @Override
    public Star addNewStar(Star star) {
        em.persist(star);
        return star;
    }
}
