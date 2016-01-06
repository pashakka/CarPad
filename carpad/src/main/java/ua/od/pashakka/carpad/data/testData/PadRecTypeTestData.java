package ua.od.pashakka.carpad.data.testData;

import java.util.ArrayList;
import java.util.List;

import ua.od.pashakka.carpad.data.PadRecType;
import ua.od.pashakka.carpad.data.PadRecTypeAttr;

public class PadRecTypeTestData {

    public final static int TYPE_FUEL = 1;
    public final static int TYPE_REPAIR = 2;
    public final static int TYPE_PARKING = 3;
    public final static int TYPE_WASH = 4;

    public final static PadRecType PADRECTYPE_FUEL =
            new PadRecType(TYPE_FUEL, UnitTestData.UNIT_LITRES, "Топливо");
    public final static PadRecType PADRECTYPE_REPAIR =
            new PadRecType(TYPE_REPAIR, UnitTestData.UNIT_CNT, "Ремонт");
    public final static PadRecType PADRECTYPE_PARKING =
            new PadRecType(TYPE_PARKING, UnitTestData.UNIT_CNT, "Стоянка");
    public final static PadRecType PADRECTYPE_WASH =
            new PadRecType(TYPE_WASH, UnitTestData.UNIT_CNT, "Мойка");

    private static List<PadRecType> PADRECTYPEList = new ArrayList<>();

    static {
        PADRECTYPEList.add(PADRECTYPE_FUEL);
        PADRECTYPEList.add(PADRECTYPE_PARKING);
        PADRECTYPEList.add(PADRECTYPE_REPAIR);
        PADRECTYPEList.add(PADRECTYPE_WASH);
    }

    public static List<PadRecType> getPADRECTYPEList() {
        return PADRECTYPEList;
    }
}
