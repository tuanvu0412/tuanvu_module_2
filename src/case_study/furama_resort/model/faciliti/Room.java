package case_study.furama_resort.model.faciliti;

public class Room extends Facility {
    private String freeService;

    public Room() {

    }

    public Room(String idService, String nameService, String utilities, String taxExpense, String numberOfPerson, String rentalType,String price, String freeService) {
        super(idService, nameService, utilities, taxExpense, numberOfPerson, rentalType,price);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
    public String writeToFile() {
        return getIdService()+","+
                getNameService()+","+
                getUtilities()+","+
                getTaxExpense()+","+
                getTaxExpense()+","+
                getNumberOfPerson()+","+
                getRentalType()+""+
                getPrice()+","+
                getFreeService();
    }
}
