package mape;

import java.util.*;

/**
 * 
 * @author emma
 * 
 * about Maps
 *
 */

public class MainMape {

	public static void main(String[] args) {
		
		// HashMap -tip koji je ekvivalentan asocijativni (hash) nizovima u nekim drugim jezicima
		// može da sadrži samo jedinstvene vrednosti
		// nije sinhronizovan
		// pri definisanju može da mu se dodeli i određen kapacitet, a koji se
		// po prekoračenju uvećava za 75%
		// podrazumevani kapacitet je 10
		
		// definicija
		Map<String, String> gd = new HashMap<String, String>();
		/*
		 * kreirana je mapa podrazumevanog kapaciteta od 16 parova
		 * a sa
		 * Map<String, String> gd = new HashMap<String, String>(5);
		 * kreira se mapa kapaciteta 5 parova
		 */
		
		//dodavanje .put(ključ, vrednost)
		gd.put("Beograd", "Srbija");
		gd.put("Bukurešt", "Rumunija");
		gd.put("Sofija", "Bugarska");
		gd.put("Skoplje", "Makedonija");
		
		//može da se "odštampa" sa print/println u vidu parova vrednosti: ključ=vrednost)
		System.out.println(gd);
		
		//mogu da se ažuriraju vrednosti, ali ne i ključevi
		gd.replace("Skoplje", "Severna Makedonija");
		System.out.println(gd);
		
		//mogu da se čitaju samo vrednosti, preko ključa
		System.out.println(gd.get("Beograd"));
		
		//ne može da se vrši direktna iteracija
		// ali ako se prevede u set onda može
		// Set egd = gd.entrySet();
		for(Object e : gd.entrySet())
			System.out.print(e + "   "); //ključ=vrednost
		System.out.println("");
		// ili, ako treba pročitati vrednosti i ključeve
		for(Map.Entry<String, String> entry : gd.entrySet()){    
	        String key = entry.getKey();  
	        String val = entry.getValue();  
	        System.out.println(key + " je glavni grad " + val);
	    }
		
		
		//LinkedHashMap - povezana HashMap-a, nasleđuje HashMap
		//imaju jedinstvene elemente
		//mogu da sadrže najviše jedan null ključ
		//i više null vrednosti
		// mogu da imaju korisnički kapacitet (podrazumevano 16 sa uvećanjem od 75% za svako prekračenje)	
		//nije sinhronizovano
		
		//definicija
		Map<String, String> lgd = new LinkedHashMap<String, String>();
		//dodavanje
		lgd.put("Podgorica", "Crna Gora");
		lgd.put("Tirana", "Albanija");
		//mogu se prošiti odgovarajućom mapom
		lgd.putAll(gd); //voditi računa da ne postoje duplikati
		System.out.println(lgd);
		//ostalo je isto kao kod HashMap
		
		//TreeMap implementira Map i SortedMap interfejse
		//sadrži jedinstvene elemente
		//ne može da ima null ključeve, ali može da ima više null vrednosti
		//kod iteracije, prikazuje se uvek sortirano po rastućoj vrednosti ključeva
		//nije sinhronizovano
		//nema podrazumevani kapacitet i isti se ne može definisati
		
		//definicija
		Map<String, String> tgd = new TreeMap<String, String>();
		//dodavanje
		tgd.put("Sarajevo", "Bosna i Hercegovin");
		tgd.put("Zagreb", "Hrvatska");
		tgd.put("Budimpešta", "Mađarska");
		//dodavanje druge odgovarajuće mape
		tgd.putAll(lgd);
		System.out.println(tgd); //sortirano
		//prikaz, demonstracija redosleda
		for(Map.Entry<String, String> entry : tgd.entrySet()){    
	        String key = entry.getKey();  
	        String val = entry.getValue();  
	        System.out.println(key + " je glavni grad " + val);
	    }	    

	}

}

/*
 * interfejs Map pozajmljuje metode generičkim klasama HashMap, LinkedHashMap i TreeMap
 * a koji se koriste za obradu niza elemenata koji se sastoje od para vrednosti
 * ključ/vrednost gde je ključ ekvivalent indeksima kod nizova i listi s tim ...
 * što ključ može biti bilo kog tipa, uključujući i null (ne i kod TreeMap)
 * vrednost ključa mora biti jedinstvena na nivou mape
 * vrednost elementa (ne)može da se duplira, npr više null vrednosti
 * kombinacija ključ+vrednost mora biti jedinstvena
 * 
 * mogu da se dodaju novi elementi
 * ažuriraju, brišu, čitaju postojeći (na osnovu ključa), ...
 * 
 * ovo su osnove, ostalo će pomoći Eclipse :)
 * 
 */
