package com.bytedance.sdk.component.ra.kgy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    private static volatile kgy ahm;
    private volatile ahm kgy;

    public static kgy kgy() {
        if (ahm == null) {
            synchronized (kgy.class) {
                try {
                    if (ahm == null) {
                        ahm = new kgy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return ahm;
    }

    public ahm ahm() {
        return this.kgy;
    }

    private kgy() {
    }

    public void kgy(ahm ahmVar) {
        this.kgy = ahmVar;
    }
}
