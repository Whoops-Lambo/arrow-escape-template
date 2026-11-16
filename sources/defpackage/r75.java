package defpackage;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzaw;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzt;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class r75 extends zzai {
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ zzt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r75(zzt zztVar, boolean z, boolean z2) {
        super(CreativeInfo.f);
        this.e = zztVar;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0095 A[LOOP:0: B:23:0x008b->B:25:0x0095, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao b(zzg zzgVar, List list) {
        int i;
        int i2;
        String strZzc;
        ArrayList arrayList;
        zzh.b(1, CreativeInfo.f, list);
        int size = list.size();
        zzat zzatVar = zzao.e9;
        zzt zztVar = this.e;
        if (size == 1) {
            zztVar.c.e(3, zzgVar.b.b(zzgVar, (zzao) list.get(0)).zzc(), Collections.EMPTY_LIST, this.c, this.d);
            return zzatVar;
        }
        zzao zzaoVar = (zzao) list.get(0);
        zzaw zzawVar = zzgVar.b;
        zzaw zzawVar2 = zzgVar.b;
        int iG = zzh.g(zzawVar.b(zzgVar, zzaoVar).zzd().doubleValue());
        if (iG != 2) {
            i = 3;
            if (iG == 3) {
                i2 = 1;
            } else if (iG == 5) {
                i2 = 5;
            } else if (iG == 6) {
                i2 = 2;
            }
            strZzc = zzawVar2.b(zzgVar, (zzao) list.get(1)).zzc();
            if (list.size() == 2) {
                zztVar.c.e(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
                return zzatVar;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(zzawVar2.b(zzgVar, (zzao) list.get(i3)).zzc());
            }
            zztVar.c.e(i2, strZzc, arrayList, this.c, this.d);
            return zzatVar;
        }
        i = 4;
        i2 = i;
        strZzc = zzawVar2.b(zzgVar, (zzao) list.get(1)).zzc();
        if (list.size() == 2) {
            zztVar.c.e(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
            return zzatVar;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(zzawVar2.b(zzgVar, (zzao) list.get(i3)).zzc());
        }
        zztVar.c.e(i2, strZzc, arrayList, this.c, this.d);
        return zzatVar;
    }
}
