package com.bytedance.sdk.component.adexpress.dynamic.ct;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ra {
    public static List<ahm.kgy> kgy(float f, List<ahm.kgy> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<ahm.kgy> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((ahm.kgy) it.next().clone());
        }
        int size = arrayList.size();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ahm.kgy kgyVar = (ahm.kgy) obj;
            boolean z2 = kgyVar.ahm;
            float f2 = kgyVar.kgy;
            if (z2) {
                i = (int) (i + f2);
            } else {
                i2 = (int) (i2 + f2);
                z = false;
            }
        }
        if (!z || f <= i) {
            float f3 = i;
            float f4 = f < f3 ? f / f3 : 1.0f;
            float f5 = f > f3 ? (f - f3) / i2 : 0.0f;
            if (f5 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                boolean z3 = false;
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    ahm.kgy kgyVar2 = (ahm.kgy) obj2;
                    if (!kgyVar2.ahm) {
                        float f6 = kgyVar2.rz;
                        if (f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && kgyVar2.kgy * f5 > f6) {
                            kgyVar2.kgy = f6;
                            kgyVar2.ahm = true;
                            z3 = true;
                        }
                    }
                    arrayList2.add(kgyVar2);
                }
                if (z3) {
                    return kgy(f, arrayList2);
                }
            }
            int size3 = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList.get(i6);
                i6++;
                ahm.kgy kgyVar3 = (ahm.kgy) obj3;
                boolean z4 = kgyVar3.ahm;
                float f7 = kgyVar3.kgy;
                if (z4) {
                    kgyVar3.kgy = kgy(f7 * f4);
                } else {
                    kgyVar3.kgy = kgy(f7 * f5);
                }
                i5 = (int) (i5 + kgyVar3.kgy);
            }
            float f8 = i5;
            if (f8 < f) {
                float f9 = f - f8;
                for (int size4 = 0; size4 < arrayList.size() && f9 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT; size4 = (size4 + 1) % arrayList.size()) {
                    ahm.kgy kgyVar4 = (ahm.kgy) arrayList.get(size4);
                    if ((f < f3 && kgyVar4.ahm) || (f > f3 && !kgyVar4.ahm)) {
                        kgyVar4.kgy += 0.0625f;
                        f9 -= 0.0625f;
                    }
                }
            }
        }
        return arrayList;
    }

    public static float kgy(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }
}
