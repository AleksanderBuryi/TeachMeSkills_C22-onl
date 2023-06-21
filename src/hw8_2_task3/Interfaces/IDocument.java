package hw8_2_task3.Interfaces;

import hw8_2_task3.AbstractClasses.Document;

public interface IDocument {
    boolean saveDocs(Document document);
    void readDoc(Document document);
}
