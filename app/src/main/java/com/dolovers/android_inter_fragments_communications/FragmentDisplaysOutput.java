package com.dolovers.android_inter_fragments_communications;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by Sagiruddin on 3/25/2015.
 */
public class FragmentDisplaysOutput extends Fragment{

    TextView tView;
    String data;

    Integer count = 0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

                View view = inflater.inflate( R.layout.output_fragment_layout, container, false);
        if(savedInstanceState==null){

        }else{
           data = savedInstanceState.getString("data");
           TextView text = (TextView) view.findViewById(R.id.textView);
           text.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tView = (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("data", data);
    }

    public void changeText(String data){
        tView.setText(data);
    }

}
