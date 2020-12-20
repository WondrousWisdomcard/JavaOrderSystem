package Database;

import java.util.HashMap;

public class Warehouse extends HashMap<String, HashMap<String, Cuisine>> {// ��Ʒ�ֿ�

	public Warehouse() {
		HashMap<String, Cuisine> pot_bottom = new HashMap<String, Cuisine>();// ����keyΪ��ƷID��valueΪ��Ʒ��map
		pot_bottom.put("022", new HotPotCondiment("������֭", 100, "src/image/022.jpg", 68.0, "022"));
		pot_bottom.put("023", new HotPotCondiment("����", 100, "src/image/023.jpg", 68.0, "023"));
		pot_bottom.put("024", new HotPotCondiment("ԧ��", 100, "src/image/024.jpg", 68.0, "024"));
		pot_bottom.put("025", new HotPotCondiment("����", 100, "src/image/025.jpg", 68.0, "025"));

		HashMap<String, Cuisine> drink = new HashMap<String, Cuisine>();
		drink.put("018", new Drinks("�ൺ����", 100, "src/image/018.jpg", 7.5, "018"));
		drink.put("019", new Drinks("ѩ��", 100, "src/image/019.jpg", 5.5, "019"));
		drink.put("020", new Drinks("����", 100, "src/image/020.jpg", 5.5, "020"));
		drink.put("021", new Drinks("��֭", 100, "src/image/021.jpg", 6.5, "021"));

		HashMap<String, Cuisine> meat = new HashMap<String, Cuisine>();
		meat.put("001", new Meet("��ţ��", 100, "src/image/001.jpg", 32.5, "001"));
		meat.put("002", new Meet("��ţ��", 100, "src/image/002.jpg", 23.0, "002"));
		meat.put("003", new Meet("ѩ��ţ��", 100, "src/image/003.jpg", 25.0, "003"));
		meat.put("004", new Meet("ţ��", 100, "src/image/004.jpg", 55.0, "004"));
		meat.put("005", new Meet("ţ��", 100, "src/image/005.jpg", 32.5, "005"));
		meat.put("006", new Meet("�ױ�", 100, "src/image/006.jpg", 45.5, "006"));
		meat.put("007", new Meet("��ţ����", 100, "src/image/007.jpg", 45.5, "007"));

		HashMap<String, Cuisine> snack = new HashMap<String, Cuisine>();
		snack.put("008", new Snack("����", 100, "src/image/008.jpg", 22.0, "008"));
		snack.put("009", new Snack("���", 100, "src/image/009.jpg", 22.0, "009"));
		snack.put("010", new Snack("���Ƕ�����", 100, "src/image/010.jpg", 5.0, "010"));
		snack.put("011", new Snack("��������", 100, "src/image/011.jpg", 12.0, "011"));
		snack.put("012", new Snack("��������", 100, "src/image/012.jpg", 15.0, "012"));
		snack.put("013", new Snack("������", 100, "src/image/013.jpg", 15.0, "013"));

		HashMap<String, Cuisine> vegetable = new HashMap<String, Cuisine>();
		vegetable.put("014", new Vegetable("���޲�", 100, "src/image/014.jpg", 16.0, "014"));
		vegetable.put("015", new Vegetable("��Ƭ", 100, "src/image/015.jpg", 22.0, "015"));
		vegetable.put("016", new Vegetable("����", 100, "src/image/016.jpg", 16.0, "016"));
		vegetable.put("017", new Vegetable("���빽", 100, "src/image/017.jpg", 25.0, "017"));
		put("pot_bottom", pot_bottom);
		put("meat", meat);
		put("vegetable", vegetable);
		put("snack", snack);
		put("drink", drink);// ����Ʒ�ֿ����warehouse�����Ӳֿ���Ϊkey
	}
}
