package dev.penchev.susi;

import dev.penchev.susi.user.Student;
import dev.penchev.susi.course.BaseCourse;
import java.util.ArrayList;

public class SUSI {
  private static ArrayList<Student> students;
  private static ArrayList<BaseCourse> courses;

  public static void main(String[] args) {
  }

  public static ArrayList<Student> getStudents() {
    return students;
  }
}
