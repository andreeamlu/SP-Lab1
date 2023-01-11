import java.util.List;

public abstract class Fisier implements Element {
    protected String fileName;

    public Fisier(String fileName) {
        this.fileName = fileName;
    }

    public abstract void add(List<Element> listaOfElements);
}