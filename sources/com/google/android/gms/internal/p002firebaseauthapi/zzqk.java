package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.pv1;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzqk {
    public static zzaau a(zzcv zzcvVar, Integer num) throws GeneralSecurityException {
        if (zzcvVar == zzcv.e) {
            if (num == null) {
                return zzpj.a;
            }
            e.d("RAW output prefix type cannot have an id requirement");
            return null;
        }
        if (num == null) {
            throw new GeneralSecurityException(pv1.n("idRequirement must be non-null for ", String.valueOf(zzcvVar), " type"));
        }
        if (zzcvVar == zzcv.c) {
            return zzpj.b(num.intValue());
        }
        if (zzcvVar == zzcv.d || zzcvVar == zzcv.f) {
            return zzpj.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }

    public static zzcv b(zzyi zzyiVar) throws GeneralSecurityException {
        switch (s.b[zzyiVar.ordinal()]) {
            case 1:
                return zzcv.b;
            case 2:
                return zzcv.c;
            case 3:
                return zzcv.d;
            case 4:
                return zzcv.e;
            case 5:
                return zzcv.f;
            case 6:
                return zzcv.g;
            case 7:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(zzyiVar)));
            default:
                throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(zzyiVar)));
        }
    }

    public static zzcw c(zzxg.zza zzaVar) throws GeneralSecurityException {
        switch (s.a[zzaVar.ordinal()]) {
            case 1:
                return zzcw.b;
            case 2:
                return zzcw.c;
            case 3:
                return zzcw.d;
            case 4:
                return zzcw.e;
            case 5:
                return zzcw.f;
            case 6:
                throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(zzaVar)));
            default:
                throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(zzaVar)));
        }
    }

    public static zzxg.zza d(zzcw zzcwVar) throws GeneralSecurityException {
        if (zzcwVar == zzcw.b) {
            return zzxg.zza.UNKNOWN_KEYMATERIAL;
        }
        if (zzcwVar == zzcw.c) {
            return zzxg.zza.SYMMETRIC;
        }
        if (zzcwVar == zzcw.d) {
            return zzxg.zza.ASYMMETRIC_PRIVATE;
        }
        if (zzcwVar == zzcw.e) {
            return zzxg.zza.ASYMMETRIC_PUBLIC;
        }
        if (zzcwVar == zzcw.f) {
            return zzxg.zza.REMOTE;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(String.valueOf(zzcwVar)));
    }

    public static zzyi e(zzcv zzcvVar) throws GeneralSecurityException {
        if (zzcvVar.equals(zzcv.b)) {
            return zzyi.UNKNOWN_PREFIX;
        }
        if (zzcvVar == zzcv.c) {
            return zzyi.TINK;
        }
        if (zzcvVar == zzcv.d) {
            return zzyi.LEGACY;
        }
        if (zzcvVar == zzcv.e) {
            return zzyi.RAW;
        }
        if (zzcvVar == zzcv.f) {
            return zzyi.CRUNCHY;
        }
        if (zzcvVar == zzcv.g) {
            return zzyi.WITH_ID_REQUIREMENT;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(String.valueOf(zzcvVar)));
    }
}
