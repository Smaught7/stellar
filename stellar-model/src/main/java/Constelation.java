import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Constelation {

    @Column
    private String constelationName;

    @ManyToOne
    private List<Star> stars;

    public Constelation(String constelationName) {
        this.constelationName = constelationName;
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
}
