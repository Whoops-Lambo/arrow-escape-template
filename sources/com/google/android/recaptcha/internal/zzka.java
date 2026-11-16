package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    public /* synthetic */ zzka(MessageDigest messageDigest, int i, zzkb zzkbVar) {
        this.zza = messageDigest;
        this.zzb = i;
    }

    @Override // com.google.android.recaptcha.internal.zzjr
    public final void zza(byte[] bArr, int i, int i2) {
        zzc();
        this.zza.update(bArr, 0, i2);
    }

    @Override // com.google.android.recaptcha.internal.zzjx
    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i = this.zzb;
        int digestLength = this.zza.getDigestLength();
        MessageDigest messageDigest = this.zza;
        if (i == digestLength) {
            byte[] bArrDigest = messageDigest.digest();
            int i2 = zzjv.zzb;
            return new zzju(bArrDigest);
        }
        byte[] bArrCopyOf = Arrays.copyOf(messageDigest.digest(), i);
        int i3 = zzjv.zzb;
        return new zzju(bArrCopyOf);
    }
}
