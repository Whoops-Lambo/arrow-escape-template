package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzhv implements RemoteCall {
    static {
        new zzhv();
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) {
        int i = zzih.a;
        ((zzgy) obj).a();
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }

    private /* synthetic */ zzhv() {
    }
}
