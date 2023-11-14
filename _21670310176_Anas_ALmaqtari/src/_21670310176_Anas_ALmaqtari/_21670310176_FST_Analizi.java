package _21670310176_Anas_ALmaqtari;

public class _21670310176_FST_Analizi {
	public static void makinedeki_outputler_gecisSemboller_parcalama(_21670310176_FST fst,String satir) {
		 String[] satirler = satir.split("\\r?\\n");
	        for (String s : satirler) {
	            String[] bolenmis = s.split("\\t", 2);
	            if (bolenmis.length >= 1) {
	                fst.addState(bolenmis[0]);
	            }
	            if (bolenmis.length == 2) {
	                String icerik = bolenmis[1].trim();
	                icerik = icerik.substring(1, icerik.length() - 1);

	                String[] icBolenmis = icerik.split("\\)\\s*\\(");
	                for (String tek : icBolenmis) {
	                    String[] addgecis = tek.split(",");
	                    fst.addGecisStateleri(addgecis[0].trim());
	                    fst.addOutputler(addgecis[1].trim());
	                    fst.addGecisSatVeOut();
	                    fst.fillMakine();
	                }
	            }
	            }	        	
	}

	public static void baslangicDurum(_21670310176_FST fst, String satir) {
		String baslangicState = satir.split("=")[1].trim();
        fst.setBaslangicState(baslangicState);
	}    
}