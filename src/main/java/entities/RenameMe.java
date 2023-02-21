package entities;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
@NamedQuery(name = "RenameMe.deleteAllRows", query = "DELETE from RenameMe")
public class RenameMe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public RenameMe() {
    }  
    
    // TODO, delete this class, or rename to an Entity class that makes sense for what you are about to do
    // Delete EVERYTHING below if you decide to use this class, it's dummy data used for the initial demo
    private String dummyStr1;
    private String dummyStr2;

    @OneToMany(mappedBy = "renameMe", orphanRemoval = true)
    private Set<CircleDemo> circleDemoes = new LinkedHashSet<>();

    public Set<CircleDemo> getCircleDemoes() {
        return circleDemoes;
    }

    public void addCircleDemo(CircleDemo circleDemo) {
        this.circleDemoes.add(circleDemo);
        if (circleDemo != null) {
            circleDemo.setRenameMe(this);
        }
    }

    public RenameMe(String dummyStr1, String dummyStr2) {
        this.dummyStr1 = dummyStr1;
        this.dummyStr2 = dummyStr2;
    }

    public RenameMe(Long id, String dummyStr1, String dummyStr2) {
        this.dummyStr1 = dummyStr1;
        this.dummyStr2 = dummyStr2;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDummyStr1() {
        return dummyStr1;
    }

    public void setDummyStr1(String dummyStr1) {
        this.dummyStr1 = dummyStr1;
    }

    public String getDummyStr2() {
        return dummyStr2;
    }

    public void setDummyStr2(String dummyStr2) {
        this.dummyStr2 = dummyStr2;
    }

    public void setCircleDemoes(Set<CircleDemo> circleDemoes) {
        this.circleDemoes = circleDemoes;
    }

    @Override
    public String toString() {
        return "RenameMe{" +
                "dummyStr1='" + dummyStr1 + '\'' +
                ", dummyStr2='" + dummyStr2 + '\'' +
                '}';
    }
}
