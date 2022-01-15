import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Colonia implements Iterable<Bacteria>{
    public List<Bacteria> bacterias= new ArrayList<>();

    public Colonia(Bacteria... bacteria){this.bacterias = Arrays.asList(bacteria);}

    @Override
    public Iterator<Bacteria> iterator() {
        return bacterias.iterator();
    }
}
