package ua.od.pashakka.carpad.data.testData;

import java.util.ArrayList;
import java.util.List;

import ua.od.pashakka.carpad.data.PadRecSubType;
import ua.od.pashakka.carpad.data.PadRecType;

public class PadRecSubTypeTestData {

    public final static int SUBTYPE_FUEL_LPG = 1;
    public final static int SUBTYPE_FUEL_GASOLINE = 2;

    public final static PadRecSubType PADRECSUBTYPE_FUEL_LPG =
            new PadRecSubType(SUBTYPE_FUEL_LPG, "Газ");
    public final static PadRecSubType PADRECSUBTYPE_FUEL_GASOLINE =
            new PadRecSubType(SUBTYPE_FUEL_GASOLINE, "Бензин");

    private static List<PadRecSubType> PADRECSUBTYPEList = new ArrayList<PadRecSubType>();

    static {
        PADRECSUBTYPEList.add(PADRECSUBTYPE_FUEL_GASOLINE);
        PADRECSUBTYPEList.add(PADRECSUBTYPE_FUEL_LPG);
    }

    public static List<PadRecSubType> getPADRECSUBTYPEList() {
        return PADRECSUBTYPEList;
    }
}
