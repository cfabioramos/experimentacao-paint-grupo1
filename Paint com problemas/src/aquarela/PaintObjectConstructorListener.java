package aquarela;

public interface PaintObjectConstructorListener {

    public void constructionBeginning(PaintObject temporaryObject);
    public void constructionContinuing(PaintObject temporaryObject);
    public void constructionComplete(PaintObject finalObject);
    public void hoveringOverConstructionArea(PaintObject hoverObject);
        
}
