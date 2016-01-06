package ua.od.pashakka.carpad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

import ua.od.pashakka.carpad.data.PadRec;
import ua.od.pashakka.carpad.data.PadRecTypeAttr;
import ua.od.pashakka.carpad.data.testData.PadRecTypeAttrTestData;

public class PadRecViewAdapter extends BaseAdapter {

    LayoutInflater _lInflater;
    private Context _ctx;
    private List<PadRec> _padRecs;

    public PadRecViewAdapter(Context context, List<PadRec> padRecs) {
        _ctx = context;
        _padRecs = padRecs;
        _lInflater = (LayoutInflater) _ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return _padRecs.size();
    }

    @Override
    public int getViewTypeCount() {
        return PadRecTypeAttrTestData.getPADRECTYPEATTRList().size();
    }

    @Override
    public int getItemViewType(int position) {
        return _padRecs.get(position).getTypeRef().getId();
    }

    @Override
    public Object getItem(int position) {
        return _padRecs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return _padRecs.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PadRec p = getPadRec(position);
        List<PadRecTypeAttr> attrList = p.getTypeRef().getAttrList();
        LinearLayout paneAddAttr;

        // используем созданные, но не используемые view
        View view = convertView;
        if (view == null) {
            view = _lInflater.inflate(R.layout.padrec_view, parent, false);

            // create views for addAttrs
            if (!attrList.isEmpty()) {
                paneAddAttr = (LinearLayout) view.findViewById(R.id.paneAddAttr);
                createViewsForAddAttrs(attrList, paneAddAttr);
            }
        }


        // fill Views
        ((TextView) view.findViewById(R.id.txtPadRecDate)).setText(String.format("%1$tY-%1$tm-%1$td %1$ta", p.getDate()));
        ((TextView) view.findViewById(R.id.txtPadRecType)).setText(
                p.getTypeRef() != null ? p.getTypeRef().toString() : "null");
        ((TextView) view.findViewById(R.id.txtPadRecSubType)).setText(
                p.getSubTypeRef() != null ? p.getSubTypeRef().toString() : "null");

        ((EditText) view.findViewById(R.id.edCarPadAmt)).setText(p.getAmt() + "");
        ((EditText) view.findViewById(R.id.edCarPadPrice)).setText(p.getPrice() + "");
        ((EditText) view.findViewById(R.id.edCarPadSum)).setText(p.getSum() + "");

        // fill views for addAttrs
        if (!attrList.isEmpty()) {
            paneAddAttr = (LinearLayout) view.findViewById(R.id.paneAddAttr);
            fillAddAttrsValues(p, attrList, paneAddAttr);
        }

        return view;
    }

    private void fillAddAttrsValues(PadRec p, List<PadRecTypeAttr> attrList, LinearLayout paneAddAttr) {
        for (PadRecTypeAttr typeAttr : attrList) {
            View v = paneAddAttr.findViewWithTag(typeAttr.getId());
            TextView txtVal = (TextView) v.findViewById(R.id.type_attr_value);
            txtVal.setText(p.getTypeAttrValue(typeAttr.getId()).getValueForView());
        }
    }

    private void createViewsForAddAttrs(List<PadRecTypeAttr> attrList, LinearLayout paneAddAttr) {
        for (PadRecTypeAttr typeAttr : attrList) {
            paneAddAttr.addView(typeAttr.getView(_ctx));
        }
    }

    private PadRec getPadRec(int position) {
        return (PadRec) getItem(position);
    }
}
