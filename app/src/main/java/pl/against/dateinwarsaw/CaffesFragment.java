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
public class CaffesFragment extends Fragment {


    public CaffesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.describe_list, container, false);


        final ArrayList<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description("Oko w Oko", "www.facebook.com/okowokomoko/", "https://goo.gl/maps/xAKvTjSwTBy", R.drawable.caffe_1));
        descriptions.add(new Description("Same fusy", "samefusy.pl", "https://goo.gl/maps/F6qHHBqaiwp", R.drawable.caffe_2));
        descriptions.add(new Description("Etno Cafe", "etnocafe.pl", "https://goo.gl/maps/nYe81HMUs9R2", R.drawable.caffe_3));
        descriptions.add(new Description("Na huśtawce", "nahustawce.pl", "https://goo.gl/maps/AAcJEZFeZDC2", R.drawable.caffe_4));
        descriptions.add(new Description("name", "description", "street", R.drawable.blank));



        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_cafes);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
