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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.describe_list, container, false);


        final ArrayList<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description("Multimedia Fountain Park", "http://www.parkfontann.pl/", "https://goo.gl/maps/UnYcR7kyd5U2", R.drawable.event_1));
        descriptions.add(new Description("Ship to Serock", "http://www.ztm.waw.pl/?c=148&l=1", "https://goo.gl/maps/8abivy27Q9y", R.drawable.event_2));
        descriptions.add(new Description("name", "description", "street", R.drawable.blank));
        descriptions.add(new Description("name", "description", "street", R.drawable.blank));
        descriptions.add(new Description("name", "description", "street", R.drawable.blank));


        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;


    }


}
