package com.inmobi.media;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class M0 implements Wh {
    public final /* synthetic */ N0 a;
    public final /* synthetic */ Q2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ C4276oj d;

    public M0(N0 n0, Q2 q2, boolean z, C4276oj c4276oj) {
        this.a = n0;
        this.b = q2;
        this.c = z;
        this.d = c4276oj;
    }

    @Override // com.inmobi.media.Wh
    public final void a(Object obj) {
        this.a.a((Bitmap) obj, this.b, this.c, this.d);
    }

    @Override // com.inmobi.media.Wh
    public final void onError(Exception exc) {
        this.a.a(exc, this.b);
    }
}
