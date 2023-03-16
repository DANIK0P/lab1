package org.example;

import java.util.ArrayList;

public class Group {
    private int number;
    private ArrayList<Student> students;

    public Group(int number) {
        this.number = number;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(String fullName) {
//        Student stu=new Student( "john smith");
        students.removeIf(student ->student.getFullName().equals(fullName));
//        students.removeIf(stu -> stu.equals(fullName));
    }

    public void addSubject(String subject) {

        students.forEach(student -> student.addSubject(subject));
    }

    public void deleteSubject(String subjectName) {
        students.forEach(student -> student.deleteSubject(subjectName));
    }

    public void addMark(String fullName, String subjectName, int mark) {
        students.stream()
                .filter(student -> student.getFullName().equals(fullName))
                .findFirst()
                .ifPresent(student -> student.addMark(subjectName, mark));
    }

    public void deleteMark(String fullName, String subjectName) {
        students.stream()
                .filter(student -> student.getFullName().equals(fullName))
                .findFirst()
                .ifPresent(student -> student.deleteMark(subjectName));
    }

    public void updateMark(String fullName, String subjectName, int mark) {
        students.stream()
                .filter(student -> student.getFullName().equals(fullName))
                .findFirst()
                .ifPresent(student -> student.updateMark(subjectName, mark));
    }


}
//public class School {
//  private int schoolNumber;
//  private List<Student> students;
//
//  public School(int schoolNumber) {
//    this.schoolNumber = schoolNumber;
//    this.students = new ArrayList<>();
//  }
//
//  public void addStudent(Student student) {
//    students.add(student);
//  }
//
//  public void removeStudent(String name) {
//    for (Student student : students) {
//      if (student.getName().equals(name)) {
//        students.remove(student);
//        break;
//      }
//    }
//  }
//
//  public void addSubject(String subjectName) {
//    for (Student student : students) {
//      student.addSubject(subjectName);
//    }
//  }
//
//  public void removeSubject(String subjectName) {
//    for (Student student : students) {
//      student.removeSubject(subjectName);
//    }
//  }
//
//  public void changeGrade(String studentName, String subjectName, int grade) {
//    for (Student student : students) {
//      if (student.getName().equals(studentName)) {
//        student.changeGrade(subjectName, grade);
//        break;
//      }
//    }
//  }
//}


