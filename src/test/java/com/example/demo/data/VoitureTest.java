package com.example.demo.data;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture() {
   
        Voiture voiture = new Voiture("Toyota", 20000);

        assertEquals("Toyota", voiture.getMarque(), "La marque de la voiture devrait être 'Toyota'");
        assertEquals(20000, voiture.getPrix(), "Le prix de la voiture devrait être 20000");

      
        voiture.setId(1);
        voiture.setMarque("Honda");
        voiture.setPrix(22000);

     
        assertEquals(1, voiture.getId(), "L'ID de la voiture devrait être 1");
        assertEquals("Honda", voiture.getMarque(), "La marque de la voiture devrait être 'Honda'");
        assertEquals(22000, voiture.getPrix(), "Le prix de la voiture devrait être 22000");
    }

    @Test
    void testToString() {
       
        Voiture voiture = new Voiture("BMW", 30000);
        voiture.setId(2);

        String expectedString = "Car{marque='BMW', prix=30000, id=2}";
        assertEquals(expectedString, voiture.toString(), "La méthode toString() ne renvoie pas la chaîne attendue");
    }
}
