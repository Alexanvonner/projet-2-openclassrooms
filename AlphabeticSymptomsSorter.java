package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public  class AlphabeticSymptomsSorter implements ISymptomSorter{


	

	// Cette méthode compte les occurences de symptomes
	
    public Map<String, Integer> countOccurences()
    {
    	Map<String,Integer> listNoSort = new HashMap<String, Integer>();
    	ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("C://Users//dell//git//Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application//Project02Eclipse//symptoms.txt");
    	
    	
		return listNoSort;	
	}
    
    // Cette méthode converti la Hashmap (list) en une Treemap
	@Override
	public TreeMap<String, Integer> convertToTreemap() {
		// TODO Auto-generated method stub
		return null;
	}

	




}
	
	
	
	  
	    

