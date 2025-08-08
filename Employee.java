package Employee;

import myclasses.Employee;

public class Employee {
    private int staffID;              // employee unique identifier
    private String firstName;
    private String surname;
    private String address;           // home address
    private double annualLeave;       // accrued annual leave available (hours)
    private double longServiceLeave;  // accrued long service leave available (hours)

    // ===== No-arg constructor =====
    public Employee() {
        this.staffID = -1;
        this.firstName = "not known";
        this.surname = "not known";
        // address defaults to null, doubles default to 0.0
    }

    // ===== Constructor with four arguments =====
    public Employee(int staffID, String firstName, String surname, String address) {
        this.staffID = staffID;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        // annualLeave and longServiceLeave default to 0.0
    }

    // ===== Getters and Setters =====
    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAnnualLeave() {
        return annualLeave;
    }

    public void setAnnualLeave(double annualLeave) {
        this.annualLeave = annualLeave;
    }

    public double getLongServiceLeave() {
        return longServiceLeave;
    }

    public void setLongServiceLeave(double longServiceLeave) {
        this.longServiceLeave = longServiceLeave;
    }

    // ===== Request Leave Method =====
    public boolean requestLeave(char leaveType, double requestedHours) {
        if (leaveType == 'A') {
            return annualLeave >= requestedHours;
        } else if (leaveType == 'L') {
            return longServiceLeave >= requestedHours;
        }
        return false;
    }
}

