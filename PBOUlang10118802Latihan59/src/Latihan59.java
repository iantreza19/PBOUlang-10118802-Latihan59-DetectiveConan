/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IantReza
 */
public class Latihan59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TokohUtama conan = new TokohUtama("Memecahkan/Menyelesaikan Kasus", 
                 "Detektif", "Conan Edogawa/Shinichi Kudo", 
                 "Detektif Cilik");
        conan.tampilTokohUtama();
        
        TokohUtama ran = new TokohUtama("Ingin Menjadi Ahli Karate di Seluruh Jepang", "Ahli Beladiri Karate", 
                "Ran Mouri", 
                "Siswi SMA dan Suka pada Shinichi Kudo");
        ran.tampilTokohUtama();
        
        TokohUtama kogoro = new TokohUtama("Memecahkan/Menyelesaikan Kasus", "Detektif Swasta", 
                "Kogoro Mouri", "Detektif Swasta");
        kogoro.tampilTokohUtama();
        
        TokohPendukung eri = new TokohPendukung("Istri dari Kogoro Mouri dan Ibunya Ran", "Eri Kisaki", 
                "Pengacara");
        eri.tampilTokohPendukung();
        
        TokohPendukung sonoko = new TokohPendukung("Sahabatnya Ran Mouri", 
                "Sonoko Suzuki", "Siswi SMA");
        sonoko.tampilTokohPendukung();
        
        TokohPendukung heiji = new TokohPendukung("Temannya Conan Edogawa", 
                "Heiji Hattori", "Detektif SMA");
        heiji.tampilTokohPendukung();
        
        TokohPendukung kazuha = new TokohPendukung("Temannya Ran Mouri dan Suka pada "
                + "Heiji Hattori", 
                "Kazuha Tayoma", "Ahli Aikido");
        kazuha.tampilTokohPendukung();
        
        TokohPendukung agasa = new TokohPendukung("Memberikan bantuan kepada Conan berupa alat "
                + "dalam memecahkan/menyelesaikan kasus dan "
                + "kepada Detektif Cilik", "Hiroshi Agasa",
                "Profesor");
        agasa.tampilTokohPendukung();
        
         TokohPendukung ai = new TokohPendukung("Memberikan bantuan kepada Conan "
                + "dan salah satu Detektif Cilik", 
                "Ai Haibara/Shiho Miyano", "Peneliti/Detektif Cilik");
        ai.tampilTokohPendukung();
    }
    
}
