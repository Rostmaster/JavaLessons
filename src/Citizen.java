public class Citizen extends Human {
    String email;
    String phone;
    String address;

    public Citizen(String name, int age, Boolean isMale, String address) {
        super(name, age, isMale);
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "email='" + email + '\'' + "\n" +
                "phone='" + phone + '\'' + "\n" +
                "address='" + address + '\'';
    }
}
