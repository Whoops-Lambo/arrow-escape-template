package com.mbridge.msdk.thrid.okio;

import androidx.annotation.Nullable;
import defpackage.e32;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class p {

    @Nullable
    static o a;
    static long b;

    public static void a(o oVar) {
        if (oVar.f != null || oVar.g != null) {
            e32.a();
            return;
        }
        if (oVar.d) {
            return;
        }
        synchronized (p.class) {
            try {
                long j = b + 8192;
                if (j > 65536) {
                    return;
                }
                b = j;
                oVar.f = a;
                oVar.c = 0;
                oVar.b = 0;
                a = oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = a;
                if (oVar != null) {
                    a = oVar.f;
                    oVar.f = null;
                    b -= 8192;
                    return oVar;
                }
                return new o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
