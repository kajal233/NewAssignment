import com.jprogrammers.model.Course;
import com.jprogrammers.model.User;
import com.jprogrammers.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;


public class Test {

    public static void main(String[] args) {
        User user1 = new User();
        user1.setFirstName("vahid");
        user1.setFirstName("forghani");

        User user2 = new User();
        user2.setFirstName("alireza");
        user2.setLastName("akbariyan");

        Course course1 = new Course();
        course1.setName("mathematics");

        Course course2 = new Course();
        course2.setName("physics");

        Session session = HibernateUtil.getSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();

        session.save(course1);
        session.save(course2);

        List<Course> courses = new ArrayList<Course>();
        courses.add(course1);
        courses.add(course2);

        user1.setCourses(courses);
        user2.setCourses(courses);

        session.save(user1);
        session.save(user2);

        transaction.commit();
        session.flush();
        session.close();
    }

}