package implementations;

import entiti.Constelation;
import entiti.Star;

import java.util.List;

public interface StellarView {

    List<Star> getListOfStarByPharse(String pharse);
    List<Constelation> getListOfConstelationsByPharse(String constelationPharse);
}
