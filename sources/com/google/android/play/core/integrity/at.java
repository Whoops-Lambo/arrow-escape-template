package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ib3;
import defpackage.pa3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class at {
    private final ib3 a;
    private final ib3 b;

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, pa3 pa3Var) {
        Object objA = this.a.a();
        objA.getClass();
        k kVar = (k) this.b.a();
        kVar.getClass();
        activity.getClass();
        pa3Var.getClass();
        return new as((Context) objA, kVar, activity, taskCompletionSource, pa3Var);
    }

    public at(ib3 ib3Var, ib3 ib3Var2) {
        this.a = ib3Var;
        this.b = ib3Var2;
    }
}
