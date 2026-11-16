package com.bytedance.adsdk.ugeno.ct;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class kgy implements gf {
    @Override // com.bytedance.adsdk.ugeno.ct.gf
    public List<fi> kgy() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fi("slide") { // from class: com.bytedance.adsdk.ugeno.ct.kgy.1
            @Override // com.bytedance.adsdk.ugeno.ct.fi
            public com.bytedance.adsdk.ugeno.ct.uq.rz kgy(Context context) {
                return new com.bytedance.adsdk.ugeno.ct.uq.ct(context);
            }
        });
        arrayList.add(new fi("tap") { // from class: com.bytedance.adsdk.ugeno.ct.kgy.2
            @Override // com.bytedance.adsdk.ugeno.ct.fi
            public com.bytedance.adsdk.ugeno.ct.uq.rz kgy(Context context) {
                return new com.bytedance.adsdk.ugeno.ct.uq.gf(context);
            }
        });
        arrayList.add(new fi("timer") { // from class: com.bytedance.adsdk.ugeno.ct.kgy.3
            @Override // com.bytedance.adsdk.ugeno.ct.fi
            public com.bytedance.adsdk.ugeno.ct.uq.rz kgy(Context context) {
                return new com.bytedance.adsdk.ugeno.ct.uq.ra(context);
            }
        });
        arrayList.add(new fi("touchStart") { // from class: com.bytedance.adsdk.ugeno.ct.kgy.4
            @Override // com.bytedance.adsdk.ugeno.ct.fi
            public com.bytedance.adsdk.ugeno.ct.uq.rz kgy(Context context) {
                return new com.bytedance.adsdk.ugeno.ct.uq.kus(context);
            }
        });
        arrayList.add(new fi("touchEnd") { // from class: com.bytedance.adsdk.ugeno.ct.kgy.5
            @Override // com.bytedance.adsdk.ugeno.ct.fi
            public com.bytedance.adsdk.ugeno.ct.uq.rz kgy(Context context) {
                return new com.bytedance.adsdk.ugeno.ct.uq.twf(context);
            }
        });
        arrayList.add(new fi("animateState") { // from class: com.bytedance.adsdk.ugeno.ct.kgy.6
            @Override // com.bytedance.adsdk.ugeno.ct.fi
            public com.bytedance.adsdk.ugeno.ct.uq.rz kgy(Context context) {
                return new com.bytedance.adsdk.ugeno.ct.uq.ahm(context);
            }
        });
        arrayList.add(new fi("timerState") { // from class: com.bytedance.adsdk.ugeno.ct.kgy.7
            @Override // com.bytedance.adsdk.ugeno.ct.fi
            public com.bytedance.adsdk.ugeno.ct.uq.rz kgy(Context context) {
                return new com.bytedance.adsdk.ugeno.ct.uq.at(context);
            }
        });
        return arrayList;
    }
}
