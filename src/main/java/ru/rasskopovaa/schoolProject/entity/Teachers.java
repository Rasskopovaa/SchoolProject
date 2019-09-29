package ru.rasskopovaa.schoolProject.entity;

public class Teachers extends Human {
    String patronymic;

    String subjects;

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public Teachers(String surname, String name, String patronymic, String subjects) {
        this.setSurname(surname);
        this.setName(name);
        this.setPatronymic(patronymic);
        this.setSubjects(subjects);
    }

    @Override
    public String toString() {
        return "ru.rasskopovaa.schoolProject.entity.Teachers{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", subject=" + subjects +
                '}';
    }
}
