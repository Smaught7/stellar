package net.atos.model.dao;

import net.atos.model.Constellation;

import java.util.List;

public interface ConstellationsDAO {

    List<Constellation> getConstellation(String query);

    List<Constellation> getAllConstellations();

    Constellation addNewConstelation(Constellation constellation);
}
