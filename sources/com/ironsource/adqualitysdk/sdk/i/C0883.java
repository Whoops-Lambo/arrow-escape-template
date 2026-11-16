package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᔄ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0883 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static C0883 f2368;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final ArrayList f2371 = new ArrayList();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ArrayList f2370 = new ArrayList();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final C0920 f2369 = new C0920(this);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m638(k1 k1Var) {
        synchronized (this) {
            try {
                this.f2370.remove(k1Var);
                if (this.f2370.size() == 0) {
                    C1325 c1325M943 = C1325.m943();
                    C0920 c0920 = this.f2369;
                    c1325M943.getClass();
                    AbstractC4631n.m402(new C1353(c1325M943, c0920));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m639(k1 k1Var) {
        synchronized (this) {
            this.f2370.add(k1Var);
        }
        C1325 c1325M943 = C1325.m943();
        C0920 c0920 = this.f2369;
        c1325M943.getClass();
        AbstractC4631n.m402(new C0363(c1325M943, c0920));
        AbstractC4631n.m402(new C0893(this, k1Var));
    }

    static {
        StringFog.decrypt("diO9yiE6RltSPrbAKz9ZV1M8us0r\n", "IUrTrk5NCjI=\n");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0883 m637() {
        try {
            if (f2368 == null) {
                f2368 = new C0883();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2368;
    }
}
