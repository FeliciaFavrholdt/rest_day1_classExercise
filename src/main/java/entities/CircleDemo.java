package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "circle_demo")
public class CircleDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 30)
    private String name;

    @ManyToOne
    @JoinColumn(name = "rename_me_id")
    private RenameMe renameMe;

    public CircleDemo() {
    }

    public CircleDemo(String name) {
        this.name = name;
    }

    public RenameMe getRenameMe() {
        return renameMe;
    }

    public void setRenameMe(RenameMe renameMe) {
        this.renameMe = renameMe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CircleDemo that = (CircleDemo) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }


    @Override
    public String toString() {
        return name;
    }
}