package pattern.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    protected final List<HtmlNode> htmlNodes = new ArrayList<>();

    public void add(HtmlNode node){
        htmlNodes.add(node);
    }

    public void highlight(){
        for (HtmlNode node : htmlNodes)
            node.highlight();
    }
}
