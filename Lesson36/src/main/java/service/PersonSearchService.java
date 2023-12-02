package service;

import config.HibernateConfig;
import dto.PersonSearchDto;
import dto.TaskSearchDto;
import entity.PersonEntity;
import org.apache.commons.lang3.BooleanUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import static java.util.Objects.nonNull;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class PersonSearchService {

    public List<PersonEntity> searchPerson (PersonSearchDto search){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(PersonEntity.class);
        List result;
        if(search == null){
            result = criteria.list();
        } else {
            if (isNotBlank(search.getName())){
                criteria.add(Restrictions.eq("name", search.getName()));
            }

            if (nonNull(search.getType())){
                criteria.add(Restrictions.eq("type", search.getType()));
            }

            if (BooleanUtils.isTrue(search.getIsMan())) {
                criteria.add(Restrictions.eq("isMan", search.getIsMan()));
            }

            if (search.getBirthdayFrom() != null && search.getBirthdayTo() != null){
                criteria.add(Restrictions.between("birthday", search.getBirthdayFrom(), search.getBirthdayTo()));
            }
        }
        result = criteria.list();
        transaction.commit();
        session.close();
        return  result;
    }

        public List<PersonEntity> searchPersonByTask (TaskSearchDto search){
        Session session = HibernateConfig.create();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(PersonEntity.class, "pe");
        List result;
            if(search == null){
                result = criteria.list();
            } else {
                if (nonNull(search.getStatus())) {
                    criteria.createAlias("pe.task", "tasks")
                            .add(Restrictions.eq("tasks.status", search.getStatus()));
                }
            }

        result = criteria.list();
        transaction.commit();
        session.close();
        return result;
    }
}
