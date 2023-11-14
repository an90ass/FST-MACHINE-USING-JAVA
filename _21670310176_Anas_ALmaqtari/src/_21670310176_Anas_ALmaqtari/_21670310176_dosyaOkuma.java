package _21670310176_Anas_ALmaqtari;
import java.io.*;
import java.util.*;
public class _21670310176_dosyaOkuma {
    
   static void dosyaAcmaVeOkuma(_21670310176_FST fst, String fileName) {

          try (BufferedReader dosya = new BufferedReader(new FileReader(fileName))) {
              String satir;
              while ((satir = dosya.readLine()) != null) {
                   if (satir.startsWith("q0")) {
                      
                	   _21670310176_FST_Analizi.baslangicDurum(fst, satir); 
                  }
                  
                  else if (satir.startsWith("\u03B4")) {                     
               	       girdiler_parcalama(fst,satir);               	  
                	  }
                	  else if (satir.contains("(")) {
                		  _21670310176_FST_Analizi.makinedeki_outputler_gecisSemboller_parcalama(fst, satir);
          	                    }
          	                    
          	                }   
              dosya.close();

         }               
           catch (IOException e) {
              e.printStackTrace();
          } 
}

private static void girdiler_parcalama(_21670310176_FST fst, String satir) {
	String b= satir.replaceAll("\\s+", "").replaceAll("\\D+", "");
    String [] inputler = b.split("");                   
	  for (int i = 0 ; i <inputler.length;i++) {
		  fst.addInputler(inputler[i]);}		
}
}

