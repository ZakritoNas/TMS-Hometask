package service;

import config.HibernateConfig;
import entity.PersonEntity;
import entity.PhoneEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.UUID;

public class PersonService {

   public UUID save (PersonEntity person){
       Session session = HibernateConfig.create();
       Transaction transaction = session.beginTransaction();

       UUID saved = (UUID) session.save(person);
       transaction.commit();
       session.close();
       return saved;
   }

    public PhoneEntity save (PhoneEntity phone){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        PhoneEntity saved = (PhoneEntity) session.save(phone);
        transaction.commit();
        session.close();
        return saved;
    }

    public PersonEntity getByID (UUID personId){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        PersonEntity person = session.find(PersonEntity.class, personId);
        System.out.println(person);
        transaction.commit();
        session.close();
        return person;
    }
}
