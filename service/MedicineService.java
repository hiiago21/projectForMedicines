package service;

import repositories.MedicineRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MedicineService {

    public List<MedicineBO> getAllMedicines(){
        MedicineRepository repository = new MedicineRepository();
        MedicineConverter converter = new MedicineConverter();
        return repository.fileRead().stream().map(converter::toBO).collect(Collectors.toList());
    }
}
