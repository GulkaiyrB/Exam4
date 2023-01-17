package task5;

class Student implements Comparable<Student> {

    String name;

    Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }

    public int compareTo(Student stu) {
        return this.name.compareTo(stu.name);
    }
}

