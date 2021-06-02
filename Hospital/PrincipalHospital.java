import java.util.Scanner;

public class PrincipalHospital {
    static Paciente paciente1;//Instancia, de forma global
    public static void main(String[] args) {
        System.out.println("Prueba git...");
        
        solicitarDatos();//Llamada de metodo

        //Impresion de la informacion del objeto, se accede a los metodos de la clase paciente
        System.out.println("Datos del paciente:"+paciente1.getmostrarNombre()+" "+paciente1.getmostrarEdad()+ " years");   
    }

    public static void solicitarDatos(){
        Scanner entrada= new Scanner (System.in); //Creacion del objeto Scanner

        System.out.println("Ingrese los datos del paciente\nEdad");
        int edadIngresada= entrada.nextInt();

        entrada.nextLine(); //Permite limpirar el objeto Scanner para una siguiente captura de datos

        System.out.println("Ingrese el nombre del paciente");
        String nombreIngresado= entrada.nextLine();

        //Creacion del objeto con informacion pasada por parametros 
        paciente1= new Paciente(nombreIngresado, edadIngresada);
    }
    
}
