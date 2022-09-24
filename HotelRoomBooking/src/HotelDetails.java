public class HotelDetails {
    private String hotelName;
    private Address address;
    private Double rating;
    private int totalFloors;
    private int roomsPerFloor;
    private Room[][] totalRooms;

    public HotelDetails(String hotelName, Address address, Double rating,int totalFloors,int roomsPerFloor,Room[][] totalRooms){
        this.hotelName = hotelName;
        this.address = address;
        this.rating = rating;
        this.totalFloors = totalFloors;
        this.roomsPerFloor = roomsPerFloor;
        this.totalRooms = totalRooms;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getRoomsPerFloor() {
        return roomsPerFloor;
    }

    public void setRoomsPerFloor(int roomsPerFloor) {
        this.roomsPerFloor = roomsPerFloor;
    }

    public Room[][] getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(Room[][] totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }
}
