package minggu5;

public class MainNilaiMahasiswa {
    public static void main(String[] args) {
        NilaiMahasiswa nm = new NilaiMahasiswa();

        int utsTertinggi = nm.maxUTS(nm.uts, 0, nm.uts.length - 1);
        int utsTerendah = nm.minUTS(nm.uts, 0, nm.uts.length - 1);
        double rataUAS = nm.rataUAS();

        System.out.println("Nilai UTS tertinggi: "+ nm.maxUTS(nm.uts,0,nm.uts.length-1));
        System.out.println("Nilai UTS terendah: "+ nm.minUTS(nm.uts,0,nm.uts.length-1));
        System.out.println("Rata-rata nilai UAS: "+ nm.rataUAS());
    }
}
