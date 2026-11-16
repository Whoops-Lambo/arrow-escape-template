package com.google.android.recaptcha.internal;

import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.e80;
import defpackage.gg0;
import defpackage.iu;
import defpackage.k52;
import defpackage.kc2;
import defpackage.wz2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzl {

    @NotNull
    private final List zza;

    @Nullable
    private zzek zzb;

    public final void zzf(@NotNull zze... zzeVarArr) {
        zzh((zze[]) Arrays.copyOf(zzeVarArr, 1));
    }

    private final void zzh(zze... zzeVarArr) {
        iu.O(this.zza, zzeVarArr);
    }

    @Nullable
    public final Object zzb(@NotNull String str, long j, @NotNull dy dyVar) {
        return kc2.j(new zzh(this, str, j, null), dyVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object zzc(long j, @NotNull zzsc zzscVar, @NotNull zzek zzekVar, @NotNull dy dyVar) {
        zzi zziVar;
        if (dyVar instanceof zzi) {
            zziVar = (zzi) dyVar;
            int i = zziVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zziVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zziVar = new zzi(this, dyVar);
            }
        } else {
            zziVar = new zzi(this, dyVar);
        }
        Object objJ = zziVar.zza;
        int i2 = zziVar.zzc;
        if (i2 == 0) {
            wz2.a0(objJ);
            zzk zzkVar = new zzk(this, zzekVar, j, zzscVar, null);
            zziVar.zzc = 1;
            objJ = kc2.j(zzkVar, zziVar);
            dz dzVar = dz.a;
            if (objJ == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(objJ);
        }
        return ((k52) objJ).a;
    }

    @NotNull
    public final List zzd() {
        return this.zza;
    }

    public final void zzg(@NotNull zzsr zzsrVar) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzsrVar);
        }
    }

    public /* synthetic */ zzl(List list, int i, e80 e80Var) {
        this.zza = new ArrayList();
        zze[] zzeVarArr = (zze[]) gg0.a.toArray(new zze[0]);
        zzh((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }

    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
