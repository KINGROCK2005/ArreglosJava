import java.util.Scanner;
public class Arreglos {
    public static void main(String []args){
        Scanner lector = new Scanner(System.in);
        System.out.println("Cantidad de notas: ");
        int cantidadNotas = lector.nextInt();
        int cantidad = lector.nextInt();
         String[] nombreEstudiantes = new String[cantidad];
        
         System.out.println("Ingrese el nombre del estudiante y su nota: ");
         
        while(cantidadNotas <= 0){
            
            System.out.println("No puede ingresar valores menores o iguales a 0.");
            System.out.println("Cantidad de notas: ");
            
            nombreEstudiantes[cantidad] = lector.nextLine();
        cantidadNotas = lector.nextInt();
        }

        int[] notas = new int[cantidadNotas];
        double sumaNotas = 0;
        System.out.println("Ingrese las notas del grupo: ");
        for(int i = 0; i < notas.length; i++){

            System.out.println("Notas[" + (i+1) + "] =");
            notas[i] =lector.nextInt();
            sumaNotas += notas[i]; 
        }
        double promedio =sumaNotas/cantidadNotas;
        System.out.println(promedio);
        
    }
    
}
