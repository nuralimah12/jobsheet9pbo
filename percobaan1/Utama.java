public class Utama {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        //pembuatan Manager
        man[0] = new Manager();
        man[0].setNama("Tedjo");
        man[0].setNip("101");
        man[0].setGolongan("1");
        man[0].setTunjangan(5000000);
        man[0].setBagian("Administrasi");

        
        man[1] = new Manager();
        man[1].setNama("Atika");
        man[1].setNip("102");
        man[1].setGolongan("1");
        man[1].setTunjangan(2500000);
        man[1].setBagian("Pemasaran");

        staff1[0]= new Staff();
        staff1[0].setNama("Usman");
        staff1[0].setNip("003");
        staff1[0].setGolongan("2");
        staff1[0].setLembur(10);
        staff1[0].setGajiLembur(10000);

        staff1[1]= new Staff();
        staff1[1].setNama("Anugrah");
        staff1[1].setNip("005");
        staff1[1].setGolongan("2");
        staff1[1].setLembur(10);
        staff1[1].setGajiLembur(55000);
        man[0].setStaff(staff1);

        staff2[0]= new Staff();
        staff2[0].setNama("Anugrah");
        staff2[0].setNip("005");
        staff2[0].setGolongan("2");
        staff2[0].setLembur(10);
        staff2[0].setGajiLembur(55000);
        man[1].setStaff(staff1);

        man[0].lihatInfo();
        man[1].lihatInfo();

       
    }
}
