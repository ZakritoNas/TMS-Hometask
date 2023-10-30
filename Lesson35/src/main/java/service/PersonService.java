package service;

import config.HibernateConfig;
import entity.PersonEntity;
import enums.PersonType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class PersonService {
    public UUID save (PersonEntity user){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        UUID saved = (UUID) session.save(user);
        transaction.commit();
        session.close();
        return saved;
    }

        public void update (PersonEntity user, String name, PersonType type, LocalDate date){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("update PersonEntity set name = :nameParam, type = :typeParam" +
                ", birthday = :birthdayParam"+
                " where id = :userId");

        query.setParameter("userId", user.getId());
        query.setParameter("nameParam", name);
        query.setParameter("typeParam", type);
        query.setParameter("birthdayParam",date);

        int result = query.executeUpdate();
        transaction.commit();
        session.close();
    }

    public List<PersonEntity> getAll (){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query all = session.createQuery("from PersonEntity");
        List list = all.list();
        System.out.println(list);
        transaction.commit();
        session.close();
        return list;
    }

    public PersonEntity getByID (UUID userId){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        PersonEntity user = session.find(PersonEntity.class, userId);
        System.out.println(user);
        transaction.commit();
        session.close();
        return user;
    }

    public List<PersonEntity> getByActiveTask (){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query byActiveTask = session.createQuery("select user from TaskEntity as task where task.status = 'IN_PROGRESS' or task.status = 'NEW'");
        List list = byActiveTask.list();
        System.out.println(list);
        transaction.commit();
        session.close();
        return list;
    }

    public void delete (PersonEntity user){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
        session.close();
    }

}
