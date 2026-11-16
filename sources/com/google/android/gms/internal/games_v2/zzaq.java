package com.google.android.gms.internal.games_v2;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import defpackage.w13;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzaq {
    public final zzaw a;

    public static zzaq a(Application application) {
        return new zzaq(zzay.a(application));
    }

    public final Task b(zzap zzapVar) {
        return this.a.b(new w13(zzapVar, 24));
    }

    public zzaq(zzaw zzawVar) {
        this.a = zzawVar;
    }
}
