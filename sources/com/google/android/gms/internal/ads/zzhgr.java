package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzhgr {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zzhgq a(String str) throws GeneralSecurityException {
        for (zzhgq zzhgqVar : a) {
            if (zzhgqVar.zza()) {
                return zzhgqVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
