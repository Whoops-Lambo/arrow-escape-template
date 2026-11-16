package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.ct.gf;
import com.bytedance.adsdk.ugeno.ct.nu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class noq {
    private static volatile noq kgy;
    private List<com.bytedance.adsdk.ugeno.core.ahm> ahm;
    private kgy ct;
    private com.bytedance.adsdk.ugeno.core.kgy.kgy fi;
    private com.bytedance.adsdk.ugeno.uq.kgy noq;
    private com.bytedance.adsdk.ugeno.core.rz rz;
    private ahm uq;
    private com.bytedance.adsdk.ugeno.core.ahm.uq yo;

    public static noq kgy() {
        if (kgy == null) {
            synchronized (noq.class) {
                try {
                    if (kgy == null) {
                        kgy = new noq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private void yo() {
        ArrayList arrayList = new ArrayList();
        this.ahm = arrayList;
        com.bytedance.adsdk.ugeno.core.rz rzVar = this.rz;
        if (rzVar != null) {
            arrayList.addAll(rzVar.kgy());
        }
        com.bytedance.adsdk.ugeno.core.uq.kgy(this.ahm);
    }

    public ahm ahm() {
        return this.uq;
    }

    public com.bytedance.adsdk.ugeno.core.ahm.uq ct() {
        return this.yo;
    }

    public com.bytedance.adsdk.ugeno.core.kgy.kgy noq() {
        return this.fi;
    }

    public com.bytedance.adsdk.ugeno.uq.kgy rz() {
        return this.noq;
    }

    public kgy uq() {
        return this.ct;
    }

    private noq() {
    }

    public void kgy(Context context, com.bytedance.adsdk.ugeno.core.rz rzVar, ahm ahmVar) {
        this.rz = rzVar;
        this.uq = ahmVar;
        yo();
    }

    public void kgy(com.bytedance.adsdk.ugeno.uq.kgy kgyVar) {
        this.noq = kgyVar;
    }

    public void kgy(gf gfVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.ct.kgy().kgy());
        if (gfVar != null) {
            arrayList.addAll(gfVar.kgy());
        }
        nu.kgy(arrayList);
    }

    public void kgy(com.bytedance.adsdk.ugeno.ct.rz rzVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.ct.noq().kgy());
        if (rzVar != null) {
            arrayList.addAll(rzVar.kgy());
        }
        com.bytedance.adsdk.ugeno.ct.uq.kgy(arrayList);
    }

    public void kgy(kgy kgyVar) {
        this.ct = kgyVar;
    }
}
