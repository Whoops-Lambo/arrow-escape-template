package com.google.android.recaptcha.internal;

import defpackage.d;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzkc extends zzjs implements Serializable {
    private final MessageDigest zza;
    private final int zzb;
    private final boolean zzc;
    private final String zzd;

    public final String toString() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzjw
    public final zzjx zzb() {
        zzkb zzkbVar = null;
        if (this.zzc) {
            try {
                return new zzka((MessageDigest) this.zza.clone(), this.zzb, zzkbVar);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new zzka(zzc(this.zza.getAlgorithm()), this.zzb, zzkbVar);
    }

    public zzkc(String str, String str2) {
        MessageDigest messageDigestZzc = zzc("SHA-256");
        this.zza = messageDigestZzc;
        this.zzb = messageDigestZzc.getDigestLength();
        this.zzd = "Hashing.sha256()";
        this.zzc = zzd(messageDigestZzc);
    }

    private static MessageDigest zzc(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            d.p(e);
            return null;
        }
    }

    private static boolean zzd(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }
}
