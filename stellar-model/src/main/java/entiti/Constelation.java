package entiti;

import entiti.Star;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Constelation {

    @Id
    private Integer id;


    private String constelationName;

    @OneToMany
    private transient List<Star> stars = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstelationName() {
        return constelationName;
    }

    public void setConstelationName(String constelationName) {
        this.constelationName = constelationName;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Constelation{" +
                "id=" + id +
                ", constelationName='" + constelationName + '\'' +
                '}';
    }
}
