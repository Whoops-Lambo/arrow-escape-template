package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class l1 extends C0522 {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public final String f386;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public final String f387;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public final String f388;

    public l1(JSONObject jSONObject) {
        boolean z;
        List listAsList;
        this.f387 = jSONObject.optString(StringFog.decrypt("twRZE0Xt1jWsAEg2YunME5ATXiNF8A==\n", "wGE7RSyIoXY=\n"));
        this.f388 = jSONObject.optString(StringFog.decrypt("VLTzDzV8i69Rk/cVEw==\n", "It2WeHYQ6tw=\n"));
        this.f386 = jSONObject.optString(StringFog.decrypt("dR2BUywK1xhgC6NEJxjoCQ==\n", "BXzzNkJ+gXE=\n"));
        this.f1268 = jSONObject.optString(StringFog.decrypt("e5CKiKjxkBFylw==\n", "EePe5+Gf+nQ=\n"));
        this.f1266 = false;
        if (TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("PJDqVl+fuvs1lw==\n", "VuO+ORbx0J4=\n"))) && !jSONObject.optBoolean(StringFog.decrypt("cMNREoam9zpgx3cpiqHPJw==\n", "BbA0RePEoVM=\n")) && !jSONObject.optBoolean(StringFog.decrypt("urMQoQ5i1ti9rxiTKGz81aG0\n", "z8B19msAlbA=\n"))) {
            z = false;
        } else {
            z = true;
        }
        this.f1263 = z;
        this.f1262 = jSONObject.optBoolean(StringFog.decrypt("GZGOEHNe10MJlagrf1nvXg==\n", "bOLrRxY8gSo=\n"));
        this.f1261 = jSONObject.optBoolean(StringFog.decrypt("9QKjs2qxrx/KAg==\n", "gHHG9hLF3X4=\n"));
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(jSONObject.optString(StringFog.decrypt("A0evXht5sJYO\n", "djXDDmkc1v8=\n")))) {
            listAsList = null;
        } else {
            listAsList = Arrays.asList(jSONObject.optString(StringFog.decrypt("M2MSiwQ3qFw+\n", "RhF+23ZSzjU=\n")).split(StringFog.decrypt("hw==\n", "qwe51gUr5fs=\n")));
        }
        this.f1267 = listAsList;
        this.f1265 = jSONObject.optBoolean(StringFog.decrypt("wNBEM74ftrTW0UgJqw==\n", "taMhed9p18c=\n"), true);
        this.f1264 = false;
        this.f1260 = jSONObject.optBoolean(StringFog.decrypt("QhNiRRJn7h5mCH1FGnnhHlw=\n", "L2YOMXsXgns=\n"));
        this.f1259 = jSONObject.optBoolean(StringFog.decrypt("bRKtkEUEaKZw\n", "BH/d3ytUB9U=\n"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(StringFog.decrypt("DvGVh0ew+cEf9p+CUQ==\n", "eJjw8DTklog=\n"));
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                Object objOpt = jSONArrayOptJSONArray.opt(i);
                if (objOpt != null) {
                    arrayList.add(objOpt);
                }
            }
        }
        if (arrayList != null) {
            this.f1258 = arrayList;
        }
    }

    public l1() {
    }
}
