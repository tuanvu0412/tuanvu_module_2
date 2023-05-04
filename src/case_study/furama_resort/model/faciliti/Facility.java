package case_study.furama_resort.model.faciliti;

public abstract class Facility {
    private String idService;
    private String nameService;
    private String utilities;
    private String taxExpense;
    private String numberOfPerson;
    private String rentalType;
    private String price;

    public Facility() {

    }

    public Facility(String idService, String nameService, String utilities, String taxExpense, String numberOfPerson, String rentalType, String price) {
        this.idService = idService;
        this.nameService = nameService;
        this.utilities = utilities;
        this.taxExpense = taxExpense;
        this.numberOfPerson = numberOfPerson;
        this.rentalType = rentalType;
        this.price = price;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUtilities() {
        return utilities;
    }

    public void setUtilities(String utilities) {
        this.utilities = utilities;
    }

    public String getTaxExpense() {
        return taxExpense;
    }

    public void setTaxExpense(String taxExpense) {
        this.taxExpense = taxExpense;
    }

    public String getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(String numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "idService='" + idService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", utilities='" + utilities + '\'' +
                ", taxExpense='" + taxExpense + '\'' +
                ", numberOfPerson='" + numberOfPerson + '\'' +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public String writeToFile() {
        return idService + "," + nameService + "," +
                utilities + "," +
                taxExpense + "," +
                numberOfPerson + "," +
                rentalType+","+price;
    }
}
