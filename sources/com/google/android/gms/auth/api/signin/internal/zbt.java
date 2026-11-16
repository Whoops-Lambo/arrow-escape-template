package com.google.android.gms.auth.api.signin.internal;

import android.os.Binder;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.util.UidVerifier;
import defpackage.jc1;
import defpackage.vq2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zbt extends zbo {
    public final RevocationBoundService a;

    public final void z1() {
        if (UidVerifier.isGooglePlayServicesUid(this.a, Binder.getCallingUid())) {
            return;
        }
        vq2.y(jc1.k(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
    }

    public zbt(RevocationBoundService revocationBoundService) {
        this.a = revocationBoundService;
    }
}
