package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class zzxo extends zzxz implements zzyi {
    @Override // com.google.android.gms.internal.measurement.zzxz
    public final zzabl c() {
        return zzabl.b;
    }

    @Override // com.google.android.gms.internal.measurement.zzxz
    public final boolean d(zzyd zzydVar) {
        zzzj zzzjVarJ = j();
        int iA = zzzjVarJ.a();
        for (int i = 0; i < iA; i++) {
            if (zzzjVarJ.b(i).a == "eye3tag") {
                if (zzzjVarJ.d(zzxx.a) != null) {
                    break;
                }
                zzyl zzylVar = zzxx.i;
                if (zzzjVarJ.d(zzylVar) != null) {
                    break;
                }
                k(zzylVar, zzyv.SMALL);
                break;
            }
        }
        return super.d(zzydVar);
    }
}
