package main;

public class StudentBean {
    private String stdNo;
    private String stdName;
    private String stdPhone;
    private String stdAddress;
    private String stdYear;

    public String getStdNo() { return stdNo; }
    public void setStdNo(String stdNo) {
        this.stdNo = stdNo;
    }
    public String getStdName() {
        return stdName;
    }
    public void setStdName(String stdName) {
        this.stdName = stdName;
    }
    public String getStdPhone() {
        return stdPhone;
    }
    public void setStdPhone(String stdPhone) {
        this.stdPhone = stdPhone;
    }
    public String getStdAddress() {
        return stdAddress;
    }
    public void setStdAddress(String stdAddress) { this.stdAddress = stdAddress; }
    public String getStdYear() {
        return stdYear;
    }
    public void setStdYear(String stdYear) {
        this.stdYear = stdYear;
    }
}