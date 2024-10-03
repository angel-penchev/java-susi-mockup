package dev.penchev.susi.course;

import dev.penchev.susi.user.Teacher;
import dev.penchev.susi.SUSI;
import java.util.ArrayList;

public class MandatoryCourse extends BaseCourse {
  private int year;

  public MandatoryCourse(String name, int credits, ArrayList<Teacher> teachers, int year) {
    super(name, credits, teachers);

    SUSI.getStudents().forEach(student -> {
      if (student.getYear() == year) {
        addStudent(student);
      }
    });
  }

  public int getYear() {
    return year;
  }
}
