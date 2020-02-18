package siit;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is a main class for the student repository
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        StudentRepository students=new StudentRepository();


        try {
            students.addStudent("123456","George","Nichols",LocalDate.of(1985,3,3),"m");
            students.addStudent("123789","Michael","Newsted",LocalDate.of(1985, 8,9),"M");
            students.addStudent("124568","Diane","Alexander", LocalDate.of(1985, 6,7),"f");
            students.addStudent("789123","Elisabeth","Harper",LocalDate.of(1985,12,12),"F");
            students.addStudent("123","a","b",LocalDate.of(1985,9,9),"m");
        } catch (InvalidStudentException e) {
            logger.log(Level.SEVERE,e.getMessage());
            e.printStackTrace();
        }
        try {
            students.deleteStudent("123");
        } catch (InvalidStudentException e) {
            logger.log(Level.WARNING,e.getMessage());
            e.printStackTrace();
        }
        try {
           List allStudentsAged35 =students.retrieveStudentsWithAgeX(34);
            System.out.println(allStudentsAged35.toString());
        } catch (InvalidStudentException e) {
            logger.log(Level.WARNING,e.getMessage());
            e.printStackTrace();
        }

    }
}
