package com.google.android.gms.internal.measurement;

import defpackage.wl3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzabq {
    public static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    public static final wl3 b;

    static {
        wl3 wl3Var;
        for (int i = 0; i < 2; i++) {
            wl3Var = null;
            try {
                wl3Var = (wl3) Class.forName(a[i]).asSubclass(wl3.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (wl3Var != null) {
                b = wl3Var;
            }
        }
        wl3Var = new wl3();
        b = wl3Var;
    }
}
