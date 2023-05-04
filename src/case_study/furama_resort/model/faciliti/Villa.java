package case_study.furama_resort.model.faciliti;

public class Villa extends Facility {
    private String swimmingPoolArea;
    private String roomStandard;
    private String numberOfFloors;

    public Villa() {

    }

    public Villa(String idService, String nameService, String utilities, String taxExpense, String numberOfPerson, String rentalType, String price, String swimmingPoolArea) {
        super(idService, nameService, utilities, taxExpense, numberOfPerson, rentalType, price);
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public Villa(String id, String name, String utilities, String taxExpense, String numberOfPerson, String rentalType) {
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
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
        return "Villa{" +
                "swimmingPoolArea='" + swimmingPoolArea + '\'' +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                '}';
    }
    public String writeToFile(){
      return    getIdService() + "," +
                getNameService() + "," +
                getUtilities() + "," +
                getTaxExpense() + "," +
                getNumberOfPerson() + "," +
                getTaxExpense() + "," +
                getSwimmingPoolArea() + "," +
                getRoomStandard() + "," +
                getNumberOfFloors() + "," +
                '}';
    }
}
