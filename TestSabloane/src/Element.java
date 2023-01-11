import java.util.List;

public interface Element extends Visitable {
    void add(List<Element> listaOfElements);

    int countTxtFiles();
}