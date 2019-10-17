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
public class IF0110118025Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film film = new Film();
        
        System.out.println("===Daftar Film Sedang Tayang===");
        film.nowPlaying("Venom", "Action, Horor, Sci-fi", 8.5, 120);
        film.nowPlaying("Small Foot", "Animation", 9, 96);
        film.nowPlaying("Crazy Rich Asian", "Comedy", 7.8, 119);
        film.nowPlaying("Asih", "Horor", 6, 100);
        
    }
    
}
