
package tulterhelesszammax;


public class teszt {
   
         public static void main(String[] args) {
        tesztSzamMax();
    }

    public static void tesztSzamMax() {
        int[] szamok1 = {1, 2, 3, 4, 5, 8, 6};
        int eredmeny = TulterhelesSzamMax.szamMax(szamok1);
        assert eredmeny == 5 : "A szamMax metódus helytelen eredményt adott vissza!";
        System.out.printf("A legnagyobb szám %d",eredmeny);
    }
    }    

