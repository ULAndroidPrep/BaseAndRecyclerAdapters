package edu.rosehulman.fisher.namebaseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fisherds on 3/19/18.
 */

public class NameAdapter extends BaseAdapter {
  private List<String> mNames;
  private Context mContext;

  public NameAdapter(Context context) {
    this.mNames = new ArrayList<>();
    this.mContext = context;
  }

  @Override
  public int getCount() {
    return mNames.size();
  }

  // Optional
  @Override
  public Object getItem(int i) {
    return null;
  }

  // Optional
  @Override
  public long getItemId(int i) {
    return 0;
  }


  @Override
  public View getView(int i, View convertView, ViewGroup parent) {
    View view = null;
    if (convertView == null) {
      view = LayoutInflater.from(mContext).inflate(R.layout.name_view, parent, false);
    } else {
      view = convertView;
    }
    // TODO: Populate the view with data.
    TextView nameTextView = view.findViewById(R.id.name);
    TextView descriptionTextView = view.findViewById(R.id.description);


    return view;
  }
}
