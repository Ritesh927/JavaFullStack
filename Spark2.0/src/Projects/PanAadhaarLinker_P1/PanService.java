package Projects.PanAadhaarLinker_P1;

import java.util.HashMap;
import java.util.Map;

public class PanService {

    private static Map<String, Pan> panMap = new HashMap<>();

    static {
        panMap.put("EDWPK1234A", new Pan("EDWPK1234A",
                "123456789", "HDFC BANK", "Stock,ELSS,FD"));
        panMap.put("EDWPK1234B", new Pan("EDWPK1234B",
                "123456780", "SBI BANK", "Stock,FD"));

    }

    public Pan getPanByAadhaarNumber(String aadhaarNumber) {
        for (Pan pan : panMap.values()) {
            if (pan.getAadhaarNumber().equals(aadhaarNumber)) {
                return pan;
            }
        }
        return null;
    }
}
