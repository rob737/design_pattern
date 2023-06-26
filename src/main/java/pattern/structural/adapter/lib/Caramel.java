package pattern.structural.adapter.lib;

import pattern.structural.adapter.Image;

/*
* Assume, this class belongs to external library but we want to use this filter.
* Interface of caramel class is different from our existing filter classes which
* must implement Filter interface.
*
* We can leverage adapter pattern in these scenarios to facilitate re-use
* of objects with a different interface.
* */
public class Caramel {
    public void init(){
    }

    public void render(Image image){
        System.out.println("Applying caramel filter to the image.");
    }
}
