package com.sda.world.examples;



import com.sda.world.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class CountryQueryExample {

    public static void main(String[] args) {
        Country poland = null;
        try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
             Session session = factory.openSession()) {
            Query<Country> query = session.createQuery("FROM Country c " +
                    "JOIN FETCH c.cities " +
                    "WHERE c.code=:code");
            poland = query.setParameter("code", "POL").uniqueResult();
            poland.getCities().stream().forEach(city -> System.out.println(city.getName()));
        }
    }
}
