public class Customer {
    private String customer_name;
    private int age;
    private long mob_no;
    private BookingRequest bookingRequest;
    private Address customer_Address;
    private StayDuration duration;

    public Customer(String name,int age,long mob_no, BookingRequest bookingRequest,StayDuration duration){
        this.customer_name = name;
        this.age = age;
        this.mob_no = mob_no;
        this.bookingRequest = bookingRequest;
        this.duration = duration;
    }
    public Customer(String name, int age, int mob_no){
        this.customer_name = name;
        this.age = age;
        this. mob_no = mob_no;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Address getCustomer_Address(){
        return customer_Address;
    }

    public void setCustomer_Address(Address customer_Address) {
        this.customer_Address = customer_Address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMob_no() {
        return mob_no;
    }

    public void setMob_no(long mob_no) {
        this.mob_no = mob_no;
    }

    public BookingRequest getBookingRequest() {
        return bookingRequest;
    }

    public void setBookingRequest(BookingRequest bookingRequest) {
        this.bookingRequest = bookingRequest;
    }

    public StayDuration getDuration() {
        return duration;
    }

    public void setDuration(StayDuration duration) {
        this.duration = duration;
    }
}
