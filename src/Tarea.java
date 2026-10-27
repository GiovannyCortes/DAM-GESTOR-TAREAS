public class Tarea {

    private int id;
    private String titulo;
    private boolean completada;

    public Tarea(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; // CAMBIO PARA QUE EL TITULO NO SEA NULO NI VACIO
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}