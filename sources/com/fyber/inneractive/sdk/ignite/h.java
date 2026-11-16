package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.gb;
import defpackage.ia3;
import defpackage.ja3;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class h implements ia3, gb {
    public Context a;
    public IIgniteServiceAPI b;
    public long j;
    public String k;
    public d l;
    public ja3 m;
    public com.fyber.inneractive.sdk.config.global.r n;
    public l o;
    public final Bundle c = new Bundle();
    public boolean e = false;
    public boolean f = false;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public boolean h = false;
    public boolean i = false;
    public final i d = new i(new e(this));

    @Override // defpackage.gb
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        ja3 ja3Var = this.m;
        if (ja3Var != null) {
            ja3Var.a(str);
            this.m = null;
        }
    }

    @Override // defpackage.gb
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.k = componentName.getPackageName();
        this.b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.i) {
            l lVar = this.o;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.i = true;
        byte[] byteArray = null;
        try {
            o oVarNewBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.Q.c;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.a.getPackageName();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setSdkVersion(version);
            String str3 = this.k;
            oVarNewBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setIgnitePackageName(str3);
            if (TextUtils.isEmpty(this.k) || (context = this.a) == null) {
                str = null;
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setIgniteVersionName(str);
                String strA = com.fyber.inneractive.sdk.util.o.a(this.a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setAppSignature(strA);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            } else {
                try {
                    str = context.getPackageManager().getPackageInfo(this.k, 0).versionName;
                } catch (Exception unused) {
                    IAlog.a("Failed to resolve ignite version", new Object[0]);
                    str = null;
                }
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setIgniteVersionName(str);
                String strA2 = com.fyber.inneractive.sdk.util.o.a(this.a);
                oVarNewBuilder.c();
                ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.b).setAppSignature(strA2);
                byteArray = ((IgniteRequestOuterClass$IgniteRequest) oVarNewBuilder.a()).toByteArray();
            }
        } catch (Throwable unused2) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (byteArray != null) {
            IAConfigManager.Q.s.a(new a1(new b(this), byteArray, this.n));
        }
    }

    public final void m() {
        d dVar = this.l;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
            this.l = null;
        }
    }

    public final boolean n() {
        l lVar = this.o;
        return lVar != null && lVar.isConnected() && this.o.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.o;
        return lVar == null || lVar.a.f();
    }

    @Override // defpackage.ia3
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.o;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // defpackage.ia3
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.o;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // defpackage.gb
    public final void onIgniteServiceAuthenticated(String str) {
        this.c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        ja3 ja3Var = this.m;
        if (ja3Var != null) {
            ja3Var.a();
            this.m = null;
        }
    }

    @Override // defpackage.gb
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f || (lVar = this.o) == null) {
            return;
        }
        lVar.destroy();
        this.o = null;
    }

    public final void a(String str, g gVar) {
        String strA;
        if (!TextUtils.isEmpty(str)) {
            IAlog.a("Starting install timeout with %d", Long.valueOf(this.j));
            d dVar = new d(this);
            this.l = dVar;
            com.fyber.inneractive.sdk.util.r.b.postDelayed(dVar, this.j);
            if (n() && !o() && this.b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, str);
                    jSONObject.put("data", jSONObject2);
                    IIgniteServiceAPI iIgniteServiceAPI = this.b;
                    String string = jSONObject.toString();
                    Bundle bundle = this.c;
                    Bundle bundle2 = new Bundle();
                    i iVar = this.d;
                    c cVar = new c(this, gVar);
                    iVar.getClass();
                    iIgniteServiceAPI.install(string, bundle, bundle2, new s((e) iVar.a, cVar));
                    return;
                } catch (Exception unused) {
                    IAlog.a("Failed to install app", new Object[0]);
                    return;
                }
            }
            for (r rVar : this.g) {
                if (rVar != null) {
                    if (o()) {
                        strA = j.SESSION_EXPIRED.a();
                    } else {
                        strA = j.NOT_CONNECTED.a();
                    }
                    rVar.a((String) null, strA, (String) null);
                }
            }
        }
    }

    @Override // defpackage.gb
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    public final void a(j jVar, String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.b = tVar;
        wVar.a = null;
        wVar.d = null;
        JSONObject jSONObject = new JSONObject();
        String strA = jVar.a();
        try {
            jSONObject.put(com.safedk.android.analytics.brandsafety.creatives.discoveries.t.d, strA);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", com.safedk.android.analytics.brandsafety.creatives.discoveries.t.d, strA);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(ja3 ja3Var) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + ja3Var, new Object[0]);
        this.m = ja3Var;
        l lVar = this.o;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        h hVar;
        this.n = rVar;
        if (TextUtils.isEmpty(this.k)) {
            return;
        }
        IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
        com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
        IAlog.a("%s : initializing ignite features", "IgniteAdapter");
        Boolean boolC = jVar.c("odt");
        this.e = boolC != null ? boolC.booleanValue() : false;
        Boolean boolC2 = jVar.c("flow");
        this.f = boolC2 != null ? boolC2.booleanValue() : false;
        Boolean boolC3 = jVar.c("updates");
        boolean zBooleanValue = boolC3 != null ? boolC3.booleanValue() : false;
        Context context = this.a;
        if (context != null) {
            boolean z = this.e;
            if (z || this.f) {
                if (this.o == null) {
                    this.i = false;
                    hVar = this;
                    l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z, this.f, zBooleanValue, hVar);
                    hVar.o = lVar;
                    lVar.authenticate();
                } else {
                    hVar = this;
                }
                hVar.j = TimeUnit.SECONDS.toMillis(IAConfigManager.Q.w.a.b.a("igniteInstallTimeOutInSeconds", 15, 1));
            }
        }
    }
}
