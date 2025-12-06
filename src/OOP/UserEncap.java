package OOP;

public class UserEncap {

    //atributo
    private String username;
    private String password;


    /*constructor
    public UserEncap(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }*/

        //metodo

        public String getUsername () {
            return username;
        }



    public void setUsername(String username) {
        if (username != null && username.length() >=3) {
            this.username = username;
            System.out.println("Nombre de usuario establecido");
        } else {
            System.out.println("El nombre de usuario debe tener 3 caracteres");
        }
    }
    public void setPassword(String password) {
        if (password !=null && password.length() >=6) {
            this.password = password;
            System.out.println("Contraseña establecida");
        } else {
            System.out.println("La contraseña debe tener almenos 6 caracteres");
        }
    }
    public boolean checkPassword(String inputPassword) {
        return password != null && password.equals(inputPassword);
    }

}
