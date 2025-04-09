/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.validadorpalindromo.ValidadorPalindromo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromoTest {
    


    @Test
    public void deveRetornarTrueParaPalindromoSimples() {
        assertTrue(ValidadorPalindromo.ehPalindromo("ana"));
        assertTrue(ValidadorPalindromo.ehPalindromo("ovo"));
    }

    @Test
    public void deveRetornarTrueParaFrasePalindroma() {
        assertTrue(ValidadorPalindromo.ehPalindromo("Ame a ema"));
        assertTrue(ValidadorPalindromo.ehPalindromo("Socorram-me subi no ônibus em Marrocos"));
    }

    @Test
    public void deveRetornarFalseParaNaoPalindromos() {
        assertFalse(ValidadorPalindromo.ehPalindromo("cachorro"));
        assertFalse(ValidadorPalindromo.ehPalindromo("banana"));
    }

    @Test
    public void deveIgnorarPontuacoesEAcentos() {
        assertTrue(ValidadorPalindromo.ehPalindromo("A grama é amarga!"));
        assertFalse(ValidadorPalindromo.ehPalindromo("Olá, mundo!"));
    }
}

    

