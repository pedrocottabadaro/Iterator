import java.util.Iterator;

public class Amostra {

    public static Integer contarBacteriasBacilli(Colonia colonia) {
        int quantidade = 0;
        for (Bacteria bacteria : colonia) {
            if (bacteria.getForma()=="Bacilli") {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalBacteriasColonia(Colonia colonia) {
        int quantidade = 0;
        for (Iterator a = colonia.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
