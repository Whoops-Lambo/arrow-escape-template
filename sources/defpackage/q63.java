package defpackage;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RelativeLayout;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.bytedance.sdk.component.adexpress.dynamic.uq.fi;
import com.google.android.exoplayer2.util.Log;
import com.inmobi.media.AbstractC4230n1;
import com.inmobi.media.Z9;
import com.ironsource.adqualitysdk.sdk.i.AbstractC0529;
import com.ironsource.sdk.utils.Logger;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import com.mbridge.msdk.video.bt.component.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class q63 {
    public static void A(ArrayList arrayList, String str, String str2) {
        arrayList.add(new Pair(str, str2));
    }

    public static void C(String str, AbstractC4230n1 abstractC4230n1, Z9 z9, String str2) {
        z9.c(str2, str + abstractC4230n1);
    }

    public static void D(String str, String str2, String str3) {
        q0.a(str3, str + str2);
    }

    public static GradientDrawable b(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i);
        return gradientDrawable;
    }

    public static RelativeLayout.LayoutParams c(int i, int i2, int i3) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
        layoutParams.addRule(i3);
        return layoutParams;
    }

    public static String f(int i, String str, String str2, String str3) {
        return str + i + str2 + str3;
    }

    public static String i(String str, String str2, String str3) {
        return AbstractC0529.m515(str, str2, new StringBuilder(), str3);
    }

    public static /* synthetic */ String k(CharSequence[] charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb.append(charSequenceArr[0]);
            for (int i = 1; i < charSequenceArr.length; i++) {
                sb.append((CharSequence) ",");
                sb.append(charSequenceArr[i]);
            }
        }
        return sb.toString();
    }

    public static HashMap m(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static JSONArray n(String str, JSONObject jSONObject) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static JSONObject o(m5 m5Var, String str) {
        return m5Var.a(str, new JSONObject());
    }

    public static void t(String str, AbstractC4230n1 abstractC4230n1, Z9 z9, String str2) {
        z9.a(str2, str + abstractC4230n1);
    }

    public static void u(String str, String str2, p pVar, String str3) {
        pVar.a(str3, str + str2);
    }

    public static void v(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    public static void w(String str, String str2, String str3, String str4) {
        Logger.i(str4, str + str2 + str3);
    }

    public static boolean B(fi fiVar, String str) {
        return TextUtils.equals(fiVar.ra().ahm(), str);
    }

    public static int a(int i, int i2, String str) {
        return str.length() + i + i2;
    }

    public static b d() {
        return b.a(c.n().d());
    }

    public static g e(i iVar) {
        return iVar.f(c.n().b());
    }

    public static String g(long j, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String h(Number number, String str) {
        return number.getClass().getName().concat(str);
    }

    public static String j(String str, Map map) {
        return String.valueOf(map.get(com.mbridge.msdk.config.component.common.util.c.c(str)));
    }

    public static StringBuilder l(Throwable th, a aVar, Object obj, String str) {
        aVar.a(obj, th.getMessage());
        return new StringBuilder(str);
    }

    public static void p(int i, int i2, int i3, HashMap map, String str) {
        map.put(str, Integer.valueOf(Color.rgb(i, i2, i3)));
    }

    public static void q(MaxAdFormat maxAdFormat, StringBuilder sb, String str) {
        sb.append(maxAdFormat.getLabel());
        sb.append(str);
    }

    public static void r(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        q0.b(str, sb.toString());
    }

    public static void s(Exception exc, StringBuilder sb, String str, Exception exc2) {
        sb.append(exc.getMessage());
        q0.b(str, sb.toString(), exc2);
    }

    public static void x(StringBuilder sb, String str, p pVar, String str2) {
        sb.append(str);
        pVar.a(str2, sb.toString());
    }

    public static void y(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void z(Throwable th, StringBuilder sb, String str) {
        sb.append(th.getMessage());
        q0.a(str, sb.toString());
    }
}
