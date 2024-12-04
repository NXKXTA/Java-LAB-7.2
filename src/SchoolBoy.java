public class SchoolBoy {
    private String surname;
    private String name;
    private byte numClass;
    private String subject;
    private byte grade;

    public SchoolBoy() {
        this.surname = "";
        this.name = "";
        this.numClass = 0;
        this.subject = "";
        this.grade = 0;
    }

    public SchoolBoy(String surname, String name, byte numClass, String subject, byte grade) {
        this.surname = surname;
        this.name = name;
        this.numClass = numClass;
        this.subject = subject;
        this.grade = grade;
    }

    public boolean equal(String subject) {
        return this.subject.equals(subject);
    }

    public boolean equal(byte grade) {
        return this.grade == grade;
    }

    public boolean equal(String surname, String name) {
        return this.surname.equals(surname) && this.name.equals(name);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumClass(byte numClass) {
        this.numClass = numClass;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setGrade(byte grade) {
        this.grade = grade;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public byte getNumClass() {
        return numClass;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }
}