package com.example.demo.todo;

public class Todo {
    Integer id;
    private String name;
    private String details;
    private Integer status;

    public Todo() {
    }

    public Todo(Integer id, String name, String details, Integer status) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", status=" + status +
                '}';
    }
}
