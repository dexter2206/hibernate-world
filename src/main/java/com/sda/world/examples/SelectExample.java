package com.sda.world.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class SelectExample {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {
            Query<CityNameDistrict> q = session.createQuery(
                    "SELECT new com.sda.world.examples.CityNameDistrict(c.name, c.district) " +
                    "FROM City c");
            q.setMaxResults(10);
            q.stream().forEach(c -> System.out.println(c.getName() + " " + c.getDistrict()));
        }
    }
}
