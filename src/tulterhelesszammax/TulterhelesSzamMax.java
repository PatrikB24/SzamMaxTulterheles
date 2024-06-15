
package tulterhelesszammax;


public class TulterhelesSzamMax {

  
    public static void main(String[] args) {
        
    }

    public static int szamMax(int [] szamok) {
        int max = szamok[0];
        for (int i = 0; i < szamok.length; i++) {
            if(szamok[i] > max){
            max = szamok[i];
            }
        }
        return max;
    }
        
        
        
      
    }
    

