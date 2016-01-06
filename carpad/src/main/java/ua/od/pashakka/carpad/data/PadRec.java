package ua.od.pashakka.carpad.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ua.od.pashakka.carpad.data.testData.PadRecTypeAttrValTestData;

/**
 * CarPad record
 */
public class PadRec {
    private int _id;
    private Date _date;
    private PadRecType _typeRef;
    private PadRecSubType _subTypeRef;
    private float _amt;
    private float _price;
    private float _sum;

    public PadRec() {
    }

    public PadRec(int id, Date date, PadRecType typeRef, PadRecSubType subTypeRef, float amt, float price, float sum) {
        _id = id;
        _date = date;
        _typeRef = typeRef;
        _subTypeRef = subTypeRef;
        _amt = amt;
        _price = price;
        _sum = sum;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public Date getDate() {
        return _date;
    }

    public void setDate(Date date) {
        _date = date;
    }

    public PadRecType getTypeRef() {
        return _typeRef;
    }

    public void setTypeRef(PadRecType typeRef) {
        _typeRef = typeRef;
    }

    public PadRecSubType getSubTypeRef() {
        return _subTypeRef;
    }

    public void setSubTypeRef(PadRecSubType subTypeRef) {
        _subTypeRef = subTypeRef;
    }

    public float getAmt() {
        return _amt;
    }

    public void setAmt(float amt) {
        _amt = amt;
    }

    public float getPrice() {
        return _price;
    }

    public void setPrice(float price) {
        _price = price;
    }

    public float getSum() {
        return _sum;
    }

    public void setSum(float sum) {
        _sum = sum;
    }

    public List<PadRecTypeAttrVal> getTypeAttrValList() {
        List<PadRecTypeAttrVal> typeAttrValList = new ArrayList<>();

        for (PadRecTypeAttrVal typeAttrVal : PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList()) {
            if (typeAttrVal.getPadRecRef().getId() == this.getId()) {
                typeAttrValList.add(typeAttrVal);
            }
        }

        return typeAttrValList;
    }

    public PadRecTypeAttrVal getTypeAttrValue(int typeAttrId) {
        for (PadRecTypeAttrVal typeAttrVal : PadRecTypeAttrValTestData.getPADRECTYPEATTRVALList()) {
            if (typeAttrVal.getPadRecRef().getId() == this.getId()
                    && typeAttrVal.getPadRecTypeAttrRef().getId() == typeAttrId) {
                return typeAttrVal;
            }
        }
        return null;
    }
}
