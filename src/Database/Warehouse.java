package Database;

import java.util.HashMap;

public class Warehouse extends HashMap<String, HashMap<String, Cuisine>> {// ²ËÆ·²Ö¿â

	public Warehouse() {
		HashMap<String, Cuisine> pot_bottom = new HashMap<String, Cuisine>();// ¶¨ÒåkeyÎª²ËÆ·ID£¬valueÎª²ËÆ·µÄmap
		pot_bottom.put("022", new HotPotCondiment("ÏÊÏãÇÑÖ­", 100, "src/image/022.jpg", 68.0, "022"));
		pot_bottom.put("023", new HotPotCondiment("¾úÌÀ", 100, "src/image/023.jpg", 68.0, "023"));
		pot_bottom.put("024", new HotPotCondiment("Ô§Ñì", 100, "src/image/024.jpg", 68.0, "024"));
		pot_bottom.put("025", new HotPotCondiment("ÂéÀ±", 100, "src/image/025.jpg", 68.0, "025"));

		HashMap<String, Cuisine> drink = new HashMap<String, Cuisine>();
		drink.put("018", new Drinks("Çàµº´¿Éú", 100, "src/image/018.jpg", 7.5, "018"));
		drink.put("019", new Drinks("Ñ©±Ì", 100, "src/image/019.jpg", 5.5, "019"));
		drink.put("020", new Drinks("¿ÉÀÖ", 100, "src/image/020.jpg", 5.5, "020"));
		drink.put("021", new Drinks("½ÛÖ­", 100, "src/image/021.jpg", 6.5, "021"));

		HashMap<String, Cuisine> meat = new HashMap<String, Cuisine>();
		meat.put("001", new Meet("ÄÛÅ£Èâ", 100, "src/image/001.jpg", 32.5, "001"));
		meat.put("002", new Meet("·ÊÅ£Èâ", 100, "src/image/002.jpg", 23.0, "002"));
		meat.put("003", new Meet("Ñ©»¨Å£Èâ", 100, "src/image/003.jpg", 25.0, "003"));
		meat.put("004", new Meet("Å£Éà", 100, "src/image/004.jpg", 55.0, "004"));
		meat.put("005", new Meet("Å£¶Ç", 100, "src/image/005.jpg", 32.5, "005"));
		meat.put("006", new Meet("³×±ú", 100, "src/image/006.jpg", 45.5, "006"));
		meat.put("007", new Meet("ÏÊÅ£ÈâÍè", 100, "src/image/007.jpg", 45.5, "007"));

		HashMap<String, Cuisine> snack = new HashMap<String, Cuisine>();
		snack.put("008", new Snack("´º¾í", 100, "src/image/008.jpg", 22.0, "008"));
		snack.put("009", new Snack("òºÀÓ", 100, "src/image/009.jpg", 22.0, "009"));
		snack.put("010", new Snack("ºìÌÇ¶¹¸¯»¨", 100, "src/image/010.jpg", 5.0, "010"));
		snack.put("011", new Snack("ÆÒÌïËÖÈâ", 100, "src/image/011.jpg", 12.0, "011"));
		snack.put("012", new Snack("ÆÕÄş¶¹¸É", 100, "src/image/012.jpg", 15.0, "012"));
		snack.put("013", new Snack("ÓñÃ×ÀÓ", 100, "src/image/013.jpg", 15.0, "013"));

		HashMap<String, Cuisine> vegetable = new HashMap<String, Cuisine>();
		vegetable.put("014", new Vegetable("ÍŞÍŞ²Ë", 100, "src/image/014.jpg", 16.0, "014"));
		vegetable.put("015", new Vegetable("ËñÆ¬", 100, "src/image/015.jpg", 22.0, "015"));
		vegetable.put("016", new Vegetable("Éú²Ë", 100, "src/image/016.jpg", 16.0, "016"));
		vegetable.put("017", new Vegetable("½ğÕë¹½", 100, "src/image/017.jpg", 25.0, "017"));
		put("pot_bottom", pot_bottom);
		put("meat", meat);
		put("vegetable", vegetable);
		put("snack", snack);
		put("drink", drink);// ½«ÒûÆ·²Ö¿â¼ÓÈëwarehouse£¬ÒÔ×Ó²Ö¿âÃûÎªkey
	}
}
