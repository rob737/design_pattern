package pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowserHistory {
    List<String> list = new ArrayList<>();

    public void push(String ele){
        list.add(ele);
    }

    public String pop(){
        return list.remove(list.size()-1);
    }

    public List<String> getList() {
        return list;
    }

}
