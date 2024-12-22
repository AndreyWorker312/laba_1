package Estimation_of_Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        setStudents(students);

        System.out.println("Начальный список студентов: " + students.toString());

        delete_Student(students);// Удаление студентов

        System.out.println("Список студентов, которые переводятся на следующий курс: " + students.toString());

        printStudents(students,2); // возвращает имена студентов которые учатся на данном курсе (course)

    }
    public static void setStudents(List<Student> students){
        students.add(new Student("Андрей","ПТМ", 1, 4.2));
        students.add(new Student("Витя","БВ", 4, 5.0));
        students.add(new Student("Виталя","ЭБ", 1, 1.2));
        students.add(new Student("Маша","ЭБ", 3, 3.7));
        students.add(new Student("Паша","ПТМ", 2, 3.4));
        students.add(new Student("Света","ПАС", 5, 4.9));
        students.add(new Student("Ира","ЯФ", 2, 2.8));
        students.add(new Student("Света","БВ", 4, 3.1));
        students.add(new Student("Андрей","ПИ", 2, 5.0));
        students.add(new Student("Георгий","ПТМ", 1, 1.9));
    }
    public static void delete_Student(List<Student> students) {
        for(int i = 0; i < students.size(); i++) {
            if (students.get(i).getEstimation() < 3.0) {
                students.remove(i);
            }
        }
    }
    public static void printStudents(List<Student> students, int course) {
        System.out.printf("Студенты которые учаться на " + course + " курсе: ");
        for(Student student: students) {
            if (student.getCourse() == course) {
                System.out.printf(student.getName() + " ");
            }
        }
    }
}
