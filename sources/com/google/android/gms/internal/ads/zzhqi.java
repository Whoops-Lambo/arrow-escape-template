package com.google.android.gms.internal.ads;

import defpackage.jc1;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzhqi {
    public static zzidx a(zzhgw zzhgwVar, Integer num) throws GeneralSecurityException {
        String str = zzhgwVar.a;
        if (zzhgwVar == zzhgw.e) {
            if (num == null) {
                return zzhpo.a;
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.d("RAW output prefix type cannot have an id requirement");
            return null;
        }
        if (num == null) {
            throw new GeneralSecurityException(jc1.o("idRequirement must be non-null for ", str, new StringBuilder(str.length() + 40), " type"));
        }
        if (zzhgwVar == zzhgw.c) {
            return zzhpo.b(num.intValue());
        }
        if (zzhgwVar == zzhgw.d || zzhgwVar == zzhgw.f) {
            return zzhpo.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(str));
    }

    public static int b(zzhgv zzhgvVar) throws GeneralSecurityException {
        if (zzhgvVar == zzhgv.b) {
            return 2;
        }
        if (zzhgvVar == zzhgv.c) {
            return 3;
        }
        if (zzhgvVar == zzhgv.d) {
            return 4;
        }
        if (zzhgvVar == zzhgv.e) {
            return 5;
        }
        if (zzhgvVar == zzhgv.f) {
            return 6;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(zzhgvVar.a));
    }

    public static zzhgv c(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return zzhgv.b;
        }
        if (i2 == 1) {
            return zzhgv.c;
        }
        if (i2 == 2) {
            return zzhgv.d;
        }
        if (i2 == 3) {
            return zzhgv.e;
        }
        if (i2 == 4) {
            return zzhgv.f;
        }
        throw new GeneralSecurityException("Unknown KeyMaterialType: ".concat(Integer.toString(i2)));
    }

    public static zzhgw d(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 0) {
            return zzhgw.b;
        }
        if (i2 == 1) {
            return zzhgw.c;
        }
        if (i2 == 2) {
            return zzhgw.d;
        }
        if (i2 == 3) {
            return zzhgw.e;
        }
        if (i2 == 4) {
            return zzhgw.f;
        }
        if (i2 == 5) {
            return zzhgw.g;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(Integer.toString(i2)));
    }

    public static int e(zzhgw zzhgwVar) throws GeneralSecurityException {
        if (zzhgwVar == zzhgw.b) {
            return 2;
        }
        if (zzhgwVar == zzhgw.c) {
            return 3;
        }
        if (zzhgwVar == zzhgw.d) {
            return 4;
        }
        if (zzhgwVar == zzhgw.e) {
            return 5;
        }
        if (zzhgwVar == zzhgw.f) {
            return 6;
        }
        if (zzhgwVar == zzhgw.g) {
            return 7;
        }
        throw new GeneralSecurityException("Unknown OutputPrefixType: ".concat(zzhgwVar.a));
    }
}
