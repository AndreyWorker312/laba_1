package Estimation_of_Student;

import java.util.List;

public class Student {

    public Student(String name, String group, int course, double estimation) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.estimation = estimation;
    }


    @Override
    public String toString() {
        return (name + "//" + group + "//" + course + "//" + estimation);
    }


    private String name, group;
    private int course;
    private double estimation;

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public double getEstimation() {
        return estimation;
    }
}
