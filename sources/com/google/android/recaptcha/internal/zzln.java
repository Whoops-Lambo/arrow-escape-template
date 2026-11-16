package com.google.android.recaptcha.internal;

import defpackage.e32;
import defpackage.nj;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zzln extends zzkw {
    private static final Logger zzb = Logger.getLogger(zzln.class.getName());
    private static final boolean zzc = zzps.zzx();
    zzlo zza;

    public abstract int zza();

    public abstract void zzb(byte b) throws IOException;

    public abstract void zzd(int i, boolean z) throws IOException;

    public abstract void zze(int i, zzle zzleVar) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(int i) throws IOException;

    public abstract void zzh(int i, long j) throws IOException;

    public abstract void zzi(long j) throws IOException;

    public abstract void zzj(int i, int i2) throws IOException;

    public abstract void zzk(int i) throws IOException;

    public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zzm(int i, zzoi zzoiVar, zzow zzowVar) throws IOException;

    public abstract void zzn(int i, zzoi zzoiVar) throws IOException;

    public abstract void zzo(int i, zzle zzleVar) throws IOException;

    public abstract void zzp(int i, String str) throws IOException;

    public abstract void zzr(int i, int i2) throws IOException;

    public abstract void zzs(int i, int i2) throws IOException;

    public abstract void zzt(int i) throws IOException;

    public abstract void zzu(int i, long j) throws IOException;

    public abstract void zzv(long j) throws IOException;

    public static int zzA(int i) {
        return nj.e(i, 9, 352) >>> 6;
    }

    public static int zzB(long j) {
        return nj.g(9, 640, j) >>> 6;
    }

    @Deprecated
    public static int zzw(int i, zzoi zzoiVar, zzow zzowVar) {
        int iZzA = zzA(i << 3);
        return ((zzko) zzoiVar).zza(zzowVar) + iZzA + iZzA;
    }

    public static int zzy(zzoi zzoiVar, zzow zzowVar) {
        int iZza = ((zzko) zzoiVar).zza(zzowVar);
        return zzA(iZza) + iZza;
    }

    public final void zzD(String str, zzpu zzpuVar) throws IOException {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzpuVar);
        byte[] bytes = str.getBytes(zznl.zza);
        try {
            int length = bytes.length;
            zzt(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzll(e);
        }
    }

    public /* synthetic */ zzln(zzlm zzlmVar) {
    }

    public static int zzx(zzoi zzoiVar) {
        int iZzo = zzoiVar.zzo();
        return zzA(iZzo) + iZzo;
    }

    public static int zzz(String str) {
        int length;
        try {
            length = zzpv.zzc(str);
        } catch (zzpu unused) {
            length = str.getBytes(zznl.zza).length;
        }
        return zzA(length) + length;
    }

    public final void zzC() {
        if (zza() == 0) {
            return;
        }
        e32.i("Did not write as much data as expected.");
    }

    private zzln() {
        throw null;
    }
}
