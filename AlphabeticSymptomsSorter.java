package com.hemebiotech.analytics;

import java.util.*;


public  class AlphabeticSymptomsSorter implements ISymptomSorter{





	@Override
	public Map<String, Integer> listNoSort() 
	{
        
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("C://Users//dell//git//Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application//Project02Eclipse//symptoms.txt");
        List<String> list = reader.getSymptoms();
    	Map< String,Integer> map = new  TreeMap<>();
    	 for (String word : list) 
    	 {
             if (!map.containsKey(word))
             {
                 map.put(word, 1);
             } else 
             {
                 map.put(word, map.get(word) + 0);
             }
    	 }
		return map;
	}
    
   

	

	

	




}
	
	
	
	  
	    

