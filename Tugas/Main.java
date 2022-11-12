public class Main {
    public static void main(String[] args) {
        Manusia mn = new Manusia();
        Dosen ds = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        mn.bernafas();
        mn.makan();

        ds.makan();
        ds.lembur();

        mhs.makan();
        mhs.tidur();
    }
}
