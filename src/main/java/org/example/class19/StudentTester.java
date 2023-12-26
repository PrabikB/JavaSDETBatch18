package org.example.class19;

public class StudentTester {
    public static void main(String[] args) {

        Student[] arr = {new StntaxStudent(),new CollegeStudent(), new SchoolStudent()};

        for (int i = 0; i < arr.length; i++) {
            Student st = arr[i];
            st.study();
            st.exam();st.askQuestion();

            /*Student[] arr = {new Student(), new SyntaxStudents(), new CollegeStudent(), new SchoolStudent()};
        for (Student student : arr) {
            student.homework();
            student.exam();
            student.study();
            if(student instanceof SyntaxStudents ){
              SyntaxStudents s=  (SyntaxStudents)student;
              s.play();

             */

        }

    }
}
