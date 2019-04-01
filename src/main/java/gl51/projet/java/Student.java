package gl51.projet.java;

import java.util.Objects;

public class Student {
    private String name;
    private String prenom;

    public Student() {
        this.name = "";
        this.prenom = "";
    }

    public Student(String name, String prenom) {
        this.name = name;
        this.prenom = prenom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                prenom.equals(student.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prenom);
    }
}
