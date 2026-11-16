package com.google.android.recaptcha.internal;

import com.inmobi.media.core.config.models.AdConfig;
import defpackage.e32;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
final class zzju extends zzjv implements Serializable {
    final byte[] zza;

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zza() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        if (length < 4) {
            e32.i(zzji.zza("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
            return 0;
        }
        int i = bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i2 = bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i3 = bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        return ((bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final int zzb() {
        return this.zza.length * 8;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zzd() {
        return (byte[]) this.zza.clone();
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final byte[] zze() {
        return this.zza;
    }

    public zzju(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjv
    public final boolean zzc(zzjv zzjvVar) {
        boolean z;
        if (this.zza.length != zzjvVar.zze().length) {
            return false;
        }
        boolean z2 = true;
        int i = 0;
        while (true) {
            byte[] bArr = this.zza;
            if (i < bArr.length) {
                if (bArr[i] == zzjvVar.zze()[i]) {
                    z = true;
                } else {
                    z = false;
                }
                z2 &= z;
                i++;
            } else {
                return z2;
            }
        }
    }
}
