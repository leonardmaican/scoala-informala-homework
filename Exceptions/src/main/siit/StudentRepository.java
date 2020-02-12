package siit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * This class emulates a  repository, used to store students
 */

public class StudentRepository {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    /**
     * This method validates the data used to create a student object, then it adds it to the list of students
     *
     * @param id          the students identification number, also known as cnp
     * @param firstName   the student's first name
     * @param lastName    the student's last name
     * @param dateOfBirth the student's date of birth
     * @param gender      the student's gender
     * @throws InvalidStudentException if the parameters passed as arguments do not meet the requirements
     */
    public void addStudent(String id, String firstName, String lastName, LocalDate dateOfBirth, String gender) throws InvalidStudentException {
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new InvalidStudentException("The first or last name cannot be empty");
        }
        if (dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > 2018) {
            throw new InvalidStudentException("The birth year must be between 1900 and 2018");
        }
        if (!gender.contains("F") && !gender.contains("f") && !gender.contains("M") && !gender.contains("m")) {
            throw new InvalidStudentException("The gender must be M or F, both upcase and lowercase");
        }
        if (id.trim().isEmpty()) {
            throw new InvalidStudentException("The id should not be empty");
        }
        Student newStudent = new Student(firstName, lastName, dateOfBirth, gender, id);
        studentList.add(newStudent);

    }

    /**
     * This method checks if the there is a person in the list with the id passed as an argument.
     * If the person is found in the list, it will be deleted
     *
     * @param id the person's to be deleted it
     * @throws InvalidStudentException if the person with that id is not on the list or if the id is empty
     */
    public void deleteStudent(String id) throws InvalidStudentException {
        if (id.trim().isEmpty()) {
            throw new InvalidStudentException("The id must not be empty and must only contain numbers");
        }
        boolean isStudentinlist = false;
        for (int i = 0; i < studentList.size(); i++) {
            if (id.equals(studentList.get(i).getCnp())) {
                isStudentinlist = true;
                studentList.remove(studentList.get(i));
            }

        }
        if (!isStudentinlist) {
            throw new InvalidStudentException("The student is not on the list");
        }

    }

    /**
     * This method creates a list with people that are a certain age
     *
     * @param age the age that will sort the students and add them to the new list
     * @return the list with all students with a certain age
     * @throws InvalidStudentException if the age passed as an argument is lower than 0
     */
    public List retrieveStudentsWithAgeX(Integer age) throws InvalidStudentException {
        if (age < 0) {
            throw new InvalidStudentException("The age must be higher than 0");
        }
        boolean areThereStudentsWithThatAge = false;
        List<Student> studentsWithAgeX = new ArrayList<>();
        for (int i = 0; i < studentList.size(); i++) {
            Period p = Period.between(studentList.get(i).getDateOfBirth(), LocalDate.now());
            if (age.equals(p.getYears())) {
                areThereStudentsWithThatAge = true;
                studentsWithAgeX.add(studentList.get(i));
            }

        }
        if (!areThereStudentsWithThatAge) {
            throw new InvalidStudentException("There are no students with that age");
        }
        return studentsWithAgeX;

    }
}
