public class Booking {
    private Room room;
    private Customer customer;
    private int totalPrice;
    private StayDuration duration;

    public Booking(Room room,Customer customer, int totalPrice, StayDuration duration){
        this.room = room;
        this.customer = customer;
        this.totalPrice = totalPrice;
        this.duration = duration;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public StayDuration getDuration() {
        return duration;
    }

    public void setDuration(StayDuration duration) {
        this.duration = duration;
    }
}
