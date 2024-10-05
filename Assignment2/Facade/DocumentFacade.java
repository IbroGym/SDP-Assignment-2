package Assignment2.Facade;

import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Bridge.RenderEngine;

public class DocumentFacade {

    // Метод для отображения документа
    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        document.display();
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        Document watermarkDocument = new WatermarkDecorator(document);
        watermarkDocument.display();
    }

    // Метод для рендеринга документа через выбранный движок
    public void renderDocument(String title, RenderEngine engine) {
        Document document = DocumentFactory.getDocument(title);
        DocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render(title);
    }
}
