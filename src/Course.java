public class Course {
    String name;
    int capacity;
    String teacher;
    Student[] audience;

    public Course(String name, int capacity, String teacher) {
        this.name = name;
        this.capacity = capacity;
        this.teacher = teacher;
        this.audience = new Student[capacity];
    }

    public RegisteredStudent registerStudent(Student student) {
        for (int i = 0; i < capacity; i++) {
            if (audience[i] == null || audience[i].equals(student)) {
                student.course = this.name;
                audience[i] = student;
                return new RegisteredStudent(student, true);
            }
        }
        return new RegisteredStudent(student, false);
    }

    public String toString() {
        StringBuilder result = new StringBuilder("Course: " + name + "\nTeacher: " + teacher + "\n" + "Audience: \n");
        for (int i = 0; i < capacity; i++) {
            if (audience[i] != null) {
                result.append(audience[i].name).append("\n");
            }
        }
        return result.toString();
    }
}

