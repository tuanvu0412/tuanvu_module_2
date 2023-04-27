package case_study.furama_resort.model;

public class Booking {
    private String idBooking;
    private String date;
    private String startDate;
    private String endDate;
    private String idCustomer;
    private String idService;

    public Booking(String date, String startDate, String endDate, String idCustomer, String idService) {

    }

    public Booking(String idBooking, String date, String startDate, String endDate, String idCustomer, String idService) {
        this.idBooking = idBooking;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
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
                "idBooking='" + idBooking + '\'' +
                ", date='" + date + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", idService='" + idService + '\'' +
                '}';
    }

    public String bookingList() {
        return "Booking{" +
                "idBooking='" + idBooking + "," +
                ", date='" + date + "," +
                ", startDate='" + startDate + "," +
                ", endDate='" + endDate + "," +
                ", idCustomer='" + idCustomer + "," +
                ", idService='" + idService + "," +
                '}';
    }
}
