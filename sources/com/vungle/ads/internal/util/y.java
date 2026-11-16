package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class y {
    public static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(sr0 sr0Var) {
        sr0Var.getClass();
        if (a()) {
            sr0Var.invoke();
        } else {
            a.post(new defpackage.p(sr0Var, 8));
        }
    }

    public static final void b(sr0 sr0Var) {
        sr0Var.getClass();
        sr0Var.invoke();
    }

    public static boolean a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        return mainLooper.isCurrentThread();
    }
}
