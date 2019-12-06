package com.example.lv2;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


//    private List<Fragment> list;
//    private String[] titles = {"第1个", "第2个", "第3个", "第4个"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        for(int i = 1;i <5; i++){
            tabLayout.addTab(tabLayout.newTab().setText(""+i));
        }


//        final ImageView imageView1 = findViewById(R.id.firstimage);
//        imageView1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText()
//            }
//        });

        ViewPager viewPager = findViewById(R.id.ViewPager_layout);
//        TabLayout tabLayout = findViewById(R.id.tablayout);
//        list = new ArrayList<>();
//        list.add(new ViewPagerFirst());
//        list.add(new ViewPagerSecond());
//        list.add(new ViewPagerThird());
//        list.add(new ViewPagerFourth());

        Adapter adapter = new Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position == 0){
                    Toast.makeText(getApplicationContext(),"第一个viewpager",Toast.LENGTH_SHORT).show();
                }
                if(position == 1){
                    Toast.makeText(getApplicationContext(),"第二个viewpager",Toast.LENGTH_SHORT).show();
                }
                if(position == 2) {
                    Toast.makeText(getApplicationContext(), "第三个viewpager", Toast.LENGTH_SHORT).show();
                }
                if(position == 3){
                    Toast.makeText(getApplicationContext(), "第四个viewpager", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onPageScrollStateChanged(int position) {

            }
        });


    };

}
