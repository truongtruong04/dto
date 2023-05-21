


public class dto {
    int Giamay;

    public dto(String ten){
        System.out.println("Ten may la :" + ten );
    }
    public void Giamay( int gia ){
        Giamay = gia;
    }

    public int giathitruong( ){
        System.out.println("Gia mua may la :" + Giamay );
        return Giamay;
    }
    public static void main(String []args){
        /* Tao doi tuong */
        dto Maycuatoi = new dto( "Gygabye g5" );
        Maycuatoi.Giamay( 150000 );
        Maycuatoi.giathitruong( );
        System.out.println("Gia tri bien :" + Maycuatoi.Giamay );
    }
}
