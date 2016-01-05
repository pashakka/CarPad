package ua.od.pashakka.carpad.data.testData;

import java.util.ArrayList;
import java.util.List;

import ua.od.pashakka.carpad.data.PadRecType;
import ua.od.pashakka.carpad.data.PadRecTypeAttr;

public class PadRecTypeAttrTestData {

    public final static int ATTR_FUEL_ODOMETR = 1;
    public final static int ATTR_FUEL_FULL = 2;
    public final static int ATTR_FUEL_STATION = 3;
    public final static int ATTR_WASH_COMPANY = 4;
    public final static int ATTR_REPAIR_NOTE = 5;

    public final static PadRecTypeAttr PADRECTYPEATTR_FUEL_ODOMETR =
            new PadRecTypeAttr(ATTR_FUEL_ODOMETR, PadRecTypeTestData.PADRECTYPE_FUEL,
                    "Пробег", PadRecTypeAttr.VALTYPE_INT);
    public final static PadRecTypeAttr PADRECTYPEATTR_FUEL_FULL =
            new PadRecTypeAttr(ATTR_FUEL_FULL, PadRecTypeTestData.PADRECTYPE_FUEL,
                    "Полный бак", PadRecTypeAttr.VALTYPE_BOOLEAN);
    public final static PadRecTypeAttr PADRECTYPEATTR_FUEL_STATION =
            new PadRecTypeAttr(ATTR_FUEL_STATION, PadRecTypeTestData.PADRECTYPE_FUEL,
                    "Заправка", PadRecTypeAttr.VALTYPE_STRING);

    public final static PadRecTypeAttr PADRECTYPEATTR_WASH_COMPANY =
            new PadRecTypeAttr(ATTR_WASH_COMPANY, PadRecTypeTestData.PADRECTYPE_WASH,
                    "Мойка", PadRecTypeAttr.VALTYPE_STRING);

    public final static PadRecTypeAttr PADRECTYPEATTR_REPAIR_NOTE =
            new PadRecTypeAttr(ATTR_REPAIR_NOTE, PadRecTypeTestData.PADRECTYPE_REPAIR,
                    "Описание", PadRecTypeAttr.VALTYPE_STRING);

    private static List<PadRecTypeAttr> PADRECTYPEATTRList = new ArrayList<PadRecTypeAttr>();

    static {
        PADRECTYPEATTRList.add(PADRECTYPEATTR_FUEL_ODOMETR);
        PADRECTYPEATTRList.add(PADRECTYPEATTR_FUEL_FULL);
        PADRECTYPEATTRList.add(PADRECTYPEATTR_FUEL_STATION);
        PADRECTYPEATTRList.add(PADRECTYPEATTR_WASH_COMPANY);
        PADRECTYPEATTRList.add(PADRECTYPEATTR_REPAIR_NOTE);
    }

    public static List<PadRecTypeAttr> getPADRECTYPEATTRList() {
        return PADRECTYPEATTRList;
    }
}
