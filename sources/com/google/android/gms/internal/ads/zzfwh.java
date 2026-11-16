package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzfwh {
    public final zzfwv a;
    public final zzfwv b;
    public final boolean c;
    public final zzfwo d;
    public final zzfwr e;

    public static zzfwh a(zzfwo zzfwoVar, zzfwr zzfwrVar, zzfwv zzfwvVar, zzfwv zzfwvVar2, boolean z) {
        if (zzfwvVar == zzfwv.NONE) {
            defpackage.d.r("Impression owner is none");
            return null;
        }
        zzfwo zzfwoVar2 = zzfwo.DEFINED_BY_JAVASCRIPT;
        zzfwv zzfwvVar3 = zzfwv.NATIVE;
        if (zzfwoVar == zzfwoVar2 && zzfwvVar == zzfwvVar3) {
            defpackage.d.r("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (zzfwrVar != zzfwr.DEFINED_BY_JAVASCRIPT || zzfwvVar != zzfwvVar3) {
            return new zzfwh(zzfwoVar, zzfwrVar, zzfwvVar, zzfwvVar2, z);
        }
        defpackage.d.r("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }

    public zzfwh(zzfwo zzfwoVar, zzfwr zzfwrVar, zzfwv zzfwvVar, zzfwv zzfwvVar2, boolean z) {
        this.d = zzfwoVar;
        this.e = zzfwrVar;
        this.a = zzfwvVar;
        this.b = zzfwvVar2;
        this.c = z;
    }
}
