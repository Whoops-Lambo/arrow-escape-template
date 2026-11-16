package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.webkit.CookieManager;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.ironsource.C4664b4;
import com.ironsource.C4682c4;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.ak1;
import defpackage.dk2;
import defpackage.e32;
import defpackage.er;
import defpackage.k7;
import defpackage.lz;
import defpackage.mz;
import defpackage.ng1;
import defpackage.nq2;
import defpackage.pv1;
import defpackage.s71;
import defpackage.v7;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v0 {
    public static volatile int a = 0;
    public static volatile long b = -1;
    public static volatile long c = -1;
    public static volatile long d = -1;
    public static volatile String e = "";
    public static volatile String f = "";
    public static volatile String g = "NoCarrier";
    public static volatile String h = "";
    public static volatile Locale i;
    public static final /* synthetic */ int j = 0;

    public static final String X(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(er.a);
        bytes.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            bArrDigest.getClass();
            for (byte b2 : bArrDigest) {
                sb.append(Integer.toHexString((b2 >> 4) & 15));
                sb.append(Integer.toHexString(b2 & 15));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static final Method t(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static final Object z(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static final boolean A() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("fb%s://applinks", Arrays.copyOf(new Object[]{com.facebook.a0.b()}, 1))));
            Context contextA = com.facebook.a0.a();
            PackageManager packageManager = contextA.getPackageManager();
            String packageName = contextA.getPackageName();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            listQueryIntentActivities.getClass();
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (s71.b(packageName, it.next().activityInfo.packageName)) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final boolean C(Uri uri) {
        return uri != null && "content".equalsIgnoreCase(uri.getScheme());
    }

    public static final boolean D() {
        if (!lz.a.contains(v0.class)) {
            try {
                JSONObject jSONObjectR = r();
                if (jSONObjectR != null) {
                    try {
                        JSONArray jSONArray = jSONObjectR.getJSONArray("data_processing_options");
                        int length = jSONArray.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            String string = jSONArray.getString(i2);
                            string.getClass();
                            String lowerCase = string.toLowerCase();
                            lowerCase.getClass();
                            if (lowerCase.equals("ldu")) {
                                return true;
                            }
                        }
                    } catch (Exception unused) {
                        com.facebook.a0 a0Var = com.facebook.a0.a;
                    }
                }
            } catch (Throwable th) {
                lz.a(v0.class, th);
                return false;
            }
        }
        return false;
    }

    public static final boolean E(Uri uri) {
        return uri != null && "file".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean F(Context context) {
        Method methodU = u("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodU != null) {
            Object objZ = z(null, methodU, context);
            if ((objZ instanceof Integer) && objZ.equals(0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean G(String str) {
        return str == null || str.length() == 0;
    }

    public static final boolean H(Uri uri) {
        if (uri != null) {
            return com.safedk.android.analytics.brandsafety.creatives.g.e.equalsIgnoreCase(uri.getScheme()) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(uri.getScheme()) || "fbstaging".equalsIgnoreCase(uri.getScheme());
        }
        return false;
    }

    public static final ArrayList I(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        return arrayList;
    }

    public static final void N(Object obj, String str) {
        if (obj != null) {
            return;
        }
        defpackage.d.w(pv1.n("Argument '", str, "' cannot be null"));
    }

    public static final void O(String str, String str2) {
        if (str == null || str.length() <= 0) {
            ak1.n(pv1.n("Argument '", str2, "' cannot be null or empty"));
        }
    }

    public static final Bundle P(String str) {
        Bundle bundle = new Bundle();
        if (!G(str)) {
            if (str == null) {
                e32.i("Required value was null.");
                return null;
            }
            for (String str2 : (String[]) dk2.n0(str, new String[]{C4664b4.j.c}, 0, 6).toArray(new String[0])) {
                String[] strArr = (String[]) dk2.n0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                try {
                    if (strArr.length == 2) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), URLDecoder.decode(strArr[1], "UTF-8"));
                    } else if (strArr.length == 1) {
                        bundle.putString(URLDecoder.decode(strArr[0], "UTF-8"), "");
                    }
                } catch (UnsupportedEncodingException unused) {
                    com.facebook.a0 a0Var = com.facebook.a0.a;
                }
            }
        }
        return bundle;
    }

    public static final String T(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new BufferedInputStream(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 == -1) {
                    String string = sb.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb.append(cArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nq2.e(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static final void U() {
        if (!com.facebook.a0.r.get()) {
            throw new com.facebook.c0("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void W(Context context, JSONObject jSONObject) throws JSONException {
        Locale locale;
        int i2;
        int i3;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        int i4 = 0;
        if (b == -1 || System.currentTimeMillis() - b >= 1800000) {
            b = System.currentTimeMillis();
            try {
                TimeZone timeZone = TimeZone.getDefault();
                String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
                displayName.getClass();
                e = displayName;
                String id = timeZone.getID();
                id.getClass();
                f = id;
            } catch (AssertionError unused) {
            } catch (Exception unused2) {
                com.facebook.a0 a0Var = com.facebook.a0.a;
            }
            if (g.equals("NoCarrier")) {
                try {
                    Object systemService = context.getSystemService("phone");
                    systemService.getClass();
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    networkOperatorName.getClass();
                    g = networkOperatorName;
                } catch (Exception unused3) {
                    com.facebook.a0 a0Var2 = com.facebook.a0.a;
                }
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
                }
                c = Math.round(c / 1.073741824E9d);
            } catch (Exception unused4) {
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
                    d = ((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize());
                }
                d = Math.round(d / 1.073741824E9d);
            } catch (Exception unused5) {
            }
        }
        String packageName = context.getPackageName();
        int i5 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo == null) {
                return;
            }
            i5 = packageInfo.versionCode;
            h = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused6) {
        }
        jSONArray.put(packageName);
        jSONArray.put(i5);
        jSONArray.put(h);
        jSONArray.put(Build.VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().getLocales().get(0);
        } catch (Exception unused7) {
            locale = Locale.getDefault();
        }
        i = locale;
        StringBuilder sb = new StringBuilder();
        Locale locale2 = i;
        String language = locale2 != null ? locale2.getLanguage() : null;
        if (language == null) {
            language = "";
        }
        sb.append(language);
        sb.append('_');
        Locale locale3 = i;
        String country = locale3 != null ? locale3.getCountry() : null;
        sb.append(country != null ? country : "");
        jSONArray.put(sb.toString());
        jSONArray.put(e);
        jSONArray.put(g);
        double d2 = 0.0d;
        try {
            Object systemService2 = context.getSystemService("display");
            DisplayManager displayManager = systemService2 instanceof DisplayManager ? (DisplayManager) systemService2 : null;
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                display.getMetrics(displayMetrics);
                int i6 = displayMetrics.widthPixels;
                try {
                    i4 = displayMetrics.heightPixels;
                    d2 = displayMetrics.density;
                } catch (Exception unused8) {
                }
                i2 = i4;
                i4 = i6;
            } else {
                i2 = 0;
            }
        } catch (Exception unused9) {
        }
        jSONArray.put(i4);
        jSONArray.put(i2);
        jSONArray.put(new DecimalFormat("#.##").format(d2));
        if (a > 0) {
            i3 = a;
        } else {
            try {
                File[] fileArrListFiles = new File("/sys/devices/system/cpu/").listFiles(new mz(9));
                if (fileArrListFiles != null) {
                    a = fileArrListFiles.length;
                }
            } catch (Exception unused10) {
                com.facebook.a0 a0Var3 = com.facebook.a0.a;
            }
            if (a <= 0) {
                a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            }
            i3 = a;
        }
        jSONArray.put(i3);
        jSONArray.put(c);
        jSONArray.put(d);
        jSONArray.put(f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    public static final void Y(Parcel parcel, Map map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public static final boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static final Uri b(String str, Bundle bundle, String str2) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(HttpRequest.DEFAULT_SCHEME);
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        Uri uriBuild = builder.build();
        uriBuild.getClass();
        return uriBuild;
    }

    public static final void d(Context context) {
        try {
            c("facebook.com");
            c(".facebook.com");
            c("https://facebook.com");
            c("https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static final void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final HashSet g(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            String string = jSONArray.getString(i2);
            string.getClass();
            hashSet.add(string);
        }
        return hashSet;
    }

    public static final ArrayList h(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = jSONArray.getString(i2);
                string.getClass();
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static final HashMap j(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                next.getClass();
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final int k(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[8192];
            int i2 = 0;
            while (true) {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 == -1) {
                    bufferedInputStream.close();
                    return i2;
                }
                outputStream.write(bArr, 0, i3);
                i2 += i3;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nq2.e(bufferedInputStream, th);
                throw th2;
            }
        }
    }

    public static final void l(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public static final String n(Context context) {
        if (context == null) {
            return "null";
        }
        return context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    public static final String o(Context context) {
        try {
            com.facebook.a0 a0Var = com.facebook.a0.a;
            U();
            String str = com.facebook.a0.e;
            if (str != null) {
                return str;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i2 = applicationInfo.labelRes;
            if (i2 == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i2);
            string.getClass();
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final Date p(Bundle bundle, String str, Date date) {
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                jLongValue = Long.parseLong((String) obj);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date((jLongValue * 1000) + date.getTime());
    }

    public static final JSONObject r() {
        if (lz.a.contains(v0.class)) {
            return null;
        }
        try {
            String string = com.facebook.a0.a().getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).getString("data_processing_options", null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.a0 a0Var = com.facebook.a0.a;
                }
            }
            return null;
        } catch (Throwable th) {
            lz.a(v0.class, th);
            return null;
        }
    }

    public static final boolean B(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            str.getClass();
            Pattern patternCompile = Pattern.compile(".+_cheets|cheets_.+");
            patternCompile.getClass();
            if (patternCompile.matcher(str).matches()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final HashMap J(String str) {
        if (str.length() == 0) {
            return new HashMap();
        }
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                next.getClass();
                String string = jSONObject.getString(next);
                string.getClass();
                map.put(next, string);
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public static final String K(Map map) {
        map.getClass();
        String string = "";
        if (map.isEmpty()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
            string = jSONObject.toString();
        } catch (JSONException unused) {
        }
        string.getClass();
        return string;
    }

    public static final void L(String str, String str2) {
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        ak1.n(pv1.n("Argument '", str2, "' cannot be empty"));
    }

    public static final void M(com.facebook.m0 m0Var) {
        m0Var.getClass();
        Iterator it = m0Var.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                defpackage.d.w("Container 'requests' cannot contain null values");
                return;
            }
        }
        if (!m0Var.isEmpty()) {
            return;
        }
        ak1.n("Container 'requests' cannot be empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Q(Bundle bundle, JSONArray jSONArray) {
        bundle.getClass();
        if (jSONArray instanceof boolean[]) {
            bundle.putBooleanArray(C4664b4.i.I0, (boolean[]) jSONArray);
            return;
        }
        if (jSONArray instanceof double[]) {
            bundle.putDoubleArray(C4664b4.i.I0, (double[]) jSONArray);
            return;
        }
        if (jSONArray instanceof int[]) {
            bundle.putIntArray(C4664b4.i.I0, (int[]) jSONArray);
        } else if (jSONArray instanceof long[]) {
            bundle.putLongArray(C4664b4.i.I0, (long[]) jSONArray);
        } else {
            bundle.putString(C4664b4.i.I0, jSONArray.toString());
        }
    }

    public static final void R(String str, Bundle bundle, String str2) {
        if (!G(str2)) {
            bundle.putString(str, str2);
        }
    }

    public static final HashMap S(Parcel parcel) {
        int i2 = parcel.readInt();
        if (i2 < 0) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i3 = 0; i3 < i2; i3++) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (string != null && string2 != null) {
                map.put(string, string2);
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    public static final void V(JSONObject jSONObject, e eVar, String str, boolean z, Context context) throws JSONException {
        Boolean boolValueOf;
        Object objN;
        String strK;
        Object obj;
        context.getClass();
        z zVar = z.ServiceUpdateCompliance;
        if (!b0.b(zVar)) {
            jSONObject.put("anon_id", str);
        }
        jSONObject.put("application_tracking_enabled", !z);
        com.facebook.a0 a0Var = com.facebook.a0.a;
        jSONObject.put("advertiser_id_collection_enabled", com.facebook.w0.b());
        Object objN2 = null;
        if (!lz.a.contains(com.facebook.w0.class)) {
            try {
                com.facebook.w0.a.e();
                SharedPreferences sharedPreferences = com.facebook.w0.i;
                if (sharedPreferences != null) {
                    if (sharedPreferences.contains("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp")) {
                        SharedPreferences sharedPreferences2 = com.facebook.w0.i;
                        if (sharedPreferences2 != null) {
                            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp", false));
                        } else {
                            s71.D("userSettingPref");
                            throw null;
                        }
                    } else {
                        boolValueOf = null;
                    }
                } else {
                    s71.D("userSettingPref");
                    throw null;
                }
            } catch (Throwable th) {
                lz.a(com.facebook.w0.class, th);
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            if (boolValueOf.booleanValue()) {
                obj = "1";
            } else {
                obj = "0";
            }
            jSONObject.put("add_to_messaging_customer_base_for_whatsapp", obj);
        }
        if (eVar != null) {
            if (b0.b(zVar) && (Build.VERSION.SDK_INT < 31 || !F(context) || !eVar.e)) {
                jSONObject.put("anon_id", str);
            }
            if (eVar.c != null && (!b0.b(zVar) || Build.VERSION.SDK_INT < 31 || !F(context) || !eVar.e)) {
                jSONObject.put(C4682c4.c, eVar.c);
            }
            if (eVar.a() != null) {
                jSONObject.put("advertiser_id", eVar.a());
                jSONObject.put("advertiser_tracking_enabled", !eVar.e);
            }
            if (!eVar.e) {
                com.facebook.appevents.b0 b0Var = com.facebook.appevents.b0.a;
                if (lz.a.contains(com.facebook.appevents.b0.class)) {
                    strK = null;
                } else {
                    try {
                        if (!com.facebook.appevents.b0.c.get()) {
                            b0Var.b();
                        }
                        HashMap map = new HashMap();
                        map.putAll(com.facebook.appevents.b0.d);
                        map.putAll(b0Var.a());
                        strK = K(map);
                    } catch (Throwable th2) {
                        lz.a(com.facebook.appevents.b0.class, th2);
                        strK = null;
                    }
                }
                if (strK.length() != 0) {
                    jSONObject.put("ud", strK);
                }
            }
            Object obj2 = eVar.d;
            if (obj2 != null) {
                jSONObject.put("installer_package", obj2);
            }
        }
        ng1 ng1Var = v7.c;
        v7 v7VarN = ng1Var.n();
        if (v7VarN != null) {
            objN = v7VarN.n("campaign_ids");
        } else {
            objN = null;
        }
        if (objN != null) {
            jSONObject.put("campaign_ids", objN);
        }
        v7 v7VarN2 = ng1Var.n();
        if (v7VarN2 != null) {
            objN2 = v7VarN2.n("click_id");
        }
        if (objN2 != null) {
            jSONObject.put("click_id", objN2);
        }
    }

    public static void c(String str) {
        int i2;
        boolean z;
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if (cookie == null) {
            return;
        }
        for (String str2 : (String[]) dk2.n0(cookie, new String[]{";"}, 0, 6).toArray(new String[0])) {
            String[] strArr = (String[]) dk2.n0(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
            if (strArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                String str3 = strArr[0];
                int length = str3.length() - 1;
                int i3 = 0;
                boolean z2 = false;
                while (i3 <= length) {
                    if (!z2) {
                        i2 = i3;
                    } else {
                        i2 = length;
                    }
                    if (s71.h(str3.charAt(i2), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i3++;
                        }
                    } else if (!z) {
                        break;
                    } else {
                        length--;
                    }
                }
                sb.append(str3.subSequence(i3, length + 1).toString());
                sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                cookieManager.setCookie(str, sb.toString());
            }
        }
        cookieManager.flush();
    }

    public static final String f(String str) {
        if (G(str)) {
            return "";
        }
        return str;
    }

    public static final HashMap i(JSONObject jSONObject) {
        jSONObject.getClass();
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null) {
            int length = jSONArrayNames.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArrayNames.getString(i2);
                    string.getClass();
                    Object objI = jSONObject.get(string);
                    if (objI instanceof JSONObject) {
                        objI = i((JSONObject) objI);
                    }
                    objI.getClass();
                    map.put(string, objI);
                } catch (JSONException unused) {
                    com.facebook.a0 a0Var = com.facebook.a0.a;
                }
            }
        }
        return map;
    }

    public static z m(int i2) {
        for (z zVar : z.values()) {
            if (zVar.a == i2) {
                return zVar;
            }
        }
        return z.Unknown;
    }

    public static final long q(Uri uri) {
        uri.getClass();
        Cursor cursorQuery = null;
        try {
            cursorQuery = com.facebook.a0.a().getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery == null) {
                return 0L;
            }
            int columnIndex = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            long j2 = cursorQuery.getLong(columnIndex);
            cursorQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
                throw th;
            }
            throw th;
        }
    }

    public static final void s(final u0 u0Var, final String str) {
        String str2;
        String str3;
        str.getClass();
        JSONObject jSONObject = (JSONObject) r0.a.get(str);
        if (jSONObject != null) {
            u0Var.a(jSONObject);
            return;
        }
        com.facebook.g0 g0Var = new com.facebook.g0() { // from class: com.facebook.internal.t0
            @Override // com.facebook.g0
            public final void onCompleted(com.facebook.n0 n0Var) {
                String str4 = str;
                str4.getClass();
                n0Var.getClass();
                JSONObject jSONObject2 = n0Var.e;
                FacebookRequestError facebookRequestError = n0Var.d;
                u0 u0Var2 = u0Var;
                if (facebookRequestError != null) {
                    u0Var2.b(facebookRequestError.i);
                } else if (jSONObject2 == null) {
                    e32.i("Required value was null.");
                } else {
                    r0.a.put(str4, jSONObject2);
                    u0Var2.a(jSONObject2);
                }
            }
        };
        Bundle bundle = new Bundle();
        Date date = AccessToken.l;
        AccessToken accessTokenP = com.facebook.appevents.h.p();
        if (accessTokenP == null || (str2 = accessTokenP.k) == null) {
            str2 = "facebook";
        }
        if (str2.equals("instagram")) {
            str3 = "id,name,profile_picture";
        } else {
            str3 = "id,name,first_name,middle_name,last_name";
        }
        bundle.putString("fields", str3);
        bundle.putString("access_token", str);
        com.facebook.k0 k0Var = new com.facebook.k0(null, "me", null, null, new k7(2), 32);
        k0Var.d = bundle;
        k0Var.h = com.facebook.o0.a;
        k0Var.j(g0Var);
        k0Var.d();
    }

    public static final Method u(String str, String str2, Class... clsArr) {
        try {
            return t(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final Object v(String str, String str2, JSONObject jSONObject) throws JSONException {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && (objOpt instanceof String)) {
            objOpt = new JSONTokener((String) objOpt).nextValue();
        }
        if (objOpt != null && !(objOpt instanceof JSONObject) && !(objOpt instanceof JSONArray)) {
            if (str2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str2, objOpt);
                return jSONObject2;
            }
            com.facebook.appevents.p.e("Got an unexpected non-JSON object.");
            return null;
        }
        return objOpt;
    }

    public static final boolean w(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        context.getClass();
        str.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!s71.b(activityInfo.name, "com.facebook.CustomTabActivity") || !s71.b(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static final void x(Context context, boolean z) {
        ActivityInfo activityInfo;
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            if (!z) {
                Log.w("com.facebook.internal.v0", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            } else {
                e32.i("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
        }
    }

    public static final void y(Context context, boolean z) {
        context.getClass();
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            if (!z) {
                Log.w("com.facebook.internal.v0", "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            } else {
                e32.i("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
            }
        }
    }
}
