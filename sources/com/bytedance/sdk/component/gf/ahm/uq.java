package com.bytedance.sdk.component.gf.ahm;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class uq {
    public static kgy ahm;
    public static noq kgy;
    public static Handler rz;

    public static Handler ahm() {
        return rz;
    }

    public static void kgy(kgy kgyVar) {
        ahm = kgyVar;
    }

    public static kgy kgy() {
        return ahm;
    }

    public static void kgy(Handler handler) {
        rz = handler;
    }
}
