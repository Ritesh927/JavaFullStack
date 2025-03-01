package Projects.PanAadhaarLinker_P1;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String, Aadhaar> aadhaarMap = new HashMap<>();

    static {
        aadhaarMap.put("123456789", new Aadhaar("123456789",
                "Ashwani", "Mr Anil Kumar", "Agra"));
        aadhaarMap.put("123456780", new Aadhaar("123456780",
                "Chetan", "Mr Mahesh ji", "Delhi"));
    }

    public Aadhaar getAadhaarByNumber(String aadhaarNumber) {
        return aadhaarMap.get(aadhaarNumber);
    }
}