package by.step.aqa.hibernate.service;

import by.step.aqa.hibernate.daomodels.Departments;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class DepartmentService {

    public List<Departments> getAllDepartments() {
        Transaction transaction = null;
        List<Departments> resultSet = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Departments> cq = cb.createQuery(Departments.class);
            Root<Departments> rootEntry = cq.from(Departments.class);
            CriteriaQuery<Departments> all = cq.select(rootEntry);
            TypedQuery<Departments> allQuery = session.createQuery(all);
            resultSet = allQuery.getResultList();
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return resultSet;
    }

    public void saveDepartment(Departments departments) {
        Transaction transaction = null;
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(departments);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}