package com.bytedance.adsdk.kgy;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class rz implements dg {
    @Override // com.bytedance.adsdk.kgy.dg
    /* JADX INFO: renamed from: ahm, reason: merged with bridge method [inline-methods] */
    public String kgy(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        try {
            String strValueOf = String.valueOf(objArr[0]);
            if (!TextUtils.isEmpty(strValueOf)) {
                return new SimpleDateFormat(strValueOf, Locale.getDefault()).format(new Date());
            }
            if (objArr.length >= 2) {
                return String.valueOf(objArr[1]);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
