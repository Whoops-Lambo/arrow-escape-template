package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import defpackage.xw1;
import java.io.Serializable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzghf implements zzggz {
    public final ExecutorService a;
    public final String b;
    public final long c;

    @Override // com.google.android.gms.internal.ads.zzggz
    public final ListenableFuture zza(String str) {
        return CallbackToFutureAdapter.a(new xw1((Object) this, (Object) str, false, (Serializable) null, (Object) new byte[0]));
    }

    @Override // com.google.android.gms.internal.ads.zzggz
    public final ListenableFuture a(String str, byte[] bArr) {
        return CallbackToFutureAdapter.a(new xw1((Object) this, (Object) str, true, (Serializable) CommonGatewayClient.HEADER_PROTOBUF, (Object) bArr));
    }

    public zzghf(ExecutorService executorService, String str, long j) {
        this.a = executorService;
        this.b = str;
        this.c = j;
    }
}
