/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validadorpalindromo;

/**
 *
 * @author aluno
 */


  import java.text.Normalizer;

public class ValidadorPalindromo {

    public static boolean ehPalindromo(String texto) {
        if (texto == null || texto.isBlank()) return false;

        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");

        String somenteLetras = normalizado
                .replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        String reverso = new StringBuilder(somenteLetras).reverse().toString();

        return somenteLetras.equals(reverso);
    }
}

    

