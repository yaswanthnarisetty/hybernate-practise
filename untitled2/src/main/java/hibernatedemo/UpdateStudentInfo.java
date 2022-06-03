package hibernatedemo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentInfo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //create a session

        Session session = factory.getCurrentSession();

        try {
            int studentId=3;
        //get a new session
            session = factory.getCurrentSession();
            session.beginTransaction();

            Student myStudent = session.get(Student.class,studentId);
            myStudent.setLastName("uchiha");
            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }





    }
}
