package com.facebook.login;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.p003activity.result.ActivityResultRegistryOwner;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.FacebookActivity;
import com.facebook.internal.v0;
import com.facebook.unity.BaseActivity;
import com.facebook.unity.FBUnityLoginActivity;
import com.ironsource.C5074y2;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import defpackage.du;
import defpackage.lz;
import defpackage.n30;
import defpackage.n8;
import defpackage.s71;
import defpackage.y93;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class x {
    public static final v b = new v();
    public static final Set c = n8.q0(new String[]{"ads_management", "create_event", "rsvp_event"});
    public static final String d;
    public static volatile x e;
    public final SharedPreferences a;

    public static void safedk_BaseActivity_startActivityForResult_7135a7939ddf3a103d50925005f7e170(BaseActivity p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/facebook/unity/BaseActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.facebook");
        p0.startActivityForResult(p1, p2);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.facebook.AccessToken] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.facebook.p] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void d(int i, Intent intent, com.facebook.p pVar) {
        int i2;
        boolean z;
        com.facebook.u uVar;
        Object obj;
        LoginClient.Request request;
        AuthenticationToken authenticationToken;
        int i3;
        ?? r4;
        ?? r12;
        Set set;
        Set setD0;
        AccessToken accessTokenP;
        AuthenticationToken authenticationToken2;
        boolean z2;
        Object obj2;
        y yVar = null;
        if (intent == null) {
            if (i == 0) {
                i2 = 2;
                z = true;
                uVar = null;
                obj = null;
                request = null;
                authenticationToken = null;
            }
            i3 = i2;
            r4 = authenticationToken;
            r12 = obj;
            if (uVar == null) {
                uVar = new com.facebook.u("Unexpected call to LoginManager.onActivityResult");
            }
            com.facebook.u uVar2 = uVar;
            b(null, i3, r4, uVar2, true, request);
            if (r12 != 0) {
                Date date = AccessToken.l;
                com.facebook.appevents.h.x(r12);
                accessTokenP = com.facebook.appevents.h.p();
                if (accessTokenP != null) {
                    if (com.facebook.appevents.h.r()) {
                        v0.s(new com.explorestack.protobuf.adcom.c(28), accessTokenP.e);
                    } else {
                        com.facebook.k.f.j().a(null, true);
                    }
                }
            }
            if (authenticationToken != null) {
                com.facebook.appevents.k.q(authenticationToken);
            }
            if (pVar != 0) {
                if (r12 != 0) {
                    set = request.b;
                    setD0 = du.D0(du.Y(r12.b));
                    if (request.h) {
                        setD0.retainAll(set);
                    }
                    Set setD1 = du.D0(du.Y(set));
                    setD1.removeAll(setD0);
                    yVar = new y(r12, authenticationToken, setD0, setD1);
                }
                if (z) {
                }
                pVar.onCancel();
            }
        }
        intent.setExtrasClassLoader(LoginClient.Result.class.getClassLoader());
        LoginClient.Result result = (LoginClient.Result) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
        if (result != null) {
            LoginClient.Request request2 = result.f;
            int i4 = result.a;
            if (i != -1) {
                if (i != 0) {
                    uVar = null;
                    authenticationToken2 = null;
                    z2 = false;
                    obj2 = authenticationToken2;
                } else {
                    z2 = true;
                    uVar = null;
                    obj2 = null;
                    authenticationToken2 = null;
                }
            } else if (i4 == 1) {
                AccessToken accessToken = result.b;
                authenticationToken2 = result.c;
                z2 = false;
                obj2 = accessToken;
                uVar = null;
            } else {
                uVar = new com.facebook.o(result.d);
                authenticationToken2 = null;
                z2 = false;
                obj2 = authenticationToken2;
            }
            request = request2;
            i3 = i4;
            z = z2;
            authenticationToken = authenticationToken2;
            r4 = result.g;
            r12 = obj2;
        }
        if (uVar == null && r12 == 0 && !z) {
            uVar = new com.facebook.u("Unexpected call to LoginManager.onActivityResult");
        }
        com.facebook.u uVar3 = uVar;
        b(null, i3, r4, uVar3, true, request);
        if (r12 != 0) {
            Date date2 = AccessToken.l;
            com.facebook.appevents.h.x(r12);
            accessTokenP = com.facebook.appevents.h.p();
            if (accessTokenP != null) {
                if (com.facebook.appevents.h.r()) {
                    com.facebook.k.f.j().a(null, true);
                } else {
                    v0.s(new com.explorestack.protobuf.adcom.c(28), accessTokenP.e);
                }
            }
        }
        if (authenticationToken != null) {
            com.facebook.appevents.k.q(authenticationToken);
        }
        if (pVar != 0) {
            if (r12 != 0 && request != null) {
                set = request.b;
                setD0 = du.D0(du.Y(r12.b));
                if (request.h) {
                    setD0.retainAll(set);
                }
                Set setD2 = du.D0(du.Y(set));
                setD2.removeAll(setD0);
                yVar = new y(r12, authenticationToken, setD0, setD2);
            }
            if (!z || (yVar != null && yVar.c.isEmpty())) {
                pVar.onCancel();
            }
            if (uVar3 != null) {
                pVar.onError(uVar3);
                return;
            }
            if (r12 == 0 || yVar == null) {
                return;
            }
            SharedPreferences.Editor editorEdit = this.a.edit();
            editorEdit.putBoolean("express_login_allowed", true);
            editorEdit.apply();
            pVar.onSuccess(yVar);
            return;
        }
        i2 = 3;
        uVar = null;
        obj = null;
        request = null;
        authenticationToken = null;
        z = false;
        i3 = i2;
        r4 = authenticationToken;
        r12 = obj;
        if (uVar == null) {
            uVar = new com.facebook.u("Unexpected call to LoginManager.onActivityResult");
        }
        com.facebook.u uVar4 = uVar;
        b(null, i3, r4, uVar4, true, request);
        if (r12 != 0) {
            Date date3 = AccessToken.l;
            com.facebook.appevents.h.x(r12);
            accessTokenP = com.facebook.appevents.h.p();
            if (accessTokenP != null) {
                if (com.facebook.appevents.h.r()) {
                    com.facebook.k.f.j().a(null, true);
                } else {
                    v0.s(new com.explorestack.protobuf.adcom.c(28), accessTokenP.e);
                }
            }
        }
        if (authenticationToken != null) {
            com.facebook.appevents.k.q(authenticationToken);
        }
        if (pVar != 0) {
            if (r12 != 0) {
                set = request.b;
                setD0 = du.D0(du.Y(r12.b));
                if (request.h) {
                    setD0.retainAll(set);
                }
                Set setD3 = du.D0(du.Y(set));
                setD3.removeAll(setD0);
                yVar = new y(r12, authenticationToken, setD0, setD3);
            }
            if (z) {
            }
            pVar.onCancel();
        }
    }

    static {
        String string = x.class.toString();
        string.getClass();
        d = string;
    }

    public static x a() {
        v vVar = b;
        if (e == null) {
            synchronized (vVar) {
                e = new x();
            }
        }
        x xVar = e;
        if (xVar != null) {
            return xVar;
        }
        s71.D(C5074y2.p);
        throw null;
    }

    public static void b(FBUnityLoginActivity fBUnityLoginActivity, int i, Map map, com.facebook.u uVar, boolean z, LoginClient.Request request) {
        s sVarC = w.a.c(fBUnityLoginActivity);
        if (sVarC == null) {
            return;
        }
        if (request == null) {
            ScheduledExecutorService scheduledExecutorService = s.d;
            if (lz.a.contains(s.class)) {
                return;
            }
            try {
                sVarC.c("fb_mobile_login_complete", "");
                return;
            } catch (Throwable th) {
                lz.a(s.class, th);
                return;
            }
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z ? "1" : "0");
        map2.put("from_sso", "false");
        String str = request.g;
        String str2 = request.o ? "foa_mobile_login_complete" : "fb_mobile_login_complete";
        ScheduledExecutorService scheduledExecutorService2 = s.d;
        if (lz.a.contains(sVarC)) {
            return;
        }
        try {
            Bundle bundleB = w.b(str);
            if (i != 0) {
                bundleB.putString("2_result", com.explorestack.protobuf.z.f(i));
            }
            if ((uVar != null ? uVar.getMessage() : null) != null) {
                bundleB.putString("5_error_message", uVar.getMessage());
            }
            JSONObject jSONObject = map2.isEmpty() ? null : new JSONObject(map2);
            if (map != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleB.putString("6_extras", jSONObject.toString());
            }
            sVarC.a(bundleB, str2);
            if (i != 1 || lz.a.contains(sVarC)) {
                return;
            }
            try {
                s.d.schedule(new y93(26, sVarC, w.b(str)), 5L, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                lz.a(sVarC, th2);
            }
        } catch (Throwable th3) {
            lz.a(sVarC, th3);
        }
    }

    public x() {
        v0.U();
        SharedPreferences sharedPreferences = com.facebook.a0.a().getSharedPreferences("com.facebook.loginManager", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
        if (com.facebook.a0.o && com.facebook.internal.l.a() != null) {
            CustomTabsClient.a(com.facebook.a0.a(), "com.android.chrome", new b());
            CustomTabsClient.b(com.facebook.a0.a(), com.facebook.a0.a().getPackageName());
        }
    }

    public final void c(FBUnityLoginActivity fBUnityLoginActivity, p pVar) {
        int i;
        String str;
        String str2;
        String str3;
        fBUnityLoginActivity.getClass();
        if (fBUnityLoginActivity instanceof ActivityResultRegistryOwner) {
            Log.w(d, "You're calling logging in Facebook with an activity supports androidx activity result APIs. Please follow our document to upgrade to new APIs to avoid overriding onActivityResult().");
        }
        String strL = (String) pVar.c;
        try {
            strL = com.facebook.appevents.k.l(strL);
            i = 1;
        } catch (com.facebook.u unused) {
            i = 2;
        }
        String str4 = strL;
        Set setE0 = du.E0((Set) pVar.a);
        String strB = com.facebook.a0.b();
        String strF = n30.f();
        String str5 = (String) pVar.b;
        String str6 = (String) pVar.c;
        v0.U();
        String str7 = com.facebook.a0.f;
        if (str7 == null) {
            str = "";
        } else {
            str = str7;
        }
        v0.U();
        String str8 = com.facebook.a0.g;
        if (str8 == null) {
            str2 = "";
        } else {
            str2 = str8;
        }
        LoginClient.Request request = new LoginClient.Request(setE0, strB, strF, str5, str6, str4, i, str, str2);
        Date date = AccessToken.l;
        request.h = com.facebook.appevents.h.r();
        request.l = null;
        request.m = false;
        request.o = false;
        request.p = false;
        s sVarC = w.a.c(fBUnityLoginActivity);
        if (sVarC != null) {
            if (request.o) {
                str3 = "foa_mobile_login_start";
            } else {
                str3 = "fb_mobile_login_start";
            }
            if (!lz.a.contains(sVarC)) {
                try {
                    ScheduledExecutorService scheduledExecutorService = s.d;
                    Bundle bundleB = w.b(strF);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("login_behavior", com.explorestack.protobuf.z.u(1));
                        jSONObject.put("request_code", com.explorestack.protobuf.z.a(1));
                        jSONObject.put("permissions", TextUtils.join(",", request.b));
                        jSONObject.put("default_audience", com.explorestack.protobuf.z.t(3));
                        jSONObject.put("isReauthorize", request.h);
                        String str9 = sVarC.c;
                        if (str9 != null) {
                            jSONObject.put("facebookVersion", str9);
                        }
                        jSONObject.put("target_app", com.explorestack.protobuf.z.h(1));
                        bundleB.putString("6_extras", jSONObject.toString());
                    } catch (JSONException unused2) {
                    }
                    sVarC.a(bundleB, str3);
                } catch (Throwable th) {
                    lz.a(sVarC, th);
                }
            }
        }
        com.facebook.a0 a0Var = com.facebook.a0.a;
        com.facebook.internal.j.b.A(com.explorestack.protobuf.z.a(1), new com.facebook.internal.i() { // from class: com.facebook.login.u
            @Override // com.facebook.internal.i
            public final boolean a(int i2, Intent intent) {
                this.a.d(i2, intent, null);
                return true;
            }
        });
        Intent intent = new Intent();
        intent.setClass(com.facebook.a0.a(), FacebookActivity.class);
        intent.setAction(com.explorestack.protobuf.z.u(request.a));
        Bundle bundle = new Bundle();
        bundle.putParcelable("request", request);
        intent.putExtra("com.facebook.LoginFragment:Request", bundle);
        if (com.facebook.a0.a().getPackageManager().resolveActivity(intent, 0) != null) {
            try {
                safedk_BaseActivity_startActivityForResult_7135a7939ddf3a103d50925005f7e170(fBUnityLoginActivity, intent, com.explorestack.protobuf.z.a(1));
                return;
            } catch (ActivityNotFoundException unused3) {
            }
        }
        com.facebook.u uVar = new com.facebook.u("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
        b(fBUnityLoginActivity, 3, null, uVar, false, request);
        throw uVar;
    }
}
