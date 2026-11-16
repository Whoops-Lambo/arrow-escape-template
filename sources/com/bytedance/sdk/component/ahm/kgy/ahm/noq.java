package com.bytedance.sdk.component.ahm.kgy.ahm;

import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class noq {
    static long ahm;
    static ct kgy;

    public static void kgy(ct ctVar) {
        if (ctVar.noq != null || ctVar.yo != null) {
            e32.a();
            return;
        }
        if (ctVar.uq) {
            return;
        }
        synchronized (noq.class) {
            try {
                long j = ahm;
                if (j + 8192 > 65536) {
                    return;
                }
                ahm = j + 8192;
                ctVar.noq = kgy;
                ctVar.rz = 0;
                ctVar.ahm = 0;
                kgy = ctVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private noq() {
    }

    public static ct kgy() {
        synchronized (noq.class) {
            ct ctVar = kgy;
            if (ctVar != null) {
                kgy = ctVar.noq;
                ctVar.noq = null;
                ahm -= 8192;
                return ctVar;
            }
            return new ct();
        }
    }
}
