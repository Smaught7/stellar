package net.atos.service;

import net.atos.model.Constellation;
import net.atos.model.Star;
import net.atos.model.dao.ConstellationsDAO;
import net.atos.model.dao.StarsDAO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Primary
@Service
@Transactional
public class StellarServiceImplementation implements StellarService {

    @Autowired
    StarsDAO starsDAO;

    @Autowired
    ConstellationsDAO constellationsDAO;

    @Override
    public List<Constellation> getConstellations(String query) {

        List<Constellation> constellations = new ArrayList<>();
        if (StringUtils.isEmpty(query)) {
            constellations = constellationsDAO.getAllConstellations();
        } else {
            constellations = constellationsDAO.getConstellation(query);
        }
        return constellations;
    }

    @Override
    public List<Star> getStarsForConstellation(String constellationAbbreviation) {
        return starsDAO.getStarForConstellation(constellationAbbreviation);
    }

    @Override
    public Constellation addConstellation(Constellation constellation) {
        return constellationsDAO.addNewConstelation(constellation);

    }

    @Override
    public Star addStar(Star star) {
        return starsDAO.addNewStar(star);
    }
}
