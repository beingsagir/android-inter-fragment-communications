package com.dolovers.android_inter_fragments_communications;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Sagiruddin on 3/25/2015.
 */
public class FragmentForManualInput extends Fragment  implements View.OnClickListener{
    Button buttonInput;
    Integer count = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.input_fragment_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        buttonInput = (Button) getActivity().findViewById(R.id.button);
    }

    @Override
    public void onClick(View view) {
        count++;
    }
}
