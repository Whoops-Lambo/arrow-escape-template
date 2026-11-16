package io.p071bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import io.p071bidmachine.iab.mraid.w;
import io.p071bidmachine.media3.decoder.a;
import io.p071bidmachine.media3.exoplayer.video.g;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface k {
    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void detachOutputSurface();

    void f(int i, a aVar, long j, int i2);

    void flush();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    default boolean k(w wVar) {
        return false;
    }

    void l(int i);

    void m(int i, int i2, int i3, long j);

    void r(g gVar, Handler handler);

    void release();

    void releaseOutputBuffer(int i, long j);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i);
}
