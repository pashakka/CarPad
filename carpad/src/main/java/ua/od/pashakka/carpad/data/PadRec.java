package ua.od.pashakka.carpad.data;

import java.util.Date;

/**
 * CarPad record
 */
public class PadRec {
    private int _id;
    private Date _date;
    private PadRecType _typeRef;
    private PadRecSubType _subTypeRef;
    private Unit _unitRef;
    private float _amt;
    private float _price;
    private float _sum;
    private String _note;

    public PadRec() {
    }

    public PadRec(int id, Date date, PadRecType typeRef, PadRecSubType subTypeRef, Unit unitRef, float amt, float price, float sum, String note) {
        _id = id;
        _date = date;
        _typeRef = typeRef;
        _subTypeRef = subTypeRef;
        _unitRef = unitRef;
        _amt = amt;
        _price = price;
        _sum = sum;
        _note = note;
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

    public Unit getUnitRef() {
        return _unitRef;
    }

    public void setUnitRef(Unit unitRef) {
        _unitRef = unitRef;
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

    public String getNote() {
        return _note;
    }

    public void setNote(String note) {
        _note = note;
    }
}
