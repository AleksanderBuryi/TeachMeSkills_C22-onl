package hw8_2_task3.Documents;

import hw8_2_task3.AbstractClasses.Document;

import java.text.ParseException;
import java.util.Date;

public class FinancialInvoice extends Document {
    private double totalSumForMonth;
    private int departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(int numberOfDocument, Date dateOfDocument, double totalSumForMonth, int departmentCode) {
        super(numberOfDocument, dateOfDocument);
        this.totalSumForMonth = totalSumForMonth;
        this.departmentCode = departmentCode;
    }

    public FinancialInvoice(int numberOfDocument, String dateOfDocument, double totalSumForMonth, int departmentCode) throws ParseException {
        super(numberOfDocument, dateOfDocument);
        this.totalSumForMonth = totalSumForMonth;
        this.departmentCode = departmentCode;
    }

    public double getTotalSumForMonth() {
        return totalSumForMonth;
    }

    public void setTotalSumForMonth(double totalSumForMonth) {
        this.totalSumForMonth = totalSumForMonth;
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Financial Invoice: ");
        super.PrintInfo();
        System.out.println("Total sum for the month: " + totalSumForMonth +
                "\nDepartment code: " + departmentCode);
    }
}
