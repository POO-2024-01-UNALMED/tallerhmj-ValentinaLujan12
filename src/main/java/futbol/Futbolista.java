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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;  // Verifica si es el mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;  // Verifica si el objeto es null o si no son de la misma clase

        Futbolista f = (Futbolista) obj;
        return edad == f.edad && nombre.equals(f.nombre) && posicion.equals(f.posicion);
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

