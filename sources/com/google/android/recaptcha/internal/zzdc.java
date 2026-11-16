package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.k52;
import defpackage.tb5;
import defpackage.w32;
import defpackage.wz2;
import defpackage.zr0;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {

    @NotNull
    private static final w32 zza = new w32("^[a-zA-Z0-9/_]{0,100}$");

    @NotNull
    private final zzcn zzb;

    @NotNull
    private final String zzc;

    @NotNull
    private final zzek zzd;

    @NotNull
    private final zzbi zze;

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.c(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzf(RecaptchaAction recaptchaAction, long j, dy dyVar) {
        zzcy zzcyVar;
        if (dyVar instanceof zzcy) {
            zzcyVar = (zzcy) dyVar;
            int i = zzcyVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, dyVar);
            }
        } else {
            zzcyVar = new zzcy(this, dyVar);
        }
        Object objZzg = zzcyVar.zza;
        int i2 = zzcyVar.zzc;
        try {
            if (i2 == 0) {
                wz2.a0(objZzg);
                String string = UUID.randomUUID().toString();
                zr0 zzczVar = new zzcz(this, j, recaptchaAction, string, null);
                zzcyVar.zzc = 1;
                objZzg = zzg(string, zzczVar, zzcyVar);
                Object obj = dz.a;
                if (objZzg == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(objZzg);
            }
            return ((k52) objZzg).a;
        } catch (zzbd e) {
            return wz2.J(e.zzc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzg(String str, zr0 zr0Var, dy dyVar) throws zzbd {
        zzdb zzdbVar;
        Exception e;
        zzen zzenVar;
        zzbd e2;
        if (dyVar instanceof zzdb) {
            zzdbVar = (zzdb) dyVar;
            int i = zzdbVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdbVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdbVar = new zzdb(this, dyVar);
            }
        } else {
            zzdbVar = new zzdb(this, dyVar);
        }
        Object objInvoke = zzdbVar.zza;
        int i2 = zzdbVar.zzc;
        if (i2 == 0) {
            wz2.a0(objInvoke);
            zzek zzekVarZza = this.zzd.zza();
            zzekVarZza.zzc(str);
            zzen zzenVarZzf = zzekVarZza.zzf(9);
            try {
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = zr0Var.invoke(zzekVarZza, zzdbVar);
                Object obj = dz.a;
                if (objInvoke == obj) {
                    return obj;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e3) {
                e2 = e3;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e4) {
                e = e4;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzdbVar.zzd;
            try {
                wz2.a0(objInvoke);
            } catch (zzbd e5) {
                e2 = e5;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzX, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @Nullable
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo305execute0E7RQCE(@NotNull RecaptchaAction recaptchaAction, long j, @NotNull dy dyVar) {
        zzcw zzcwVar;
        if (dyVar instanceof zzcw) {
            zzcwVar = (zzcw) dyVar;
            int i = zzcwVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, dyVar);
            }
        } else {
            zzcwVar = new zzcw(this, dyVar);
        }
        Object obj = zzcwVar.zza;
        int i2 = zzcwVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj);
                return ((k52) obj).a;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        zzcwVar.zzc = 1;
        Object objZzf = zzf(recaptchaAction, j, zzcwVar);
        Object obj2 = dz.a;
        return objZzf == obj2 ? obj2 : objZzf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    @Nullable
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo306executegIAlus(@NotNull RecaptchaAction recaptchaAction, @NotNull dy dyVar) {
        zzcx zzcxVar;
        if (dyVar instanceof zzcx) {
            zzcxVar = (zzcx) dyVar;
            int i = zzcxVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, dyVar);
            }
        } else {
            zzcxVar = new zzcx(this, dyVar);
        }
        Object obj = zzcxVar.zza;
        int i2 = zzcxVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj);
                return ((k52) obj).a;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        zzcxVar.zzc = 1;
        Object objMo305execute0E7RQCE = mo305execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
        Object obj2 = dz.a;
        return objMo305execute0E7RQCE == obj2 ? obj2 : objMo305execute0E7RQCE;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction) {
        return zzas.zza(tb5.c(this.zze.zzb(), null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    @NotNull
    public final String zzd() {
        return this.zzc;
    }

    public zzdc(@NotNull zzcn zzcnVar, @NotNull String str, @NotNull zzbi zzbiVar, @NotNull zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    @NotNull
    public final Task<String> executeTask(@NotNull RecaptchaAction recaptchaAction, long j) {
        return zzas.zza(tb5.c(this.zze.zzb(), null, new zzda(this, recaptchaAction, j, null), 3));
    }
}
