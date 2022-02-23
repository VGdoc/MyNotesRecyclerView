package com.example.mynotesrecyclerview.UI;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mynotesrecyclerview.Data.MyNote;
import com.example.mynotesrecyclerview.R;

import java.util.LinkedList;
import java.util.List;


public class FragmentNotes extends Fragment {

    NotesAdapter notesAdapter;

    public static FragmentNotes newInstance() {
        FragmentNotes fragment = new FragmentNotes();
        return fragment;
    }

    public FragmentNotes() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notes, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        initAdapter();
        initRecyclerView(view);
    }

    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(notesAdapter);
    }

    private void initAdapter() {
        notesAdapter = new NotesAdapter();
        notesAdapter.setData(getData());
    }

    List<MyNote> getData(){
        List<MyNote> tempData = new LinkedList<>();
        tempData.add(new MyNote());
        tempData.add(new MyNote());
        tempData.add(new MyNote());
        return tempData;
    }
}