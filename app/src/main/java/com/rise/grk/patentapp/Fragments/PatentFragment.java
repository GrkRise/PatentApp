package com.rise.grk.patentapp.Fragments;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.transition.Fade;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rise.grk.patentapp.Entities.PatentInfo;
import com.rise.grk.patentapp.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link PatentFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link PatentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PatentFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static PatentInfo patentInfo;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    public PatentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment PatentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PatentFragment newInstance() {
        PatentFragment fragment = new PatentFragment();
        Bundle args = new Bundle();

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
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_patent, container, false);

        TextView textView_title = (TextView) rootView.findViewById(R.id.patent_title);
        textView_title.setText(patentInfo.getTitle() + " // " + patentInfo.getNumber());
        TextView textView_authors = (TextView) rootView.findViewById(R.id.authors);
        textView_authors.setText(patentInfo.getAuthors());
        TextView textView_owner = (TextView) rootView.findViewById(R.id.owner);
        textView_owner.setText(patentInfo.getOwner());
        TextView textView_full = (TextView) rootView.findViewById(R.id.patent_text);
        textView_full.setText(patentInfo.getFull_text());



        return rootView;
    }

}
