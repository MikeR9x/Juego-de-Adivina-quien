import java.util.Random;
public abstract class Persona {
    private String nombre;
    private boolean tieneLentes;
    private boolean tieneOjos;
    private boolean tieneHambre;
    private boolean tieneLengua;
    Random random = new Random();
    boolean randomBoolean = random.nextBoolean();
    boolean randomBoolean1 = random.nextBoolean();
    boolean randomBoolean2 = random.nextBoolean();
    boolean randomBoolean3 = random.nextBoolean();
    public Persona(){
        this.tieneLentes = randomBoolean;
        this.tieneHambre = randomBoolean1;
        this.tieneLengua = randomBoolean2;
        this.tieneOjos = randomBoolean3;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean gettieneHambre(){
        return tieneHambre;
    }
    public boolean gettieneOjos(){
        return tieneOjos;
    }
    public boolean gettieneLengua(){
        return tieneLengua;
    }
    public boolean gettieneLentes(){
        return tieneLentes;
    }
    public void eliminarNombre() {
        this.nombre = null;
    }
    public String setName(String nombre){
        return this.nombre = nombre;
    }
}



