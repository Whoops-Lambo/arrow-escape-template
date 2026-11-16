package defpackage;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class xw3 implements Comparator {
    public final /* synthetic */ zzai a;
    public final /* synthetic */ zzg b;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzao zzaoVar = (zzao) obj;
        zzao zzaoVar2 = (zzao) obj2;
        if (zzaoVar instanceof zzat) {
            return !(zzaoVar2 instanceof zzat) ? 1 : 0;
        }
        if (zzaoVar2 instanceof zzat) {
            return -1;
        }
        zzai zzaiVar = this.a;
        return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) zzh.h(zzaiVar.b(this.b, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
    }

    public xw3(zzai zzaiVar, zzg zzgVar) {
        this.a = zzaiVar;
        this.b = zzgVar;
    }
}
