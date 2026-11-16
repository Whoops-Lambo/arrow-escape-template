package com.google.android.gms.common.internal.service;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class Common {

    @NonNull
    @KeepForSdk
    public static final Api<Api.ApiOptions.NoOptions> API;

    @NonNull
    @KeepForSdk
    public static final Api.ClientKey<zaj> CLIENT_KEY;
    public static final zag zaa;
    private static final Api.AbstractClientBuilder zab;

    static {
        Api.ClientKey<zaj> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zad zadVar = new zad();
        zab = zadVar;
        API = new Api<>("Common.API", zadVar, clientKey);
        zaa = new zag();
    }
}
