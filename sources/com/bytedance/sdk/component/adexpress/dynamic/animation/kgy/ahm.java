package com.bytedance.sdk.component.adexpress.dynamic.animation.kgy;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.muf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm implements muf {
    List<uq> kgy = new ArrayList();

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.muf
    public void ahm() {
        Iterator<uq> it = this.kgy.iterator();
        while (it.hasNext()) {
            try {
                it.next().ahm();
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mBRN5QjQWpJ1X9", "euAkmAKoYMiOedJJnw==", "SeshkAKvbOaOQ9pcmBivJg==", 61);
            }
        }
    }

    public void kgy() {
        Iterator<uq> it = this.kgy.iterator();
        while (it.hasNext()) {
            try {
                it.next().rz();
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX6EmUuMsgQqzZ4mBRN5QjQWpJ1X9", "euAkmAKoYMiOedJJnw==", "S+IsjCKyYMqBXt5Sgg==", 28);
            }
        }
    }

    public ahm(View view, List<com.bytedance.sdk.component.adexpress.dynamic.uq.kgy> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.uq.kgy> it = list.iterator();
        while (it.hasNext()) {
            uq uqVarKgy = rz.kgy().kgy(view, it.next());
            if (uqVarKgy != null) {
                this.kgy.add(uqVarKgy);
            }
        }
    }
}
