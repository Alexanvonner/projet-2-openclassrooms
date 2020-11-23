package com.hemebiotech.analytics;



import java.util.*;



public  class AlphabeticSymptomsSorter implements ISymptomSorter, Treemap{





	



	@Override
	public TreeMap<String, Integer> listNoSort() 
	{
        ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("C://Users//dell//git//Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application//Project02Eclipse//symptoms.txt");
        List<String> list = reader.getSymptoms();
    	Map<String, Integer> map = new  TreeMap<>();
    	for (String string : list) 
    	{
    		// si ma liste n'est pas égale a null j'ajoute ma liste a ma treemap  avec 0 en valeur 
    		if (list != null)
    		{
    			map.put(string, 0);
    		}	
		}
    	 
		return (TreeMap<String, Integer>) map;
		
    }     

	

	@Override
	public TreeMap<String, Integer> treemap()
	{
		TreeMap<String, Integer> tree1 = listNoSort();
		
		
		
		
		return tree1;

	
	}
}




	
	
	
	  
	    

