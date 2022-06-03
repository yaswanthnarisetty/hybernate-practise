package hibernatedemo;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //create a session

        Session session = factory.getCurrentSession();

        try {
            //create a student object
            Student tempStudent = new Student("yash","yuga","yash@gamail.com");
            //start transaction
            session.beginTransaction();
            //save student object
            session.save(tempStudent);

            //commit changes
            session.getTransaction().commit();
        }
        finally {
            factory.close();
        }





    }
}
