package net.atos.model.dao;

import net.atos.model.Star;

import java.util.List;

public interface StarsDAO {

    List<Star> getStarForConstellation(String constellationAbbreviation);

    Star addNewStar(Star star);
}
