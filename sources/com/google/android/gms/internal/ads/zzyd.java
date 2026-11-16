package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import defpackage.dp4;
import defpackage.xb5;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzyd {
    public final zzxt a;
    public final CopyOnWriteArrayList b;

    public zzyd() {
        this(new CopyOnWriteArrayList(), null);
    }

    public final void a(zzdu zzduVar) {
        for (xb5 xb5Var : this.b) {
            zzye zzyeVar = xb5Var.b;
            Handler handler = xb5Var.a;
            dp4 dp4Var = new dp4(12, zzduVar, zzyeVar);
            String str = zzfq.a;
            Looper looper = handler.getLooper();
            if (looper.getThread().isAlive()) {
                if (looper == Looper.myLooper()) {
                    dp4Var.run();
                } else {
                    handler.post(dp4Var);
                }
            }
        }
    }

    public zzyd(CopyOnWriteArrayList copyOnWriteArrayList, zzxt zzxtVar) {
        this.b = copyOnWriteArrayList;
        this.a = zzxtVar;
    }
}
