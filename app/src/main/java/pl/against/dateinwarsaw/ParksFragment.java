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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.describe_list, container, false);


        final ArrayList<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description("Botanic Garden PAN", "ogrod-powsin.pl", "https://goo.gl/maps/kA9Fks2cgUS2", R.drawable.park_1));
        descriptions.add(new Description("Morskie Oko Park", "zielona.um.warszawa.pl", "https://goo.gl/maps/rh9Qjrbcoqx", R.drawable.park_2));
        descriptions.add(new Description("Pole Mokotowskie", "zielona.um.warszawa.pl", "https://goo.gl/maps/uRiyoHf3hVx", R.drawable.park_3));
        descriptions.add(new Description("Kępa Potocka", "description", "https://goo.gl/maps/C4tns79sAoz", R.drawable.park_4));
        descriptions.add(new Description("name", "description", "street", R.drawable.blank));

        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_parks);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
