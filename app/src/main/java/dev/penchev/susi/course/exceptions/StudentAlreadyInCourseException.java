package dev.penchev.susi.course.exceptions;

public class StudentAlreadyInCourseException extends Exception {
  public StudentAlreadyInCourseException() {
    super("Student is already in the course");
  }
}
