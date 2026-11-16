package com.bytedance.sdk.openadsdk.uq.kgy.kgy;

import android.text.TextUtils;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class at extends com.bytedance.kgy.ahm<nu> {
    @Override // com.bytedance.kgy.ahm
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public nu kgy(String str, byte[] bArr, int i, int i2) {
        nu nuVar;
        try {
            nuVar = new nu(str, PangleNetworkBridge.jsonObjectInit(new String(bArr, StandardCharsets.UTF_8)));
            try {
                nuVar.kgy(i);
                nuVar.ahm(i2);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            nuVar = null;
        }
        if (nuVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectRz = nuVar.rz();
            String strOptString = jSONObjectRz.optString("event_extra");
            JSONObject jSONObjectJsonObjectInit = !TextUtils.isEmpty(strOptString) ? PangleNetworkBridge.jsonObjectInit(strOptString) : new JSONObject();
            jSONObjectJsonObjectInit.putOpt("_reqc", Integer.valueOf(nuVar.ct()));
            jSONObjectRz.putOpt("event_extra", jSONObjectJsonObjectInit.toString());
        } catch (Throwable unused3) {
        }
        return nuVar;
    }

    @Override // com.bytedance.kgy.ahm
    public String ct() {
        return "stats_log_event";
    }

    @Override // com.bytedance.kgy.ahm
    public com.bytedance.kgy.rz.InterfaceC0202rz fi() {
        return ahm.kgy();
    }

    @Override // com.bytedance.kgy.ahm
    public int gf() {
        return rz.kgy().ahm().noq;
    }

    @Override // com.bytedance.kgy.ahm
    public long kgy() {
        return rz.kgy().ahm().kgy;
    }

    @Override // com.bytedance.kgy.ahm
    public long noq() {
        return rz.kgy().ahm().rz;
    }

    @Override // com.bytedance.kgy.ahm
    public long nu() {
        return rz.kgy().ahm().fi;
    }

    @Override // com.bytedance.kgy.ahm
    public int ra() {
        return rz.kgy().ahm().yo;
    }

    @Override // com.bytedance.kgy.ahm
    public int rz() {
        return rz.kgy().ahm().ahm;
    }

    @Override // com.bytedance.kgy.ahm
    public boolean yo() {
        return ahm.ahm();
    }

    @Override // com.bytedance.kgy.ahm
    public void kgy(ArrayList<nu> arrayList, com.bytedance.kgy.rz.ahm<nu> ahmVar) {
        uq.ahm(arrayList, ahmVar);
    }

    @Override // com.bytedance.kgy.ahm
    public long ahm() {
        return rz.kgy().ahm().gf;
    }
}
