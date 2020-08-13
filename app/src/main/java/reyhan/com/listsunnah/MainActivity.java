package reyhan.com.listsunnah;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class MainActivity extends AppCompatActivity {

    Toolbar toolDetail;
    ListView listSunnah;
    CarouselView carouselView;
    int[] listImage = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7, R.drawable.image8};
    String[] title = {"Memelihara Wudhu",
            "Bersiwak",
            "Bersegera Menuju Sholat",
            "Berbuka Puasa Dengan Makanan Ringan",
            "Sujud Syukur Ketika Mendapatkan Nikmat atau Terhindar dari Bencana",
            "Membuat Pembatas Ketika Sedang Shalat",
            "Mengeraskan Suara Ketika Membaca Zikir Setelah Shalat",
            "Shalat Subuh Berjamaah di Masjid",};

    String[] desc = {"Seperti dalam sebuah hadits yang diriwayatkan dari Tsauban Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Istiqamahlah (konsistenlah) kalian semua (dalam menjalankan perintah Allah) dan kalian tidak akan pernah dapat menghitung pahala yang akan Allah berikan. Ketahuilah bahwa sebaik-baik perbuatan adalah shalat, dan tidak ada yang selalu memelihara wudhunya kecuali seorang mukmin.” (HR. Ahmad dan Ibnu Majah)",
            "Bersiwak itu seperti gosok gigi, bedanya kalau bersiwak itu menggunakan kayu yang disebut siwak. Ada hadits yang menyebutkan masalah bersiwak ini, seperti yang diriwayatkan dari Aisyah Radhiyallahu Anha bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Siwak dapat membersihkan mulut dan sarana untuk mendapatkan ridha Allah. (HR. Ahmad dan An-Nasa`i",
            "Diriwayatkan dari Abu Hurairah Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Andaikata umat manusia mengetahui pahala di balik adzan dan berdiri pada shaf pertama kemudian mereka tidak mendapatkan bagian kecuali harus mengadakan undian terlebih dahulu niscaya mereka membuat undian itu. Andaikata mereka mengetahui pahala bergegas menuju masjid untuk melakukan shalat, niscaya mereka akan berlomba-lomba melakukannya. Andaikata mereka mengetahui pahala shalat isya dan subuh secara berjamaah, niscaya mereka datang meskipun dengan merangkak.” (HR. Al-Bukhari dan Muslim)",
            "Diriwayatkan dari Anas bin Malik Radhiyallahu Anhu, ia berkata, “Rasulullah Shallallahu Alaihi wa Sallam berbuka puasa sebelum shalat maghrib dengan beberapa kurma basah. Jika tidak ada maka dengan beberapa kurma kering. Jika tidak ada, maka beliau hanya meminum beberapa teguk air.” (HR. Ahmad, Abu Dawud dan At-Tirmidzi)",
            "Dalam sebuah hadits yang diriwayatkan dari Abu Bakrah Radhiyallahu Anhu ia berkata, “Jika Rasulullah Shallallahu Alaihi wa Sallam mendapatkan sesuatu yang menyenangkan atau disampaikan kabar gembira maka beliau langsung sujud dalam rangka bersyukur kepada Allah.” (HR. Abu Dawud, At-Tirmidzi dan Ibnu Majah).",
            "Diriwayatkan dari Abu Said al-Kudri Radhiyallahu Anhu bahwa Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Ketika kalian hendak shalat, maka buatlah pembatas di depannya dan majulah sedikit, dan janganlah membiarkan seseorang lewat di depannya. Jika ada orang yang sengaja lewat di depannya, maka hendaknya dia menghalanginya karena orang itu adalah setan.” (HR. Abu dawud dan Ibnu Majah)",
            "Di dalam kitab Shahih Al-Bukhari disebutkan, “Ibnu Abbas Radhiyallahu Anhuma mengatakan, mengeraskan suara dalam berzikir setelah orang-orang selesai melaksanakan shalat wajib telah ada sejak zaman Rasulullah Shallallahu Alaihi wa Sallam. Ibnu Abbas juga mengatakan, “Aku mengetahui orang-orang telah selesai melaksanakan shalat karena mendengar zikir mereka.” (HR. Al-Bukhari)",
            "Rasulullah Shallallahu Alaihi wa Sallam bersabda, “Sungguh, shalat yang paling berat bagi orang munafik, adalah shalat isya dan shalat shubuh. sekiranya mereka mengetahui apa yang terkandung di dalamnya, mereka pasti mendatangani keduanya, sekalipun dengan merangkak.” (HR. Bukhari-Muslim).",
    };

    String[] urlImage = {"https://i1.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/wudhu-chanelmuslim.com-.jpg?resize=768%2C607&ssl=1",
            "https://i0.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Bersiwak-islamkingdom.com-.jpg?resize=768%2C512&ssl=1",
            "https://i2.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Menuju-ke-masjid-penerbitlayar.com-.jpg?resize=768%2C412&ssl=1",
            "https://i2.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Kurma-khasiat.co_.id-.jpg?resize=768%2C498&ssl=1",
            "https://i1.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Sujud-fimadani.com-.jpg?resize=768%2C432&ssl=1",
            "https://i0.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Jamaah-Istiqlal-wikimedia.org-.jpg?resize=768%2C576&ssl=1",
            "https://i0.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/Jamaah-Istiqlal-wikimedia.org-.jpg?resize=768%2C576&ssl=1",
            "https://i2.wp.com/jubah.id/wp-content/uploads/sites/15/2017/02/sholat-subuh-jamaah-rezekipengusaha.blogspot.co_.id-.jpg?resize=768%2C576&ssl=1",
    };
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(listImage[position]);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolDetail = findViewById(R.id.toolDetail);
        listSunnah = findViewById(R.id.lvView);
        CustomListViewAdapter customListViewAdapter = new CustomListViewAdapter();
        listSunnah.setAdapter(customListViewAdapter);

        listSunnah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailSunnahActivity.class);
                intent.putExtra("puTitle", title[i]);
                intent.putExtra("putDesc", desc[i]);
                intent.putExtra("putImage", urlImage[i]);
                startActivity(intent);
            }
        });

        setSupportActionBar(toolDetail);
        carouselView = findViewById(R.id.crView);
        carouselView.setPageCount(listImage.length);
        carouselView.setImageListener(imageListener);

    }

    private class CustomListViewAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return title.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint("ViewHolder")
        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup) {
            convertView = getLayoutInflater().inflate(R.layout.customlistview, null);

            ImageView imageView = convertView.findViewById(R.id.imgSunnah);
            TextView textTitle = convertView.findViewById(R.id.txtTitle);
            TextView textDesc = convertView.findViewById(R.id.txtDesc);

            Picasso.get().load(urlImage[position]).into(imageView);
            textDesc.setText(desc[position]);
            textTitle.setText(title[position]);

            return convertView;
        }
    }
}
