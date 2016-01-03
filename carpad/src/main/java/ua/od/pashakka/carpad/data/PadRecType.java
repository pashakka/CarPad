package ua.od.pashakka.carpad.data;

import java.util.ArrayList;
import java.util.List;

import ua.od.pashakka.carpad.data.testData.PadRecTypeAttrTestData;

/**
 * Record type
 */
public class PadRecType {
    private int _id;
    private Unit _unitRef;
    private String _name;

    public PadRecType() {
    }



    public PadRecType(int id, Unit unitRef, String name) {
        _id = id;
        _unitRef = unitRef;
        _name = name;
    }

    @Override
    public String toString() {
        return _id + ": " + _name;
    }

    /**
     * id
     *
     * @return
     */
    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    /**
     * Type units
     *
     * @return
     */
    public Unit getUnitRef() {
        return _unitRef;
    }

    public void setUnitRef(Unit unitRef) {
        _unitRef = unitRef;
    }

    /**
     * Name of type
     *
     * @return
     */
    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public List<PadRecTypeAttr> getAttrList() {
        List<PadRecTypeAttr> attrList = new ArrayList<>();

        for (PadRecTypeAttr attr : PadRecTypeAttrTestData.getPADRECTYPEATTRList()) {
            if (attr.getPadRecTypeRef().getId() == this.getId()) {
                attrList.add(attr);
            }
        }

        return attrList;
    }
}
