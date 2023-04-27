package case_study.furama_resort.model;

public class Contract {
    private String contractNumber;
    private String idBooking;
    private String depositInAdvance;
    private String totalPaymentAmount;

    public Contract(){

    }

    public Contract(String contractNumber, String idBooking, String depositInAdvance, String totalPaymentAmount) {
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.depositInAdvance = depositInAdvance;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDepositInAdvance() {
        return depositInAdvance;
    }

    public void setDepositInAdvance(String depositInAdvance) {
        this.depositInAdvance = depositInAdvance;
    }

    public String getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", depositInAdvance='" + depositInAdvance + '\'' +
                ", totalPaymentAmount='" + totalPaymentAmount + '\'' +
                '}';
    }
    public String contracList(){
        return "Contract{" +
                "contractNumber='" + contractNumber + "," +
                ", idBooking='" + idBooking + "," +
                ", depositInAdvance='" + depositInAdvance + "," +
                ", totalPaymentAmount='" + totalPaymentAmount + "," +
                '}';
    }
}
