package com.bytedance.adsdk.kgy.ahm;

import com.bytedance.adsdk.kgy.ahm.rz.kgy.ahm;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.ct;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.fi;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.gf;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.noq;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.ra;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.rz;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.uq;
import com.bytedance.adsdk.kgy.ahm.rz.kgy.yo;
import defpackage.d;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy {
    private static final com.bytedance.adsdk.kgy.ahm.rz.kgy kgy;
    private final com.bytedance.adsdk.kgy.ahm.rz.kgy ahm;
    private String ct;
    private com.bytedance.adsdk.kgy.ahm.ahm.kgy rz;
    private Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> uq = new LinkedList();

    static {
        int i = 8;
        noq[] noqVarArr = {new ra(), new uq(), new gf(), new ahm(), new ct(), new com.bytedance.adsdk.kgy.ahm.rz.kgy.kgy(), new yo(), new rz(), new fi()};
        final com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar = new com.bytedance.adsdk.kgy.ahm.rz.kgy() { // from class: com.bytedance.adsdk.kgy.ahm.kgy.1
            @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy
            public int kgy(String str, int i2, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque) {
                return i2;
            }
        };
        while (i >= 0) {
            final noq noqVar = noqVarArr[i];
            i--;
            kgyVar = new com.bytedance.adsdk.kgy.ahm.rz.kgy() { // from class: com.bytedance.adsdk.kgy.ahm.kgy.2
                @Override // com.bytedance.adsdk.kgy.ahm.rz.kgy
                public int kgy(String str, int i2, Deque<com.bytedance.adsdk.kgy.ahm.ahm.kgy> deque) {
                    return noqVar.kgy(str, i2, deque, kgyVar);
                }
            };
        }
        kgy = kgyVar;
    }

    private void kgy() {
        int length = this.ct.length();
        int i = 0;
        while (i < length) {
            int iKgy = this.ahm.kgy(this.ct, i, this.uq);
            if (iKgy == i) {
                d.r("Unrecognized expression, unrecognized characters encountered during parsing:".concat(this.ct.substring(0, i)));
                return;
            }
            i = iKgy;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            com.bytedance.adsdk.kgy.ahm.ahm.kgy kgyVarPollFirst = this.uq.pollFirst();
            if (kgyVarPollFirst == null) {
                this.rz = com.bytedance.adsdk.kgy.ahm.ct.ahm.kgy(arrayList, this.ct, i);
                this.uq = null;
                return;
            }
            arrayList.add(0, kgyVarPollFirst);
        }
    }

    private kgy(String str, com.bytedance.adsdk.kgy.ahm.rz.kgy kgyVar) {
        this.ahm = kgyVar;
        this.ct = str;
        try {
            kgy();
        } catch (Exception e) {
            throw new com.bytedance.adsdk.kgy.kgy.ahm(str, e);
        }
    }

    public static kgy kgy(String str) {
        return new kgy(str, kgy);
    }

    public <T> T kgy(JSONObject jSONObject) {
        HashMap map = new HashMap();
        map.put("default_key", jSONObject);
        return (T) kgy(map);
    }

    public <T> T kgy(Map<String, JSONObject> map) {
        return (T) this.rz.kgy(map);
    }
}
