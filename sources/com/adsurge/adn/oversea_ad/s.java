package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class s extends Thread {
    public final /* synthetic */ x a;

    public s(x xVar) {
        this.a = xVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            x.a(this.a);
        } catch (Throwable unused) {
        }
    }
}
