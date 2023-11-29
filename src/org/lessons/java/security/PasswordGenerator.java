package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Inserisci nome utente: ");
        String userName = scan.nextLine();

        System.out.println("Inserisci cognome utente: ");
        String userSurname = scan.nextLine();

        System.out.println("Inserisci colore preferito : ");
        String userColor = scan.nextLine();

        System.out.println("Inserisci il tuo giorno di nascita: ");
        int userDayOfBirth = scan.nextInt();

        System.out.println("Inserisci il tuo mese di nascita: ");
        int userMonthOfBirth = scan.nextInt();

        System.out.println("Inserisci il tuo anno di nascita : ");
        int userYearOfBirth = scan.nextInt();

        int sumDateOfBirth = userDayOfBirth + userMonthOfBirth + userYearOfBirth;

        String generatePassword = userName +"-"+ userSurname +"-"+ userColor +"-"+ sumDateOfBirth;

        System.out.println(generatePassword);

        scan.close();

    }
}

