package Lectures.week1.training1.chapter_57;

import java.io.*;

public class SerializeExampleTest {
    public static void main(String[] args) {
        Person person = new Person("lee", "male", 30, "Korea", "장수");

        byte[] serializedData = null;

        try (ByteArrayOutputStream bao = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);
        ) {
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();

            serializedData = bao.toByteArray();
            System.out.println("Person 직렬화 후 : " + new String(serializedData));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ByteArrayInputStream bio = new ByteArrayInputStream(serializedData);
             ObjectInputStream objectInputStream = new ObjectInputStream(bio)
        ) {
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("직렬화된 Data 다시 Person으로 역직렬화: " + person1);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
