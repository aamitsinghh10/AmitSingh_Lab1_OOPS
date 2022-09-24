public class Address {
    private String city;
    private int pinCode;
    private String state;
    private String streetName;

    public Address(String city, int pinCode, String state, String streetName){
        this.city = city;
        this.pinCode = pinCode;
        this.state = state;
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetNo(String streetName) {
        this.streetName = streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
