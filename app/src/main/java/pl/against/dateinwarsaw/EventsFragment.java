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
        descriptions.add(new Description(R.string.name_event_1, R.string.description_event_1, R.string.localization_event_1, R.drawable.event_1));
        descriptions.add(new Description(R.string.name_event_2, R.string.description_event_2, R.string.localization_event_2, R.drawable.event_2));
        descriptions.add(new Description(R.string.name_event_3, R.string.description_event_3, R.string.localization_event_3, R.drawable.blank));
        descriptions.add(new Description(R.string.name_event_4, R.string.description_event_4, R.string.localization_event_4, R.drawable.blank));
        descriptions.add(new Description(R.string.name_event_5, R.string.description_event_5, R.string.localization_event_5, R.drawable.blank));


        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_events);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;


    }


}
