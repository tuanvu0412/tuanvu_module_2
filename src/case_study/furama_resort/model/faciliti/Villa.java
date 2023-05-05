package case_study.furama_resort.model.faciliti;

public class Villa extends Facility {
    private String swimmingPoolArea;

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


    @Override
    public String toString() {
        return "Villa{" +
                "id = " + getIdService() + "," +
                "name = " + getNameService() + "," +
                "utilities = " + getUtilities() + "," +
                "taxExpense = " + getTaxExpense() + "," +
                "rentalType = " + getRentalType() + "," +
                "numberOfPerson = " + getNumberOfPerson() + "," +
                "price = " + getPrice() + "," +
                "swimmingPoolArea = " + swimmingPoolArea;
    }

    public String writeToFile() {
        return getIdService() + "," +
                getNameService() + "," +
                getUtilities() + "," +
                getTaxExpense() + "," +
                getNumberOfPerson() + "," +
                getRentalType() + "," +
                getPrice() + "," +
                getSwimmingPoolArea();
    }
}
