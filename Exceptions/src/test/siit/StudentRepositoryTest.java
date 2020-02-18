package siit;

import org.junit.Test;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class StudentRepositoryTest {
    private static Logger logger = Logger.getLogger(StudentRepositoryTest.class.getName());

    /**
     * This test checks if the student, which has entered valid data, was added to the list
     */
    @Test
    public void addStudent() {
        StudentRepository testRepository = new StudentRepository();
        try {
            testRepository.addStudent("123", "Test", "Student", LocalDate.of(1992, 2, 12), "m");
        } catch (InvalidStudentException e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
        assertEquals(testRepository.getStudentList().size(), 1);
    }

    /**
     * This method checks if the student was succesfully deleted from the list
     */
    @Test
    public void deleteStudent() {
        StudentRepository testRepository = new StudentRepository();
        try {
            testRepository.addStudent("123", "Test", "Student", LocalDate.of(1992, 2, 12), "m");
            testRepository.deleteStudent("123");
        } catch (InvalidStudentException e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
        assertEquals(testRepository.getStudentList().size(), 0);
    }


    /**
     * This method checks if the list with students of a certain age is empty
     */
    @Test
    public void retrieveStudentsWithAgeX() {
        int listSize = 0;
        StudentRepository testRepository = new StudentRepository();
        try {
            testRepository.addStudent("123", "Test", "Student", LocalDate.of(1992, 2, 12), "m");
            listSize = testRepository.retrieveStudentsWithAgeX(28).size();

        } catch (InvalidStudentException e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }

        assertEquals(listSize, 1);
    }
}