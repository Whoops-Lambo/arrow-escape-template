package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.do4;
import defpackage.s35;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzna {
    public static s35 a(zzch zzchVar, zzqh zzqhVar) throws GeneralSecurityException {
        if (zzqu.a(zzchVar)) {
            if (((zzoq) zzchVar.mo302zza()) == null) {
                zzcd zzcdVarZzc = zzchVar.zzc();
                return new s35(new do4(zzcdVarZzc.d, 20, (zzbr) zzqhVar.a(zzcdVarZzc)), zzow.a);
            }
            throw null;
        }
        e.d("keyset doesn't contain a valid primary key");
        return null;
    }
}
