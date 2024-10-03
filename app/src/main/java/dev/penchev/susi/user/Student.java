package dev.penchev.susi.user;

import dev.penchev.susi.Faculty;

public class Student extends BaseUser {
  String facultyNumber;
  Faculty faculty;
  int year;
  int group;

  public Student(String name, String email, String password, String socialSecurityNumber, String address,
      String facultyNumber, Faculty faculty, int group) {
    super(name, email, password, socialSecurityNumber, address);

    this.facultyNumber = facultyNumber;
    this.faculty = faculty;
    this.year = 1;
    this.group = group;

  }

  public String getFacultyNumber() {
    return facultyNumber;
  }

  public Faculty getFaculty() {
    return faculty;
  }

  public int getYear() {
    return year;
  }

  public int getGroup() {
    return group;
  }

  public void incrementYear() {
    year++;
  }
}
