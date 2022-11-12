public class Segitiga{
    private int sudut;

    public void totalSudut(int sudutA){
    sudut = 180 - sudutA;
    System.out.println("Sudut : "+sudut);
    }

    public void totalSudut(int sudutA, int sudutB){
    sudut = 180 - (sudutA+sudutB);
    System.out.println("Sudut : "+sudut);  
    }

    public void keliling(int sisiA, int sisiB, int sisiC){
    int keliling = sisiA+sisiB+sisiC;
    System.out.println("Keliling : "+keliling);
      
    }

    public void keliling(int sisiA, int sisiB){
    double c = (sisiA*sisiA) + (sisiB*sisiB);
    System.out.println("Keliling : "+Math.sqrt(c));
    }
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        sgt.totalSudut(4);
        sgt.totalSudut(4,9);
        sgt.keliling(14, 8,10);
        sgt.keliling(9, 0); 
    } 
}