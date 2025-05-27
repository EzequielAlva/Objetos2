package ar.edu.unlp.info.oo2.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Componente> listaComponentes;

    public Catalogo() {
        listaComponentes = new ArrayList<>();
        listaComponentes.add(new Componente("procesador basico", "descripcion de procesador basico", 180.0, 18));
        listaComponentes.add(new Componente("procesador intermedio", "descripcion de procesador intermedio", 230, 23));
        listaComponentes.add(new Componente("procesador gamer", "descripcion de procesador gamer", 300, 30));
        listaComponentes.add(new Componente("pad termico", "descripcion de pad termico", 30, 3));
        listaComponentes.add(new Componente("cooler", "descripcion de cooler", 50, 5));
        listaComponentes.add(new Componente("ram de 8 gb", "descripcion de ram de 8 gb", 130.0, 13));
        listaComponentes.add(new Componente("ram de 16 gb", "descripcion de ram de 16 gb", 200, 20));
        listaComponentes.add(new Componente("ram de 32 gb", "descripcion de ram de 32 gb", 380, 38));
        listaComponentes.add(new Componente("hdd 500 gb", "descripcion de hdd 500 gb", 120.0, 12));
        listaComponentes.add(new Componente("ssd 500 gb", "descripcion de ssd 500 gb", 210, 21));
        listaComponentes.add(new Componente("ssd 1 tb", "descripcion de ssd 1 tb", 230, 23));
        listaComponentes.add(new Componente("gtx 1650", "descripcion de gtx 1650", 410, 41));
        listaComponentes.add(new Componente("rtx 4090", "descripcion de rtx 4090", 530, 53));
        listaComponentes.add(new Componente("gabinete estandar", "descripcion de gabinete estandar", 160.0, 16));
        listaComponentes.add(new Componente("gabinete intermedio", "descripcion de gabinete intermedio", 130, 0));
        listaComponentes.add(new Componente("fuente 800 w", "descripcion de fuente 800 w", 170, 80));
        listaComponentes.add(new Componente("gabinete gamer", "descripcion de gabinete gamer", 200, 0));
    }

    public Componente getComponente(String descripcion) {
        return listaComponentes.stream()
                .filter(comp -> comp.getNombre().trim().equals(descripcion.toLowerCase().trim()))
                .findFirst()
                .orElse(null);
    }
}
