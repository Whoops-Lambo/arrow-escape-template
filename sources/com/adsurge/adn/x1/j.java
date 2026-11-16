package com.adsurge.adn.x1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.singular.sdk.internal.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class j {
    public static volatile a a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        public String a;
        public String[] b;
        public String c;
        public long d;
    }

    public static boolean b(long j) {
        if (j <= 0) {
            return false;
        }
        if (a == null) {
            c();
        }
        return a != null && a.d == j;
    }

    public static synchronized void c() {
        byte[] bArrDecode;
        if (a != null) {
            return;
        }
        String strB = com.adsurge.adn.s1.a.b().c().b("smfs");
        if (TextUtils.isEmpty(strB) && (bArrDecode = Base64.decode("W3sibSI6MSwibiI6IkhVQVdFSSIsInAiOiJjb20uaHVhd2VpLmFwcG1hcmtldCJ9LHsibSI6MiwibiI6IlhJQU9NSSIsInAiOiJjb20ueGlhb21pLm1hcmtldCxjb20ueGlhb21pLm1pcGlja3MifSx7Im0iOjQsIm4iOiJPUFBPIiwicCI6ImNvbS5vcHBvLm1hcmtldCxjb20uaGV5dGFwLm1hcmtldCJ9LHsibSI6OCwibiI6IlZJVk8iLCJwIjoiY29tLmJiay5hcHBzdG9yZSJ9LHsibSI6MTYsIm4iOiJIT05PUiIsInAiOiJjb20uaGlob25vci5hcHBtYXJrZXQsY29tLmh1YXdlaS5hcHBtYXJrZXQifSx7Im0iOjMyLCJuIjoiU0FNU1VORyIsInAiOiJjb20uc2VjLmFuZHJvaWQuYXBwLnNhbXN1bmdhcHBzIiwidSI6InNhbXN1bmdhcHBzOi8vUHJvZHVjdERldGFpbC8lcyJ9LHsibSI6NjQsIm4iOiJNRUlaVSIsInAiOiJjb20ubWVpenUubXN0b3JlIn0seyJtIjoxMjgsIm4iOiJaVEUiLCJwIjoienRlLmNvbS5tYXJrZXQifSx7Im0iOjI1NiwibiI6IlJFRE1JIiwicCI6ImNvbS54aWFvbWkubWFya2V0LGNvbS54aWFvbWkubWlwaWNrcyJ9LHsibSI6NTEyLCJuIjoiTlVCSUEiLCJwIjoiY29tLm51YmlhLm5lb3N0b3JlIn0seyJtIjoxMDI0LCJuIjoiUkVBTE1FIiwicCI6ImNvbS5vcHBvLm1hcmtldCxjb20uaGV5dGFwLm1hcmtldCJ9LHsibSI6MjA0OCwibiI6Ik9ORVBMVVMiLCJwIjoiY29tLm9wcG8ubWFya2V0LGNvbS5oZXl0YXAubWFya2V0In0seyJtIjo0MDk2LCJuIjoiMzYwIiwicCI6ImNvbS5xaWhvby5hcHBzdG9yZSxjb20ubWFya2V0LmNoZW54aWFuZyJ9XQ==", 0)) != null) {
            strB = new String(bArrDecode, com.adsurge.adn.B0.a.a);
        }
        try {
            JSONArray jSONArray = new JSONArray(strB);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    a aVar = new a();
                    aVar.a = jSONObjectOptJSONObject.optString("n");
                    String strOptString = jSONObjectOptJSONObject.optString("p");
                    if (strOptString != null) {
                        aVar.b = strOptString.split(",");
                    }
                    aVar.c = jSONObjectOptJSONObject.optString(Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, "market://details?id=%s");
                    aVar.d = jSONObjectOptJSONObject.optLong("m");
                    if (TextUtils.isEmpty(aVar.a)) {
                        continue;
                    } else {
                        String[] strArrSplit = aVar.a.split(",");
                        if (strArrSplit.length > 0) {
                            for (String str : strArrSplit) {
                                if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(Build.MANUFACTURER)) {
                                    a = aVar;
                                    return;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        } catch (JSONException e) {
            e.getMessage();
        }
    }

    public static boolean d() {
        return b(8L);
    }

    public static Intent a(Context context, String str, long j) {
        if (!TextUtils.isEmpty(str) && a(j)) {
            String[] strArr = a.b;
            String str2 = a.c;
            if (strArr != null) {
                for (String str3 : strArr) {
                    if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(str2, str)));
                        intent.setPackage(str3);
                        intent.addFlags(268435456);
                        Intent intentA = a(context, intent);
                        if (intentA != null) {
                            return intentA;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static String[] b() {
        if (a == null) {
            c();
        }
        if (a == null) {
            return null;
        }
        return a.b;
    }

    public static long a() {
        if (a == null) {
            c();
        }
        if (a == null) {
            return 0L;
        }
        return a.d;
    }

    public static Intent a(Context context, Intent intent) {
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            return intent;
        }
        return null;
    }

    public static boolean a(long j) {
        if (j <= 0) {
            return false;
        }
        if (a == null) {
            c();
        }
        return a != null && (j & a.d) > 0;
    }
}
