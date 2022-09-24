public class Room {

    private Occupancy occupancy;
    private Customer customer;
    private int room_no;
    private int floor_no;
    private RoomStatus roomStatus;
    private boolean hasAC;
    private int price;

    public Room(int room_no,int floor_no,RoomStatus roomStatus, Occupancy occupancy,boolean hasAC,int price){
        this.room_no = room_no;
        this.floor_no = floor_no;
        this.roomStatus = roomStatus;
        this.occupancy = occupancy;
        this.hasAC = hasAC;
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Occupancy getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public int getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(int floor_no) {
        this.floor_no = floor_no;
    }

    public int getRoom_no() {
        return room_no;
    }

    public void setRoom_no(int room_no) {
        this.room_no = room_no;
    }

    public RoomStatus getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(RoomStatus roomStatus) {
        this.roomStatus = roomStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }
}
