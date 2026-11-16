package com.bytedance.adsdk.ugeno.ct;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class noq implements rz {
    @Override // com.bytedance.adsdk.ugeno.ct.rz
    public List<ahm> kgy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ahm("update") { // from class: com.bytedance.adsdk.ugeno.ct.noq.1
            @Override // com.bytedance.adsdk.ugeno.ct.ahm
            public com.bytedance.adsdk.ugeno.ct.ahm.kgy kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
                return new com.bytedance.adsdk.ugeno.ct.ahm.noq(rzVar, str, kgyVar);
            }
        });
        arrayList.add(new ahm("emit") { // from class: com.bytedance.adsdk.ugeno.ct.noq.2
            @Override // com.bytedance.adsdk.ugeno.ct.ahm
            public com.bytedance.adsdk.ugeno.ct.ahm.kgy kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
                return new com.bytedance.adsdk.ugeno.ct.ahm.ahm(rzVar, str, kgyVar);
            }
        });
        arrayList.add(new ahm("startAnimate") { // from class: com.bytedance.adsdk.ugeno.ct.noq.3
            @Override // com.bytedance.adsdk.ugeno.ct.ahm
            public com.bytedance.adsdk.ugeno.ct.ahm.kgy kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
                return new com.bytedance.adsdk.ugeno.ct.ahm.uq(rzVar, str, kgyVar);
            }
        });
        arrayList.add(new ahm("startTimer") { // from class: com.bytedance.adsdk.ugeno.ct.noq.4
            @Override // com.bytedance.adsdk.ugeno.ct.ahm
            public com.bytedance.adsdk.ugeno.ct.ahm.kgy kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, String str, yo.kgy kgyVar) {
                return new com.bytedance.adsdk.ugeno.ct.ahm.ct(rzVar, str, kgyVar);
            }
        });
        return arrayList;
    }
}
