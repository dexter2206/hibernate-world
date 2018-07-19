package com.sda.world.examples;


import com.sda.world.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class LanguageQueryExample {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
            Session session = factory.openSession()) {
            Query<Country> q = session.createQuery(
                    "SELECT c FROM Country c JOIN c.languages l "
                    + "WHERE l.id.language='Polish'");
            q.stream().forEach(c -> System.out.println(c.getName()));
        }
    }
}
