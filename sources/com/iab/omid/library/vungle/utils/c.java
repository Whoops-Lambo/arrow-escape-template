package com.iab.omid.library.vungle.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.adsession.OutputDeviceStatus;
import com.ironsource.C4664b4;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rl3;
import defpackage.vq2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class c {
    private static final ExecutorService a = Executors.newSingleThreadExecutor();
    private static WindowManager b = null;
    private static volatile Point c = null;
    private static DisplayManager.DisplayListener d = null;
    private static String[] e = {"x", "y", "width", "height"};
    public static float f = Resources.getSystem().getDisplayMetrics().density;

    public static boolean h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Point pointC = c.c();
            if (pointC == null) {
                return;
            }
            Point unused = c.c = pointC;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            c.d();
        }
    }

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class C0354c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d {
        public final float a;
        public final float b;

        public d(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!h(jSONArrayOptJSONArray.optJSONObject(i), jSONArrayOptJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 == null) {
            return true;
        }
        if (!a(jSONArrayOptJSONArray, jSONArrayOptJSONArray2)) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (!jSONArrayOptJSONArray.optString(i, "").equals(jSONArrayOptJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return rl3.s(jSONObject2, "hasWindowFocus", Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return rl3.s(jSONObject2, "noOutputDevice", Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : e) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static void a(JSONObject jSONObject, com.iab.omid.library.vungle.walking.a.C0355a c0355a) {
        com.iab.omid.library.vungle.internal.e eVarA = c0355a.a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> arrayListB = c0355a.b();
        int size = arrayListB.size();
        int i = 0;
        while (i < size) {
            String str = arrayListB.get(i);
            i++;
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", eVarA.d());
            jSONObject.put("friendlyObstructionPurpose", eVarA.b());
            jSONObject.put("friendlyObstructionReason", eVarA.a());
        } catch (JSONException e2) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting friendly obstruction", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d() {
        a.submit(new a());
    }

    private static void b(Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return;
        }
        a(displayManager);
        b bVar = new b();
        d = bVar;
        displayManager.registerDisplayListener(bVar, null);
    }

    public static void b(JSONObject jSONObject, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                jSONObject.put("isPipActive", bool);
            } catch (JSONException e2) {
                com.iab.omid.library.vungle.utils.d.a("Error with setting is picture-in-picture active", e2);
            }
        }
    }

    public static void c(JSONObject jSONObject) {
        d dVarA = a(jSONObject);
        try {
            jSONObject.put("width", dVarA.a);
            jSONObject.put("height", dVarA.b);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e2) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting not visible reason", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static Point c() {
        if (b == null) {
            return null;
        }
        Point point = new Point(0, 0);
        b.getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static Map<String, String> b(JSONObject jSONObject) {
        try {
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    map.put(next, (String) obj);
                }
            }
            return map;
        } catch (Exception e2) {
            vq2.n("Failed to parse JSON to Map", e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001d  */
    private static d a(JSONObject jSONObject) {
        float fA;
        float fA2;
        if (b == null) {
            fA = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            fA2 = 0.0f;
        } else {
            Point pointC = c;
            if (pointC == null) {
                pointC = c();
                c = pointC;
            }
            if (pointC != null) {
                fA = a(pointC.x);
                fA2 = a(pointC.y);
            } else {
                fA = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                fA2 = 0.0f;
            }
        }
        return new d(fA, fA2);
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i2));
            jSONObject.put("width", a(i3));
            jSONObject.put("height", a(i4));
            return jSONObject;
        } catch (JSONException e2) {
            com.iab.omid.library.vungle.utils.d.a("Error with creating viewStateObject", e2);
            return jSONObject;
        }
    }

    public static void a(Context context) {
        if (context != null) {
            f = context.getResources().getDisplayMetrics().density;
            b = (WindowManager) context.getSystemService("window");
            c = null;
            d();
            b(context);
        }
    }

    private static void a(DisplayManager displayManager) {
        DisplayManager.DisplayListener displayListener = d;
        if (displayListener != null) {
            displayManager.unregisterDisplayListener(displayListener);
            d = null;
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e2) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting output device status", e2);
        }
    }

    public static float a(int i) {
        return i / f;
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e2) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting has window focus", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e2) {
            com.iab.omid.library.vungle.utils.d.a("Error with setting ad session id", e2);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e2) {
            com.iab.omid.library.vungle.utils.d.a("JSONException during JSONObject.put for name [" + str + C4664b4.j.e, e2);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childViews");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
                jSONObject.put("childViews", jSONArrayOptJSONArray);
            }
            jSONArrayOptJSONArray.put(jSONObject2);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return C0354c.a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
