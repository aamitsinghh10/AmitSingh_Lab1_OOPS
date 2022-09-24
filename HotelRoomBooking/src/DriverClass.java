import java.util.Scanner;

public class DriverClass {
   static Room room11 = new Room(101,1,RoomStatus.Available,Occupancy.Single,true,RoomPrices.price[0]+1000);
   static Room room12 = new Room(102,1,RoomStatus.Available,Occupancy.Double,true,RoomPrices.price[1]+1000);
   static Room room13 = new Room(103,1,RoomStatus.Available,Occupancy.Double,false,RoomPrices.price[1]);
   static Room room14 = new Room(104,1,RoomStatus.Available,Occupancy.Single,false,RoomPrices.price[0]);

   static Room room21 = new Room(201,2,RoomStatus.Available,Occupancy.Single,true,RoomPrices.price[0]+1000);
   static Room room22 = new Room(202,2,RoomStatus.Available,Occupancy.Single,false,RoomPrices.price[0]);
   static Room room23 = new Room(203,2,RoomStatus.Available,Occupancy.Double,true,RoomPrices.price[1]+1000);
   static Room room24 = new Room(204,2,RoomStatus.Available,Occupancy.Triple,false,RoomPrices.price[2]);

   static Room[][] rooms = {{room11,room12,room13,room14},{room21,room22,room23,room24}};

   static Address address = new Address("Noida",249411,"Uttar Pradesh","Master's Point");
  static  HotelDetails hotel = new HotelDetails("Royal Blue",address,4.6,2,4,rooms);

   public static void main(String[] args) {
      BookingRequest bookingRequest;
      StayDuration duration;
      Customer customer = new Customer("Amit Singh", 24, 894984010);

      Scanner obj = new Scanner(System.in);

      while (true) {
         System.out.println("Do request with Required Conditions");
         System.out.println("Enter which type of room you want: Single Double Triple");
         String occupancy = obj.next();
         System.out.println("Enter on which floor you want Room");
         int floor = obj.nextInt();
         System.out.println("AC is required or not?");
         boolean ac = obj.nextBoolean();
         bookingRequest = new BookingRequest(Occupancy.valueOf(occupancy), floor, ac);
         Room isRoomAvailable = checkInCustomer(bookingRequest, hotel.getTotalRooms());

         if (isRoomAvailable != null) {
            Booking bookingCompleted = bookingCompleteDetails(isRoomAvailable, customer);
            System.out.println("These are your Room Allocation complete details");
            System.out.println("Room Number: " + bookingCompleted.getRoom().getRoom_no() + "," +
                    "floor Number: " + bookingCompleted.getRoom().getFloor_no() + "," +
                    "Air Conditioned" +" "+ bookingCompleted.getRoom().isHasAC() + "," +
                    "" + bookingCompleted.getRoom().getOccupancy() +" " + "Occupancy" + "," +
                    "Estimated: " + bookingCompleted.getRoom().getPrice() + "/Day");
         } else {
            System.out.println("No Room Available that matches with your Request");
         }
      }
   }

      private static Booking bookingCompleteDetails(Room room, Customer customer) {
         int totalPrice = 0;

         if(room.isHasAC()){
            totalPrice += room.getPrice() ;
         }

         return new Booking(room,customer, totalPrice, customer.getDuration());
      }

      private static Room checkInCustomer(BookingRequest bookingRequest, Room[][] rooms) {

         Room room = null;

         if(bookingRequest.getFloor_needed() != 0){
            int i = bookingRequest.getFloor_needed() -1;
            for(int j=0; j<rooms[i].length; j++){
               room = roomAvailable(rooms[i][j], bookingRequest);
               if(room != null )
                  break;
            }
         }
         else{
            for (Room[] value : rooms) {
               for (Room item : value) {
                  room = roomAvailable(item, bookingRequest);
                  if(room != null )break;
               }
            }
         }
         if(room != null)
            room.setRoomStatus(RoomStatus.NotAvailable);
         return room;
      }

      private static Room roomAvailable(Room room, BookingRequest bookingRequest) {

         if (!room.getRoomStatus().equals(RoomStatus.NotAvailable) &&
                 (room.getOccupancy().equals(bookingRequest.getOccupancy()))) {
            if (bookingRequest.getAC_needed()) {
               if (room.isHasAC()) {
                  return room;
               }
               else{
                  return null;
               }
            }
            else {
               return room;
            }
         }
         return null;
      }

   }