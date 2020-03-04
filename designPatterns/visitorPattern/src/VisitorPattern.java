
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* Visitor pattern implementation
*
*
* */
public class VisitorPattern {


    public interface Visitor {

        void visit(XmlElement xe);

        void visit(JsonElement je);
    }


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


    public static class XmlElement extends Element {

        public XmlElement(String uuid) {
            super(uuid);
        }

        public void accept(Visitor v) {
            v.visit(this);
        }
    }

    public static class JsonElement extends Element {

        public JsonElement(String uuid) {
            super(uuid);
        }

        public void accept(Visitor v) {
            v.visit(this);
        }
    }


    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }


    public static void main(String[] args) {

        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new JsonElement(generateUuid()));
        d.elements.add(new XmlElement(generateUuid()));

        d.accept(v);
    }
}
