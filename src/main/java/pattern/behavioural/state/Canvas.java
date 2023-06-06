package pattern.behavioural.state;

/*
* The problem with commented code is that the solution is not extensible.
* Let's say we introduce a new tooltype then we would need to change
* code at many places to accommodate that tooltype.
*
* Also, this is not following Open for Extension, Closed for modification SOLID principle.
*
* After the modification wherein we are using interfaces, we ensured that we are
* following Single Responsibility pattern and Open for Extension, Closed for modification principle.
* */

public class Canvas {
    private ToolType currentSelectedTool;

    // From Driver class, need to pass corresponding selected object.
    public void mouseSelect(ToolActionSelection toolActionSelection){
        /*if(currentSelectedTool == ToolType.SELECTION)
            System.out.println("Selection icon selected");
        else if(currentSelectedTool == ToolType.BRUSH)
            System.out.println("Brush icon selected");
        else if (currentSelectedTool == ToolType.ERASER)
            System.out.println("Eraser icon selected");*/
        toolActionSelection.performOnMouseSelection();
    }

    public void mouseDraw(ToolActionRelease toolActionRelease){
        /*if(currentSelectedTool == ToolType.SELECTION)
            System.out.println("Draw dashed rectangle");
        else if(currentSelectedTool == ToolType.BRUSH)
            System.out.println("Draw a line");
        else if (currentSelectedTool == ToolType.ERASER)
            System.out.println("Erase something");*/
        toolActionRelease.performOnMouseRelease();
    }
}
