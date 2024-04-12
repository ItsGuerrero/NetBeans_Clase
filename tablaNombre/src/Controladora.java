
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Controladora {
    ArrayList <Persona> personas = new ArrayList<>();
    
    public ArrayList <Persona> Leerarchivo(){
        File file = new File("personas.txt");
        try{
        BufferedReader br = new BufferedReader(new FileReader(file));
        String texto = br.readLine();
        while(texto != null){
            String[]array = texto.split(" ");
            personas.add(new Persona(array[0], array[1]));
            texto = br.readLine();
            
        }
        br.close();
    } catch(FileNotFoundException e2) {
            System.out.println("Archivo no encontrado");
    } catch(IOException e3){
            System.out.println("No se puede leer el archivo");
    }
    return personas;
}
}