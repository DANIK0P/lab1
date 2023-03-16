package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String fullName;
    private Map<String, ArrayList<Integer>> marksBySubject;

    public Student(String fullName) {
        this.fullName = fullName;
        this.marksBySubject = new HashMap<>();
    }

    public String getFullName() {
        return fullName;
    }

    public void addSubject(String subjectName) {
        marksBySubject.put(subjectName, new ArrayList<>());
    }

    public void deleteSubject(String subjectName) {
        marksBySubject.remove(subjectName);
    }

    public void addMark(String subjectName, int mark) {
        marksBySubject.get(subjectName).add(mark);
    }

    public void deleteMark(String subjectName) {
        marksBySubject.put(subjectName, new ArrayList<>());
    }

    public void updateMark(String subjectName, int mark) {
        ArrayList<Integer> marks = marksBySubject.get(subjectName);
        if (marks.size() > 0) {
            marks.set(marks.size() - 1, mark);
        } else {
            throw new IllegalStateException("There are no marks for subject " + subjectName);
        }
    }
}
//public class Student {
//  private String name;
//  private Map<String, Integer> grades;
//
//  public Student(String name) {
//    this.name = name;
//    this.grades = new HashMap<>();
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void addSubject(String subjectName) {
//    grades.put(subjectName, 0);
//  }
//
//  public void removeSubject(String subjectName) {
//    grades.remove(subjectName);
//  }
//
//  public void changeGrade(String subjectName, int grade) {
//    grades.put(subjectName, grade);
//  }
//}