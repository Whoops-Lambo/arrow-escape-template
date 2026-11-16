package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;
import defpackage.do4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqn {
    public static final zzqn c;
    public final String a;
    public final do4 b;

    static {
        new zzqn("");
        c = new zzqn("preload");
    }

    public zzqn(String str) {
        do4 do4Var;
        this.a = str;
        if (Build.VERSION.SDK_INT >= 31) {
            do4Var = new do4();
            do4Var.b = LogSessionId.LOG_SESSION_ID_NONE;
        } else {
            do4Var = null;
        }
        this.b = do4Var;
    }
}
