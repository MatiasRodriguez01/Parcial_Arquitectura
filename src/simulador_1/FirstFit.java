package simulador_1;


import java.util.List;

public class FirstFit implements AlgoritmoMemoria{
    public void asignarMemoria(List<Proceso> procesos, int memoriaTotal) {
        int[] memoriaDisponible = new int[memoriaTotal];
        for (Proceso proceso : procesos) {
            boolean asignado = false;
            for (int i = 0; i < memoriaTotal; i++) {
                if (memoriaDisponible[i] == 0 && i + proceso.getMemoriaRequerida() <= memoriaTotal) {
                    for (int j = i; j < i + proceso.getMemoriaRequerida(); j++) {
                        memoriaDisponible[j] = proceso.getId();
                    }
                    asignado = true;
                    break;
                }
            }
            if (!asignado) {
                System.out.println("No hay suficiente memoria para el proceso " + proceso.getId());
            }
        }
        // Imprimir estado final de la memoria
        System.out.println("Estado final de la memoria:");
        for (int i = 0; i < memoriaTotal; i++) {
            System.out.print(memoriaDisponible[i] + " ");
        }
        System.out.println();
    }
}
