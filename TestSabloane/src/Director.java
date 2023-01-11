import java.util.List;

public class Director implements Element {
    private final List<Element> listOfElements;
    private final String directoryName;
    public Director(List<Element> listOfElements, String directoryName) {
        this.listOfElements = listOfElements;
        this.directoryName = directoryName;
    }

    @Override
    public void add(List<Element> listOfElements) {
        for (Element element : listOfElements) {
            this.listOfElements.add(element);
        }
    }

    @Override
    public int countTxtFiles() {
        return 0;
    }

    @Override
    public void accept(Visitor visitor){

    }
}