package pl.against.dateinwarsaw;

import android.content.Context;

public class Description {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    // String value
    private String mName;
    // Text color of the text
    private String mDescription;
    private String mLocalization;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    // Context of the app
    private Context mContext;

    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public Description(String name, String description, String localization) {
        mName = name;
        mDescription = description;
        mLocalization = localization;


    }

    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public Description(String name, String description, String localization, int imageResourceId) {
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
    public String getName() {
        return mName;
    }

    /**
     * Gets the text color of the TextView.
     *
     * @return current text color.
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Gets the text color of the TextView.
     *
     * @return current text color.
     */
    public String getLocalization() {
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

    /**
     * +     * Returns whether or not there is an image for this word.
     * +
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}