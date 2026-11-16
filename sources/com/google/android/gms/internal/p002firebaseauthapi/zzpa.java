package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzpa {
    public static final zzpa b = new zzpa();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(zzoz zzozVar, Class cls) throws GeneralSecurityException {
        zzoz zzozVar2 = (zzoz) this.a.putIfAbsent(cls, zzozVar);
        if (zzozVar2 == null || zzozVar2.equals(zzozVar)) {
            return;
        }
        e.d("Different key creator for parameters class already inserted");
    }
}
