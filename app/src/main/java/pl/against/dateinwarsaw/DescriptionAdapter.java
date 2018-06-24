package pl.against.dateinwarsaw;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DescriptionAdapter extends ArrayAdapter<Description> {

    private int mColorResourceId;


    public DescriptionAdapter(Activity context, ArrayList<Description> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)

    {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Description currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);

        nameTextView.setText(currentWord.getName());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);

        descriptionTextView.setText(currentWord.getDescription());

        TextView localizationTextView = (TextView) listItemView.findViewById(R.id.localization_text_view);

        localizationTextView.setText(currentWord.getLocalization());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentWord.getImageResourceId());


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;

    }

}