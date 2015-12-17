package ua.od.pashakka.carpad;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class ToDoListItemView extends TextView {

    private Paint _marginPaint;
    private Paint _linePaint;
    private int _paperColor;
    private float _margin;

    public ToDoListItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public ToDoListItemView(Context context) {
        super(context);
        init();
    }

    public ToDoListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        Resources myResources = getResources();

        _marginPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        _marginPaint.setColor(myResources.getColor(R.color.notepad_margin));
        _linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        _linePaint.setColor(myResources.getColor(R.color.notepad_lines));

        _paperColor = myResources.getColor(R.color.notepad_paper);
        _margin = myResources.getDimension(R.dimen.notepad_margin);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(_paperColor);

        canvas.drawLine(0, 0, getMeasuredWidth(), 0, _linePaint);

        canvas.drawLine(_margin, 0, _margin, getMeasuredHeight(), _marginPaint);

        canvas.save();
        canvas.translate(_margin, 0);

        super.onDraw(canvas);
        canvas.restore();
    }
}
