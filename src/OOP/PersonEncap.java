package OOP;

import java.util.StringTokenizer;

public class PersonEncap {
    //atributos
    private String name;
    private int age;

    //constructor
    public PersonEncap(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    //metodo
    public void saludar() {
        System.out.println("Hola mi nombre es: " + name + " tengo " + age + " años");

    }
    //creamos los getName() y getAge()
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
            return "Nombre modificado con exito" ; //cuando se usa Strin y no void
        }
            return "El nombre esta vacio";
        }


    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no valida");
            }
    }

}
