package case_study.furama_resort.model;

public class Booking implements Comparable<Booking> {
    private String idBooking;
    private String date;
    private String dateStart;
    private String dateEnd;
    private String idCustomer;
    private String idService;

    public Booking() {

    }

    public Booking(String idBooking, String date, String startDate, String endDate, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.date = date;
        this.dateStart = startDate;
        this.dateEnd = endDate;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getEndDate() {
        return dateEnd;
    }

    public void setEndDate(String endDate) {
        this.dateEnd = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking= " + idBooking + '\'' +
                " date= " + date + '\'' +
                " startDate= " + dateStart + '\'' +
                " endDate= " + dateEnd + '\'' +
                " idCustomer= " + idCustomer + '\'' +
                " idService= " + idService + '\'' +
                '}';
    }

    public String writeToFile() {
        return idBooking + "," +
                date + "," +
                dateStart + "," +
                dateEnd + "," +
                idCustomer + "," +
                idService;
    }

    @Override
    public int compareTo(Booking o) {
        if(this.dateStart.equals(o.dateStart)){
            return this.dateEnd.compareTo(o.dateEnd);
        }
        return this.dateStart.compareTo(o.dateStart);
    }
}
