package com.moloco.sdk.internal.services.bidtoken.providers;

import android.content.Context;
import android.util.Base64;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.kk2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class x implements j {
    public static final String e;
    public final Context a;
    public final String b;
    public final String c;
    public w d;

    public final w d() {
        try {
            return new w(this.a.getSharedPreferences(this.b, 0).getString(this.c, null));
        } catch (Exception e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "TCSignalProvider", "[CBT] TCS Error", e2, false, 8, null);
            return new w(null);
        }
    }

    static {
        byte[] bArrDecode = Base64.decode(new byte[]{98, 87, 57, 115, 98, 50, 78, 118, 88, 50, 82, 108, 98, 87, 57, 102, 100, 71, 86, 122, 100, 71, 108, 117, 90, 119, 61, 61, 10}, 0);
        bArrDecode.getClass();
        e = kk2.B(bArrDecode);
    }

    public x(Context context) {
        String str = e;
        str.getClass();
        this.a = context;
        this.b = str;
        this.c = "test_config";
        this.d = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final String c() {
        return "TCSignalProvider";
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final void a() {
        this.d = d();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public final boolean b() {
        w wVarD = d();
        boolean z = !wVarD.equals(this.d);
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "TCSignalProvider", "[CBT] TCS needsRefresh: " + z + ", current: " + wVarD.a + ", cached: " + this.d.a, false, 4, null);
        return z;
    }
}
