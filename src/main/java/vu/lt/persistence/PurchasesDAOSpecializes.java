package vu.lt.persistence;

import vu.lt.entities.Purchase;

import javax.enterprise.inject.Specializes;

@Specializes
public class PurchasesDAOSpecializes extends PurchasesDAO {

    @Override
    public void persist(Purchase purchase) {
        System.out.println("I am Special");
        super.persist(purchase);
    }
}
