package config;


import entity.PersonEntity;
import entity.TaskEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {

    private static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration()
                .addAnnotatedClass(PersonEntity.class)
                .addAnnotatedClass(TaskEntity.class)
                .setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/hib_second")
                .setProperty("hibernate.connection.username", "postgres")
                .setProperty("hibernate.connection.password", "08102003")
                .setProperty("hibernate.connection.driver_class", "org.postgresql.Driver")
                .setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect")
                .setProperty("hibernate.connection.username", "postgres")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.hbm2ddl.auto", "create-drop")
                .buildSessionFactory();
    }

    public static Session create(){
        return sessionFactory.openSession();
    }
}
