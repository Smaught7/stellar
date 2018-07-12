package implementations;

import entiti.Constelation;
import entiti.Star;

import java.util.List;

public interface StellarDAO {

    List<Star> getListOfStars(String starList);
    List<Constelation> getLisOfConstelation(String constelationList);
    Constelation findByAbbreviation(String abbr);
}
