package _21670310176_Anas_ALmaqtari;

public class _21670310176_girlenInputIslemleri {
	public static void girilenInputIslemleri(_21670310176_FST fst, String input) {
		String baslangicState = fst.getBaslangicState();
		StringBuilder outputler = new StringBuilder();
		StringBuilder gecisStateler = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
		    String gelenSembol = String.valueOf(input.charAt(i));

		    if (fst.getMakine().containsKey(baslangicState) && fst.getMakine().get(baslangicState).containsKey(gelenSembol)) {
		        String[][] sonrakiVeOut = fst.getMakine().get(baslangicState).get(gelenSembol);
		        baslangicState = sonrakiVeOut[0][0];
		        outputler.append(sonrakiVeOut[0][1]);
		        gecisStateler.append(baslangicState);
		        if (i < input.length() - 1) {
		        	gecisStateler.append(", ");
		        }
		    }
		}

		System.out.println("Durumların sırası:"+ fst.getBaslangicState() + ","+  gecisStateler.toString().replaceAll("\\s+", ""));
		System.out.println("Çıktı:" + outputler.toString());
	}

}
