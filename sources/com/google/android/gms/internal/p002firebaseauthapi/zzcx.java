package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcx {
    public final zzakb a;
    public final String b;
    public final zzcv c;

    public static zzcx a(zzakb zzakbVar, zzcv zzcvVar, String str) throws GeneralSecurityException {
        Charset charset = zzqu.a;
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i] = (byte) cCharAt;
        }
        zzaau.a(bArr);
        return new zzcx(zzakbVar, zzcvVar, str);
    }

    public zzcx(zzakb zzakbVar, zzcv zzcvVar, String str) {
        this.a = zzakbVar;
        this.b = str;
        this.c = zzcvVar;
    }
}
