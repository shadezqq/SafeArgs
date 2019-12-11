package com.example.safeargs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class Main_fragment extends Fragment {
        EditText editText;


    public Main_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main_fragment, container, false);
        editText = rootView.findViewById(R.id.edit);



    return rootView;

    }

    @Override
    public void onViewCreated(View view, Bundle savefInstanceState){
        super.onViewCreated(view, savefInstanceState);



        final NavController navController = Navigation.findNavController(view);

        Button btn = view.findViewById(R.id.tosecond);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String vmi = editText.getText().toString();
                Main_fragmentDirections.ActionMainFragmentToSecondFragment action = Main_fragmentDirections.actionMainFragmentToSecondFragment();

                action.setString(vmi);
                System.out.println(vmi);
                navController.navigate(action);
            }
            });
    }






}
