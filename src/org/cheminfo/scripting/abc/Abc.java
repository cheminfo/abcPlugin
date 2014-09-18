package org.cheminfo.scripting.abc;


import org.cheminfo.function.Function;
import org.cheminfo.function.scripting.SecureFileManager;
import org.json.JSONObject;

public class Abc extends Function{
	
	
	/**
	 * This function accepts a String parameter
	 * @param args
	 * @return args+", Hello world!"
	 */
	public String helloWorld(String args){
		return args+", Hello World!"; 
		
	}	
	
	 /**
	  * This function accepts a JSon parameter. It can be a java json or a javascript json
	  * @param object
	  * @return
	  */
	public String getName(Object object){
		JSONObject params = checkParameter(object);
		String name = params.optString("name","none");
		return "Your name is: "+name; 
	}

}
