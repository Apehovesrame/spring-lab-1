package ru.kafpin.springlab1;

public class Student {
    private long id;
    private String surname;
    private String name;
    private String patronymic;
    private String email;
    private int enrollmentYear;
    private String group;
    private String login;

    public Student() {
    }

    public void generateGroupAndLogin() {
        String yearStr = String.valueOf(enrollmentYear);
        String lastTwoDigits = yearStr.length() > 2 ? yearStr.substring(yearStr.length() - 2) : yearStr;
        this.group = "ПИНз-1" + lastTwoDigits;

        this.login = "student-" + this.group.toLowerCase() + "-" + this.id;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPatronymic() { return patronymic; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getEnrollmentYear() { return enrollmentYear; }
    public void setEnrollmentYear(int enrollmentYear) { this.enrollmentYear = enrollmentYear; }

    public String getGroup() { return group; }
    public String getLogin() { return login; }
}