package com.google.android.recaptcha.internal;

import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.n8;
import defpackage.pp1;
import defpackage.s71;
import defpackage.wz2;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcb {
    private Object zza;

    @NotNull
    private final Mutex zzb = new pp1();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object zza(Object obj, @NotNull dy dyVar) {
        zzby zzbyVar;
        pp1 pp1Var;
        Mutex mutex;
        if (dyVar instanceof zzby) {
            zzbyVar = (zzby) dyVar;
            int i = zzbyVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbyVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbyVar = new zzby(this, dyVar);
            }
        } else {
            zzbyVar = new zzby(this, dyVar);
        }
        Object obj2 = zzbyVar.zzb;
        int i2 = zzbyVar.zzd;
        if (i2 == 0) {
            wz2.a0(obj2);
            Mutex mutex2 = this.zzb;
            zzbyVar.zze = this;
            zzbyVar.zzf = (zzje) obj;
            zzbyVar.zza = mutex2;
            zzbyVar.zzd = 1;
            pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(zzbyVar);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                mutex = pp1Var;
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = (Mutex) zzbyVar.zza;
            obj = zzbyVar.zzf;
            zzcb zzcbVar = zzbyVar.zze;
            wz2.a0(obj2);
            mutex = mutex3;
            this = zzcbVar;
        }
        try {
            mutex = pp1Var;
            return Boolean.valueOf(s71.b(this.zza, obj));
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object zzb(@NotNull Object[] objArr, @NotNull dy dyVar) {
        zzbz zzbzVar;
        pp1 pp1Var;
        Mutex mutex;
        if (dyVar instanceof zzbz) {
            zzbzVar = (zzbz) dyVar;
            int i = zzbzVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzbzVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzbzVar = new zzbz(this, dyVar);
            }
        } else {
            zzbzVar = new zzbz(this, dyVar);
        }
        Object obj = zzbzVar.zzb;
        int i2 = zzbzVar.zzd;
        if (i2 == 0) {
            wz2.a0(obj);
            Mutex mutex2 = this.zzb;
            zzbzVar.zze = this;
            zzbzVar.zzf = (zzje[]) objArr;
            zzbzVar.zza = mutex2;
            zzbzVar.zzd = 1;
            pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(zzbzVar);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                mutex = pp1Var;
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = (Mutex) zzbzVar.zza;
            objArr = zzbzVar.zzf;
            zzcb zzcbVar = zzbzVar.zze;
            wz2.a0(obj);
            mutex = mutex3;
            this = zzcbVar;
        }
        try {
            mutex = pp1Var;
            return Boolean.valueOf(n8.N(objArr, this.zza));
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object zzc(Object obj, @NotNull dy dyVar) {
        zzca zzcaVar;
        pp1 pp1Var;
        Mutex mutex;
        if (dyVar instanceof zzca) {
            zzcaVar = (zzca) dyVar;
            int i = zzcaVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcaVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzcaVar = new zzca(this, dyVar);
            }
        } else {
            zzcaVar = new zzca(this, dyVar);
        }
        Object obj2 = zzcaVar.zzb;
        int i2 = zzcaVar.zzd;
        if (i2 == 0) {
            wz2.a0(obj2);
            Mutex mutex2 = this.zzb;
            zzcaVar.zze = this;
            zzcaVar.zzf = (zzje) obj;
            zzcaVar.zza = mutex2;
            zzcaVar.zzd = 1;
            pp1Var = (pp1) mutex2;
            Object objE = pp1Var.e(zzcaVar);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                mutex = pp1Var;
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Mutex mutex3 = (Mutex) zzcaVar.zza;
            obj = zzcaVar.zzf;
            zzcb zzcbVar = zzcaVar.zze;
            wz2.a0(obj2);
            mutex = mutex3;
            this = zzcbVar;
        }
        try {
            mutex = pp1Var;
            this.zza = obj;
            return az2.a;
        } finally {
            ((pp1) mutex).g(null);
        }
    }

    public zzcb(Object obj) {
        this.zza = obj;
    }
}
