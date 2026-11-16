package com.google.android.gms.fido;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.fido.zzaa;
import com.google.android.gms.internal.fido.zzab;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class Fido {
    public static final /* synthetic */ int a = 0;

    static {
        new Api("Fido.U2F_ZERO_PARTY_API", new zzab(), new Api.ClientKey());
        new zzaa();
    }

    private Fido() {
    }
}
