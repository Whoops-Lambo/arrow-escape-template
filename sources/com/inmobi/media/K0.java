package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class K0 implements Wh {
    public final /* synthetic */ N0 a;
    public final /* synthetic */ boolean b;

    public K0(N0 n0, boolean z) {
        this.a = n0;
        this.b = z;
    }

    @Override // com.inmobi.media.Wh
    public final void a(Object obj) {
        ((Boolean) obj).getClass();
        this.a.a("result pushed to queue");
        if (this.b) {
            N0 n0 = this.a;
            n0.a("session end - cleanup");
            n0.g = null;
            n0.f.clear();
            n0.c.set(false);
            n0.d.set(false);
        }
    }

    @Override // com.inmobi.media.Wh
    public final void onError(Exception exc) {
        this.a.a("error in pushing to queue", exc);
    }
}
