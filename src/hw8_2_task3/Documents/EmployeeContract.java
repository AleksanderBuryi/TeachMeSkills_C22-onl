package hw8_2_task3.Documents;

import hw8_2_task3.AbstractClasses.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeContract extends Document {
    private Date endDate;
    private String nameOfEmployee;

    public EmployeeContract() {
    }

    public EmployeeContract(int numberOfDocument, Date dateOfDocument, Date endDate, String nameOfEmployee) {
        super(numberOfDocument, dateOfDocument);
        this.endDate = endDate;
        this.nameOfEmployee = nameOfEmployee;
    }

    public EmployeeContract(int numberOfDocument, String dateOfDocument, Date endDate, String nameOfEmployee) throws ParseException {
        super(numberOfDocument, dateOfDocument);
        this.endDate = endDate;
        this.nameOfEmployee = nameOfEmployee;
    }

    public EmployeeContract(int numberOfDocument, Date dateOfDocument, String endDate, String nameOfEmployee) throws ParseException {
        super(numberOfDocument, dateOfDocument);
        this.nameOfEmployee = nameOfEmployee;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.endDate = simpleDateFormat.parse(endDate);
    }

    public EmployeeContract(int numberOfDocument, String dateOfDocument, String endDate, String nameOfEmployee) throws ParseException {
        super(numberOfDocument, dateOfDocument);
        this.nameOfEmployee = nameOfEmployee;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.endDate = simpleDateFormat.parse(endDate);
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Contract with an employee:");
        super.PrintInfo();
        System.out.println("End date: " + endDate +
                "\nName of employee: " + nameOfEmployee);
    }
}
