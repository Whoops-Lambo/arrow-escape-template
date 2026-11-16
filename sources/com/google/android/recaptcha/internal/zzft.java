package com.google.android.recaptcha.internal;

import defpackage.az2;
import defpackage.cz;
import defpackage.d;
import defpackage.dy;
import defpackage.dz;
import defpackage.kc2;
import defpackage.tb5;
import io.p071bidmachine.media3.extractor.ts.y;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzft implements zzfo {

    @NotNull
    private final cz zza;

    @NotNull
    private final zzgf zzb;

    @NotNull
    private final zzhx zzc;

    @NotNull
    private final Map zzd;

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, dy dyVar) {
        Object objJ = kc2.j(new zzfq(zzgdVar, list, this, null), dyVar);
        return objJ == dz.a ? objJ : az2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, dy dyVar) {
        Object objJ = kc2.j(new zzfr(exc, zzgdVar, this, null), dyVar);
        return objJ == dz.a ? objJ : az2.a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(@NotNull String str) {
        tb5.t(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }

    public zzft(@NotNull cz czVar, @NotNull zzgf zzgfVar, @NotNull zzhx zzhxVar, @NotNull Map map) {
        this.zza = czVar;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar != null) {
            int iZzg = zzufVar.zzg();
            zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
            zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
            if (iZza == zzgdVar.zza()) {
                zzgdVar.zzg(zzgdVar.zza() + 1);
            }
            zzjhVarZzb.zzf();
            long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
            int i = zzbk.zza;
            int iZzk = zzufVar.zzk();
            if (iZzk != 1) {
                zzbk.zza(iZzk - 2, jZza);
                return;
            } else {
                d.r("Can't get the number of an unknown enum value.");
                return;
            }
        }
        y.e(5, 2, null);
    }
}
