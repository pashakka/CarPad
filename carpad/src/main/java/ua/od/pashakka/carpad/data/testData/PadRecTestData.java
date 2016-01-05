package ua.od.pashakka.carpad.data.testData;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import ua.od.pashakka.carpad.data.PadRec;
import ua.od.pashakka.carpad.data.PadRecTypeAttrVal;

public class PadRecTestData {

    private static List<PadRec> PADRECList = new ArrayList<>();

    static {
        PadRec padRec = new PadRec(
                1,
                new GregorianCalendar(2015, 1, 1).getTime(),
                PadRecTypeTestData.PADRECTYPE_FUEL,
                PadRecSubTypeTestData.PADRECSUBTYPE_FUEL_GASOLINE,
                20f,
                19f,
                380f
        );
        PADRECList.add(padRec);
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_FUEL_ODOMETR, padRec, 100000, null, null)
        );
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_FUEL_FULL, padRec, 0, null, null)
        );
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_FUEL_STATION, padRec, null, null, "БРСМ")
        );

        padRec = new PadRec(
                2,
                new GregorianCalendar(2015, 1, 1).getTime(),
                PadRecTypeTestData.PADRECTYPE_FUEL,
                PadRecSubTypeTestData.PADRECSUBTYPE_FUEL_LPG,
                60f,
                9f,
                540f
        );
        PADRECList.add(padRec);
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_FUEL_ODOMETR, padRec, 100000, null, null)
        );
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_FUEL_FULL, padRec, 1, null, null)
        );
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_FUEL_STATION, padRec, null, null, "БРСМ")
        );

        padRec = new PadRec(
                3,
                new GregorianCalendar(2015, 1, 6).getTime(),
                PadRecTypeTestData.PADRECTYPE_WASH,
                null,
                60f,
                9f,
                540f
        );
        PADRECList.add(padRec);
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_WASH_COMPANY, padRec, null, null, "Авто-Спа")
        );

        padRec = new PadRec(
                4,
                new GregorianCalendar(2015, 1, 10).getTime(),
                PadRecTypeTestData.PADRECTYPE_REPAIR,
                null,
                0f,
                0f,
                400f
        );
        PADRECList.add(padRec);
        PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList().add(
                new PadRecTypeAttrVal(
                        PadRecTypeAttrTestData.PADRECTYPEATTR_REPAIR_NOTE, padRec, null, null, "Замена колодок")
        );

    }

    public static List<PadRec> getPADRECList() {
        return PADRECList;
    }
}
