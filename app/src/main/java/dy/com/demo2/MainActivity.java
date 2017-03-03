package dy.com.demo2;

import android.app.Activity;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import dy.com.demo2.entity.WeatherEntity;
import dy.com.demo2.fragment.LockFragment;
import dy.com.demo2.fragment.SettingFragment;
import dy.com.demo2.view.BlurringView;

public class MainActivity extends Activity implements SettingFragment.OnAddressChangeListener{

    private ImageView imageView;

    private BlurringView mBlurringView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(this);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageDrawable(wallpaperManager.getDrawable());
        mBlurringView = (BlurringView) findViewById(R.id.blurring_view);
        View blurredView = findViewById(R.id.blurred_view);
        mBlurringView.setBlurredView(blurredView);
        LockFragment.show(getFragmentManager());
    }



    @Override
    public void onAddressChangeListener(WeatherEntity weatherEntity) {

        LockFragment lockFragment = (LockFragment) getFragmentManager().findFragmentByTag(LockFragment.TAG);

        if(lockFragment!=null){
            lockFragment.updateWeather(weatherEntity);
        }
    }
}
