package com.sda.world.examples;

import com.sda.world.model.City;
import com.sda.world.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Created by dexter on 19.07.18.
 */
public class AddCityExample2 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {
            City newCity = new City();
            newCity.setName("Będzin");
            newCity.setDistrict("Śląskie");
            Country poland = new Country();
            poland.setCode("POL");
            newCity.setCountry(poland);
            Transaction tx = session.beginTransaction();
            session.save(newCity);
            tx.commit();
        }
    }
}
