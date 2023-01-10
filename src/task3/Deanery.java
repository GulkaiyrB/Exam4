package task3;

import java.util.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class Deanery {
    public static int START_COURSE = 1;
    public static int FINISH_COURSE = 5;

    private static List<Student> students;
    private static List<Student> graduates;

    public Deanery() {
        students = new LinkedList<Student>();
        graduates = new LinkedList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(java.util.List<Student> students) {
        this.students = students;
    }

    public List<Student> getGraduates() {
        return graduates;
    }

    public void setGraduates(List<Student> graduates) {
        this.graduates = graduates;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void fillStudentsList() {
        students.add(new Student("Бакытбекова Гулкайыр",2,"JV-22"));
        students.add( new Student("Чернова Елена",1,"JV-22"));
        students.add( new Student("Ким Беназир",4,"JV-22"));;
        students.add(new Student("Исаев Байыш",2,"JV-22"));
        students.add( new Student("Окенов Изат",3,"PT-22"));

    }


    public void fillStudentsSummaryList() {
        for (Student student : students) {
            student.fillSummaryList();
        }
    }

    public void printStudentsInfo() {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public void printGraduatesInfo() {
        for (Student graduate : graduates) {
            System.out.println(graduate);
        }
        System.out.println();
    }

    public void makeDecision() {
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (averageMark(student) >= 3) {
                student.updateCourse();
                if (student.isGraduate()) {
                    iterator.remove();
                    graduates.add(student);
                } else {
                    iterator.set(student);
                }
            } else {
                iterator.remove();
            }
        }
    }

    public double averageMark(Student student) {
        double averageMark = 0;
        for (Integer integer : student.getResults().values()) {
            averageMark += integer;
        }
        averageMark /= student.subjectsNumber();
        return averageMark;
    }
}
