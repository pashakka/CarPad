package ua.od.pashakka.carpad;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import ua.od.pashakka.carpad.data.PadRec;
import ua.od.pashakka.carpad.data.PadRecTypeAttr;
import ua.od.pashakka.carpad.data.PadRecTypeAttrVal;
import ua.od.pashakka.carpad.data.testData.PadRecTypeTestData;

public class PadRecViewAdapter extends BaseAdapter {

    private Context _ctx;
    private List<PadRec> _padRecs;
    LayoutInflater _lInflater;

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
    public Object getItem(int position) {
        return _padRecs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return _padRecs.get(position).getId();
    }

    @Override
    public int getItemViewType(int position) {
        return _padRecs.get(position).getTypeRef().getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PadRec p = getPadRec(position);

        // используем созданные, но не используемые view
        View view = convertView;
        if (view == null || ) {
            view = _lInflater.inflate(R.layout.padrec_view, parent, false);
        }


        // заполняем View
        ((TextView) view.findViewById(R.id.txtPadRecDate)).setText(String.format("%1$tY-%1$tm-%1$td %1$ta", p.getDate()));
        ((TextView) view.findViewById(R.id.txtPadRecType)).setText(
                p.getTypeRef() != null ? p.getTypeRef().toString() : "null");
        ((TextView) view.findViewById(R.id.txtPadRecSubType)).setText(
                p.getSubTypeRef() != null ? p.getSubTypeRef().toString() : "null");

        viewAddAttr(p, view);

        ((EditText) view.findViewById(R.id.edCarPadAmt)).setText(p.getAmt() + "");
        ((EditText) view.findViewById(R.id.edCarPadPrice)).setText(p.getPrice() + "");
        ((EditText) view.findViewById(R.id.edCarPadSum)).setText(p.getSum() + "");

        return view;
    }

    private void viewAddAttr(PadRec p, View view) {
        if (!p.getTypeRef().getAttrList().isEmpty()) {
            LinearLayout ll = (LinearLayout) view.findViewById(R.id.paneAddAttr);
            for (PadRecTypeAttr typeAttr : PadRecTypeTestData.getPADRECTYPEList(p.getTypeRef().getId())) {
                ll.addView(typeAttr.getView(_ctx));
            }
        }
    }

    private PadRec getPadRec(int position) {
        return (PadRec) getItem(position);
    }
}
