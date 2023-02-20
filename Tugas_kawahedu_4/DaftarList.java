import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaftarList {
    public List<String> getMakanan() {
        List<String> namaMakanan = new ArrayList<>();
        namaMakanan.add("1. Nasi Goreng");
        namaMakanan.add("2. Mie Goreng");
        namaMakanan.add("3. Bakso");
        namaMakanan.add("4. Sate");
        namaMakanan.add("5. Nasi Padang");
        namaMakanan.add("6. Ayam Geprek");
        namaMakanan.add("7. Soto");
        namaMakanan.add("8. Rendang");
        namaMakanan.add("9. Gado-Gado");
        namaMakanan.add("10. Sop Buntut");
        System.out.println("List Nama Makanan: " + namaMakanan);
        return namaMakanan;
    }

    public List<String> getPialaDunia() {
        List<Integer> tahunPialaDunia = new ArrayList<>();
        tahunPialaDunia.add(2014);
        tahunPialaDunia.add(2018);
        tahunPialaDunia.add(2022);
        System.out.println("List Tahun Piala Dunia: " + tahunPialaDunia);
        return null;
    }

    public List<String> getProvinsi() {
        List<String> namaProvinsi = new ArrayList<>();
        namaProvinsi.add("01. Bali");
        namaProvinsi.add("02. Sulawesi Utara");
        namaProvinsi.add("03. Papua");
        namaProvinsi.add("04. Kalimantan Barat");
        namaProvinsi.add("05. Jawa Barat");
        namaProvinsi.add("06. Aceh");
        namaProvinsi.add("07. Nusa Tenggara Barat");
        namaProvinsi.add("08. Sumatera Utara");
        namaProvinsi.add("09. Sulawesi Selatan");
        namaProvinsi.add("10. Jawa Timur");
        // Mengurutkan list nama provinsi secara descending
        Collections.sort(namaProvinsi, Collections.reverseOrder());
        System.out.println("List Nama Provinsi: " + namaProvinsi);
        return namaProvinsi;
    }

    public List<String> getPrograman() {
        List<String> bahasaPemrograman = new ArrayList<>();
        bahasaPemrograman.add("Java");
        bahasaPemrograman.add("Python");
        bahasaPemrograman.add("C++");
        bahasaPemrograman.add("JavaScript");
        bahasaPemrograman.add("Go");
        bahasaPemrograman.add("Swift");
        bahasaPemrograman.add("Kotlin");
        bahasaPemrograman.add("Ruby");
        bahasaPemrograman.add("PHP");
        bahasaPemrograman.add("Rust");
        bahasaPemrograman.add("MATLAB");

        // Menghapus 5 data dari list bahasa pemrograman
        bahasaPemrograman.remove("Go");
        bahasaPemrograman.remove("Swift");
        bahasaPemrograman.remove("Ruby");
        bahasaPemrograman.remove("Rust");
        bahasaPemrograman.remove("MATLAB");
        System.out.println("List Bahasa Pemrograman setelah penghapusan: " + bahasaPemrograman);
        return bahasaPemrograman;
    }

}
