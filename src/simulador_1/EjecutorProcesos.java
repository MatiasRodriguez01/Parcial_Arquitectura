package simulador_1;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjecutorProcesos {
    private ExecutorService executorService;

    public EjecutorProcesos(int numThreads) {
        executorService = Executors.newFixedThreadPool(numThreads);
    }

    public void ejecutarProceso(Proceso proceso) {
        executorService.execute(() -> {
            System.out.println("Ejecutando proceso " + proceso.getId());
            try {
                Thread.sleep(proceso.getTiempoDeEjecucion()); // Simula el tiempo de ejecución
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Proceso " + proceso.getId() + " finalizado");
        });
    }

    public void detenerEjecucion() {
        executorService.shutdown();
    }
}
