package ar.edu.unlp.info.oo2.ejercicio_02_V2;

public class ArenaDeCombate {
    private Elemento elementoIzquierda;
    private Elemento elementoDerecha;

    public ArenaDeCombate() {
    }

    public void cargarElementos(Elemento elemIzq, Elemento elemDer) {
        elementoIzquierda = elemIzq;
        elementoDerecha = elemDer;
    }

    public String combate() {
        if(elementoDerecha == null || elementoIzquierda == null)
            return "Ingrese ambos elementos para combatir";

        int izq = elementoIzquierda.combate(elementoDerecha);
        int der = elementoDerecha.combate(elementoIzquierda);

        if(izq > der) {
            return "Elemento ganador: " + elementoIzquierda.getName() +
                    "Elemento perdedor: " + elementoDerecha.getName();
        } else if(der > izq) {
            return "Elemento perdedor: " + elementoIzquierda.getName() +
                    "Elemento ganador: " + elementoDerecha.getName();
        }

        return "empate";
    }
}
