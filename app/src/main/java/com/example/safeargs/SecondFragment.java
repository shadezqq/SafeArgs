package com.example.safeargs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class SecondFragment extends Fragment {
    TextView title;

    public SecondFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View secview = inflater.inflate(R.layout.fragment_second, container, false);
        title = secview.findViewById(R.id.textView);

        return secview;
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null){
            SecondFragmentArgs args = SecondFragmentArgs.fromBundle(getArguments());
            String string = args.getString();

            title.setText(string);

        }
    }


}
