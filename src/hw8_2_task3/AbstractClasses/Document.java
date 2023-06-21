package hw8_2_task3.AbstractClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Document {
    private int numberOfDocument;
    private Date dateOfDocument;

    public Document() {
    }

    public Document(int numberOfDocument, Date dateOfDocument) {
        this.numberOfDocument = numberOfDocument;
        this.dateOfDocument = dateOfDocument;
    }

    public Document(int numberOfDocument, String dateOfDocument) throws ParseException {
        this.numberOfDocument = numberOfDocument;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.dateOfDocument = simpleDateFormat.parse(dateOfDocument);
    }

    public int getNumberOfDocument() {
        return numberOfDocument;
    }

    public void setNumberOfDocument(int numberOfDocument) {
        this.numberOfDocument = numberOfDocument;
    }

    public Date getDateOfDocument() {
        return dateOfDocument;
    }

    public void setDateOfDocument(Date dateOfDocument) {
        this.dateOfDocument = dateOfDocument;
    }

    public void PrintInfo() {
        System.out.println("Number of Document: " + numberOfDocument +
                "\nDate of Document: " + dateOfDocument);
    }
}
