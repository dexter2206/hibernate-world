package com.sda.world.examples2;
import com.sda.world.model.City;
import com.sda.world.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class AddCity {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {
            City newCity = new City();
            newCity.setName("Grunwald");
            newCity.setDistrict("Śląskie");
            Country poland = session.load(Country.class, "POL");
            //newCity.setCountry(poland);
            //poland.getCities().add(newCity);
            poland.addCity(newCity);
            Transaction tx = session.beginTransaction();
            tx.commit();
        }
    }
}
