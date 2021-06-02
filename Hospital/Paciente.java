import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Paciente {
    //Atributos de la clase
    private String Nombre;
    private int Edad;

    public Paciente (String name, int Year){ //Metodo Contructor por parametros
        //Asignacion de los valores de parametros
        Nombre = name;
        Edad = Year;
        System.out.println("Prueba git paciente....");
    }

    public String getmostrarNombre(){
        return Nombre;
    }
    
    public void setMostrarNombre(String name){
        Nombre = name;
    }

    public int getmostrarEdad(){
        return Edad;
    }

    public void setMostrarNombre( int Year){
        this.Edad = Year;
    }
}
