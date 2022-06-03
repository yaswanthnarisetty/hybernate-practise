package hibernatedemo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class QueryStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //create a session

        Session session = factory.getCurrentSession();

        try {
            //start transaction
            session.beginTransaction();

            List<Student> theStudents = session.createQuery("from Student").getResultList();

            displayStudents(theStudents);

            theStudents = session.createQuery("from Student s where s.lastName = 'yuga' ").getResultList();

            displayStudents(theStudents);


            theStudents = session.createQuery("from Student s where s.firstName = 'yash' or s.lastName = 'doe' ").getResultList();

            displayStudents(theStudents);
            //commit changes
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }





    }

    private static void displayStudents(List<Student> theStudents) {
        for(Student tempStudent : theStudents){

            System.out.println(tempStudent);
        }
    }
}
