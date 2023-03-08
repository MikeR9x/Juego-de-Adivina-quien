import java.util.Random;
import java.util.Scanner;
public class one {
    public static void main(String[] args){
		String[] names = {"Laura", "Fer", "David", "Pedro", "Lorena", "Eduardo", "Paco", "Maria", "Lucy", "Diego"};
        Random random = new Random();
		Persona[] personas = new Persona[10];
		for(int k = 0; k < 10; k++){
			int randomNum = random.nextInt(10);
			while(names[randomNum] == "nada"){
				randomNum = random.nextInt(10);
			}
			personas[k] = new Persona(){};
			String randomName = names[randomNum];
			names[randomNum] = "nada";
			personas[k].setName(randomName);
        }
        int contadorLentes = 0;
        int contadorOjos = 0;
        int contadorHambre = 0;
        int contadorLengua = 0;
        for (int i = 0; i <= personas.length-1; i++) {
            if(personas[i].gettieneHambre()){
                contadorHambre++;
            }
            if(personas[i].gettieneLengua()){
                contadorLengua++;
            }
            if(personas[i].gettieneLentes()){
                contadorLentes++;
            }
            if(personas[i].gettieneOjos()){
                contadorOjos++;
            }
        }
        System.out.println("El atributo tiene-lentes fue usado: " + contadorLentes + " veces");
        System.out.println("El atributo tiene-ojos fue usado: " + contadorOjos + " veces");
        System.out.println("El atributo tiene-hambre fue usado: " + contadorHambre + " veces");
        System.out.println("El atributo tiene-lengua fue usado: " + contadorLengua + " veces");
        while(true){
            int personaMisteriosa = random.nextInt(10);
            for (int i = 0; i <= personas.length-1; i++) {
                System.out.println(i + " " + personas[i].getNombre() + ": tiene lentes = " + personas[i].gettieneLentes() + ", tiene ojos =" + personas[i].gettieneOjos() + ", tiene hambre = " + personas[i].gettieneHambre() + ", tiene lengua = " + personas[i].gettieneLengua());
            }
            try (Scanner scan = new Scanner(System.in)) {
                for (int i = 0; i <= 3; i++) {
                    System.out.println("Seleccione el atributo a comprobar: tiene-lentes = 1 tiene-ojos = 2 tiene-hambre = 3 tiene-lengua = 4");
                    int respuesta = Integer.parseInt(scan.next());
                    switch(respuesta){
                        case 1:
                        System.out.println("las personas con el atributo tiene-lentes igual a la persona misteriosa son: ");
                        for (int j = 0; j <= personas.length-1; j++) {
                            if(personas[j].gettieneLentes() == personas[personaMisteriosa].gettieneLentes() && personas[j].getNombre() != null){
                                System.out.println(j + " " + personas[j].getNombre());
                            } else{
                                personas[j].eliminarNombre();
                            }
                        } 
                        break;
                        case 2:
                        System.out.println("las personas con el atributo tiene-ojos igual a la persona misteriosa son: ");
                        for (int j = 0; j <= personas.length-1; j++) {
                            if(personas[j].gettieneOjos() == personas[personaMisteriosa].gettieneOjos() && personas[j].getNombre() != null){
                                System.out.println(j + " " + personas[j].getNombre());
                            } else{
                                personas[j].eliminarNombre();
                            }
                        }
                        break;
                        case 3:
                        System.out.println("las personas con el atributo tiene-hambre igual a la persona misteriosa son: ");
                        for (int j = 0; j <= personas.length-1; j++) {
                            if(personas[j].gettieneHambre() == personas[personaMisteriosa].gettieneHambre() && personas[j].getNombre() != null){
                                System.out.println(j + " " + personas[j].getNombre());
                            } else{
                                personas[j].eliminarNombre();
                            }
                        }
                        break;
                        case 4:
                        System.out.println("las personas con el atributo tiene-lengua igual a la persona misteriosa son: ");
                        for (int j = 0; j <= personas.length-1; j++) {
                            if(personas[j].gettieneLengua() == personas[personaMisteriosa].gettieneLengua() && personas[j].getNombre() != null){
                                System.out.println(j + " " + personas[j].getNombre());
                            } else{
                                personas[j].eliminarNombre();
                            }
                        }
                        break;
                    } 
                }
                System.out.println("¿Quiien es la persona misteriosa? seleccione el numero");
                int respuesta1 = Integer.parseInt(scan.next());
                if(respuesta1 == personaMisteriosa){
                    System.out.println("Es correcto");
                    System.exit(0);
                }else{
                    System.out.println("Es incorrecto");
                    System.exit(0);
                }
            }
        }
    }
}
