package entity;

public class Student {
    private String enrolID;
    private String firstName;
    private String lastName;
    private Integer age;

    public Student(String enrolID, String firstName, String lastName, Integer age) {
        this.enrolID = enrolID;
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEnrolID() {
        return enrolID;
    }

    public void setEnrolID(String enrolID) {
        this.enrolID = enrolID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
