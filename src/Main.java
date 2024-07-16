
public class Main {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    //1 1 2 3 5 8 13 21 ....
    //n = adım sayısı
    //psvm içinde çağrılan sayıya göre o adımdaki fibonacci elemanını getiren program.
    //fibo(5)=5.sırada hangi fibonacci elemanı var onu getir.
    static int fibo(int n){
        if(n==1||n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
}