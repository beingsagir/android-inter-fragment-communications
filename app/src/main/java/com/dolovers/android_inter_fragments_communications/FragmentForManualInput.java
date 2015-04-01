package com.dolovers.android_inter_fragments_communications;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
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
    FCommunicator fcomm;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState ==null){
            count=0;
        }else{
            count= savedInstanceState.getInt("count", 0);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.input_fragment_layout, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fcomm= (FCommunicator) getActivity();
        buttonInput = (Button) getActivity().findViewById(R.id.button);
        buttonInput.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }

    @Override
    public void onClick(View view) {
        count++;
        fcomm.respond(count.toString());
    }
}
