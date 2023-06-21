package hw8_2_task3.Main;

import hw8_2_task3.AbstractClasses.Document;
import hw8_2_task3.Documents.EmployeeContract;
import hw8_2_task3.Documents.FinancialInvoice;
import hw8_2_task3.Documents.SupplyProductsContract;
import hw8_2_task3.Register.Register;

import java.text.ParseException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        System.out.println("\t\t===Additional task. Homework 8_2. Task 3===");
        //Task 3
        Register register = new Register();
        SupplyProductsContract supplyProductsContract = new SupplyProductsContract(
                1,
                new Date(),
                "Movable",
                20
        );

        EmployeeContract employeeContract = new EmployeeContract(
                2,
                new Date(),
               "26-07-2025",
                "Test Testovich Testov"
        );

        FinancialInvoice financialInvoice = new FinancialInvoice(
                3,
                new Date(1_718_585_858_558L),
                1230.50,
                2
        );

        SupplyProductsContract supplyProductsContract1 = new SupplyProductsContract(
                1,
                new Date(),
                "Movable",
                20
        );

        System.out.println(register.saveDocs(supplyProductsContract) ? "Successfully added to register." : "Fail.");
        System.out.println(register.saveDocs(employeeContract) ? "Successfully added to register." : "Fail.");
        System.out.println(register.saveDocs(financialInvoice) ? "Successfully added to register." : "Fail.");

        System.out.println();

        register.readDoc(supplyProductsContract);
        System.out.println("___________________________________________");

        register.readDoc(employeeContract);
        System.out.println("___________________________________________");

        register.readDoc(financialInvoice);
        System.out.println("___________________________________________");

    }
}
