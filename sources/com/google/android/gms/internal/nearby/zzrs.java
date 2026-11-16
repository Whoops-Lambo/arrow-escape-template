package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.nearby.uwb.UwbClient;
import defpackage.z65;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzrs extends GoogleApi implements UwbClient {
    static {
        new Api("Nearby.UWB_API", new z65(), new Api.ClientKey());
    }
}
