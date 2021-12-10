package com.obsqura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sample3 {

	public static void main(String[] args) {
    HashMap<String,String>ob =new HashMap<String,String>();
    ob.put("name", "abc");
    ob.put("job", "doc");
    ob.put("name", "xyz");
    //List<String>ob3 = new ArrayList<String>();
    List<HashMap<String,String>>ob1=new ArrayList <HashMap<String,String>>();
    ob1.add(ob);
    ob1.add( new HashMap<String, String>() {{
        put("name", "b");
        put("job", "d");
    }});
    for (HashMap<String,String> cities : ob1)   
    {  
    //prints the elements of the List  
    System.out.println(cities);   
   
    for (Map.Entry<String,String> entry : cities.entrySet()) //using map.entrySet() for iteration  
	 {  
	 //returns keys and values respectively  
	// System.out.println("Key " + entry.getKey() + ", Value " + entry.getValue());   
	
	 }   
	}
	 }  

}


//eat ,ate ,tea ,abc ,cba ,xyz
//output --List of list of string of anagrams
//[[ eat,ate,tea  ],[abc ,cba ],[xyz]]


// I am using eclipse for java developement
//I - no of occurances =3
//a - no of occurances =3
//output should be in alphabetical order //Hash Table-insertion//Hash Tree map-alphabetical 



