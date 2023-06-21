package hw8_2_task3.Documents;

import hw8_2_task3.AbstractClasses.Document;

import java.text.ParseException;
import java.util.Date;

public class SupplyProductsContract extends Document {
    private String typeOfGoods;
    private int numberOfGoods;

    public SupplyProductsContract() {
    }

    public SupplyProductsContract(int numberOfDocument, Date dateOfDocument, String typeOfGoods, int numberOfGoods) {
        super(numberOfDocument, dateOfDocument);
        this.typeOfGoods = typeOfGoods;
        this.numberOfGoods = numberOfGoods;
    }

    public SupplyProductsContract(int numberOfDocument, String dateOfDocument, String typeOfGoods, int numberOfGoods) throws ParseException {
        super(numberOfDocument, dateOfDocument);
        this.typeOfGoods = typeOfGoods;
        this.numberOfGoods = numberOfGoods;
    }

    public String getTypeOfGoods() {
        return typeOfGoods;
    }

    public void setTypeOfGoods(String typeOfGoods) {
        this.typeOfGoods = typeOfGoods;
    }

    public int getNumberOfGoods() {
        return numberOfGoods;
    }

    public void setNumberOfGoods(int numberOfGoods) {
        this.numberOfGoods = numberOfGoods;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Contract for the supply of goods:");
        super.PrintInfo();
        System.out.println("Type: " + typeOfGoods +
                "\nNumber of goods: " + numberOfGoods);
    }
}
