package com.google.android.gms.internal.p002firebaseauthapi;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzct {
    public final String a;
    public final zzakb b;
    public final zzcw c;
    public final zzcv d;
    public final Integer e;

    public static zzct a(String str, zzakb zzakbVar, zzcw zzcwVar, zzcv zzcvVar, Integer num) throws GeneralSecurityException {
        zzcv zzcvVar2 = zzcv.e;
        if (num != null && zzcvVar.equals(zzcvVar2)) {
            e.d("Cannot set idRequirement for OutputPrefixType RAW");
            return null;
        }
        if (num == null && !zzcvVar.equals(zzcvVar2)) {
            e.d("Cannot have null idRequirement unless OutputPrefixType is RAW");
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("typeURL " + str + " contains non-ascii character at position " + i);
            }
        }
        return new zzct(str, zzakbVar, zzcwVar, zzcvVar, num);
    }

    public zzct(String str, zzakb zzakbVar, zzcw zzcwVar, zzcv zzcvVar, Integer num) {
        this.a = str;
        this.b = zzakbVar;
        this.c = zzcwVar;
        this.d = zzcvVar;
        this.e = num;
    }
}
