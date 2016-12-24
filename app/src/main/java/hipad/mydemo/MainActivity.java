package hipad.mydemo;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.Log;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.Arrays;

/**
 * 添加一句注释
 */
public class MainActivity extends FragmentActivity {
    private AppCompatSeekBar seekBar;
    private VerticalSeekBar seek_bar1;
    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (AppCompatSeekBar) findViewById(R.id.seek_bar);
        seek_bar1 = (VerticalSeekBar) findViewById(R.id.seek_bar1);
        seek_bar1.setMax(527);

        seek_bar1.setThumb(getResources().getDrawable(
                R.drawable.huaniu_shang));
        seek_bar1.setProgressDrawable(getResources().getDrawable(
                R.mipmap.yinliangtiao_hengxiang));
//        seek_bar1.setThumbOffset(0);

        seekBar.setProgressDrawable(getResources().getDrawable(
                R.mipmap.yinliangtiao_hengxiang));
        seekBar.setThumb(getResources().getDrawable(
                R.drawable.huaniu_shang));


        seek_bar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                ToastTools.showShort(MainActivity.this, "当期==" + progress);/*进度范围{0-527}*/
                /*转化为标准数值*/
                double x = progress / 250.000;
                int yScale = (int) Math.pow(Math.E, 2.302 * x) - 1;

//                int a = Arrays.binarySearch(keyTools.XScale, progress);
                Log.d("vivi", x + "进度转化为指令" + yScale);
//                ToastTools.showShort(MainActivity.this, "当期==" + x);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seek_bar1.setOnStopSeekBarTouch(new VerticalSeekBar.onStopSeekBarTouchListener() {


            @Override
            public void onProgressChang(double progress) {
//                Log.d("vivi", progress + "");
//
//                ToastTools.showShort(MainActivity.this, "当前指令=" + progress);
            }

            @Override
            public void OnStopSeekBarProgress(SeekBar seekBar) {


//                ToastTools.showShort(MainActivity.this, "当期指令==" + seekBar.getProgress());

            }
        });

    }
}
