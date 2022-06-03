package hibernatedemo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ShowStudentInfo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //create a session

        Session session = factory.getCurrentSession();

        try {
            //create a student object
            Student tempStudent = new Student("john","doe","john@gamail.com");
            //start transaction
            session.beginTransaction();
            //save student object
            session.save(tempStudent);
            //commit changes
            session.getTransaction().commit();

        //get a new session
            session = factory.getCurrentSession();
            session.beginTransaction();


            //retrieve the student details
            System.out.println("\nGetting student with id: " + tempStudent.getId());
            Student myStudent = session.get(Student.class, tempStudent.getId());
            System.out.println(myStudent);

            session.getTransaction().commit();

        }
        finally {
            factory.close();
        }





    }
}
