package ASSESSMENT1;

import java.util.LinkedList;
import java.util.Queue;

public class AntrianBPJS {
    Queue<String> dokterUmum = new LinkedList<>();
    Queue<String> dokterSpesialis = new LinkedList<>();


    public void ambilNomor(String nomor) {
        if (nomor == null || nomor.length() == 0) {
            System.out.println("PASTIKAN INPUTAN SUDAH BENAR");
            return;
        }

        char hurufDepan = Character.toLowerCase(nomor.charAt(0));

        if (hurufDepan == 'a') {
            dokterUmum.add(nomor);
            int jumlah_antrian = dokterUmum.size();
            if(jumlah_antrian > 1){
                System.out.println("PASIEN " + nomor + " Anda menunggu " + jumlah_antrian + " Orang lagi");
            }
        } else if (hurufDepan == 'b') {
            dokterSpesialis.add(nomor);
            int jumlah_antrian = dokterSpesialis.size();
            if(jumlah_antrian > 1){
                System.out.println("PASIEN " + nomor + " Anda menunggu " + jumlah_antrian + " Orang lagi");
            }

        } else {
            System.out.println("ERROR");
        }
    }

    public void panggilan(String nomor){
        if (nomor == null || nomor.length() == 0) {
            System.out.println("PASTIKAN INPUTAN SUDAH BENAR");
            return;
        }
        char hurufDepan = Character.toLowerCase(nomor.charAt(0));

        if (hurufDepan == 'a') {
            if(dokterSpesialis.isEmpty()){
                System.out.println("Tidak ada layanan Dokter Umum");
            }else{
                System.out.println("Memanggil pasien: " + dokterUmum.poll() + " Silahkan ke loket 1");
            }
        } else if (hurufDepan == 'b') {

            if(dokterSpesialis.isEmpty()){
                System.out.println("Tidak ada layanan Dokter Spesialis");
            }else{
                System.out.println("Memanggil pasien: " + dokterSpesialis.poll() + " Silahkan ke loket 2");
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public void hapusSemualayanan(){
        dokterUmum.clear();
        dokterSpesialis.clear();
    }

}
