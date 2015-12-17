package ua.od.pashakka.carpad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by pasha on 017.17.12.2015.
 */
public class MyCompoundView extends LinearLayout {

    EditText _edText;
    Button _clrBtn;

    public MyCompoundView(Context context) {
        super(context);
        init();
    }

    public MyCompoundView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyCompoundView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li;
        li = (LayoutInflater) getContext().getSystemService(infService);
        li.inflate(R.layout.my_compound_view_layout, this, true);

        _edText = (EditText) findViewById(R.id.editTextClr);
        _clrBtn = (Button) findViewById(R.id.clrBtnClr);

        hookupButton();
    }

    private void hookupButton() {
        _clrBtn.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                _edText.setText("");
            }
        });
    }
}
