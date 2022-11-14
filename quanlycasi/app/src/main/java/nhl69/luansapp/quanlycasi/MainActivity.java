package nhl69.luansapp.quanlycasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<CaSi> arrayList;
    CaSiAdapter caSiAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listviewcasi);
        arrayList = new ArrayList<>();

        arrayList.add(new CaSi("Nguyễn Thanh Tùng", "Sơn Tùng MVP", "Việt Nam" ,R.drawable.sontung, 5));
        arrayList.add(new CaSi("Nguyễn Đức Phúc", "Đức Phúc", "Việt Nam" ,R.drawable.ducphuc, 2));
        arrayList.add(new CaSi("Lê Trung Thành", "Erik", "Việt Nam" ,R.drawable.erik, 2));
        arrayList.add(new CaSi("Nguyễn Hoàng Dũng", "Hoàng Dũng", "Việt Nam" ,R.drawable.hoangdung, 4));

        caSiAdapter = new CaSiAdapter(MainActivity.this, R.layout.list_item, arrayList);
        listView.setAdapter(caSiAdapter);
    }
}