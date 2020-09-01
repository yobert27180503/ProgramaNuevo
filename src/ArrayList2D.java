
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PC-22
 */
public class ArrayList2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int numAlumnos = 5; //número de alumnos
        int i, j, nota, cont = 1;
//crear un ArrayList bidimensional de enteros vacío
//Realmente se crea un ArrayList de ArrayLists de enteros
        ArrayList<ArrayList<Integer>> array = new ArrayList();
//Se leen las notas de cada alumno.
        System.out.println(
        "Introduzca las notas de alumno. Introduzca ");
for (i = 0; i < numAlumnos; i++) {
            cont = 1;
            System.out.println("Alumno " + (i + 1) + ": ");
            System.out.print("Nota " + cont + ": ");
            nota = sc.nextInt();
//para cada alumno se añade una nueva fila vacía
//esto es necesario porque el arrayList se crea vacío
            array.add(new ArrayList<Integer>());
            while (nota >= 0) {
                array.get(i).add(nota); //en la fila i se añade una

                cont++;
                System.out.print("Nota " + cont + ": ");
                nota = sc.nextInt();
            }
        }
//Mostrar todas las notas
        System.out.println("Notas de alumnos");
        for (i = 0; i < array.size(); i++) { //para

            System.out.print("Alumno " + (i + 1) + ": ");
            for (j = 0; j < array.get(i).size(); j++) { //se

                System.out.print(array.get(i).get(j) + " "); //se
            }
            System.out.println();
        }
    
    }}
