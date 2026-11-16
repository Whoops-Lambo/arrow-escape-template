package com.google.android.recaptcha.internal;

import com.ironsource.G5;
import defpackage.d;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzkh {
    private static final zzkh zza;
    private static final zzkh zzb;

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzkf;

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzc(int i);

    public abstract int zzd(int i);

    public CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zzjf.zzd(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            d.p(e);
            return null;
        }
    }

    static {
        Character chValueOf = Character.valueOf(G5.U);
        zza = new zzke("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", chValueOf);
        zzb = new zzke("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", chValueOf);
        new zzkg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", chValueOf);
        new zzkg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", chValueOf);
        zzkd zzkdVar = new zzkd("base16()", "0123456789ABCDEF".toCharArray());
        new zzkg(zzkdVar, null);
        char[] cArr = new char[512];
        zzjf.zza(zzkdVar.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            cArr[i] = zzkdVar.zza(i >>> 4);
            cArr[i | 256] = zzkdVar.zza(i & 15);
        }
    }

    public static zzkh zzg() {
        return zza;
    }

    public static zzkh zzh() {
        return zzb;
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZze = zze(charSequence);
            int iZzc = zzc(charSequenceZze.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZze);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzkf e) {
            d.n(e);
            return null;
        }
    }
}
