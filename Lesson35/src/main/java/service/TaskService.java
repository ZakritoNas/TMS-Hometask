package service;

import config.HibernateConfig;
import entity.PersonEntity;
import entity.TaskEntity;
import enums.TaskStatus;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class TaskService {
    public Integer save (TaskEntity task){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Integer saved = (Integer) session.save(task);
        transaction.commit();
        session.close();
        return saved;
    }

    public List<TaskEntity> getAll (){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query all = session.createQuery("from TaskEntity");
        List list = all.list();
        System.out.println(list);
        transaction.commit();
        session.close();
        return list;
    }

    public TaskEntity getByID (Integer taskId){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        TaskEntity task = session.find(TaskEntity.class, taskId);
        System.out.println(task);
        transaction.commit();
        session.close();
        return task;
    }

    public List<TaskEntity> getByUser (PersonEntity user){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query byUser = session.createQuery("from TaskEntity as task where task.user = user.id");
        List list = byUser.list();
        System.out.println(list);
        transaction.commit();
        session.close();
        return list;
    }

    public void updateStatus (TaskEntity task, TaskStatus newStatus){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("update TaskEntity as task set task.status = :newStatus where task.status = :oldStatus");
        query.setParameter("newStatus", newStatus);
        query.setParameter("oldStatus", task.getStatus());
        int i = query.executeUpdate();
        transaction.commit();
        session.close();
    }

    public void delete (TaskEntity task){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();
        session.delete(task);
        transaction.commit();
        session.close();
    }
}
