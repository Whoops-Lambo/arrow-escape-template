package com.adsurge.adn.p021f1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.adsurge.adn.X.C;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.Y0.e;
import com.adsurge.adn.s1.a;
import com.adsurge.adn.w1.b;
import com.safedk.android.utils.Logger;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class o {
    public static final String[] a = {"tbopen://m.taobao.com", "taobao://m.taobao.com"};
    public static final Map b = new HashMap(2);
    public static long c;

    public static Intent a(Context context, String str, boolean z, String str2) {
        Intent intent;
        if (context == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        if (z && C.a(uri)) {
            if (TextUtils.isEmpty(str2)) {
                str2 = (String) b.get(uri.getScheme() + "://" + uri.getAuthority());
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
            }
            intent = new Intent();
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
        } else if ("intent".equals(uri.getScheme())) {
            try {
                intent = Intent.parseUri(str, 1);
            } catch (URISyntaxException unused) {
                return null;
            }
        } else if ("android-app".equals(uri.getScheme())) {
            try {
                intent = Intent.parseUri(str, 2);
            } catch (URISyntaxException unused2) {
                return null;
            }
        } else {
            intent = new Intent();
            intent.setData(uri);
            intent.setAction("android.intent.action.VIEW");
        }
        if (!TextUtils.isEmpty(str2)) {
            intent.setPackage(str2);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public static boolean b(Context context, Intent intent) {
        if (context != null && intent != null) {
            try {
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                return true;
            } catch (Exception e) {
                e eVar = new e(9120011);
                d dVar = new d();
                dVar.a(CmcdConfiguration.KEY_OBJECT_TYPE, e.toString());
                eVar.a(dVar);
                b.a(eVar);
            }
        }
        return false;
    }

    public static void safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(Activity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        p0.startActivity(p1);
    }

    static {
        JSONObject jSONObjectA = new com.adsurge.adn.I0.e(com.adsurge.adn.N.b.a("dphp", "{\"https://play.google.com\":\"com.android.vending\"}")).a();
        Iterator<String> itKeys = jSONObjectA.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            b.put(next, jSONObjectA.optString(next));
        }
        c = 0L;
    }

    public static Pair c(Context context, Intent intent) {
        if (context == null || intent == null) {
            return new Pair(Boolean.FALSE, "context or intent is null");
        }
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return new Pair(Boolean.TRUE, "");
        } catch (Exception e) {
            return new Pair(Boolean.FALSE, e.toString());
        }
    }

    public static Intent b(Context context, String str, String str2) {
        return a(context, str, true, str2);
    }

    public static Intent c(Context context, String str) {
        return a(context, str, false);
    }

    public static Intent b(Context context, String str) {
        return a(context, str, true);
    }

    public static Intent a(Context context, String str, boolean z) {
        return a(context, str, z, null);
    }

    public static Intent a(Context context, String str) {
        if (TextUtils.isEmpty(str) || a.b().c().a("ecglifp", 1) != 1) {
            return null;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
        }
        return launchIntentForPackage;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intentB = !TextUtils.isEmpty(str2) ? b(context, str2) : null;
        Intent intent = a(context, intentB) != null ? intentB : null;
        return intent == null ? a(context, str) : intent;
    }

    public static ResolveInfo a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return null;
        }
        return context.getPackageManager().resolveActivity(intent, 65536);
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Context contextA = a.b().a();
            if (contextA == null) {
                return false;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(str);
            if (contextA.getPackageManager().resolveActivity(intent, 0) != null) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static Pair a(Activity activity, Intent intent) {
        if (activity != null && intent != null) {
            try {
                safedk_Activity_startActivityForResult_206f42f0b65887e835d87ee52d14d221(activity, intent, 0);
                return new Pair(Boolean.TRUE, "");
            } catch (Exception e) {
                return new Pair(Boolean.FALSE, e.toString());
            }
        }
        return new Pair(Boolean.FALSE, "activity or intent is null");
    }
}
