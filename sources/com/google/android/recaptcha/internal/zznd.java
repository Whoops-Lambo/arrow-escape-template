package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzmx;
import com.google.android.recaptcha.internal.zznd;
import defpackage.dr0;
import defpackage.dz4;
import defpackage.e32;
import defpackage.pv1;
import defpackage.vq2;
import io.p071bidmachine.media3.extractor.ts.y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zznd<MessageType extends zznd<MessageType, BuilderType>, BuilderType extends zzmx<MessageType, BuilderType>> extends zzko<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzpm zzc = zzpm.zzc();

    public static Object zzE(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            vq2.n("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vq2.n("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean zzK(zznd zzndVar, boolean z) {
        byte bByteValue = ((Byte) zzndVar.zzh(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzl = zzos.zza().zzb(zzndVar.getClass()).zzl(zzndVar);
        if (z) {
            zzndVar.zzh(2, true != zZzl ? null : zzndVar, null);
        }
        return zZzl;
    }

    public static zznc zzs(zzoi zzoiVar, Object obj, zzoi zzoiVar2, zzng zzngVar, int i, zzpw zzpwVar, Class cls) {
        return new zznc(zzoiVar, "", null, new zznb(null, i, zzpwVar, false, false), cls);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final zzoq zzD() {
        return (zzoq) zzh(7, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final /* synthetic */ zzoh zzad() {
        return (zzmx) zzh(5, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final /* synthetic */ zzoh zzae() {
        zzmx zzmxVar = (zzmx) zzh(5, null, null);
        zzmxVar.zzh(this);
        return zzmxVar;
    }

    public abstract Object zzh(int i, Object obj, Object obj2);

    @Override // com.google.android.recaptcha.internal.zzoj
    public final /* synthetic */ zzoi zzm() {
        return (zznd) zzh(6, null, null);
    }

    @Override // com.google.android.recaptcha.internal.zzoj
    public final boolean zzp() {
        return zzK(this, true);
    }

    public final zzmx zzq() {
        return (zzmx) zzh(5, null, null);
    }

    public final zzmx zzr() {
        zzmx zzmxVar = (zzmx) zzh(5, null, null);
        zzmxVar.zzh(this);
        return zzmxVar;
    }

    public final zznd zzv() {
        return (zznd) zzh(4, null, null);
    }

    public static Object zzF(zzoi zzoiVar, String str, Object[] objArr) {
        return new zzou(zzoiVar, str, objArr);
    }

    private static zznd zzg(zznd zzndVar) throws zznn {
        if (zzndVar == null || zzK(zzndVar, true)) {
            return zzndVar;
        }
        throw new zzpk(zzndVar).zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zznd zzi(zznd zzndVar, byte[] bArr, int i, int i2, zzmo zzmoVar) throws zznn {
        if (i2 == 0) {
            return zzndVar;
        }
        zznd zzndVarZzv = zzndVar.zzv();
        try {
            zzow zzowVarZzb = zzos.zza().zzb(zzndVarZzv.getClass());
            zzowVarZzb.zzi(zzndVarZzv, bArr, 0, i2, new zzkt(zzmoVar));
            zzowVarZzb.zzf(zzndVarZzv);
            return zzndVarZzv;
        } catch (zznn e) {
            if (e.zzb()) {
                throw new zznn(e);
            }
            throw e;
        } catch (zzpk e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zznn) {
                throw ((zznn) e3.getCause());
            }
            throw new zznn(e3);
        } catch (IndexOutOfBoundsException unused) {
            dz4.d("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    public static zznd zzu(Class cls) {
        Map map = zzb;
        zznd zzndVar = (zznd) map.get(cls);
        if (zzndVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzndVar = (zznd) map.get(cls);
            } catch (ClassNotFoundException e) {
                dr0.l("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzndVar != null) {
            return zzndVar;
        }
        zznd zzndVar2 = (zznd) ((zznd) zzps.zze(cls)).zzh(6, null, null);
        if (zzndVar2 != null) {
            map.put(cls, zzndVar2);
            return zzndVar2;
        }
        y.b();
        return null;
    }

    public static zznd zzw(zznd zzndVar, InputStream inputStream) throws zznn {
        zzli zzlgVar;
        if (inputStream == null) {
            byte[] bArr = zznl.zzb;
            int length = bArr.length;
            zzlgVar = zzli.zzH(bArr, 0, 0, false);
        } else {
            zzlgVar = new zzlg(inputStream, 4096, null);
        }
        int i = zzmo.zzb;
        int i2 = zzos.zza;
        zzmo zzmoVar = zzmo.zza;
        zznd zzndVarZzv = zzndVar.zzv();
        try {
            zzow zzowVarZzb = zzos.zza().zzb(zzndVarZzv.getClass());
            zzowVarZzb.zzh(zzndVarZzv, zzlj.zzq(zzlgVar), zzmoVar);
            zzowVarZzb.zzf(zzndVarZzv);
            zzg(zzndVarZzv);
            return zzndVarZzv;
        } catch (zznn e) {
            if (e.zzb()) {
                throw new zznn(e);
            }
            throw e;
        } catch (zzpk e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zznn) {
                throw ((zznn) e3.getCause());
            }
            throw new zznn(e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zznn) {
                throw ((zznn) e4.getCause());
            }
            throw e4;
        }
    }

    public static zznd zzx(zznd zzndVar, byte[] bArr) throws zznn {
        int i = zzmo.zzb;
        int i2 = zzos.zza;
        zznd zzndVarZzi = zzi(zzndVar, bArr, 0, bArr.length, zzmo.zza);
        zzg(zzndVarZzi);
        return zzndVarZzi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzos.zza().zzb(getClass()).zzk(this, (zznd) obj);
    }

    public final void zzH() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzJ(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzL() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public static zznj zzA() {
        return zznx.zzf();
    }

    public static zznk zzB() {
        return zzot.zze();
    }

    public static zznk zzC(zznk zznkVar) {
        int size = zznkVar.size();
        return zznkVar.zzd(size + size);
    }

    public static void zzI(Class cls, zznd zzndVar) {
        zzndVar.zzH();
        zzb.put(cls, zzndVar);
    }

    private final int zzf(zzow zzowVar) {
        return zzos.zza().zzb(getClass()).zza(this);
    }

    public static zzni zzy() {
        return zzne.zzf();
    }

    public static zzni zzz(zzni zzniVar) {
        int size = zzniVar.size();
        return zzniVar.zzd(size + size);
    }

    public final int hashCode() {
        if (!zzL()) {
            int i = this.zza;
            if (i == 0) {
                int iZzn = zzn();
                this.zza = iZzn;
                return iZzn;
            }
            return i;
        }
        return zzn();
    }

    public final String toString() {
        return zzok.zza(this, super.toString());
    }

    public final void zzG() {
        zzos.zza().zzb(getClass()).zzf(this);
        zzH();
    }

    @Override // com.google.android.recaptcha.internal.zzko
    public final int zza(zzow zzowVar) {
        if (zzL()) {
            int iZza = zzowVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            e32.i(pv1.k(iZza, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int iZza2 = zzowVar.zza(this);
            if (iZza2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
                return iZza2;
            }
            e32.i(pv1.k(iZza2, "serialized size must be non-negative, was "));
            return 0;
        }
        return i;
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final void zze(zzln zzlnVar) throws IOException {
        zzos.zza().zzb(getClass()).zzj(this, zzlo.zza(zzlnVar));
    }

    public final int zzn() {
        return zzos.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.recaptcha.internal.zzoi
    public final int zzo() {
        if (zzL()) {
            int iZzf = zzf(null);
            if (iZzf >= 0) {
                return iZzf;
            }
            e32.i(pv1.k(iZzf, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzf2 = zzf(null);
        if (iZzf2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf2;
            return iZzf2;
        }
        e32.i(pv1.k(iZzf2, "serialized size must be non-negative, was "));
        return 0;
    }
}
