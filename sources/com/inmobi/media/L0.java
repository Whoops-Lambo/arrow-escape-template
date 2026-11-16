package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class L0 implements Wh {
    public final /* synthetic */ N0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C4306pl c;
    public final /* synthetic */ String d;

    public L0(N0 n0, boolean z, C4306pl c4306pl, String str) {
        this.a = n0;
        this.b = z;
        this.c = c4306pl;
        this.d = str;
    }

    @Override // com.inmobi.media.Wh
    public final void onError(Exception exc) {
        this.a.a(exc, this.c);
    }

    @Override // com.inmobi.media.Wh
    public final void a(String str) {
        str.getClass();
        this.a.a("file saved - " + str + " , isReporting - " + this.b);
        this.a.a(str, this.c, this.d, this.b);
    }
}
