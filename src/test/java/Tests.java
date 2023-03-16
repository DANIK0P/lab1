import org.example.Group;
import org.example.Student;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Tests {

//      1. Тест на добавление студента в группу:


    @Test
    public void testAddStudent() {
        Group group = new Group(1);
        Student student = new Student("John Smith Li");
        group.addStudent(student);
        assertEquals(group.returnStudents().size(), 1);
        assertTrue(group.returnStudents().contains(student));
    }


//        2. Тест на удаление студента из группы:


    @Test
    public void testDeleteStudent() {
        Group group = new Group(1);
        Student student = new Student("John Smith Li");
        group.addStudent(student);
        group.deleteStudent("John Smith Li");
        assertFalse(group.returnStudents().contains(student));
    }


//        3. Тест на добавление предмета для всех студентов в группе:


    @Test
    public void testAddSubject() {
        Group group = new Group(1);
        Student student1 = new Student("John Smith Li");
        Student student2 = new Student("Петров Петр Петрович");
        group.addStudent(student1);
        group.addStudent(student2);
        group.addSubject("Математика");
        assertTrue(student1.returnSubject().containsKey("Математика"));
        assertTrue(student2.returnSubject().containsKey("Математика"));
    }


//        4. Тест на удаление предмета у всех студентов в группе:


    @Test
    public void testDeleteSubject() {
        Group group = new Group(1);
        Student student1 = new Student("John Smith Li");
        Student student2 = new Student("Петров Петр Петрович");
        group.addStudent(student1);
        group.addStudent(student2);
        student1.addSubject("Математика");
        student2.addSubject("Программирование");
        group.deleteSubject("Математика");
        assertFalse(student1.returnSubject().containsKey("Математика"));
        assertTrue(student2.returnSubject().containsKey("Программирование"));
    }


//        5. Тест на добавление оценки для студента по предмету:


    @Test
    public void testAddMark() {
        Group group = new Group(1);
        Student student = new Student("John Smith Li");
        group.addStudent(student);
        group.addSubject("Математика");
        group.addMark("John Smith Li", "Математика", 5);
        assertEquals(5, student.returnMark("Математика").get(0));
    }


//        6. Тест на удаление оценки для студента по предмету:


    @Test
    public void testDeleteMark() {
        Group group = new Group(1);
        Student student = new Student("John Smith Li");
        group.addStudent(student);
        group.addSubject("Математика");
        group.addMark("John Smith Li", "Математика", 5);
        group.deleteMark("John Smith Li", "Математика");
        assertTrue(student.returnMark("Математика").isEmpty());
    }


//        7. Тест на обновление оценки для студента по предмету:


    @Test
    public void testUpdateMark() {
        Group group = new Group(1);
        Student student = new Student("John Smith Li");
        group.addStudent(student);
        group.addSubject("Математика");
        group.addMark("John Smith Li", "Математика", 4);
        group.updateMark("John Smith Li", "Математика", 5);
        assertEquals(student.returnMark("Математика").get(0), 5);
    }
}