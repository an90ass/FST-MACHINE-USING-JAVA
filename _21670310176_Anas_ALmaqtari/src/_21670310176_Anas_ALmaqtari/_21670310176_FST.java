package _21670310176_Anas_ALmaqtari;
import java.util.*;
class _21670310176_FST {

	    private String baslangicState;
       	private static ArrayList<String> statler = new ArrayList<String>();
       	private static  ArrayList<String> inputler = new ArrayList<String>();
        private ArrayList<String> gecisStateleri = new ArrayList<String>();  	
        private ArrayList<String> outputler = new ArrayList<String>(); 
        private static Map<String, Map<String, String[][]>> makine = new HashMap<>();
        private static String[][] sonrakiSatVeOut;
        
	    public _21670310176_FST() {
	        statler = new ArrayList<>();
	        inputler = new ArrayList<String>();
	        gecisStateleri = new ArrayList<String>();
	        outputler = new ArrayList<String>();
	        makine = new HashMap<>();
	        
	    }
	    public void addState(String state) {
	    	statler.add(state);
	    }
	    public  ArrayList<String> getStatler() {
        return statler;
	    }
	    public void addInputler(String inputSembolu) {
           inputler.add(inputSembolu);
	    }
	    public  ArrayList<String> getInputler() {
           return inputler;
    }
	    public void addGecisStateleri(String state) {
	    	gecisStateleri.add(state);
	    }
	    public ArrayList<String> getGecisStateleri() {
        return gecisStateleri;
	    }
	    public void addOutputler(String outputSembolu) {
	    	outputler.add(outputSembolu);
	    }
	    public ArrayList<String> getOutputler() {
        return outputler;
	    }
	    public static void addToMakine(String state,Map<String, String[][]> inner_map) {
	    	makine.put(state , inner_map);
	    }
	    
	    public Map<String, Map<String, String[][]>> getMakine() {
	        return makine;
	    }
	    
	    public void addGecisSatVeOut() {
	    	  int size = getSize_gecisler();
	    	  sonrakiSatVeOut = new String[size][2];
	    	    for (int i = 0; i < size; i++) {
	    	    	sonrakiSatVeOut[i][0] = gecisStateleri.get(i);
	    	    	sonrakiSatVeOut[i][1] = outputler.get(i);
	    	    }
	    }


	    public String[][] getGecisSatVeOut() {
	    	return sonrakiSatVeOut;
	    }
	    
	    public  void fillMakine() {
	    	 int index = 0; 

	          for (String state : getStatler()) {
	              Map<String, String[][]> altMap = new HashMap();

	              for (String input : getInputler()) {
	                  if (index < getGecisSatVeOut().length) {
	                      String[] birles_gecisSatVeOut = getGecisSatVeOut()[index];

	                      String[][] a = new String[1][2];
	                      a[0][0] = birles_gecisSatVeOut[0]; 
	                      if (birles_gecisSatVeOut.length > 1) {
	                          a[0][1] = birles_gecisSatVeOut[1];
	                      }
	                      altMap.put(input, a);
	                      index++; 
	                  }
	              

	                  addToMakine(state, altMap);
	    }
	              }
	          }
	    
	     int getSize_gecisler() {
	        return gecisStateleri.size();
		    }
	 public String getBaslangicState() {
		        return baslangicState;
		    }
    public void setBaslangicState(String baslangicState) {
          this.baslangicState = baslangicState;
     }
}
