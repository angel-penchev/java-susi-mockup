package dev.penchev.susi.user;

public class BaseUser {
  private String name;
  private String email;
  private String password;
  private String socialSecurityNumber;
  private String address;

  public BaseUser(String name, String email, String password, String socialSecurityNumber, String address) {
    this.name = name;
    this.email = email;
    this.password = password;
    this.socialSecurityNumber = socialSecurityNumber;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }

  public String getAddress() {
    return address;
  }
}
