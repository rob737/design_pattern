package pattern.structural.flyweight.assignment;

public class Cell {
  private final int row;
  private final int column;
  private String content;
  private FontStyle fontStyle;

  public Cell(int row, int column) {
    this.row = row;
    this.column = column;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void render() {
    System.out.printf("(%d, %d): %s [%s]\n", row, column, content, fontStyle.getFontFamily());
  }


  public void setFontStyle(FontStyle fontStyle) {
    this.fontStyle = fontStyle;
  }
}
