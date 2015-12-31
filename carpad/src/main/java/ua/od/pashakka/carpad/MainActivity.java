package ua.od.pashakka.carpad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import ua.od.pashakka.carpad.data.PadRec;
import ua.od.pashakka.carpad.data.PadRecSubType;
import ua.od.pashakka.carpad.data.PadRecType;
import ua.od.pashakka.carpad.data.Unit;

public class MainActivity extends Activity {

    private ArrayList<PadRec> _records;
    private PadRecViewAdapter _padRecAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.listRecords);

        _records = fillRecords();
        _padRecAdapter = new PadRecViewAdapter(
                getApplicationContext(),
                _records);
        lv.setAdapter(_padRecAdapter);
    }

    private ArrayList<PadRec> fillRecords() {
        ArrayList<PadRec> recs = new ArrayList<PadRec>();
        recs.add(new PadRec(
                1, new Date(), new PadRecType(1, "Type1"), new PadRecSubType(1, "SubType1"),
                new Unit(1, "L"), 1.0F, 10.0F, 10.0F, "Note litres"
        ));
        recs.add(new PadRec(
                2, new Date(), new PadRecType(2, "Type2"), new PadRecSubType(2, "SubType2"),
                new Unit(2, "UAH"), 2.0F, 0.0F, 2.0F, "Note hrivhas"
        ));
        recs.add(new PadRec(
                3, new Date(), new PadRecType(2, "Type2"), new PadRecSubType(2, "SubType2"),
                new Unit(2, "UAH"), 6.0F, 0.0F, 6.0F, "Note hrivhas"
        ));
        recs.add(new PadRec(
                1, new Date(), new PadRecType(1, "Type1"), new PadRecSubType(1, "SubType1"),
                new Unit(1, "L"), 1.0F, 10.0F, 10.0F, "Note litres"
        ));
        return recs;
    }
}
