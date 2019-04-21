package com.wzx.framesequence.gif;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;

import android.support.rastermill.FrameSequence;
import android.support.rastermill.FrameSequenceDrawable;

/**
 * 描述：Gif转换器
 *
 * @author wzx
 * @date 2019/4/18
 */
public class GifDrawableTranscoder implements ResourceTranscoder<FrameSequence, FrameSequenceDrawable> {

    @Nullable
    @Override
    public Resource<FrameSequenceDrawable> transcode(@NonNull Resource<FrameSequence> toTranscode, @NonNull Options options) {
        FrameSequenceDrawable drawable = new FrameSequenceDrawable(toTranscode.get());
        return new SimpleResource<>(drawable);
    }
}
