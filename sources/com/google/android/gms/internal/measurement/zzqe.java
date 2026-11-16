package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ol2;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzqe {
    public final Context a;
    public final ol2 b;
    public final ol2 c;
    public final ol2 d;
    public volatile int e = 0;
    public final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
    public final Object g = new Object();
    public volatile ListenableFuture h = null;

    public zzqe(Context context, ol2 ol2Var, ol2 ol2Var2, ol2 ol2Var3) {
        this.a = context;
        this.b = ol2Var;
        this.c = ol2Var2;
        this.d = ol2Var3;
    }
}
