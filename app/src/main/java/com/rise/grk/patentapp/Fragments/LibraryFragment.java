package com.rise.grk.patentapp.Fragments;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rise.grk.patentapp.Adapters.CardRecAdapter;
import com.rise.grk.patentapp.Entities.PatentInfo;
import com.rise.grk.patentapp.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LibraryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LibraryFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static PatentInfo patentInfo;
    public static List<PatentInfo> result;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public LibraryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment LibraryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LibraryFragment newInstance() {
        LibraryFragment fragment = new LibraryFragment();
        Bundle args = new Bundle();

//        args.putAll();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        patentInfo = PatentInfo.fromBundle(getArguments());

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_library, container, false);
        // Inflate the layout for this fragment
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
        if(getActivity().getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        }


        else
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        CardRecAdapter cardRecAdapter = new CardRecAdapter(createList(100));
        recyclerView.setAdapter(cardRecAdapter);

        return rootView;
    }

    private static List<PatentInfo> createList(int size){
        result = new ArrayList<PatentInfo>();
        for (int i = 0; i <= size; i++) {
            PatentInfo patentInfo = new PatentInfo();
            patentInfo.setNumber(String.valueOf(i));
            patentInfo.setTitle(PatentInfo.getTitlePrefix() + i);
            patentInfo.setPreview(PatentInfo.getPreviewRefix());

            result.add(patentInfo);
        }

        return result;
    }

}
