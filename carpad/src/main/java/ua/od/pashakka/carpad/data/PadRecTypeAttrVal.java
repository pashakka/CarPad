package ua.od.pashakka.carpad.data;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Date;

/**
 * Attributes for PadRecType
 */
public class PadRecTypeAttrVal {
    private PadRecTypeAttr _padRecTypeAttrRef;
    private PadRec _padRecRef;
    private Integer _intValue;
    private Float _floatValue;
    private String _strValue;

    public PadRecTypeAttrVal() {
    }

    public PadRecTypeAttrVal(PadRecTypeAttr padRecTypeAttrRef, PadRec padRecRef, Integer intValue, Float floatValue, String strValue) {
        _padRecTypeAttrRef = padRecTypeAttrRef;
        _padRecRef = padRecRef;
        _intValue = intValue;
        _floatValue = floatValue;
        _strValue = strValue;
    }

    public PadRecTypeAttr getPadRecTypeAttrRef() {
        return _padRecTypeAttrRef;
    }

    public void setPadRecTypeAttrRef(PadRecTypeAttr padRecTypeAttrRef) {
        _padRecTypeAttrRef = padRecTypeAttrRef;
    }

    public PadRec getPadRecRef() {
        return _padRecRef;
    }

    public void setPadRecRef(PadRec padRecRef) {
        _padRecRef = padRecRef;
    }

    public Integer getIntValue() {
        return _intValue;
    }

    public void setIntValue(Integer intValue) {
        _intValue = intValue;
    }

    public Float getFloatValue() {
        return _floatValue;
    }

    public void setFloatValue(Float floatValue) {
        _floatValue = floatValue;
    }

    public String getStrValue() {
        return _strValue;
    }

    public void setStrValue(String strValue) {
        _strValue = strValue;
    }

    public View getView(Context ctx) {
        TextView tv = new TextView(ctx);
        tv.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        tv.setText(this.getPadRecTypeAttrRef().getName() + ": " + this.getValueForView());
        return tv;
    }

    public String getValueForView() {
        switch (this.getPadRecTypeAttrRef().getValType()) {
            case PadRecTypeAttr.VALTYPE_BOOLEAN:
                return this.getIntValue() != null && this.getIntValue().equals(1) ? "yes" : "no";
            case PadRecTypeAttr.VALTYPE_INT:
                return this.getIntValue() != null ? this.getIntValue().toString() : "null";
            case PadRecTypeAttr.VALTYPE_FLOAT:
                return this.getFloatValue() != null ? this.getFloatValue().toString() : "null";
            case PadRecTypeAttr.VALTYPE_STRING:
                return this.getStrValue() != null ? this.getStrValue() : "null";
            default:
                return "undef";
        }
    }
}
