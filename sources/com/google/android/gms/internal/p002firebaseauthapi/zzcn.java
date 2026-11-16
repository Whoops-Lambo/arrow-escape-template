package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.n30;
import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcn {
    public static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static zzco a(String str) throws GeneralSecurityException {
        for (zzco zzcoVar : a) {
            if (zzcoVar.zzb(str)) {
                return zzcoVar;
            }
        }
        throw new GeneralSecurityException(n30.y("No KMS client does support: ", str));
    }
}
