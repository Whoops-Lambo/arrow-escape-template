package com.adsurge.adn.oversea_ad;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class Tangor {
    public volatile Object a;

    public abstract Object a();

    public final Object b() {
        Object objA;
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.a;
                if (objA == null) {
                    objA = a();
                    this.a = objA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
