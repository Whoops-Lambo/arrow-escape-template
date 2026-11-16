package com.google.android.exoplayer2.ui;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements Runnable {
    public float a;
    public float b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ AspectRatioFrameLayout e;

    @Override // java.lang.Runnable
    public final void run() {
        this.d = false;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.e;
        if (aspectRatioFrameLayout.aspectRatioListener == null) {
            return;
        }
        aspectRatioFrameLayout.aspectRatioListener.onAspectRatioUpdated(this.a, this.b, this.c);
    }

    public a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.e = aspectRatioFrameLayout;
    }
}
