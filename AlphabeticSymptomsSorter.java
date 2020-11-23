package com.hemebiotech.analytics;



import java.util.*;
import java.util.Map.Entry;



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
    			map.put(string, null);
    		}	
		}
    	 
		return (TreeMap<String, Integer>) map;
		
    }     

	

	@Override
	public TreeMap<String, Integer> treemap()
	{
		TreeMap<String, Integer> tree1 = listNoSort();
		
		// treemap tree2 pour stocker la treemap une fois les occurence compter
		TreeMap<String, Integer> tree2 = new TreeMap<>();
			for (Entry<String, Integer> map : tree2.entrySet())
			{
				if (!tree1.containsKey(map)) 
				{
					tree2.put(map, 1);
				}
				else 
				{
					tree2.put(map, tree2.get(map)+1);
				}
		
				
			}
			
			
		
			return tree2;
		


	}
	

}




	
	
	
	  
	    

