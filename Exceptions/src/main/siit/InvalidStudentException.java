package siit;

/**
 * This is a custom exception created for the purposes of this assignment
 */
public class InvalidStudentException extends Exception {
    public InvalidStudentException(String message) {
        super(message);
    }
}
