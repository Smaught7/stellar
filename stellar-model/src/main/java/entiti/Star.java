package entiti;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Star {


    @Id
    private Integer id;


    private String starName;

    @ManyToOne
    private Constelation constelation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public Constelation getConstelation() {
        return constelation;
    }

    public void setConstelation(Constelation constelation) {
        this.constelation = constelation;
    }
}
