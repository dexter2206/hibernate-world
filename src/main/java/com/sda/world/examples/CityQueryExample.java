package com.sda.world.examples;

import com.sda.world.model.City;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CityQueryExample {

    public static void main(String[] args) {

        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session session = factory.openSession()) {
            Query<City> query = session.createQuery("FROM City c " +
                            "WHERE c.country.name='France'");
            query.setMaxResults(10);
            query.stream().forEach(System.out::println);
        }
    }
}
