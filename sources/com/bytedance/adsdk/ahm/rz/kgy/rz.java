package com.bytedance.adsdk.ahm.rz.kgy;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz extends kus<com.bytedance.adsdk.ahm.rz.ahm.uq, com.bytedance.adsdk.ahm.rz.ahm.uq> {
    private static com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq> kgy(com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq> kgyVar) {
        com.bytedance.adsdk.ahm.rz.ahm.uq uqVar = kgyVar.kgy;
        com.bytedance.adsdk.ahm.rz.ahm.uq uqVar2 = kgyVar.ahm;
        if (uqVar == null || uqVar2 == null || uqVar.kgy().length == uqVar2.kgy().length) {
            return kgyVar;
        }
        float[] fArrKgy = kgy(uqVar.kgy(), uqVar2.kgy());
        return kgyVar.kgy(uqVar.kgy(fArrKgy), uqVar2.kgy(fArrKgy));
    }

    public rz(List<com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq>> list) {
        super(kgy(list));
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.kus, com.bytedance.adsdk.ahm.rz.kgy.twf
    public /* bridge */ /* synthetic */ boolean ahm() {
        return super.ahm();
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.kus, com.bytedance.adsdk.ahm.rz.kgy.twf
    public /* bridge */ /* synthetic */ List rz() {
        return super.rz();
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.kus
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static List<com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq>> kgy(List<com.bytedance.adsdk.ahm.yo.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, kgy(list.get(i)));
        }
        return list;
    }

    public static float[] kgy(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.ahm.rz.kgy.twf
    public com.bytedance.adsdk.ahm.kgy.ahm.kgy<com.bytedance.adsdk.ahm.rz.ahm.uq, com.bytedance.adsdk.ahm.rz.ahm.uq> kgy() {
        return new com.bytedance.adsdk.ahm.kgy.ahm.ct(this.kgy);
    }
}
