package c08_oop;

public class User {
    // 6. Crea una clase User con los atributos privados username y password.
// Implementa los métodos setUsername(String username), setPassword(String password)
// y checkPassword(String inputPassword) que compare contraseñas.

    //Atributos
    private String username;
    private String password;


    //Getters
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    //Setters para username
    public void setUsername(String username) {
        this.username = username;
    }

    //Setter para password
    public void setPassword(String password) {
        this.password = password;
    }

    //Métodos para comparar contraseñas
    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
}
