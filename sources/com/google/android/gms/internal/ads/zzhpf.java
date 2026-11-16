package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzhpf {
    public static final zzhpf b = new zzhpf();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final void a(zzhpe zzhpeVar, Class cls) throws GeneralSecurityException {
        zzhpe zzhpeVar2 = (zzhpe) this.a.putIfAbsent(cls, zzhpeVar);
        if (zzhpeVar2 == null || zzhpeVar2.equals(zzhpeVar)) {
            return;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.d("Different key creator for parameters class already inserted");
    }
}
