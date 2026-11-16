package com.ironsource;

import defpackage.tk0;
import defpackage.wr0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Gf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Runnable b(T t, wr0 wr0Var) {
        return new tk0(8, new WeakReference(t), wr0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(WeakReference weakReference, wr0 wr0Var) {
        Object obj = weakReference.get();
        if (obj != null) {
            wr0Var.invoke(obj);
        }
    }
}
