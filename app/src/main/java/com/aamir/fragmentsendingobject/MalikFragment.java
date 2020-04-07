package com.aamir.fragmentsendingobject;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class MalikFragment extends Fragment {


    public MalikFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_malik, container, false);
        TextView textView=view.findViewById(R.id.txt);

        Bundle bundle=getArguments();
        if (bundle!=null){

            Person p=bundle.getParcelable("key");
            textView.setText(p.getFname()+"\n");
            textView.append(p.getLname()+"\n");
            textView.append(String.valueOf(p.getAge()));


        }

        return view;
    }

}
