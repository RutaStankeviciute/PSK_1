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
        @NamedQuery(name = "Customer.findAll", query = "select a from Customer as a")
})
@Table(name = "CUSTOMER")
@Getter @Setter
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 50)
    @Column(name = "NAME")
    private String name;

    @Column(name = "PERSONAL_CODE")
    private Integer personalCode;

    @ManyToOne
    @JoinColumn(name="STORE_ID")
    private Store store;

    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    public Customer() {
    }

    @ManyToMany(mappedBy = "customers")
    private List<Purchase> purchases = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}