package Servicios;

import Entidades.Curso;
import java.util.Scanner;

public class CursoService {
    Scanner consola = new Scanner(System.in).useDelimiter("\n");
    
    public Curso crearCurso(){
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = consola.next();
        System.out.println("Ingrese la cantidad de horas por dia");
        int horasDia = consola.nextInt();
        System.out.println("Ingres la cantidad de horas por semana");
        int horasSemana = consola.nextInt();
        System.out.println("Ingrese el turno: Mañana o Tarde");
        String turno = consola.next();
        System.out.println("Ingrese el precio por hora");
        int precioHoras = consola.nextInt();
        
        return new Curso(nombreCurso, horasDia, horasSemana, turno, precioHoras);
    }
    
    public void cargarAlumnos(Curso cur){
        System.out.println("Cuantos alumnos tendra la clase?");
        int cant = consola.nextInt();
        String alumnos[] = new String[cant]; 
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i+1));
            alumnos[i] = consola.next();
        }
        cur.setAlumnos(alumnos);
    }
    
    public void calcularGananciaSemanal(Curso cur){
        int res = cur.getCantidadHorasPorDia()*cur.getPrecioPorHora()*cur.getCantidadHorasPorSemana()*cur.getAlumnos().length;
        System.out.println("La ganancia semanal se de: " + res);
    }
    
}
