package com.google.android.exoplayer2.upstream;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class c implements Runnable {
    public final Loader.ReleaseCallback a;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.onLoaderReleased();
    }

    public c(Loader.ReleaseCallback releaseCallback) {
        this.a = releaseCallback;
    }
}
