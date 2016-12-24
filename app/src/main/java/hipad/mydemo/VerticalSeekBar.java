package hipad.mydemo;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;


public class VerticalSeekBar extends SeekBar {


    public interface onStopSeekBarTouchListener {
        void OnStopSeekBarProgress(SeekBar seekBar);

        void onProgressChang(double progress);

    }

    public void setOnStopSeekBarTouch(onStopSeekBarTouchListener l) {
        this.listener = l;

    }

    private onStopSeekBarTouchListener listener;

    public VerticalSeekBar(Context context) {
        super(context);
    }

    public VerticalSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public VerticalSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    // 这是一个重点,高宽倒置
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(h, w, oldh, oldw);
    }

    // 这是一个重点,高宽倒置
    @Override
    protected synchronized void onMeasure(int widthMeasureSpec,
                                          int heightMeasureSpec) {
        super.onMeasure(heightMeasureSpec, widthMeasureSpec);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }

    // 这是一个重点
    protected void onDraw(Canvas c) {
        c.rotate(-90);
        c.translate(-getHeight(), 0);

        super.onDraw(c);
    }

    // 这是一个重点,高宽倒置
    @Override
    public synchronized void setProgress(int progress) {
        super.setProgress(progress);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (!isEnabled()) {
            return false;
        }
        // 屏蔽父控件拦截onTouch事件
        getParent().requestDisallowInterceptTouchEvent(true);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
                setProgress(getMax()
                        - (int)(getMax() * event.getY() / getHeight()));
                if (listener != null
                        )
                    listener.onProgressChang((getMax()
                            - (int) (getMax() * event.getY() / getHeight())) / 250.0000);

                break;
            case MotionEvent.ACTION_UP:
                // onSizeChanged(getWidth(), getHeight(), 0, 0);
                OnStopTrackingTouch();
                break;

            case MotionEvent.ACTION_CANCEL:
                break;
        }
        return true;
    }

    void OnStopTrackingTouch() {
        if (listener != null) {
            listener.OnStopSeekBarProgress(this);
        }
    }


}
