package futbol;

public abstract class Futbolista implements Comparable<Object> {
    
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion();
    }

    public boolean equals(Futbolista f) {
        if (this == f) return true;
        
        if (f == null) return false;
        
        return this.edad == f.edad && this.nombre.equals(f.nombre) && this.posicion.equals(f.posicion);
    }

    public abstract boolean jugarConLasManos();

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

}

