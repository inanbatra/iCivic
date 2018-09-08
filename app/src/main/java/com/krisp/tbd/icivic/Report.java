package com.krisp.tbd.icivic;

public class Report{
  private String type;
  private User reporter;

  public Report(String type, User user,Image image) {
    this.type = type;
    this.reporter = user;
    this.image = image;
  }

  public void setType(String t) {
    this.type = t;
  }

  public String getType() {
    return this.type;
  }

  public void setUser(User user) {
    this.reporter = user;
  }

  public User getUser() {
    return this.reporter;
  }
}
