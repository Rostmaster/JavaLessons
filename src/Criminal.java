public class Criminal extends Citizen {
    Boolean isUnderSurveillance;
    Boolean isArrested;
    Boolean isUnderParoll;
    Boolean isConvicted;
    String crime;


    public Criminal(String name, int age, Boolean isMale, String address, String crime) {
        super(name, age, isMale, address);
        this.crime = crime;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "isUnderSurveillance=" + isUnderSurveillance + "\n" +
                "isArrested=" + isArrested + "\n" +
                "isUnderParoll=" + isUnderParoll + "\n" +
                "isConvicted=" + isConvicted + "\n" +
                "crime='" + crime + '\'';
    }
}
