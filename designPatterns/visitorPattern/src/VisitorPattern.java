
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* Visitor pattern implementation
* The purpose of the visitor pattern is to define a new operation without introducing the modification to the existing
* object structure
* */
public class VisitorPattern {

    /*
    * Our example is a custom document object that consists of JSOn amd XML
    * concret elements
    * */
    public static class Document extends Element {

        List<Element> elements = new ArrayList<>();

        public Document(String uuid) {
            super(uuid);
        }

        @Override
        public void accept(Visitor v) {
            for (Element e : this.elements) {
                e.accept(v);
            }
        }
    }

/*
*
* The visitor interface that will need to be implemented
* */
    public interface Visitor {

        void visit(XmlElement xe);

        void visit(JsonElement je);
    }

    /*
    * The implementation of the visitor pattern
    * */
    public static class ElementVisitor implements Visitor {

        @Override
        public void visit(XmlElement xe) {
            System.out.println("processing an XML element with uuid: " + xe.uuid);
        }

        @Override
        public void visit(JsonElement je) {
            System.out.println("processing a JSON element with uuid: " + je.uuid);
        }
    }

    /*
     * Xml element which is part of our Documents elements
     *
     * */
    public static class XmlElement extends Element {

        public XmlElement(String uuid) {
            super(uuid);
        }

        public void accept(Visitor v) {
            v.visit(this);
        }
    }

    /*
    * Json element which is part of our Documents elements
    *
    * */
    public static class JsonElement extends Element {

        public JsonElement(String uuid) {
            super(uuid);
        }

        public void accept(Visitor v) {
            v.visit(this);
        }
    }



/*
* First, we create an elementVisitor, it hold the algorithm will apply to our element
* Next, we setup our Document with proper components and apply the visitor which will be
* accepted be every element of an object structure
*
* */
    public static void main(String[] args) {

        Visitor v = new ElementVisitor();

        Document d = new Document(UUID.randomUUID().toString());
        d.elements.add(new JsonElement(UUID.randomUUID().toString()));
        d.elements.add(new JsonElement(UUID.randomUUID().toString()));
        d.elements.add(new XmlElement(UUID.randomUUID().toString()));

        d.accept(v);
    }
}
