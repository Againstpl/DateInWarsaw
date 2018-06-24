package pl.against.dateinwarsaw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class CinemasFragment extends Fragment {


    public CinemasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.describe_list, container, false);


        final ArrayList<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description("Kino Wisła", "www.novekino.pl", "Pl. Wilsona 2, Warszawa", R.drawable.cinema_1));
        descriptions.add(new Description("red", "weṭeṭṭi", "street", R.drawable.cinema_1));
        descriptions.add(new Description("red", "weṭeṭṭi", "street", R.drawable.cinema_1));
        descriptions.add(new Description("red", "weṭeṭṭi", "street", R.drawable.cinema_1));


        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_cinemas);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
