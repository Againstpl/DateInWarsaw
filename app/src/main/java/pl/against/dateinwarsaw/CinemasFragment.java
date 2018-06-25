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
        descriptions.add(new Description("Kino Wisła", "www.novekino.pl", "https://goo.gl/maps/8AiHwmMSq5U2", R.drawable.cinema_1));
        descriptions.add(new Description("Iluzjon", "http://www.iluzjon.fn.org.pl/", "https://goo.gl/maps/a1GurSbQLZC2", R.drawable.cinema_2));
        descriptions.add(new Description("Kino Lab", "u-jazdowski.pl/kino", "https://goo.gl/maps/wMQA362Tcb12", R.drawable.cinema_3));
        descriptions.add(new Description("Kino Muranów", "kinomuranow.pl", "https://goo.gl/maps/6eZAgoWAEgk", R.drawable.cinema_4));
        descriptions.add(new Description("name", "description", "street", R.drawable.blank));


        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_cinemas);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
