package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class H2 implements Nk, InterfaceC4033g {
    public final AbstractC4425u1 a;
    public final InterfaceC3932c9 b;
    public final Ad c;

    @Override // com.inmobi.media.Nk
    public final void c() {
    }

    @Override // com.inmobi.media.InterfaceC4033g
    public final void j() {
        this.c.a(new S5(this.b), this);
    }

    public H2(AbstractC4425u1 abstractC4425u1, InterfaceC3932c9 interfaceC3932c9, Ad ad) {
        interfaceC3932c9.getClass();
        ad.getClass();
        this.a = abstractC4425u1;
        this.b = interfaceC3932c9;
        this.c = ad;
    }
}
