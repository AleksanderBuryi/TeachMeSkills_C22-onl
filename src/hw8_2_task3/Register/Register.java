package hw8_2_task3.Register;

import hw8_2_task3.AbstractClasses.Document;
import hw8_2_task3.Interfaces.IDocument;

public class Register implements IDocument {
    private Document[] documents = new Document[10];
    private int tos;

    public Register() {
        this.tos = -1;
    }

    @Override
    public boolean saveDocs(Document document) {
        if (tos == documents.length-1) {
            System.out.println("Register is full.");
            return false;
        }
        else {
            documents[++tos] = document;
            return true;
        }
    }

    @Override
    public void readDoc(Document document) {
        int counter = 0;
        for (Document doc : documents){
            if (doc != null && doc.equals(document)) {
                counter++;
                if (counter == 1)
                    doc.PrintInfo();
            }
        }

        if (counter > 1)
            System.out.println("The number of these documents in the register: " + counter);
        else if (counter == 0)
            System.out.println("This document not found.");
    }
}
