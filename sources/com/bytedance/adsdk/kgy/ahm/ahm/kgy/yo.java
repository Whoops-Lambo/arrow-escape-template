package com.bytedance.adsdk.kgy.ahm.ahm.kgy;

import com.ironsource.C4664b4;
import defpackage.e32;
import defpackage.jc1;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class yo implements com.bytedance.adsdk.kgy.ahm.ahm.kgy {
    private final Object kgy;

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public String ahm() {
        Object obj = this.kgy;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public Object kgy(Map<String, JSONObject> map) {
        return this.kgy;
    }

    public String toString() {
        return jc1.p(new StringBuilder("KeywordNode [keywordValue="), this.kgy, C4664b4.j.e);
    }

    public yo(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.kgy = Boolean.TRUE;
            return;
        }
        if (str.equalsIgnoreCase("false")) {
            this.kgy = Boolean.FALSE;
        } else if (str.equalsIgnoreCase("null")) {
            this.kgy = null;
        } else {
            e32.a();
            throw null;
        }
    }

    @Override // com.bytedance.adsdk.kgy.ahm.ahm.kgy
    public com.bytedance.adsdk.kgy.ahm.uq.ct kgy() {
        return com.bytedance.adsdk.kgy.ahm.uq.noq.CONSTANT;
    }
}
