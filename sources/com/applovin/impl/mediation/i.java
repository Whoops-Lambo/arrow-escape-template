package com.applovin.impl.mediation;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ com.applovin.impl.mediation.ads.a.InterfaceC0165a d;

    public /* synthetic */ i(com.applovin.impl.mediation.ads.a.InterfaceC0165a interfaceC0165a, int i, String str, int i2) {
        this.a = i2;
        this.d = interfaceC0165a;
        this.b = i;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        int i2 = this.b;
        com.applovin.impl.mediation.ads.a.InterfaceC0165a interfaceC0165a = this.d;
        switch (i) {
            case 0:
                ((d.b) interfaceC0165a).a(i2, str);
                break;
            default:
                ((e.b) interfaceC0165a).a(i2, str);
                break;
        }
    }
}
