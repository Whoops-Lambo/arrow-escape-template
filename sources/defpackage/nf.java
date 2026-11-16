package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzggx;
import com.google.android.gms.internal.ads.zzgjs;
import com.google.android.gms.internal.ads.zzipn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p;
import io.p071bidmachine.media3.common.audio.c;
import io.p071bidmachine.util.log.d;
import io.p071bidmachine.util.viewabilitytracker.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class nf implements SettingsProvider, p, zzgjs {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public oc2 b() {
        return (oc2) ((AtomicReference) this.h).get();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task d() {
        return ((TaskCompletionSource) ((AtomicReference) this.i).get()).getTask();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p
    public void destroy() {
        li2 li2Var = (li2) this.c;
        if (li2Var != null) {
            li2Var.cancel(null);
        }
        ((View) this.a).removeOnLayoutChangeListener((a0) this.d);
    }

    public void e(Rect rect, Rect rect2) {
        float f = rect.left;
        Context context = (Context) this.a;
        rect2.set(c.o(context, f), c.o(context, rect.top), c.o(context, rect.right), c.o(context, rect.bottom));
    }

    public oc2 f(int i) {
        oc2 oc2Var = null;
        try {
            if (!h50.b(2, i)) {
                JSONObject jSONObjectB = ((xn) this.e).b();
                if (jSONObjectB != null) {
                    oc2 oc2VarN = ((x41) this.c).n(jSONObjectB);
                    g("Loaded cached settings: ", jSONObjectB);
                    ((uf0) this.d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (h50.b(3, i) || oc2VarN.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return oc2VarN;
                        } catch (Exception e) {
                            e = e;
                            oc2Var = oc2VarN;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return oc2Var;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public void h() {
        synchronized (this.c) {
            try {
                ((AtomicBoolean) this.f).set(false);
                WeakReference weakReference = (WeakReference) this.i;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    ((d) this.b).c(null, new iy(view, 4));
                    io.p071bidmachine.util.p.T(view, (a) this.e);
                }
                ArrayList arrayList = (ArrayList) this.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((io.p071bidmachine.util.viewabilitytracker.checker.a) obj).d();
                }
                ((AtomicBoolean) this.g).set(false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public k54 i() {
        zzipn.b(Context.class, (Context) this.c);
        zzipn.b(Map.class, (HashMap) this.f);
        zzipn.b(zzayj.class, (zzayj) this.h);
        zzipn.b(zzggx.class, (zzggx) this.i);
        return new k54((k) this.a, (ne4) this.b, (Context) this.c, (View) this.d, (Activity) this.e, (String) this.g, (HashMap) this.f, (zzayj) this.h, (zzggx) this.i);
    }

    public nf(WebView webView, Context context, dn dnVar) {
        webView.getClass();
        context.getClass();
        this.a = webView;
        ba0 ba0Var = xc0.a;
        this.b = kc2.u(dnVar, wg1.a);
        a0 a0Var = new a0(this, 0);
        this.d = a0Var;
        webView.addOnLayoutChangeListener(a0Var);
        xi2 xi2VarA = qb5.a(Boolean.FALSE);
        this.e = xi2VarA;
        this.f = xi2VarA;
        context.getClass();
        nf nfVar = new nf();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        nfVar.a = applicationContext;
        nfVar.b = new Rect();
        nfVar.c = new Rect();
        nfVar.d = new Rect();
        nfVar.e = new Rect();
        nfVar.f = new Rect();
        nfVar.g = new Rect();
        nfVar.h = new Rect();
        nfVar.i = new Rect();
        this.g = nfVar;
        xi2 xi2VarA2 = qb5.a(new b0(nfVar));
        this.h = xi2VarA2;
        this.i = xi2VarA2;
    }

    public static void g(String str, JSONObject jSONObject) {
        StringBuilder sbP = h50.p(str);
        sbP.append(jSONObject.toString());
        String string = sbP.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjs
    public /* bridge */ /* synthetic */ nf a(Context context) {
        context.getClass();
        this.c = context;
        return this;
    }

    public /* bridge */ /* synthetic */ nf j(zzayj zzayjVar) {
        zzayjVar.getClass();
        this.h = zzayjVar;
        return this;
    }
}
