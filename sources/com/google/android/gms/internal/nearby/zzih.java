package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import defpackage.zw4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzih extends GoogleApi implements ConnectionsClient {
    public static final /* synthetic */ int a = 0;

    static {
        new Api("Nearby.CONNECTIONS_API", new zw4(), new Api.ClientKey());
    }
}
