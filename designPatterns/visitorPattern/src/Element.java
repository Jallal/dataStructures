public abstract class Element {

    public String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    /*
    * The Element class has an abstract method which accepts the visitor interface
    * */
    public abstract void accept(VisitorPattern.Visitor v);
}