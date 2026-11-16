package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ee3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
class bi extends ee3 {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // defpackage.ee3
    public final void b(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }

    @Override // defpackage.ee3
    public void c(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }

    @Override // defpackage.ee3
    public final void d(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }

    @Override // defpackage.ee3
    public void e(Bundle bundle) throws RemoteException {
        this.b.a.d(this.a);
    }
}
