package io.p071bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface ImageOutput {
    public static final e a = new e();

    void onDisabled();

    void onImageAvailable(long j, Bitmap bitmap);
}
