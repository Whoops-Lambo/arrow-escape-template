package com.bytedance.sdk.component.fi.rz;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class uq {
    private ahm ahm;
    private kgy kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class rz {
        private static final uq kgy = new uq();
    }

    public static void kgy(kgy kgyVar) {
        synchronized (uq.class) {
            rz.kgy.kgy = kgyVar;
        }
    }

    private uq() {
        this.kgy = kgy.OFF;
        this.ahm = new com.bytedance.sdk.component.fi.rz.ahm();
    }
}
