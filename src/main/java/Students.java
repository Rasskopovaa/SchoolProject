public class Students extends Human {
    int marks;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Students(String surname, String name, int marks) {
        this.setSurname(surname);
        this.setName(name);
        this.setMarks(marks);
    }

    @Override
    public String toString() {
        return "Students{" +
        "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", marks=" + marks +
                '}';
    }
}
