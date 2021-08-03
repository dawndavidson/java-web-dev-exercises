package org.launchcode.java.demos.lsn3classes1;


public class SchoolPractice {

    public static void main(String[] args) {
        Student firstStudent = new Student("Dawn", 156525, 1, 4.0);

        System.out.println("The GPA for this student is " + firstStudent.getGpa() + "The Name of this student is " + firstStudent.getName() + firstStudent.getStudentId() + firstStudent.getNumberOfCredits());
        // Instantiate your Student class for part 2 here!
    }

}
