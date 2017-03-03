package dy.com.demo2.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dy.com.demo2.R;

/**
 * Created by yindezhi on 17/3/3.
 */

public class ToolFragment extends Fragment {

    private static final String TAG = "ToolFragment";

    public static void show(FragmentManager fm) {
        final SettingFragment fragment = new SettingFragment();
        //fragment.setArguments(args);
        final FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.activity_main, fragment);
        ft.addToBackStack(TAG);
        ft.setCustomAnimations(R.animator.zoom_slide_vertical_right_in, R.animator.zoom_slide_vertical_left_out,
                R.animator.zoom_slide_vertical_left_in, R.animator.zoom_slide_vertical_right_out);
        ft.commitAllowingStateLoss();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final Context context = inflater.getContext();
        final Resources res = context.getResources();
        final View view = inflater.inflate(R.layout.setting_main, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
