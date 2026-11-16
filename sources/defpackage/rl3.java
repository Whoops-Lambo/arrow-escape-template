package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzear;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.consent_sdk.zzpv;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.play_billing.zzfc;
import com.google.android.recaptcha.internal.zzln;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class rl3 {
    public static int f(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int v(int i, int i2, int i3, int i4, int i5) {
        return i + i2 + i3 + i4 + i5;
    }

    public static int x(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static /* synthetic */ int a(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        d.p("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static /* bridge */ /* synthetic */ int b(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        d.p("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static Bundle g(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static void l(int i, int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        zzeh.c(str2, sb.toString());
    }

    public static int c(int i, int i2) {
        return String.valueOf(i).length() + i2;
    }

    public static int d(int i, int i2, int i3) {
        return zzada.b(i) + i2 + i3;
    }

    public static int e(int i, int i2, int i3, int i4) {
        return zzada.b(i) + i2 + i3 + i4;
    }

    public static IObjectWrapper h(Parcel parcel) {
        IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperR;
    }

    public static IObjectWrapper i(Parcel parcel, Parcel parcel2) {
        IObjectWrapper iObjectWrapperR = IObjectWrapper.Stub.r(parcel.readStrongBinder());
        zzbfh.f(parcel2);
        return iObjectWrapperR;
    }

    public static zzaef j(zzaef zzaefVar) {
        int size = zzaefVar.size();
        return zzaefVar.zzg(size + size);
    }

    public static String k(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static void m(int i, String str, String str2, String str3, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
    }

    public static void n(String str, zzear zzearVar) {
        zzearVar.c(zzt.zzk().currentTimeMillis(), str);
    }

    public static void o(String str, String str2, String str3) {
        zzeh.c(str3, str2.concat(String.valueOf(str)));
    }

    public static void p(String str, String str2, StringBuilder sb, String str3) {
        sb.append(str);
        sb.append(StringFog.decrypt(str2, str3));
    }

    public static void q(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        zzeh.c(str2, sb.toString());
    }

    public static void r(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static boolean s(JSONObject jSONObject, String str, Boolean bool) {
        return bool.equals(Boolean.valueOf(jSONObject.optBoolean(str)));
    }

    public static int t(int i, int i2, int i3) {
        return zzaky.u(i) + i2 + i3;
    }

    public static int u(int i, int i2, int i3, int i4) {
        return zzfc.x(i) + i2 + i3 + i4;
    }

    public static int w(int i, int i2, int i3) {
        return zzfc.x(i) + i2 + i3;
    }

    public static int y(int i, int i2, int i3) {
        return zzln.zzA(i) + i2 + i3;
    }

    public static int z(int i, int i2, int i3) {
        return zzpv.c(i) + i2 + i3;
    }
}
