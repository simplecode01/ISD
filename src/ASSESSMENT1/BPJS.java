package ASSESSMENT1;

public class BPJS {
    public static void main(String[] args) {
        AntrianBPJS bpjs = new AntrianBPJS();

        bpjs.ambilNomor("A001");
        bpjs.ambilNomor("B001");
        bpjs.ambilNomor("A002");
        bpjs.ambilNomor("A003");

        bpjs.panggilan("A001");
        bpjs.ambilNomor("A004");
        bpjs.panggilan("B001");
        bpjs.panggilan("B002");

        bpjs.hapusSemualayanan();

        bpjs.panggilan("A002");




    }
}
