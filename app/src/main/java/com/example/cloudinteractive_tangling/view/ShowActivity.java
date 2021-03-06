package com.example.cloudinteractive_tangling.view;

import android.os.Bundle;
import android.view.KeyEvent;

import com.example.cloudinteractive_tangling.R;
import com.example.cloudinteractive_tangling.viewmodel.ShowViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class ShowActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.example.cloudinteractive_tangling.databinding.ShowActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.show_activity);

        ShowViewModel viewModel = new ShowViewModel();

        viewModel.getData(binding, this);

        viewModel.setBtn(binding, this);

        binding.setModel(viewModel);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {

            finish();

        }

        return super.onKeyDown(keyCode, event);
    }

}