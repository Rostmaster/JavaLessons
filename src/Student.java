public class Student extends Criminal {
    String university;
    String course;
    String group;
    String purposeOfStudy;
    String specialization;
    Boolean wasGraduated;

    Student(String name, int age, Boolean isMale, String address,
            String crime, String course, String university) {
        super(name, age, isMale, address, crime);
        this.university = university;
        this.course = course;
    }

    Student(String name, int age, Boolean isMale, Citizen citizen, String crime, String course, String university) {
        super(name, age, isMale, citizen.address, crime);
        this.email = citizen.email;
        this.phone = citizen.phone;
        this.university = university;
        this.course = course;
    }

    public String toString() {
        return super.toString() + "\n" +
                "university='" + university + '\'' + "\n" +
                "course='" + course + '\'' + "\n" +
                "group='" + group + '\'' + "\n" +
                "purposeOfStudy='" + purposeOfStudy + '\'' + "\n" +
                "specialization='" + specialization + '\'' + "\n" +
                "wasGraduated=" + wasGraduated;
    }

}
