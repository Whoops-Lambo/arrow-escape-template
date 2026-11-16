package com.bytedance.adsdk.ahm;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class um {
    private boolean kgy = false;
    private final Set<Object> ahm = new kgy();
    private final Map<String, com.bytedance.adsdk.ahm.noq.uq> rz = new HashMap();
    private final Comparator<Pair<String, Float>> uq = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.ahm.um.1
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
        public int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public void kgy(String str, float f) {
        if (this.kgy) {
            com.bytedance.adsdk.ahm.noq.uq uqVar = this.rz.get(str);
            if (uqVar == null) {
                uqVar = new com.bytedance.adsdk.ahm.noq.uq();
                this.rz.put(str, uqVar);
            }
            uqVar.kgy(f);
            if (str.equals("__container")) {
                Iterator<Object> it = this.ahm.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }

    public void kgy(boolean z) {
        this.kgy = z;
    }
}
