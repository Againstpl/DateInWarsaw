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
public class CaffesFragment extends Fragment {


    public CaffesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.describe_list, container, false);


        final ArrayList<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description("name", "description", "street", R.drawable.caffe_1));
        descriptions.add(new Description("name", "description", "street", R.drawable.caffe_1));
        descriptions.add(new Description("name", "description", "street", R.drawable.caffe_1));
        descriptions.add(new Description("name", "description", "street", R.drawable.caffe_1));



        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_cafes);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
