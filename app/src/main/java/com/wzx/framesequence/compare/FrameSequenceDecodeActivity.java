package com.wzx.framesequence.compare;

import android.net.Uri;
import android.support.rastermill.FrameSequenceDrawable;
import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wzx.framesequence.R;
import com.wzx.framesequence.gif.GifSoftwareLayerSetter;
import com.wzx.framesequence.gif.module.GlideApp;

import static android.support.rastermill.FrameSequenceDrawable.LOOP_INF;

/**
 * 描述：
 *
 * @author wzx
 * @date 2019/4/18
 */
public class FrameSequenceDecodeActivity extends BaseActivity {

    @Override
    protected void onResume() {
        super.onResume();

        GlideApp.with(this)
                .as(FrameSequenceDrawable.class)
                .listener(new GifSoftwareLayerSetter(LOOP_INF))
                .load(Uri.parse(url))
                .diskCacheStrategy(DiskCacheStrategy.DATA)
                .into((ImageView) findViewById(R.id.imageView));
    }
}
