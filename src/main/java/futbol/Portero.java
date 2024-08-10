package futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public int compareTo(Object f) {
        if (f instanceof Portero) {
            Portero p = (Portero) f;
            return Math.abs(this.golesRecibidos - p.golesRecibidos);
        }
        else {return this.golesRecibidos;}
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }
}
