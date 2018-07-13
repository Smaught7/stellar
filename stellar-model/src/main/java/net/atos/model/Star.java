package net.atos.model;

import javax.persistence.*;

@Entity
public class Star {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "constellation_abbreviation", columnDefinition="VARCHAR(255)")
    private Constellation constellation;

    public Star() {}

    public Star(String name) {
        this.name = name;
    }

    public Star(String name, Constellation constellation) {
        this.name = name;
        this.constellation = constellation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Constellation getConstellation() {
        return constellation;
    }

    public void setConstellation(Constellation constellation) {
        this.constellation = constellation;
    }

    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", constellation=" + constellation +
                '}';
    }
}
