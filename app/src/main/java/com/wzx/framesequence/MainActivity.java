package com.wzx.framesequence;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wzx.framesequence.compare.FrameSequenceDecodeActivity;
import com.wzx.framesequence.compare.GlideDefaultDecodeActivity;
import com.wzx.framesequence.samples.FrameSequenceTest;

/**
 * 5.1不明显
 * 8.0cpu明显降低
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onViewsClick(View view) {
        if (view.getId() == R.id.btn_samples) {
            startActivity(new Intent(this, FrameSequenceTest.class));
        } else if (view.getId() == R.id.btn_glide) {
            startActivity(new Intent(this, GlideDefaultDecodeActivity.class));
        } else {
            startActivity(new Intent(this, FrameSequenceDecodeActivity.class));
        }
    }
}
