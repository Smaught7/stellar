package net.atos.service;

import net.atos.model.Constellation;
import net.atos.model.Star;

import java.util.List;

public interface StellarService {

    List<Constellation> getConstellations(String query);

    List<Star> getStarsForConstellation(String constellationAbbreviation);

    Constellation addConstellation(Constellation constellation);

    Star addStar(Star star);
}
