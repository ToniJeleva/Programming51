package Candidate;

import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;
import org.json.simple.parser.JSONParser;

public class DepedenciesResolving {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();

		try {
			Object objDep = parser.parse(new FileReader(
					"C:\\Users\\4525s\\Desktop\\Java.JS\\dependencies.json"));
			Object objAll = parser.parse(new FileReader(
					"C:\\Users\\4525s\\Desktop\\Java.JS\\all_packages.json"));

			JSONObject jsonObjectDep = (JSONObject) objDep;
			JSONObject jsonObjectAll = (JSONObject) objAll;

			ArrayList<String> a = (ArrayList) jsonObjectDep.get("dependencies");
			for (int i = 0; i < a.size(); i++) {
				installPackages(jsonObjectAll, a.get(i));
				System.out.println("All done");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public static void installPackages(JSONObject jsonObject1, String dep) {
		ArrayList<String> mustBeInstalled = new ArrayList<String>();
		mustBeInstalled = (ArrayList) jsonObject1.get(dep);

		if (checkIfInstalled(dep)) {
			System.out.println(Character.toUpperCase(dep.charAt(0))
					+ dep.substring(1) + " is alredy installed.");
		} else {
			System.out.println("Instaling " + dep + ".");
			saveInstalled(dep);
		}

		if (mustBeInstalled.size() != 0) {
			System.out.print("In order to install " + dep + ", we need ");
			for (int i = 0; i < mustBeInstalled.size(); i++) {
				System.out.print(mustBeInstalled.get(i));
				if (i != mustBeInstalled.size() - 1) {
					System.out.print(" and ");
				}
			}
			System.out.print(".");
			System.out.println();
		}

		if (mustBeInstalled.size() != 0) {
			for (int i = 0; i < mustBeInstalled.size(); i++) {
				installPackages(jsonObject1, mustBeInstalled.get(i));
			}

		}
	}

	public static boolean checkIfInstalled(String dep) {
		File folder = new File(
				"C:\\Users\\4525s\\Desktop\\Java.JS\\installed_modules");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile()) {
				if (file.getName().equals(dep)) {
					return true;
				}
			}
		}

		return false;
	}

	public static void saveInstalled(String dep) {
		File file = new File("C:\\Users\\4525s\\Desktop\\Java.JS\\installed_modules\\"+dep);
		file.getParentFile().mkdir();
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
