package com.campusdual.classroom;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
    public static String greetings(String name) {
        String saludoEntero = "Hola. Bienvenido " + name;
        return saludoEntero;
    }

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
    public static String error(String nombre) {
        String mensajeError = "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
        return mensajeError;
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    // TODO ↓: Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    public static void checkUser(String user, String pass) {
        String nombreCorrecto = "Sebas";
        String passCorrecta = "sebas01";

        if (nombreCorrecto.equals(user) && passCorrecta.equals(pass)) {
            System.out.println(greetings(user));
        } else {
            System.out.println(error(nombreCorrecto));
        }

    }


    public static void main(String[] args) {
        greetings("Juan");
        error("Laura");

        checkUser("Sebas", "sebas01");

    }
}
