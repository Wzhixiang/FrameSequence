package com.wzx.framesequence.gif.module;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;
import com.wzx.framesequence.gif.GifDecoder;
import com.wzx.framesequence.gif.GifDrawableTranscoder;

import java.io.InputStream;

/**
 * 描述：使用@GlideModule修饰，rebuild项目后，会生成一个GlideApp，用来代替Glide加载需要特定解码的图片
 *
 * @author wzx
 * @date 2019/4/18
 */

@GlideModule
public class GifModule extends AppGlideModule {

    @Override
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        super.registerComponents(context, glide, registry);
        registry.register(FrameSequence.class, FrameSequenceDrawable.class, new GifDrawableTranscoder()).append(InputStream.class, FrameSequence.class, new GifDecoder());
    }

    @Override
    public boolean isManifestParsingEnabled() {
        return false;
    }
}
