
package uygulama7;

public class Uygulama7 {

         public static void main(String[] args) 
    {
        String isim=oku();
        //Döndürdüğümüz değeri isim değişkenine atadık.
        System.out.println(isim);
        //Ekrana yazdırdık.
    }
    static String oku()
    //Bu metodumuzda void yerine String yazdık.Çünkü geriye dönen değer String tipindedir.        
    {
    return "Nesne Tabanlı Programlama" ;
    }
}
    
