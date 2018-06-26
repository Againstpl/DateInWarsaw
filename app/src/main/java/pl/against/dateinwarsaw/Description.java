package pl.against.dateinwarsaw;

import android.content.Context;

public class Description {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    // String value
    private int mName;
    // Text color of the text
    private int mDescription;
    private int mLocalization;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    // Context of the app
    private Context mContext;

    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public Description(int name, int description, int localization) {
        mName = name;
        mDescription = description;
        mLocalization = localization;


    }

    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public Description(int name, int description, int localization, int imageResourceId) {
        mName = name;
        mDescription = description;
        mLocalization = localization;
        mImageResourceId = imageResourceId;

    }

    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public int getName() {
        return mName;
    }

    /**
     * Gets the text color of the TextView.
     *
     * @return current text color.
     */
    public int getDescription() {
        return mDescription;
    }

    /**
     * Gets the text color of the TextView.
     *
     * @return current text color.
     */
    public int getLocalization() {
        return mLocalization;
    }

    /**
     * Gets image in ImageView
     *
     * @return current image
     */

    public int getImageResourceId() {
        return mImageResourceId;
    }


}