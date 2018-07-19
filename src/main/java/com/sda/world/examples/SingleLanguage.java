package com.sda.world.examples;

import com.sda.world.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Created by dexter on 19.07.18.
 */
public class SingleLanguage {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session session = factory.openSession()) {
            Query<Country> q = session.createQuery(
                    "FROM Country c WHERE c.languages.size = 1");
            q.stream().forEach(c -> System.out.println(c.getName()));
        }
    }
}
