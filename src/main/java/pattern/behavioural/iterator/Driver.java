package pattern.behavioural.iterator;

public class Driver {
    public static void main(String[] args) {
        BrowserHistory history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        // iterate over history
        /*List<String> list = history.getHistory();
        for(String val : list)
            System.out.println(val);*/
        /*
        * above implementation will have issues if history class changes the underlying data structure
        * to store history.
        * We can use iterator pattern in scenarios like this.
        * */

        iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
