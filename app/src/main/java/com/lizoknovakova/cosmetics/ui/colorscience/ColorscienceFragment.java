package com.lizoknovakova.cosmetics.ui.colorscience;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lizoknovakova.cosmetics.R;

public class ColorscienceFragment extends Fragment {

    private ColorscienceViewModel colorscienceViewModel;
    private ListView listArray;
    private String[] array;
    private ArrayAdapter<String> adapter;
    private int category = 3;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        colorscienceViewModel =
                ViewModelProviders.of(this).get(ColorscienceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_colorscience, container, false);

        listArray = root.findViewById(R.id.listViewColorscience);
        array = getResources().getStringArray(R.array.colorscience);
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, array);
        listArray.setAdapter(adapter);

//        final TextView textView = root.findViewById(R.id.text_colorscience);
//        colorscienceViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}