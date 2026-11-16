package com.facebook;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import defpackage.dk2;
import defpackage.kk2;
import defpackage.n8;
import defpackage.s71;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class k0 {
    public static final String j;
    public static final Pattern k;
    public static volatile String l;
    public final AccessToken a;
    public final String b;
    public JSONObject c;
    public Bundle d;
    public String e;
    public final String f;
    public g0 g;
    public o0 h;
    public boolean i;

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        charArray.getClass();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        j = sb.toString();
        k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public k0(AccessToken accessToken, String str, Bundle bundle, o0 o0Var, g0 g0Var, int i) {
        accessToken = (i & 1) != 0 ? null : accessToken;
        str = (i & 2) != 0 ? null : str;
        bundle = (i & 4) != 0 ? null : bundle;
        o0Var = (i & 8) != 0 ? null : o0Var;
        g0Var = (i & 16) != 0 ? null : g0Var;
        this.a = accessToken;
        this.b = str;
        this.f = null;
        j(g0Var);
        this.h = o0Var == null ? o0.a : o0Var;
        if (bundle != null) {
            this.d = new Bundle(bundle);
        } else {
            this.d = new Bundle();
        }
        this.f = a0.d();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    public final void a() {
        Bundle bundle = this.d;
        String strE = e();
        boolean zO = strE != null ? dk2.O(strE, com.safedk.android.analytics.brandsafety.m.ad, false) : false;
        if (strE == null || !kk2.L(strE, "IG", false) || zO || !i()) {
            if ((s71.b(a0.e(), "instagram.com") ? true ^ i() : true) || zO) {
                String strE2 = e();
                if (strE2 != null) {
                    bundle.putString("access_token", strE2);
                }
            } else {
                bundle.putString("access_token", f());
            }
        } else {
            bundle.putString("access_token", f());
        }
        if (!bundle.containsKey("access_token")) {
            a0 a0Var = a0.a;
            com.facebook.internal.v0.U();
            String str = a0.h;
            if (str == null) {
                com.facebook.appevents.p.e("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
                return;
            } else if (com.facebook.internal.v0.G(str)) {
                Log.w("k0", "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString("format", "json");
        HashSet hashSet = a0.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
    }

    public final String b(String str, boolean z) {
        if (!z && this.h == o0.b) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.d.keySet()) {
            Object obj = this.d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (com.explorestack.protobuf.adcom.c.l(obj)) {
                builderBuildUpon.appendQueryParameter(str2, com.explorestack.protobuf.adcom.c.c(obj).toString());
            } else if (this.h != o0.a) {
                defpackage.d.r(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
                return null;
            }
        }
        String string = builderBuildUpon.toString();
        string.getClass();
        return string;
    }

    public final String e() {
        Bundle bundle = this.d;
        AccessToken accessToken = this.a;
        if (accessToken != null) {
            if (!bundle.containsKey("access_token")) {
                String str = accessToken.e;
                com.facebook.internal.k0.c.z(str);
                return str;
            }
        } else if (!bundle.containsKey("access_token")) {
            return f();
        }
        return this.d.getString("access_token");
    }

    public final String g() {
        String str;
        String str2;
        if (this.h == o0.b && (str2 = this.b) != null && kk2.C(str2, "/videos", false)) {
            str = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{a0.e()}, 1));
        } else {
            String strE = a0.e();
            strE.getClass();
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{strE}, 1));
        }
        String strH = h(str);
        a();
        return b(strH, false);
    }

    public final boolean i() {
        String str = this.b;
        if (str == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder("^/?");
        sb.append(a0.b());
        sb.append("/?.*");
        return this.i || Pattern.matches(sb.toString(), str) || Pattern.matches("^/?app/?.*", str);
    }

    public final void j(g0 g0Var) {
        HashSet hashSet = a0.b;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        this.g = g0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.c);
        sb.append(", httpMethod: ");
        sb.append(this.h);
        sb.append(", parameters: ");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public static String f() {
        String strB = a0.b();
        com.facebook.internal.v0.U();
        String str = a0.h;
        if (str != null) {
            if (strB.length() <= 0 || str.length() <= 0) {
                return null;
            }
            return strB + '|' + str;
        }
        com.facebook.appevents.p.e("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
        return null;
    }

    public final n0 c() {
        ArrayList arrayListE = com.explorestack.protobuf.adcom.c.e(new m0(n8.o0(new k0[]{this})));
        if (arrayListE.size() == 1) {
            return (n0) arrayListE.get(0);
        }
        com.facebook.appevents.p.e("invalid state: expected a single response");
        return null;
    }

    public final l0 d() {
        m0 m0Var = new m0(n8.o0(new k0[]{this}));
        com.facebook.internal.v0.M(m0Var);
        l0 l0Var = new l0(m0Var);
        l0Var.executeOnExecutor(a0.c(), new Void[0]);
        return l0Var;
    }

    public final String h(String str) {
        boolean z;
        if (!s71.b(a0.e(), "instagram.com")) {
            z = true;
        } else {
            z = !i();
        }
        if (!z) {
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{a0.t}, 1));
        }
        Pattern pattern = k;
        String str2 = this.b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public k0(AccessToken accessToken, String str, Bundle bundle, g0 g0Var) {
        this(accessToken, str, bundle, o0.b, g0Var, 32);
    }

    public k0() {
        this(null, null, null, null, null, 63);
    }
}
