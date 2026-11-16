package defpackage;

import android.os.HandlerThread;
import android.util.Log;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.p;
import com.applovin.mediation.MaxAdListener;
import com.ironsource.D5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.l;
import com.mbridge.msdk.foundation.tools.v0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class jc1 {
    public static int B(int i, int i2, int i3, int i4) {
        return i4 - ((i + i2) * i3);
    }

    public static int e(int i, int i2, int i3, int i4) {
        return ((i / i2) * i3) + i4;
    }

    public static final String a(int i) {
        int i2 = in1.$EnumSwitchMapping$0[h50.C(i)];
        if (i2 == 1) {
            return "integrity_detect";
        }
        if (i2 == 2) {
            return "app_event_pred";
        }
        e.b();
        return null;
    }

    public static final String b(int i) {
        int i2 = in1.$EnumSwitchMapping$0[h50.C(i)];
        if (i2 == 1) {
            return "MTML_INTEGRITY_DETECT";
        }
        if (i2 == 2) {
            return "MTML_APP_EVENT_PRED";
        }
        e.b();
        return null;
    }

    public static HandlerThread h(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread;
    }

    public static l i(String str) {
        return new l.b(str).a();
    }

    public static String k(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String l(long j, String str) {
        return str + j;
    }

    public static String n(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static StringBuilder s(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static void x(String str, String str2, String str3) {
        Log.e(str3, str + str2);
    }

    public static void A(StringBuilder sb, List list, String str, List list2, String str2) {
        sb.append(list);
        sb.append(str);
        sb.append(list2);
        sb.append(str2);
    }

    public static int c(float f) {
        return v0.a(c.n().d(), f);
    }

    public static int d(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int f(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int g(d31 d31Var, int i, int i2) {
        return (d31Var.hashCode() + i) * i2;
    }

    public static String j(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String m(long j, String str, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String o(String str, String str2, StringBuilder sb, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String p(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String r(StringBuilder sb, Map map, char c) {
        sb.append(map);
        sb.append(c);
        return sb.toString();
    }

    public static void u(int i, HashMap map, String str, int i2, String str2) {
        map.put(str, Integer.valueOf(i));
        map.put(str2, Integer.valueOf(i2));
    }

    public static void v(D5 d5, Set set) {
        set.add(Integer.valueOf(d5.c()));
    }

    public static void w(String str, int i, RelativeLayout.LayoutParams layoutParams, int i2) {
        layoutParams.addRule(i2, str.substring(i).hashCode());
    }

    public static void y(StringBuilder sb, MaxAdListener maxAdListener, p pVar, String str) {
        sb.append(maxAdListener);
        pVar.a(str, sb.toString());
    }

    public static void z(StringBuilder sb, String str, String str2, IronLog ironLog) {
        sb.append(str);
        sb.append(str2);
        ironLog.verbose(sb.toString());
    }
}
