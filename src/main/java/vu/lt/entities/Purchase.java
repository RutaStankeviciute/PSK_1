package vu.lt.entities;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Purchase.findAll", query = "select p from Purchase as p")
})
@Table(name = "PURCHASE")
@Getter @Setter
public class Purchase implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 50)
    @Column(name = "NAME")
    private String name;

    @ManyToMany
    @JoinColumn(name="CUSTOMER_ID")
    private List<Customer> customers = new ArrayList<>();

    public Purchase(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(name, purchase.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}