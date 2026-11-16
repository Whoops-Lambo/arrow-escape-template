package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.internal.fido.zzj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class Fido2PrivilegedApiClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    static {
        new Api("Fido.FIDO2_PRIVILEGED_API", new zzj(), new Api.ClientKey());
    }
}
