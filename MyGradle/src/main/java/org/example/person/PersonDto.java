package org.example.person;

public class PersonDto {
    private String name;
    private int age;
    private String address;
    private String email;
    private String phone;
    private String gender;
    private String nationality;
    private String education;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public PersonDto() {
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
