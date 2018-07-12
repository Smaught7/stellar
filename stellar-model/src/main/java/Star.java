import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Star {

    @Column
    private String starName;

    @OneToMany
    private List<Constelation> constelations;

    public Star(String starName) {
        this.starName = starName;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }
}
