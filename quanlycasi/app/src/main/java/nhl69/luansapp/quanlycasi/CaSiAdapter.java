package nhl69.luansapp.quanlycasi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CaSiAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<CaSi> arrayList;

    public CaSiAdapter(Context context, int layout, List<CaSi> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        CaSi caSi = arrayList.get(i);

        TextView ten = convertView.findViewById(R.id.ten);
        TextView nghedanh = convertView.findViewById(R.id.nghedanh);
        TextView quocgia = convertView.findViewById(R.id.quocgia);
        TextView sosao = convertView.findViewById(R.id.sosao);
        ImageView image = convertView.findViewById(R.id.hinhanh);

        ten.setText(caSi.getTen());
        nghedanh.setText(caSi.getNghedanh());
        sosao.setText(caSi.getSosao());
        image.setImageResource(caSi.getHinh());

        return convertView;
    }
}
