package com.sda.world.examples;


import com.sda.world.model.City;
import com.sda.world.model.Country;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ModifyCity {
                public static void main(String[] args) {
                    try (SessionFactory factory = new Configuration().configure().buildSessionFactory();
                         Session session = factory.openSession()) {
                        Query<City> q = session.createQuery("FROM City c " +
                                "WHERE c.name='Będzin'");
                        City bedzin = q.uniqueResult();
                        bedzin.setDistrict("Małopolskie");
                        Transaction tx = session.beginTransaction();
                        session.save(bedzin);
                        tx.commit();
                    }
                }
            }


