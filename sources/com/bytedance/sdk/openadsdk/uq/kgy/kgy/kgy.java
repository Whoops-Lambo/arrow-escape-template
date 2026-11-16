package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy extends com.bytedance.kgy.ahm<gf> {
    @Override // com.bytedance.kgy.ahm
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public gf kgy(String str, byte[] bArr, int i, int i2) {
        gf gfVar;
        try {
            gfVar = new gf(str, PangleNetworkBridge.jsonObjectInit(new String(bArr, StandardCharsets.UTF_8)));
            try {
                gfVar.kgy(i);
                gfVar.ahm(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            gfVar = null;
        }
        if (gfVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectRz = gfVar.rz();
            String strOptString = jSONObjectRz.optString("ad_extra_data");
            JSONObject jSONObjectJsonObjectInit = !TextUtils.isEmpty(strOptString) ? PangleNetworkBridge.jsonObjectInit(strOptString) : new JSONObject();
            String strOptString2 = jSONObjectJsonObjectInit.optString("pag_json_data");
            JSONObject jSONObjectJsonObjectInit2 = !TextUtils.isEmpty(strOptString2) ? PangleNetworkBridge.jsonObjectInit(strOptString2) : new JSONObject();
            jSONObjectJsonObjectInit2.putOpt("_reqc", Integer.valueOf(gfVar.ct()));
            jSONObjectJsonObjectInit.putOpt("pag_json_data", jSONObjectJsonObjectInit2.toString());
            jSONObjectRz.putOpt("ad_extra_data", jSONObjectJsonObjectInit.toString());
        } catch (Throwable unused3) {
        }
        return gfVar;
    }

    @Override // com.bytedance.kgy.ahm
    public String ct() {
        return "app_log_event";
    }

    @Override // com.bytedance.kgy.ahm
    public com.bytedance.kgy.rz.InterfaceC0202rz fi() {
        return ahm.kgy();
    }

    @Override // com.bytedance.kgy.ahm
    public int gf() {
        return rz.kgy().kgy().noq;
    }

    @Override // com.bytedance.kgy.ahm
    public long kgy() {
        return rz.kgy().kgy().kgy;
    }

    @Override // com.bytedance.kgy.ahm
    public long noq() {
        return rz.kgy().kgy().rz;
    }

    @Override // com.bytedance.kgy.ahm
    public long nu() {
        return rz.kgy().kgy().fi;
    }

    @Override // com.bytedance.kgy.ahm
    public int ra() {
        return rz.kgy().kgy().yo;
    }

    @Override // com.bytedance.kgy.ahm
    public int rz() {
        return rz.kgy().kgy().ahm;
    }

    @Override // com.bytedance.kgy.ahm
    public boolean yo() {
        return ahm.ahm();
    }

    @Override // com.bytedance.kgy.ahm
    public void kgy(ArrayList<gf> arrayList, com.bytedance.kgy.rz.ahm<gf> ahmVar) {
        uq.kgy(arrayList, ahmVar);
    }

    @Override // com.bytedance.kgy.ahm
    public long ahm() {
        return rz.kgy().kgy().gf;
    }
}
