import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmostraTest {
    @Test
    void deveContarBacteriaBacilli() {
        Colonia colonia = new Colonia(
                new Bacteria(15, "Bacilli","ATCGGTGACt",3, (float) 0.4),
                new Bacteria(31, "Bacilli","ATCGGTGACG",4, (float) 0.3),
                new Bacteria(10, "Cocci","CGGTTAACTA",5, (float) 0.05),
                new Bacteria(3, "Spirilli","ACTGAGGCGAC",2, (float) 0.32)
        );
        assertEquals(2, Amostra.contarBacteriasBacilli(colonia));
    }

    @Test
    void deveContarTotalBacteria() {
        Colonia colonia = new Colonia(
                new Bacteria(40, "Cocci","TGAATCGGCt",10, (float) 0.4),
                new Bacteria(55, "Spirilli","TGACATCGGG",7, (float) 0.3),
                new Bacteria(6, "Cocci","AACTACGGTT",2, (float) 0.05),
                new Bacteria(6, "Spirilli","GGCGACACTGA",1, (float) 0.32)
        );
        assertEquals(4, Amostra.contarTotalBacteriasColonia(colonia));
    }
}