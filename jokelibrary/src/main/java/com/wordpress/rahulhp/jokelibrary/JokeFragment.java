package com.wordpress.rahulhp.jokelibrary;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.JokeJava;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link JokeFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link JokeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JokeFragment extends Fragment {
    String Joke;
    public JokeFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_joke, container, false);
        Joke = getActivity().getIntent().getExtras().getString("JOKE_INTENT");
        TextView joke = (TextView) view.findViewById(R.id.joke_text);
        joke.setText(Joke);
        return view;
    }


}
