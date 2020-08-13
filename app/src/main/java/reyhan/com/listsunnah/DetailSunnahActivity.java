package reyhan.com.listsunnah;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.squareup.picasso.Picasso;

public class DetailSunnahActivity extends AppCompatActivity {

    String title, desc, urlImage;
    TextView tvDetailSunnah, tvDesc;
    ImageView ivSunnah;
    Toolbar toolbarDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sunnah);

        Intent intent = getIntent();
        title = intent.getStringExtra("puTitle");
        desc = intent.getStringExtra("putDesc");
        urlImage = intent.getStringExtra("putImage");

        tvDetailSunnah = findViewById(R.id.tvDetailSunnah);
        tvDesc = findViewById(R.id.tvDetailDesc);
        ivSunnah = findViewById(R.id.ivDetailSunnah);
        toolbarDetail = findViewById(R.id.tbDetail);


        ImageView imageView = findViewById(R.id.ivDetailSunnah);
        TextView textView = findViewById(R.id.tvDetailSunnah);
        TextView textView1 = findViewById(R.id.tvDetailDesc);

        Picasso.get().load(urlImage).into(imageView);
        textView.setText(title);
        textView1.setText(desc);

        setSupportActionBar(toolbarDetail);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
