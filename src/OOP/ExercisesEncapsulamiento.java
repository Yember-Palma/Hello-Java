package OOP;

public class ExercisesEncapsulamiento {
    static void main() {
        //crea una clase PersonEncap con atributos privados name y age
        //Usa los metodos getName(), setName(), getAge() y setAge() para
        //asignar y mostrar valores desde otra clase.
        PersonEncap personEncap = new PersonEncap("Ana", -18);
        personEncap.saludar();
        personEncap.setAge(18);
        personEncap.saludar();
        System.out.println(personEncap.getAge());
        System.out.println(personEncap.getName());
        personEncap.setName("Juan");
        personEncap.saludar();
        System.out.println(personEncap.getName());


        //Crea una clase ProductEncap con el atributo privado price. Añade el metodo
        //setPrice(double price) que solo permita precios mayores a 0.

        ProductEncap producto = new ProductEncap(10);
        producto.setPrice(8);

        //Crea una clase BankAccountEncap con el atributo privado balance
        //Implementa los metodos deposit(double amount) y withdraw(double amount)
        //que validen las cantidades correctamente.
        System.out.println("banco");
        BankAccountEncap bank = new BankAccountEncap(1234567, 10);
        bank.withdraw(10);
        bank.withdraw(0);
        //Crea una clase BookEncap con el atributo privado title. Permite leer
        // con el metodo getTitle() pero no modificarlo(sin setTitle()).
        //El titulo debe asignarse solo por el constructor

        BookEncap leer =new BookEncap("El hombre mas rico de balilonia");
        System.out.println(leer.getTitle());

        //Crea una clase TemperatureEncap con el atributo privado celsius.
        //El metodo setCelsius(duble celsius) solo debe aceptar valores entre
        //-100 y 100
        TemperatureEncap teperatura = new TemperatureEncap();
        teperatura.setCelsius(100);
        System.out.println(teperatura.getCelsius());

        //Crea una clase UserEncap con los atributos privados username y password.
        //Implementa los metodos setUsername(String username), setPassword(String
        //password) y checkPassword(Strinng inputPassword) que compare contraseñas.


        var user = new UserEncap();
        user.setUsername("diego");
        user.setPassword("diego12");
        System.out.println("El usuario es: " + user.getUsername());
        System.out.println("¿contraseña correcta?: " + user.checkPassword("diego12"));
        System.out.println("¿contraseña incorrecta?: " + user.checkPassword("diego1256"));

        //Crea una clase EmployeEncap con el atributo privado salary. Agrega el metodo
        //raiseSalary(double percent) que solo permita aumentos positivos
        EmployeEncap salario = new EmployeEncap("Diego", 500);
        salario.showInfo();
        salario.raiseSalary(5);
        salario.showInfo();

        //Crea una clase RectangleEncap con los atributos privados width y height
        //Agrega setters y el metodo calculateArea() que devuelva el resultado
        //de width * heigth
        var area = new RectangleEncap();
        area.setWidth(5);
        area.setHeight(4);

        System.out.println("El area es: " + area.calculateArea());

        //Crea una clase StudentEncap con el atributo privado grade. Agrega
        //los metodos setGrade(int grade) y isPassed() que retorne true si
        //la nota es mayor o igual a 60

        StudentEncap calificacion = new StudentEncap("Jorge");
        calificacion.setGrade(60);
        System.out.println(calificacion.getStuden());
        System.out.println(calificacion.getGrade());
        System.out.println(calificacion.isPassed());

        //crea una clase CarEncap con el atributo privado speed
        //Agrega los metodos acelerate(int amount) que aumente
        // la velecidad (maximo 120) y brake(int amount)
        // que reduzca la velocidad(minimo 0)
        CarEncap car1 = new CarEncap("DMC DeLorean");
        car1.showStatus();
        car1.accelerate(50);
        car1.showStatus();
        car1.accelerate(80);
        car1.showStatus();
        car1.brake(30);
        car1.showStatus();
        car1.brake(100);
        car1.showStatus();





    }

}
