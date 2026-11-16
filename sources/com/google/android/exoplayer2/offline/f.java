package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.upstream.cache.CacheWriter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements CacheWriter.ProgressListener {
    public final Downloader.ProgressListener a;
    public final long b;
    public final int c;
    public long d;
    public int e;

    public final float a() {
        float f;
        float f2;
        long j = this.b;
        if (j == -1 || j == 0) {
            int i = this.c;
            if (i == 0) {
                return -1.0f;
            }
            f = this.e * 100.0f;
            f2 = i;
        } else {
            f = this.d * 100.0f;
            f2 = j;
        }
        return f / f2;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
    public final void onProgress(long j, long j2, long j3) {
        long j4 = this.d + j3;
        this.d = j4;
        this.a.onProgress(this.b, j4, a());
    }

    public f(Downloader.ProgressListener progressListener, long j, int i, long j2, int i2) {
        this.a = progressListener;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = i2;
    }
}
