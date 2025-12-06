package OOP;

public class Clases {
    static void main() {
        var persona=new Persona("Diego", 25); //esta es la forma de acceder a una clase
       // persona.name = ;
      //  persona.edad = 25;
        persona.saludar();//accede a la funcion de la clase Persona

        var persona2=new Persona("Rosa", 18); //crear otra persona
        persona2.saludar();

    }
}
