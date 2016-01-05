package ua.od.pashakka.carpad.data;

import android.app.ActionBar;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import ua.od.pashakka.carpad.R;

/**
 * Attributes for PadRecType
 */
public class PadRecTypeAttr {

    public final static short VALTYPE_INT = 1;
    public final static short VALTYPE_FLOAT = 2;
    public final static short VALTYPE_STRING = 3;
    public final static short VALTYPE_BOOLEAN = 4;

    private int _id;
    private PadRecType _padRecTypeRef;
    private String _name;
    private short _valType;

    public PadRecTypeAttr() {
    }

    public PadRecTypeAttr(int id, PadRecType padRecTypeRef, String name, short valType) {
        _id = id;
        _padRecTypeRef = padRecTypeRef;
        _name = name;
        _valType = valType;
    }

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public PadRecType getPadRecTypeRef() {
        return _padRecTypeRef;
    }

    public void setPadRecTypeRef(PadRecType padRecTypeRef) {
        _padRecTypeRef = padRecTypeRef;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public short getValType() {
        return _valType;
    }

    public void setValType(short valType) {
        _valType = valType;
    }

    public View getView(Context ctx) {
        LinearLayout ll = new LinearLayout(ctx);
        ll.setOrientation(LinearLayout.HORIZONTAL);
        ll.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));

        TextView txtName = new TextView(ctx);
        txtName.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        txtName.setText(this.getName() + ": ");

        TextView txtVal = new TextView(ctx);
        txtVal.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
        txtVal.setId(R.id.);

        return ll;
    }

}
