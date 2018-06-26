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
        descriptions.add(new Description(R.string.name_caffe_1, R.string.description_caffe_1, R.string.localization_caffe_1, R.drawable.caffe_1));
        descriptions.add(new Description(R.string.name_caffe_2, R.string.description_caffe_2, R.string.localization_caffe_2, R.drawable.caffe_2));
        descriptions.add(new Description(R.string.name_caffe_3, R.string.description_caffe_3, R.string.localization_caffe_3, R.drawable.caffe_3));
        descriptions.add(new Description(R.string.name_caffe_4, R.string.description_caffe_4, R.string.localization_caffe_4, R.drawable.caffe_4));
        descriptions.add(new Description(R.string.name_caffe_5, R.string.description_caffe_5, R.string.localization_caffe_5, R.drawable.blank));


        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_cafes);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;


    }


}
