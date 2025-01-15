package dev.penchev.susi.course;

import java.util.ArrayList;
import dev.penchev.susi.user.Teacher;
import dev.penchev.susi.user.Student;

public class BaseCourse {
  private String name;
  private int credits;
  private ArrayList<Teacher> teachers;
  private ArrayList<Student> students;

  public BaseCourse(String name, int credits, ArrayList<Teacher> teachers) {
    this.name = name;
    this.credits = credits;
    this.teachers = teachers;
    this.students = new ArrayList<Student>();
  }

  public String getName() {
    return name;
  }

  public int getCredits() {
    return credits;
  }

  public ArrayList<Teacher> getTeachers() {
    return teachers;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void addStudent(Student student) {
    for (Student s : students) {
      if (s.getName().equals(student.getName())) {
        // throw IllegalArgumentException("Student is already in the course");
      }
    }

    students.add(student);
  }
}
