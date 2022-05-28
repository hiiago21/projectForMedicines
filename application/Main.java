package application;

import service.MedicineService;

public class Main {

	public static void main(String[] args) {
		MedicineService service = new MedicineService();

		service.getAllMedicines();
	}
}
