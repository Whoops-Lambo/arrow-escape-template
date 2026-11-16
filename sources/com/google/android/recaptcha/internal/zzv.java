package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import defpackage.cz;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.e80;
import defpackage.eu;
import defpackage.hg0;
import defpackage.k52;
import defpackage.kc2;
import defpackage.rh1;
import defpackage.wz2;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzv extends zze {

    @NotNull
    private final zzek zza;

    @NotNull
    private final List zzb;
    private zzle zzc;

    @NotNull
    private final Map zzd;

    public /* synthetic */ zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i, e80 e80Var) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zzekVarZza = zzekVar.zza();
        cz czVarZzc = zzbiVar.zzc();
        List listZ = eu.z(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zzekVarZza, context, czVarZzc, new zzan(context, czVarZzc, zzekVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(GoogleApiAvailabilityLight.getInstance())));
        this.zza = zzekVar;
        this.zzb = listZ;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map linkedHashMap;
        List list = (List) this.zzd.remove(str);
        if (list != null) {
            List<zzaa> list2 = list;
            int iU = rh1.U(eu.f(list2, 10));
            if (iU < 16) {
                iU = 16;
            }
            linkedHashMap = new LinkedHashMap(iU);
            for (zzaa zzaaVar : list2) {
                linkedHashMap.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            linkedHashMap = hg0.a;
        }
        zzsz zzszVarZzs = zzs(linkedHashMap, str);
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        zzsf zzsfVarZzf = zzsg.zzf();
        byte[] bArrZzd = zzszVarZzs.zzd();
        zzsfVarZzf.zze(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        zzshVarZzf.zzf(zzsfVarZzf);
        return (zzsi) zzshVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zza(@NotNull String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzf(@NotNull String str, @NotNull dy dyVar) {
        zzq zzqVar;
        if (dyVar instanceof zzq) {
            zzqVar = (zzq) dyVar;
            int i = zzqVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzqVar = new zzq(this, dyVar);
            }
        } else {
            zzqVar = new zzq(this, dyVar);
        }
        Object objJ = zzqVar.zza;
        int i2 = zzqVar.zzc;
        if (i2 == 0) {
            wz2.a0(objJ);
            zzs zzsVar = new zzs(this, str, null);
            zzqVar.zzc = 1;
            objJ = kc2.j(zzsVar, zzqVar);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzh(@NotNull zzsc zzscVar, @NotNull dy dyVar) {
        zzt zztVar;
        if (dyVar instanceof zzt) {
            zztVar = (zzt) dyVar;
            int i = zztVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zztVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zztVar = new zzt(this, dyVar);
            }
        } else {
            zztVar = new zzt(this, dyVar);
        }
        Object objJ = zztVar.zza;
        int i2 = zztVar.zzc;
        if (i2 == 0) {
            wz2.a0(objJ);
            zzu zzuVar = new zzu(zzscVar, this, null);
            zztVar.zzc = 1;
            objJ = kc2.j(zzuVar, zztVar);
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

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(@NotNull zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    @NotNull
    public final Map zzo() {
        return this.zzd;
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzsv zzsvVarZzf = zzsx.zzf();
        zzsvVarZzf.zzq(3);
        zzle zzleVar = null;
        if (zzaaVar instanceof zzx) {
            zzti zztiVarZza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            if (zzleVar2 != null) {
                zzleVar = zzleVar2;
            }
            byte[] bArrZzd = zztiVarZza.zzd();
            zzsvVarZzf.zzf(zzcf.zza(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzleVar));
        } else if (zzaaVar instanceof zzw) {
            zzte zzteVarZza = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            if (zzleVar3 != null) {
                zzleVar = zzleVar3;
            }
            byte[] bArrZzd2 = zzteVarZza.zzd();
            zzsvVarZzf.zze(zzcf.zza(zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), zzleVar));
        } else {
            e.b();
            return null;
        }
        return (zzsx) zzsvVarZzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzsyVarZzf = zzsz.zzf();
        zzsyVarZzf.zzq(str);
        List list = this.zzb;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            zzy zzyVar = (zzy) obj2;
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int iZza = zzyVar.zza();
                zztd zztdVarZzf = zzte.zzf();
                zztdVarZzf.zzf(iZza);
                zztdVarZzf.zzr(13);
                zztdVarZzf.zzq(27);
                zzsyVarZzf.zzf(zzr(new zzw(iZza, (zzte) zztdVarZzf.zzk())));
            }
        }
        Collection collectionValues = map.values();
        ArrayList arrayList2 = new ArrayList(eu.f(collectionValues, 10));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzsyVarZzf.zze(arrayList2);
        return (zzsz) zzsyVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzd(@NotNull String str, @NotNull dy dyVar) {
        return zzq(str);
    }
}
