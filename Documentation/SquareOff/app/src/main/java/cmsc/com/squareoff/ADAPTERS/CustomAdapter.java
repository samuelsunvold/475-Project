package cmsc.com.squareoff.ADAPTERS;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import cmsc.com.squareoff.R;

public class CustomAdapter extends BaseAdapter {

    private int [] imagesPhoto;
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(int [] imagesPhoto, Context context) {
        this.imagesPhoto = imagesPhoto;
        this.context = context;
        this.layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imagesPhoto.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if(view == null){
            view = layoutInflater.inflate(R.layout.activity_gridview, parent, false);
        }
        ImageView imageView = view.findViewById(R.id.imageViewIcon);
        imageView.setImageResource(imagesPhoto[position]);

        return view;
    }
}
