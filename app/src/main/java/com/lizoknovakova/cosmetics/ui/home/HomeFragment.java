package com.lizoknovakova.cosmetics.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.lizoknovakova.cosmetics.itemadapter.CosmeticItem;
import com.lizoknovakova.cosmetics.itemadapter.DataAdapter;
import com.lizoknovakova.cosmetics.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private ListView listArray;
    private String[] array;
    private ArrayAdapter<String> adapter;
    private int category = 0;
    private final String CATEGORY_KEY = "CATEGORY_KEY";
    private final String POSITION_KEY = "POSITION_KEY";

    private List<CosmeticItem> cosmeticItems = new ArrayList<>();


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

//-------listView realization

//        listArray = root.findViewById(R.id.listViewHome);
//        array = getResources().getStringArray(R.array.medik_eight);
//        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, array);
//        listArray.setAdapter(adapter);


        initialCosmeticItems();

        RecyclerView recyclerView = root.findViewById(R.id.listViewHome);
        DataAdapter adapter = new DataAdapter(getContext(), cosmeticItems);
        recyclerView.setAdapter(adapter);



//        listArray.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                Intent intent = new Intent(getActivity(), ContentActivity.class);
//                intent.putExtra(CATEGORY_KEY, category);
//                intent.putExtra(POSITION_KEY, position);
//                startActivity(intent);
//            }
//        });

//        final TextView textView = root.findViewById(R.id.text_home);
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    private void initialCosmeticItems(){
        //cosmeticItems.add(new CosmeticItem("Medik8 Illuminating Eye Balm", "49$", R.drawable.medik_0));
        cosmeticItems.add(new CosmeticItem("Medik8 Mutiny", "29$", R.drawable.medik_1));
        cosmeticItems.add(new CosmeticItem("Medik8 Crystal Retinal 3", "59$", R.drawable.medik_2));
    }
}