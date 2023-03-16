package org.example;

import java.util.ArrayList;

public class Group {
    private int number;
    private ArrayList<Student> students;

    public Group(int number) {
        this.number = number;
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> returnStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String fullName) {
        students.removeIf(student -> student.getFullName().equals(fullName));
    }

    public void addSubject(String subject) {
        students.forEach(student -> student.addSubject(subject));
    }

    public void deleteSubject(String subjectName) {
        students.forEach(student -> student.deleteSubject(subjectName));
    }

    public void addMark(String fullName, String subjectName, int mark) {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                student.addMark(subjectName, mark);
                break;
            }
        }
    }

    public void deleteMark(String fullName, String subjectName) {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                student.deleteMark(subjectName);
                break;
            }
        }
    }

    public void updateMark(String fullName, String subjectName, int mark) {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                student.updateMark(subjectName, mark);
                break;
            }
        }
    }
}