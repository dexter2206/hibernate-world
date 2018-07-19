package com.sda.world.examples;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Created by dexter on 19.07.18.
 */
public class CountExample {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session session = factory.openSession()) {
            Query<Object[]> q = session.createQuery(
                    "SELECT c.name, c.languages.size " +
                            "FROM Country c");
            q.setMaxResults(10);
            q.stream().forEach(o -> System.out.println(o[0] + " " + o[1]));
        }
    }
}
