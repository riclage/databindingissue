package com.riclage.libraryb;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.riclage.librarya.databinding.ActivityFromModuleABinding;

public class LibraryBActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFromModuleABinding binding = DataBindingUtil.setContentView(this, R.layout.activity_from_module_a);
        binding.rootContainer.setOnClickListener(v -> {

        });
    }
}
