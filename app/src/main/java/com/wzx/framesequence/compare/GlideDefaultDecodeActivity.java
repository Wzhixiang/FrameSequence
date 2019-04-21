package com.wzx.framesequence.compare;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.wzx.framesequence.R;

/**
 * 描述：
 *
 * @author wzx
 * @date 2019/4/18
 */
public class GlideDefaultDecodeActivity extends BaseActivity {

    @Override
    protected void onResume() {
        super.onResume();

        Glide.with(this)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.DATA)
                .into((ImageView) findViewById(R.id.imageView));
    }
}
