package com.sda.world.examples;

import com.sda.world.model.City;
import com.sda.world.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AddCityExample {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {
            City newCity = new City();
            newCity.setName("Ciechocin");
            newCity.setDistrict("Śląskie");
            Query<Country> q = session.createQuery("FROM Country c " +
                    "WHERE c.name='Poland'");
            Country poland = q.uniqueResult();
            newCity.setCountry(poland);
            Transaction tx = session.beginTransaction();
            session.save(newCity);
            tx.commit();
        }
    }
}
