package by.step.aqa.hibernate.daomodels;

import javax.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;
    @Column(name = "Name")
    String name;

    @Column(name = "Phone")
    String phone;

    @Column(name = "Salary")
    double salary;

    @Column(name = "Surname")
    String surname;

    double premium;

    public Doctor() {

    }

    public Doctor(long id, String name, String phone, double salary, String surname, double premium) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.surname = surname;
        this.premium = premium;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Doctors{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", surname='" + surname + '\'' +
                ", premium=" + premium +
                '}';
    }
}
