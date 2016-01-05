package ua.od.pashakka.carpad.data.testData;

import java.util.ArrayList;
import java.util.List;

import ua.od.pashakka.carpad.data.PadRecSubType;
import ua.od.pashakka.carpad.data.Unit;

public class UnitTestData {
    public final static int LITRES = 1;
    public final static int CNT = 2;

    public final static Unit UNIT_LITRES =
            new Unit(LITRES, "л.");
    public final static Unit UNIT_CNT =
            new Unit(CNT, "шт.");

    private static List<Unit> UNITList = new ArrayList<Unit>();

    static {
        UNITList.add(UNIT_LITRES);
        UNITList.add(UNIT_CNT);
    }

    public static List<Unit> getUNITList() {
        return UNITList;
    }
}
