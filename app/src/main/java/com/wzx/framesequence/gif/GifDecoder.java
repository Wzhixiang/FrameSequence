package com.wzx.framesequence.gif;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.rastermill.FrameSequence;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.SimpleResource;

import java.io.IOException;
import java.io.InputStream;

/**
 * 描述：Gif解码器
 *
 * @author wzx
 * @date 2019/4/18
 */
public class GifDecoder implements ResourceDecoder<InputStream, FrameSequence> {

    @Override
    public boolean handles(@NonNull InputStream source, @NonNull Options options) throws IOException {
        return true;
    }

    @Nullable
    @Override
    public Resource<FrameSequence> decode(@NonNull InputStream source, int width, int height, @NonNull Options options) throws IOException {
        try {
            FrameSequence fs = FrameSequence.decodeStream(source);
            return new SimpleResource<>(fs);
        } catch (Exception e) {
            throw new IOException("Cannot load gif from stream", e);
        }
    }
}
