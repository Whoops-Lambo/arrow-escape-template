package com.bytedance.adsdk.kgy;

import java.math.BigDecimal;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public String kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null) {
            return "";
        }
        try {
            if (objArr.length < 2) {
                return "";
            }
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            return (((obj instanceof String) || (obj instanceof Number)) && (obj2 instanceof String)) ? com.bytedance.adsdk.ugeno.rz.ahm.kgy(new BigDecimal(String.valueOf(obj)), (String) obj2, Locale.getDefault(), 2, 2, 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
