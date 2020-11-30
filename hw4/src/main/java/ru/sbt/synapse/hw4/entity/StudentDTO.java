package ru.sbt.synapse.hw4.entity;

public class StudentDTO {
    private final String surname;
    private final String name;
    private final String age;
    private final String id;

    public StudentDTO(String surname, String name, String age, String id) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }


}
