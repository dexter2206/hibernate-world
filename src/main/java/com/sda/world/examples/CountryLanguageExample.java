package com.sda.world.examples;


import com.sda.world.model.CountryLanguage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CountryLanguageExample {

    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession()) {
            Query<CountryLanguage> query = session.createQuery(
                    "FROM CountryLanguage cl WHERE cl.country.name='Canada' " +
            "AND cl.isOfficial='T'");
            query.stream().forEach(cl -> System.out.println(cl.getId().getLanguage()));
        }
    }
}
