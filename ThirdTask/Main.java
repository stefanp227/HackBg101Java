import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
     public static void main(String[] args) {

	JSONParser parser = new JSONParser();

	try {

		Object obj1 = parser.parse(new FileReader("C:\\Users\\Ricamros\\Desktop\\hackbg\\resources\\all_packages.json"));
		Object obj2 = parser.parse(new FileReader("C:\\Users\\Ricamros\\Desktop\\hackbg\\resources\\dependencies.json"));
		String backbone = new String();
		String jQuery = new String();
		String queryJ = new String();
		String underscore = new String();
		String lodash = new String();
		int i = 0;
		
		JSONObject jsonObject1 = (JSONObject) obj1;
		JSONObject jsonObject2 = (JSONObject) obj2;
		
		JSONArray dependencies = (JSONArray) jsonObject2.get("dependencies");
		Iterator<String> iterator1 = dependencies.iterator();
		while(iterator1.hasNext()){
			backbone = iterator1.next();
			System.out.println("Installing backbone.");
		}
		
		if(backbone.equals("backbone")){
			JSONArray backbone1 = (JSONArray) jsonObject1.get("backbone");
			Iterator<String> iterator2 = backbone1.iterator();
			while(iterator2.hasNext()){
				System.out.println("In order to install backbone, we need jQuery and underscore.");
				jQuery = iterator2.next();
				underscore = iterator2.next();
			}
		}
		
		if(jQuery.equals("jQuery")){
			JSONArray jQuery1 = (JSONArray) jsonObject1.get("jQuery");
			Iterator<String> iterator2 = jQuery1.iterator();
			while(iterator2.hasNext()){
				System.out.println("Installing jQuery.");
				System.out.println("In order to install jQuery, we need queryJ.");
				queryJ = iterator2.next();
			}
		}
		
		if(queryJ.equals("queryJ")){
			JSONArray queryJ1 = (JSONArray) jsonObject1.get("jQuery");
				System.out.println("Installing queryJ.");	
				FileWriter file2 = new FileWriter("C:\\Users\\Ricamros\\Desktop\\hackbg\\installed_modules\\jQuery");
				FileWriter file4 = new FileWriter("C:\\Users\\Ricamros\\Desktop\\hackbg\\installed_modules\\queryJ");

		}
		
		if(underscore.equals("underscore")){
			JSONArray underscore1 = (JSONArray) jsonObject1.get("underscore");
			Iterator<String> iterator2 = underscore1.iterator();
			while(iterator2.hasNext()){
				System.out.println("Installing underscore.");
				System.out.print("In order to install underscore, we need lodash.");
				lodash = iterator2.next();
			}
		}
		
		if(lodash.equals("lodash")){
			JSONArray lodash1 = (JSONArray) jsonObject1.get("lodash");
				System.out.println(" Lodash is already installed.");	
				System.out.println("All done.");	
				FileWriter file3 = new FileWriter("C:\\Users\\Ricamros\\Desktop\\hackbg\\installed_modules\\lodash");
				FileWriter file5 = new FileWriter("C:\\Users\\Ricamros\\Desktop\\hackbg\\installed_modules\\underscore");
				FileWriter file1 = new FileWriter("C:\\Users\\Ricamros\\Desktop\\hackbg\\installed_modules\\backbone");
		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ParseException e) {
		e.printStackTrace();
	}

     }

}