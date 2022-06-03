package hibernatedemo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentInfo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //create a session

        Session session = factory.getCurrentSession();

        try {
            int studentId=7;
        //get a new session
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student myStudent = session.get(Student.class,studentId);
            //delete the row with student id
            //session.delete(myStudent);

            //del with session query

            session.createQuery("delete from Student where id = 6").executeUpdate();
            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }





    }
}
