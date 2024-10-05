package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Добавление документа в группу
    public void addDocument(Document document) {
        documents.add(document);
    }

    // Удаление документа из группы
    public void removeDocument(Document document) {
        documents.remove(document);
    }

    // Отображение всех документов в группе
    @Override
    public void display() {
        for (Document document : documents) {
            document.display();
        }
    }
}
