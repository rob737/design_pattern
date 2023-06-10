package pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    List<String> history = new ArrayList<>();

    public void push(String ele){
        history.add(ele);
    }

    public String pop(){
        return history.remove(history.size()-1);
    }

    private List<String> getHistory() {
        return history;
    }

    public iterator<String> createIterator(){
        return new ListIterator(this);
    }

    class ListIterator implements iterator<String>{
        int index;
        BrowserHistory history;

        ListIterator(BrowserHistory history){
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.getHistory().size();
        }

        @Override
        public String current() {
            return history.getHistory().get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }

}
