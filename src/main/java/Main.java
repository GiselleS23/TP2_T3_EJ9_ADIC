/* 9.- Un colectivo hace un recorrido por una ciudad desde un punto inicial donde suben N personas hasta un punto final donde descienden todas. El colectivo realiza X paradas intermedias. Se sabe que en las paradas intermedias suben siempre 3 personas más que en la parada anterior y que descienden el 50% de la gente del colectivo (sin contar los que suben en dicha parada) ¿cuántas personas llegarán hasta el final del trayecto? 
  Ejemplo: N=10 X=3 Inicio: Nro personas=10.
  Parada 1: Bajan=5 Suben=13 Nro personas 18
  Parada 2: Bajan 9 Suben=16 Nro personas=25
  Parada 3: Bajan=12 Suben 19 Nro personas=32
  Final del trayecto: 32 personas 
  Sacchetti Maria Giselle C2*/

import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Random rand = new Random();
    int personasIniciales = rand.nextInt(16) + 5;

    int paradasIntermedias = rand.nextInt(5) + 1;

    int personasActuales = personasIniciales;
    int personasQueSuben = personasIniciales;

    System.out.println("Número inicial de personas en el colectivo: " + personasIniciales);
    System.out.println("Número de paradas intermedias: " + paradasIntermedias);

    for (int i = 1; i <= paradasIntermedias; i++) {
      int personasQueBajan = personasActuales / 2;
      personasActuales -= personasQueBajan;
      personasQueSuben += rand.nextInt(6);
      personasActuales += personasQueSuben;
      System.out.println("Parada " + i + ": Personas que suben = " + personasQueSuben +
          ", Personas que bajan = " + personasQueBajan + ", Personas actuales = " + personasActuales);
    }

    System.out.println("Final del trayecto: " + personasActuales + " personas.");
  }
}
