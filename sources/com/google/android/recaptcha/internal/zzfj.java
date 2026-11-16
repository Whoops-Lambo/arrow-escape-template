package com.google.android.recaptcha.internal;

import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.eu;
import defpackage.gd1;
import defpackage.kc2;
import defpackage.wz2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfj {

    @NotNull
    private final gd1 zza;

    public static final /* synthetic */ zzex zza(zzfj zzfjVar) {
        return (zzex) zzfjVar.zza.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object zzc(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, dy dyVar) {
        zzfg zzfgVar;
        if (dyVar instanceof zzfg) {
            zzfgVar = (zzfg) dyVar;
            int i = zzfgVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzfgVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzfgVar = new zzfg(zzfjVar, dyVar);
            }
        } else {
            zzfgVar = new zzfg(zzfjVar, dyVar);
        }
        Object obj = zzfgVar.zza;
        int i2 = zzfgVar.zzc;
        if (i2 != 0) {
            if (i2 == 1) {
                wz2.a0(obj);
                return obj;
            }
            e32.i("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        wz2.a0(obj);
        zzfh zzfhVar = new zzfh(zzfjVar, zzbrVar, zzspVar, null);
        zzfgVar.zzc = 1;
        Object objJ = kc2.j(zzfhVar, zzfgVar);
        dz dzVar = dz.a;
        return objJ == dzVar ? dzVar : objJ;
    }

    public zzfj() {
        int i = zzav.zza;
        this.zza = eu.w(zzfi.zza);
    }

    @Nullable
    public final Object zzb(@NotNull zzbr zzbrVar, @NotNull zzsp zzspVar, @NotNull dy dyVar) {
        return zzc(this, zzbrVar, zzspVar, dyVar);
    }
}
