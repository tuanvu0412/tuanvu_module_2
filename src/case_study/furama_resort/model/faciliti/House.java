package case_study.furama_resort.model.faciliti;

public class House extends Facility {
    private String roomStandard;
    private String numberOfFloors;

    public House() {

    }

    public House(String idService, String nameService, String utilities, String taxExpense, String numberOfPerson, String rentalType, String price, String roomStandard, String numberOfFloors) {
        super(idService, nameService, utilities, taxExpense, numberOfPerson, rentalType, price);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "id" + getIdService() + "," +
                "name" + getNameService() + "," +
                "utilities" + getUtilities() + "," +
                "taxExpense" + getTaxExpense() + "," +
                "rentalType" + getRentalType() + "," +
                "numberOfPerson" + getNumberOfPerson() + "," +
                "price" + getPrice() + "," +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }

    public String writeToFile() {
        return getIdService() + "," +
                getNameService() + "," +
                getUtilities() + "," +
                getTaxExpense() + "," +
                getNumberOfPerson() + "," +
                getRentalType() + "" +
                getPrice() + "," +
                getRoomStandard() + "," +
                getNumberOfFloors();
    }

}
