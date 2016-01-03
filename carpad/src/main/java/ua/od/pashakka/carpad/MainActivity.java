package ua.od.pashakka.carpad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ua.od.pashakka.carpad.data.PadRec;
import ua.od.pashakka.carpad.data.PadRecSubType;
import ua.od.pashakka.carpad.data.PadRecType;
import ua.od.pashakka.carpad.data.Unit;
import ua.od.pashakka.carpad.data.testData.PadRecTestData;

public class MainActivity extends Activity {

    private List<PadRec> _records;
    private PadRecViewAdapter _padRecAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = (ListView) findViewById(R.id.listRecords);

        _records = PadRecTestData.getPADRECList();
        _padRecAdapter = new PadRecViewAdapter(
                getApplicationContext(),
                _records);
        lv.setAdapter(_padRecAdapter);
    }

}
