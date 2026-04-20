package com.cntt_2.thanhngoc.thigk2lehothanhngoc;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // ĐỔI THÀNH cau1Fragment: Load luôn Câu 1 khi mở app cho nhanh, khỏi cần tạo FragmentHome
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, new cau1Fragment()).commit();
        }

        BottomNavigationView bottom = findViewById(R.id.bottomNavigationView);
        bottom.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                int itemId = item.getItemId();

                if (itemId == R.id.nav_home) {
                    // ĐỔI THÀNH cau1Fragment: Nếu bấm nút Home thì cho hiện luôn Câu 1
                    selectedFragment = new cau1Fragment();
                } else if (itemId == R.id.nav_cau1) {
                    selectedFragment = new cau1Fragment();
                } else if (itemId == R.id.nav_cau3) {
                    selectedFragment = new cau3Fragment();
                } else if (itemId == R.id.nav_cau4) {
                    selectedFragment = new cau4Fragment();
                }

                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragmentSpace, selectedFragment)
                            .commit();
                }
                return true;
            }
        });
    }
}