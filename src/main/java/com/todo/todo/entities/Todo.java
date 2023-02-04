package com.todo.todo.entities;

public class Todo {
  private int id;
  private String title;
  private boolean status;

  public Todo(int id, String title, boolean status) {
    this.id = id;
    this.title = title;
    this.status = status;
  }
  
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isStatus() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }
}
