package pattern.behavioural.iterator;

import java.util.List;

public class Driver {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        // iterate over history
        List<String> list = history.getList();
        for(String val : list)
            System.out.println(val);
        /*
        * above implementation will have issues if history class changes the underlying datastructure
        * to store history.
        * We can use iterator pattern in scenarios like this.
        * */
    }
}
