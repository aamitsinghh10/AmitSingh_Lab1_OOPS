public class BookingRequest {
    private Occupancy occupancy;
    private int floor_needed;
    private boolean ac_needed;

    public BookingRequest(Occupancy occupancy, int floor_number, boolean ac) {
        this.occupancy = occupancy;
        this.floor_needed = floor_number;
        this.ac_needed = ac;
    }

    public Occupancy getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public int getFloor_needed() {
        return floor_needed;
    }

    public void setFloor_number(int floor_needed) {
        this.floor_needed = floor_needed;
    }

    public boolean getAC_needed() {
        return ac_needed;
    }

    public void setAC(boolean ac) {
        this.ac_needed = ac;
    }
}
