package Assignment2.Bridge;

// Реализация простого рендеринга документа
public class SimpleDocumentRenderer extends DocumentRenderer {

    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String content) {
        engine.render(content);  // Использование переданного движка для рендеринга
    }
}
