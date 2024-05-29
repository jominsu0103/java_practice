package org.example;

import org.example.person.Person;
import org.example.person.PersonDto;
import org.example.person.PersonMapStruct;

public class Main {
    public static void main(String[] args) {
        PersonDto personDto = new PersonDto();
        personDto.setName("lee");
        personDto.setAge(30);
        personDto.setAddress("123 street , City");
        personDto.setEmail("example@example.com");
        personDto.setPhone("123-456-7890");
        personDto.setGender("male");
        personDto.setNationality("Korea");
        personDto.setEducation("seoul's Degree");

        System.out.println(personDto);

        Person person = new Person();
        person.setFullName(personDto.getName());
        person.setYears(personDto.getAge());
        System.out.println(person);

        Person person1 = PersonMapStruct.INSTANCE.personDtoToPerson(personDto);
        System.out.println(person1);
    }
}