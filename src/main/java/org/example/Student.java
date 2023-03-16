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

    public Map<String, ArrayList<Integer>> returnSubject() {
        return marksBySubject;
    }

    public void addSubject(String subjectName) {
        marksBySubject.put(subjectName, new ArrayList<>());
    }

    public void deleteSubject(String subjectName) {
        marksBySubject.remove(subjectName);
    }

    public ArrayList<Integer> returnMark(String subjectName) {
        return marksBySubject.get(subjectName);
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
            throw new IllegalStateException("Нет оценок по этому предмету: " + subjectName);
        }
    }
}