package lk.madushanka.mongo.test.mongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;


@Document(collation = "student")
public class Student implements Serializable {
    @Id
    private String  id;
    private String Name;
    private String Address;
    private int Telephone;

    public Student() {
    }

    public Student(String id, String name, String address, int telephone) {
        this.id = id;
        Name = name;
        Address = address;
        Telephone = telephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int telephone) {
        Telephone = telephone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Telephone=" + Telephone +
                '}';
    }
}
