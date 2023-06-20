package pattern.behavioural.chainOfResponsibility;
/*
* Handler class is the pipeline class basically.
* It will continue to next implemented handler if execution is not completed yet.
*
* */
public abstract class Handler {
    /*This is similar to LinkedList concept*/
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    /*
    * This is needed to move on to next object provided previous execution is as per expectation..
    * */
    public void handle(HttpRequest request){
        if(doHandle(request))
            return;
        if(next!=null)
        next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);
}
