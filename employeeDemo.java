package employeeDemo;

import Employee.Employee;

/**
 * Week 5 practical code. Not to be used without permission and appropriate referencing
 */
public class employeeDemo {
    public static void main(String[] args) {
        final double DAY_HOURS = 8.0;

        // Create first employee object
        Employee accountant = new Employee();

        // Set some values
        accountant.setStaffID(101);
        accountant.setFirstName("Alice");
        accountant.setSurname("Smith");
        accountant.setAddress("123 Main Street");
        accountant.setAnnualLeave(40);        // 40 hours = 5 days
        accountant.setLongServiceLeave(120);  // 120 hours = 15 days

        // Display accountant object state
        System.out.println("\nInitial values for accountant object data fields:");
        System.out.println("Staff ID:\t\t\t" + accountant.getStaffID());
        System.out.println("First Name:\t\t\t" + accountant.getFirstName());
        System.out.println("Surname:\t\t\t" + accountant.getSurname());
        System.out.printf("Annual Leave:\t\t\t%.2f", accountant.getAnnualLeave());
        System.out.printf("\nLong Service Leave:\t\t%.2f", accountant.getLongServiceLeave());
        System.out.println("\nHome Address:\t\t\t" + accountant.getAddress());

        // Leave request test
        System.out.println("\n\nRequesting 16 hours annual leave: " +
                (accountant.requestLeave('A', 16) ? "Approved" : "Denied"));

        System.out.println("Requesting 200 hours long service leave: " +
                (accountant.requestLeave('L', 200) ? "Approved" : "Denied"));
    }
}
