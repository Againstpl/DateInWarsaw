package pl.against.dateinwarsaw;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        descriptions.add(new Description(R.string.name_cinema_1, R.string.description_cinema_1, R.string.localization_cinema_1, R.drawable.cinema_1));
        descriptions.add(new Description(R.string.name_cinema_2, R.string.description_cinema_2, R.string.localization_cinema_2, R.drawable.cinema_2));
        descriptions.add(new Description(R.string.name_cinema_3, R.string.description_cinema_3, R.string.localization_cinema_3, R.drawable.cinema_3));
        descriptions.add(new Description(R.string.name_cinema_4, R.string.description_cinema_4, R.string.localization_cinema_4, R.drawable.cinema_4));
        descriptions.add(new Description(R.string.name_cinema_5, R.string.description_cinema_5, R.string.localization_cinema_5, R.drawable.blank));


        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_cinemas);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
