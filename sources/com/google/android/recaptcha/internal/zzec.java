package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fv;
import defpackage.gv;
import defpackage.s71;
import defpackage.tb5;
import defpackage.wr0;
import defpackage.wz2;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzec implements zzcn {

    @NotNull
    private final zzdt zza;

    @NotNull
    private final zzek zzb;

    @Nullable
    private zzbd zzd;
    private zzsc zze;

    @NotNull
    private final zzbi zzg;

    @NotNull
    private fv zzc = new gv();

    @NotNull
    private zzcm zzf = zzcm.zza;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(wr0 wr0Var, dy dyVar) {
        zzdv zzdvVar;
        zzbn zzbnVar;
        if (dyVar instanceof zzdv) {
            zzdvVar = (zzdv) dyVar;
            int i = zzdvVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdvVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdvVar = new zzdv(this, dyVar);
            }
        } else {
            zzdvVar = new zzdv(this, dyVar);
        }
        Object obj = zzdvVar.zza;
        int i2 = zzdvVar.zzc;
        if (i2 == 0) {
            wz2.a0(obj);
            zzbn zzbnVar2 = new zzbn();
            zzdvVar.zzd = zzbnVar2;
            zzdvVar.zzc = 1;
            Object objInvoke = wr0Var.invoke(zzdvVar);
            Object obj2 = dz.a;
            if (objInvoke == obj2) {
                return obj2;
            }
            zzbnVar = zzbnVar2;
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzbnVar = zzdvVar.zzd;
            wz2.a0(obj);
        }
        zzbnVar.zzc();
        return new Long(zzbnVar.zza(TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:25:0x0062, B:30:0x0075, B:31:0x007e), top: B:52:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzm(long j, dy dyVar) throws zzbd {
        zzdw zzdwVar;
        zzec zzecVar;
        Exception e;
        long j2;
        zzbd zzbdVar;
        zzbd zzbdVar2;
        long jLongValue;
        if (dyVar instanceof zzdw) {
            zzdwVar = (zzdw) dyVar;
            int i = zzdwVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdwVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdwVar = new zzdw(this, dyVar);
            }
        } else {
            zzdwVar = new zzdw(this, dyVar);
        }
        Object objZzl = zzdwVar.zzb;
        int i2 = zzdwVar.zzd;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(objZzl);
                zzdwVar.zze = this;
                zzdwVar.zza = j;
                zzdwVar.zzd = 1;
                if (zzn(j, zzdwVar) != dzVar) {
                }
                return dzVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = zzdwVar.zza;
                zzecVar = zzdwVar.zze;
                try {
                    wz2.a0(objZzl);
                    jLongValue = j2 - ((Number) objZzl).longValue();
                    if (jLongValue >= 500) {
                        return new Long(jLongValue);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzar, null);
                } catch (Exception e2) {
                    e = e2;
                    zzbdVar = e instanceof zzbd ? (zzbd) e : null;
                    if (zzbdVar == null) {
                        zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
                    }
                    if (s71.b(zzecVar.zzf, zzcm.zzd)) {
                    }
                    throw zzbdVar2;
                }
            }
            j = zzdwVar.zza;
            this = zzdwVar.zze;
            wz2.a0(objZzl);
            zzdy zzdyVar = new zzdy(j, this, null);
            zzdwVar.zze = this;
            zzdwVar.zza = j;
            zzdwVar.zzd = 2;
            objZzl = this.zzl(zzdyVar, zzdwVar);
            if (objZzl != dzVar) {
                zzecVar = this;
                j2 = j;
                jLongValue = j2 - ((Number) objZzl).longValue();
                if (jLongValue >= 500) {
                    return new Long(jLongValue);
                }
                throw new zzbd(zzbb.zzc, zzba.zzar, null);
            }
            return dzVar;
        } catch (Exception e3) {
            zzecVar = this;
            e = e3;
            if (e instanceof zzbd) {
            }
            if (zzbdVar == null) {
                zzbdVar = new zzbd(zzbb.zzc, zzba.zzar, e.getMessage());
            }
            if ((!s71.b(zzecVar.zzf, zzcm.zzd) || s71.b(zzecVar.zzf, zzcm.zzc)) && (zzbdVar2 = zzecVar.zzd) != null) {
                throw zzbdVar2;
            }
            throw zzbdVar;
        }
    }

    private final Object zzn(long j, dy dyVar) {
        boolean zB = s71.b(this.zzf, zzcm.zzb);
        az2 az2Var = az2.a;
        if (!zB && !s71.b(this.zzf, zzcm.zzc) && (!s71.b(this.zzf, zzcm.zzd) || zzo(this.zzd))) {
            this.zzf = zzcm.zzc;
            gv gvVar = new gv();
            this.zzc = gvVar;
            tb5.t(this.zzg.zza(), null, null, new zzeb(this, gvVar, j, null), 3);
        }
        return az2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        return (s71.b(zzbdVar.zzb(), zzbb.zzd) || s71.b(zzbdVar.zzb(), zzbb.zze) || s71.b(zzbdVar.zzb(), zzbb.zzf)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.google.android.recaptcha.internal.zzcn
    @Nullable
    public final Object zza(@NotNull String str, @NotNull RecaptchaAction recaptchaAction, long j, @NotNull dy dyVar) throws zzbd {
        zzdu zzduVar;
        String str2;
        RecaptchaAction recaptchaAction2;
        Object objZzm;
        zzec zzecVar;
        RecaptchaAction recaptchaAction3;
        String str3;
        double d;
        zzsc zzscVar;
        String str4;
        zzec zzecVar2;
        zzec zzecVar3 = this;
        if (dyVar instanceof zzdu) {
            zzduVar = (zzdu) dyVar;
            int i = zzduVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzduVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzduVar = new zzdu(zzecVar3, dyVar);
            }
        } else {
            zzduVar = new zzdu(zzecVar3, dyVar);
        }
        Object objZzm2 = zzduVar.zzb;
        int i2 = zzduVar.zzd;
        dz dzVar = dz.a;
        try {
            if (i2 == 0) {
                wz2.a0(objZzm2);
                zzduVar.zze = zzecVar3;
                str2 = str;
                zzduVar.zzf = str2;
                recaptchaAction2 = recaptchaAction;
                zzduVar.zzg = recaptchaAction2;
                zzduVar.zzd = 1;
                objZzm = zzecVar3.zzm(j, zzduVar);
                if (objZzm == dzVar) {
                }
                return dzVar;
            }
            if (i2 == 1) {
                RecaptchaAction recaptchaAction4 = zzduVar.zzg;
                String str5 = zzduVar.zzf;
                zzec zzecVar4 = zzduVar.zze;
                wz2.a0(objZzm2);
                recaptchaAction2 = recaptchaAction4;
                zzecVar3 = zzecVar4;
                objZzm = objZzm2;
                str2 = str5;
            } else {
                if (i2 == 2) {
                    d = zzduVar.zza;
                    recaptchaAction3 = zzduVar.zzg;
                    str3 = zzduVar.zzf;
                    zzecVar = zzduVar.zze;
                    wz2.a0(objZzm2);
                    zzsi zzsiVar = (zzsi) objZzm2;
                    zzdt zzdtVar = zzecVar.zza;
                    zzscVar = zzecVar.zze;
                    if (zzscVar == null) {
                        zzscVar = null;
                    }
                    zzsp zzspVarZzi = zzdtVar.zzi(recaptchaAction3, zzsiVar, zzscVar);
                    zzduVar.zze = zzecVar;
                    zzduVar.zzf = str3;
                    zzduVar.zzg = null;
                    zzduVar.zzd = 3;
                    String str6 = str3;
                    objZzm2 = zzecVar.zza.zzm(zzspVarZzi, str6, (long) d, zzduVar);
                    str4 = str6;
                    if (objZzm2 != dzVar) {
                        zzecVar2 = zzecVar;
                    }
                    return dzVar;
                }
                if (i2 != 3) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str4 = zzduVar.zzf;
                zzecVar2 = zzduVar.zze;
                wz2.a0(objZzm2);
            }
            zzsr zzsrVar = (zzsr) objZzm2;
            zzecVar2.zza.zzq(str4, zzsrVar);
            return zzsrVar.zzj();
            double dLongValue = ((Number) objZzm).longValue();
            zzdt zzdtVar2 = zzecVar3.zza;
            double d2 = 0.45d * dLongValue;
            zzduVar.zze = zzecVar3;
            zzduVar.zzf = str2;
            zzduVar.zzg = recaptchaAction2;
            double d3 = dLongValue * 0.55d;
            zzduVar.zza = d3;
            zzduVar.zzd = 2;
            Object objZzl = zzdtVar2.zzl(str2, (long) d2, zzduVar);
            if (objZzl != dzVar) {
                zzecVar = zzecVar3;
                recaptchaAction3 = recaptchaAction2;
                str3 = str2;
                objZzm2 = objZzl;
                d = d3;
                zzsi zzsiVar2 = (zzsi) objZzm2;
                zzdt zzdtVar3 = zzecVar.zza;
                zzscVar = zzecVar.zze;
                if (zzscVar == null) {
                    zzscVar = null;
                }
                zzsp zzspVarZzi2 = zzdtVar3.zzi(recaptchaAction3, zzsiVar2, zzscVar);
                zzduVar.zze = zzecVar;
                zzduVar.zzf = str3;
                zzduVar.zzg = null;
                zzduVar.zzd = 3;
                String str7 = str3;
                objZzm2 = zzecVar.zza.zzm(zzspVarZzi2, str7, (long) d, zzduVar);
                str4 = str7;
                if (objZzm2 != dzVar) {
                    zzecVar2 = zzecVar;
                    zzsr zzsrVar2 = (zzsr) objZzm2;
                    zzecVar2.zza.zzq(str4, zzsrVar2);
                    return zzsrVar2.zzj();
                }
            }
            return dzVar;
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzb, zzba.zzay, e2.getMessage());
        }
    }

    public zzec(@NotNull zzdt zzdtVar, @NotNull zzbi zzbiVar, @NotNull zzek zzekVar, @NotNull zzbo zzboVar) {
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    @Nullable
    public final Object zzb(long j, @NotNull dy dyVar) {
        Object objZzn = zzn(j, dyVar);
        if (objZzn == dz.a) {
            return objZzn;
        }
        return az2.a;
    }
}
