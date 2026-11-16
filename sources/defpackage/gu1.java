package defpackage;

import com.tiktok.appevents.contents.TTContentsEventConstants;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gu1 {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;

    public gu1(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLASS_NAME);
        string.getClass();
        this.a = string;
        this.b = jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_INDEX, -1);
        this.c = jSONObject.optInt("id");
        String strOptString = jSONObject.optString("text");
        strOptString.getClass();
        this.d = strOptString;
        String strOptString2 = jSONObject.optString("tag");
        strOptString2.getClass();
        this.e = strOptString2;
        String strOptString3 = jSONObject.optString(TTContentsEventConstants.Params.EVENT_PROPERTY_DESCRIPTION);
        strOptString3.getClass();
        this.f = strOptString3;
        String strOptString4 = jSONObject.optString("hint");
        strOptString4.getClass();
        this.g = strOptString4;
        this.h = jSONObject.optInt("match_bitmask");
    }
}
