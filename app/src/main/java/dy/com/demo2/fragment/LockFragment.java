package dy.com.demo2.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import dy.com.demo2.R;
import dy.com.demo2.entity.WeatherEntity;

/**
 * Created by yindezhi on 17/3/2.
 */

public class LockFragment extends Fragment implements View.OnClickListener {

    public static final String TAG = "LockFragment";

    public static void show(FragmentManager fm) {
        final LockFragment fragment = new LockFragment();
        //fragment.setArguments(args);
        final FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragment);
        //ft.addToBackStack(TAG);
        ft.commitAllowingStateLoss();
    }

    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //final Context context = inflater.getContext();
        //final Resources res = context.getResources();
        final View view = inflater.inflate(R.layout.lock_main, container, false);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(this);

        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        SettingFragment.show(getFragmentManager());
    }

    public void updateWeather(WeatherEntity entity){



    }

    public void updateTime(){




    }
}
