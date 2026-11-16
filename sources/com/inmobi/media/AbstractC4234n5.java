package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4234n5 {
    public static JSONArray a(C4206m5 c4206m5, List list) {
        c4206m5.getClass();
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        List list2 = C4206m5.j;
        if (!list.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(c4206m5.a);
        }
        if (!list.contains("bid")) {
            jSONArray.put(c4206m5.b);
        }
        if (!list.contains("its")) {
            jSONArray.put(c4206m5.c);
        }
        if (!list.contains("vtm")) {
            jSONArray.put(c4206m5.d);
        }
        if (!list.contains("plid")) {
            jSONArray.put(c4206m5.e);
        }
        if (!list.contains("catid")) {
            jSONArray.put(c4206m5.f);
        }
        if (!list.contains("hcd")) {
            jSONArray.put(c4206m5.g);
        }
        if (!list.contains("hsv")) {
            jSONArray.put(c4206m5.h);
        }
        if (!list.contains("hcv")) {
            jSONArray.put(c4206m5.i);
        }
        return jSONArray;
    }
}
