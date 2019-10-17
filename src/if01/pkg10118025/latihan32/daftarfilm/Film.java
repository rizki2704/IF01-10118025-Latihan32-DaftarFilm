/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan32.daftarfilm;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Film {
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying(String filmName, String filmGenre, double filmRating, int filmDuration){
        System.out.printf("Judul Film\t : %s%n", filmName);
        System.out.printf("Genre Film\t : %s%n", filmGenre);
        System.out.printf("Rating Film\t : %s%n", filmRating);
        System.out.printf("Durasi Film\t : %s%n%n", filmDuration + " Menit");
    }
    
}
