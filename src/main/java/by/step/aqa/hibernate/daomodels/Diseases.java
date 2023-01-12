package by.step.aqa.hibernate.daomodels;


import javax.persistence.*;

@Entity
public class Diseases {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Severity")
    private int severity;


    public Diseases(int id, String name, int severity) {
        this.id = id;
        this.name = name;
        this.severity = severity;
    }

    public Diseases() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Diseases{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", severity=" + severity +
                '}';
    }
}