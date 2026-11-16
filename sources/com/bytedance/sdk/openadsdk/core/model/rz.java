package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class rz {
    public int ahm;
    public AdSlot ct;
    public String kgy;
    public String noq;
    public int rz = 1;
    public ArrayList<Integer> uq;
    public int yo;

    public static void kgy(rz rzVar) {
        int iAhm;
        if (rzVar == null || rzVar.uq() == null || (iAhm = rzVar.ahm()) >= 0 || iAhm == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.dg.uq.kgy("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.dg.ahm() { // from class: com.bytedance.sdk.openadsdk.core.model.rz.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm
            public com.bytedance.sdk.openadsdk.dg.kgy.rz kgy() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", rz.this.rz());
                jSONObject.put("err_code", rz.this.ahm());
                jSONObject.put("err_msg", rz.this.noq);
                jSONObject.put("ext_from", rz.this.yo);
                jSONObject.put("server_res_str", rz.this.kgy());
                if (rz.this.ct() != null && rz.this.ct().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) rz.this.ct()).toString());
                }
                return com.bytedance.sdk.openadsdk.dg.kgy.uq.ahm().kgy("rd_client_custom_error").kgy(rz.this.uq().getDurationSlotType()).ahm(jSONObject.toString());
            }
        });
    }

    public int ahm() {
        return this.ahm;
    }

    public ArrayList<Integer> ct() {
        return this.uq;
    }

    public int rz() {
        return this.rz;
    }

    public AdSlot uq() {
        return this.ct;
    }

    public void ahm(int i) {
        this.rz = i;
    }

    public void rz(int i) {
        this.yo = i;
    }

    public void ahm(String str) {
        this.noq = str;
    }

    public void kgy(String str) {
        this.kgy = str;
    }

    public void kgy(int i) {
        this.ahm = i;
    }

    public void kgy(AdSlot adSlot) {
        this.ct = adSlot;
    }

    public void kgy(ArrayList<Integer> arrayList) {
        this.uq = arrayList;
    }

    public String kgy() {
        return this.kgy;
    }
}
