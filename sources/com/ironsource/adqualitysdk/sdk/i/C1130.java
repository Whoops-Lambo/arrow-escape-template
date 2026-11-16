package com.ironsource.adqualitysdk.sdk.i;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.rl3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ⅹ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1130 {

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public int f3282 = -1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final C1130 f3283;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final C0953 f3284;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final String[] f3285;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0774 f3286;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String f3287;

    static {
        StringFog.decrypt("GsOBJg==\n", "e7HmVTs05UA=\n");
        StringFog.decrypt("rJbaeg==\n", "zvm+A1xTtFs=\n");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("FT51Dytlq0VT\n", "c0sbbF8MxCs=\n"));
        rl3.p(this.f3287, "NA==\n", sb, "HNdwxcEg0Ls=\n");
        String strDecrypt = StringFog.decrypt("HPs=\n", "MNvjJN5OqeI=\n");
        String[] strArr = this.f3285;
        if (strDecrypt == null) {
            defpackage.d.w(TtmlNode.RUBY_DELIMITER);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        if (strArr.length > 0) {
            sb2.append((CharSequence) strArr[0]);
            for (int i = 1; i < strArr.length; i++) {
                sb2.append((CharSequence) strDecrypt);
                sb2.append((CharSequence) strArr[i]);
            }
        }
        sb.append(sb2.toString());
        sb.append(StringFog.decrypt("ozI=\n", "ihI5rtiKlqk=\n"));
        C0953 c0953 = this.f3284;
        sb.append(c0953 != null ? c0953.toString() : StringFog.decrypt("X+Xv\n", "JMWS1b0oRTU=\n"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C1033 m838(C0890 c0890, C0890 c0891, C1199 c1199, List list) {
        HashMap map;
        List listAsList = Arrays.asList(this.f3285);
        if (list.size() != listAsList.size()) {
            AbstractC0914.m680(c1199.m877(), this.f3287 + StringFog.decrypt("1oVivfB9QE6TkHes+2ZBCtY=\n", "9ugHyZgSJG4=\n") + listAsList.size() + StringFog.decrypt("lyKouzlmVg3DMPq+OX8TEdIgv7U6bldD\n", "t0Pa3EwLM2M=\n") + list.size(), null, null);
            map = null;
        } else {
            HashMap map2 = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                map2.put((String) listAsList.get(i), list.get(i));
            }
            map = map2;
        }
        C0890 c0892 = new C0890(map, c0891, this, c0890, c0891 == null);
        C0953 c0953 = this.f3284;
        if (c0953 != null) {
            return c0953.m533(c0892, c1199);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("0NoRuRfdza3jxwi/C5qErvDcC7kB3YM=\n", "lahj1mX9pMM=\n"));
        sb.append(this.f3287);
        new C1292(c1199, c0892, AbstractC1156.m868("DY5OMwjLYRVOlAY/Hp9nD0bYTjwC23A=\n", "KrRuXm2/CXo=\n", sb), null).m614(c1199.m877());
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public C1130(C0774 c0774, String str, JSONObject jSONObject, C1130 c1130) {
        ArrayList arrayList;
        this.f3286 = c0774;
        this.f3287 = AbstractC0475.m485(str);
        this.f3283 = c1130;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(StringFog.decrypt("JGwcJQ==\n", "RR57Vv4Lxhs=\n"));
        if (jSONArrayOptJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strM485 = AbstractC0475.m485(jSONArrayOptJSONArray.optString(i));
                if (strM485 != null) {
                    arrayList.add(strM485);
                }
            }
        } else {
            arrayList = null;
        }
        String[] strArr = new String[arrayList.size()];
        this.f3285 = strArr;
        arrayList.toArray(strArr);
        String str2 = c0774.f2048;
        String str3 = c0774.f2049;
        try {
            this.f3284 = AbstractC0963.m737(str2, str, jSONObject.optString(StringFog.decrypt("wKhVcQ==\n", "oscxCAkiMt0=\n")));
        } catch (C0918 e) {
            new C1142(str2, str3, str, m837(), StringFog.decrypt("/rgn4AWgc4zJuTzhEKBuiM+iOutXpw==\n", "u8pVj3eAA+0=\n") + this.f3287 + StringFog.decrypt("b0eVe2B+pT0tRw==\n", "SGf0D0ASzFM=\n") + (m837() + e.f2427) + StringFog.decrypt("BDs=\n", "PhuhXZIfoo8=\n") + e.getMessage(), e).m614(str2);
        } catch (Throwable th) {
            String str4 = StringFog.decrypt("wk/GZFo6bLT1Tt1lTzpxsPNV228IPQ==\n", "hz20CygaHNU=\n") + this.f3287 + StringFog.decrypt("qE+I\n", "j3WoV2pAQXU=\n") + th.getMessage();
            AbstractC0914.m680(str2, str4, th, new C1142(str2, str3, str, m837(), str4));
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m837() {
        if (this.f3282 == -1) {
            C1130 c1130 = this.f3283;
            if (c1130 == null) {
                this.f3282 = 1;
            } else {
                int iM837 = c1130.m837();
                C0953 c0953 = this.f3283.f3284;
                this.f3282 = iM837 + (c0953 != null ? c0953.mo390() : 1) + 1;
            }
        }
        return this.f3282;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final C1033 m839(C0890 c0890, C1199 c1199, List list) {
        return m838(c0890, c0890.f2386, c1199, list);
    }
}
