package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.hc3;
import defpackage.kd3;
import defpackage.td3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.a = j;
        this.b = taskCompletionSource2;
    }

    @Override // defpackage.kh3
    public final void b() {
        if (bn.k(this.c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.c;
            td3 td3Var = (td3) bnVar.a.n;
            Bundle bundleB = bn.b(bnVar, this.a, 0);
            bl blVar = new bl(this.c, this.b);
            kd3 kd3Var = (kd3) td3Var;
            kd3Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(kd3Var.b);
            int i = hc3.a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(blVar);
            kd3Var.r(2, parcelObtain);
        } catch (RemoteException e) {
            this.c.b.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.a));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
