package com.example.sijiagao.whatsfordinner.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.sijiagao.whatsfordinner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecipeListFragment extends Fragment {
    public static final String TAG = "yes";

    public RecipeListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view =inflater.inflate(R.layout.fragment_recipe_list, container, false);


        String[] sampleList = {"apple", "ham", "BBQ","Coke","apple", "ham", "BBQ","Coke","apple", "ham", "BBQ","Coke","apple", "ham", "BBQ","Coke"
        ,"apple", "ham", "BBQ","Coke"};
        ListView lv;
        lv =(ListView) view.findViewById(R.id.recipe_listview);
        lv.setAdapter(new ArrayAdapter<String>(getContext(), R.layout.recipe_listview_detail, sampleList));
        Log.i(TAG,"before clickDone");
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG,"clickDone"); // for later send to meal
            }
        });

        return view;
    }


    public void clickForInfo(View view) {
        Log.i("TEST_Info","clickDone");

    }
}
