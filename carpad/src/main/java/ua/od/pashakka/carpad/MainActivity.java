package ua.od.pashakka.carpad;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity implements View.OnClickListener {

    private EditText _edText;
    private ArrayList<String> _todoItems;
    private ArrayAdapter<String> _todoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _edText = (EditText) findViewById(R.id.edText);

        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        ListView lv = (ListView) findViewById(R.id.listRecords);

        _todoItems = new ArrayList<String>();
        _todoAdapter = new ArrayAdapter<String>(this,
                R.layout.todolist_item,
                _todoItems);
        lv.setAdapter(_todoAdapter);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAdd) {
            _todoItems.add(0, _edText.getText().toString());
            _todoAdapter.notifyDataSetChanged();
            _edText.setText("");
        }
    }
}
