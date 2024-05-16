package simulador_1;

public class Proceso {
    private int id;
    private int memoriaRequerida;
    private int tiempoDeEjecucion;

    public Proceso(int id, int memoriaRequerida, int tiempoDeEjecucion) {
        this.id = id;
        this.memoriaRequerida = memoriaRequerida;
        this.tiempoDeEjecucion = tiempoDeEjecucion;
    }

    public int getId() {
        return id;
    }

    public int getMemoriaRequerida() {
        return memoriaRequerida;
    }

    public int getTiempoDeEjecucion() {
        return tiempoDeEjecucion;
    }
}
