package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsSession;
import com.inmobi.ads.R;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4343r3 implements Application.ActivityLifecycleCallbacks {
    public final String a;
    public final C4232n3 b;
    public final Yb c;
    public final String d;
    public final F5 e;
    public final Context f;
    public final WeakReference g;
    public final Application h;
    public final G5 i;
    public boolean j;
    public final WeakReference k;
    public final WeakReference l;
    public boolean m;
    public boolean n;

    public final CustomTabsIntent.Builder a(C4232n3 c4232n3) {
        Bitmap bitmap;
        F5 f5 = this.e;
        CustomTabsSession customTabsSessionD = f5.d;
        if (customTabsSessionD == null) {
            CustomTabsClient customTabsClient = f5.a;
            customTabsSessionD = customTabsClient != null ? customTabsClient.d(new E5(f5)) : null;
            f5.d = customTabsSessionD;
        }
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(customTabsSessionD);
        Intent intent = builder.a;
        intent.putExtra(CustomTabsIntent.EXTRA_CLOSE_BUTTON_POSITION, 2);
        try {
            builder.e(2);
            intent.putExtra(CustomTabsIntent.EXTRA_TITLE_VISIBILITY_STATE, 0);
            intent.putExtra(CustomTabsIntent.EXTRA_DISABLE_DOWNLOAD_BUTTON, true);
            intent.putExtra(CustomTabsIntent.EXTRA_DISABLE_BOOKMARKS_BUTTON, true);
        } catch (Error e) {
            e.getMessage();
        }
        if (c4232n3.b) {
            Context context = this.f;
            int i = R.drawable.im_close_transparent;
            context.getClass();
            Drawable drawable = context.getDrawable(i);
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                bitmap.getClass();
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable != null ? drawable.getIntrinsicWidth() : 24, drawable != null ? drawable.getIntrinsicHeight() : 24, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (drawable != null) {
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                }
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                bitmap = bitmapCreateBitmap;
            }
            intent.putExtra(CustomTabsIntent.EXTRA_CLOSE_BUTTON_ICON, bitmap);
        }
        C4207m6 c4207m6H = AbstractC4151k6.h();
        Hg hgA = Ig.a(AbstractC4151k6.g());
        if (hgA == Hg.LANDSCAPE || hgA == Hg.REVERSE_LANDSCAPE) {
            int i2 = (int) (c4207m6H.a * c4232n3.a);
            builder.d((int) (i2 * c4207m6H.c));
            if (i2 <= 0) {
                defpackage.d.r("Invalid value for the initialWidthPx argument");
                return null;
            }
            intent.putExtra(CustomTabsIntent.EXTRA_ACTIVITY_SIDE_SHEET_BREAKPOINT_DP, i2);
        } else {
            builder.c((int) (((int) (c4207m6H.b * c4232n3.a)) * c4207m6H.c), 2);
        }
        intent.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, true);
        return builder;
    }

    public final void b() {
        if (this.n) {
            return;
        }
        this.n = true;
        F5 f5 = this.e;
        Context context = this.f;
        f5.getClass();
        context.getClass();
        D5 d5 = f5.b;
        if (d5 != null) {
            try {
                context.unbindService(d5);
            } catch (Throwable unused) {
            }
        }
        f5.a = null;
        f5.d = null;
        f5.b = null;
        f5.c = null;
        Application application = this.h;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.k.clear();
        this.l.clear();
    }

    public final Context c() {
        WeakReference weakReference = this.g;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? this.f : activity;
    }

    public C4343r3(String str, C4232n3 c4232n3, Context context, C4304pj c4304pj, Ji ji, Yb yb, String str2) {
        Activity activity;
        WeakReference weakReference;
        Activity activity2;
        str.getClass();
        context.getClass();
        ji.getClass();
        str2.getClass();
        this.a = str;
        this.b = c4232n3;
        this.c = yb;
        this.d = str2;
        F5 f5 = new F5();
        this.e = f5;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f = applicationContext;
        boolean z = context instanceof Activity;
        if (z) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity != null) {
            weakReference = new WeakReference(activity);
        } else {
            weakReference = null;
        }
        this.g = weakReference;
        if (z) {
            activity2 = (Activity) context;
        } else {
            activity2 = null;
        }
        Application application = activity2 != null ? activity2.getApplication() : null;
        this.h = application;
        this.i = new G5(c4304pj, yb);
        this.k = new WeakReference(c4304pj);
        this.l = new WeakReference(ji);
        f5.c = this;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Activity activity2;
        activity.getClass();
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            activity2 = (Activity) weakReference.get();
        } else {
            activity2 = null;
        }
        if (activity2 != null && !activity2.equals(activity)) {
            return;
        }
        b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Activity activity2;
        activity.getClass();
        if (!this.n && this.m) {
            WeakReference weakReference = this.g;
            if (weakReference != null) {
                activity2 = (Activity) weakReference.get();
            } else {
                activity2 = null;
            }
            if (activity2 == null || activity2.equals(activity)) {
                b();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
    }

    public final void a(Uri uri) {
        CustomTabsIntent.Builder builder;
        CustomTabsSession customTabsSessionD;
        Context contextC = c();
        C4232n3 c4232n3 = this.b;
        if (c4232n3 != null && (contextC instanceof Activity)) {
            try {
                builder = a(c4232n3);
            } catch (Error e) {
                e.getMessage();
                F5 f5 = this.e;
                CustomTabsSession customTabsSession = f5.d;
                if (customTabsSession == null) {
                    CustomTabsClient customTabsClient = f5.a;
                    customTabsSessionD = customTabsClient != null ? customTabsClient.d(new E5(f5)) : null;
                    f5.d = customTabsSessionD;
                    customTabsSession = customTabsSessionD;
                }
                builder = new CustomTabsIntent.Builder(customTabsSession);
                builder.a.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, true);
            }
        } else {
            F5 f6 = this.e;
            CustomTabsSession customTabsSession2 = f6.d;
            if (customTabsSession2 == null) {
                CustomTabsClient customTabsClient2 = f6.a;
                customTabsSessionD = customTabsClient2 != null ? customTabsClient2.d(new E5(f6)) : null;
                f6.d = customTabsSessionD;
                customTabsSession2 = customTabsSessionD;
            }
            builder = new CustomTabsIntent.Builder(customTabsSession2);
            builder.a.putExtra(CustomTabsIntent.EXTRA_ENABLE_URLBAR_HIDING, true);
        }
        CustomTabsIntent customTabsIntentA = builder.a();
        C4304pj c4304pj = (C4304pj) this.k.get();
        Yb yb = this.c;
        Object obj = this.l.get();
        obj.getClass();
        C5.a(contextC, customTabsIntentA, uri, c4304pj, yb, (Ji) obj, this.d);
    }

    public final C4109ik a() {
        return new C4109ik(new C4260o3(this), new C4288p3(), new C4316q3(this));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i, int i2, int i3, int i4, int i5) throws JSONException {
        C4304pj c4304pj = (C4304pj) this.k.get();
        if (c4304pj != null) {
            Y9 y9 = c4304pj.a.i;
            if (y9 != null) {
                String str = Ej.j1;
                str.getClass();
                ((Z9) y9).a(str, "onCCTLayout");
            }
            Ej ej = c4304pj.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", "customTabLayout");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("left", AbstractC4038g4.a(i));
            jSONObject2.put("top", AbstractC4038g4.a(i2));
            jSONObject2.put("right", AbstractC4038g4.a(i3));
            jSONObject2.put("bottom", AbstractC4038g4.a(i4));
            jSONObject2.put("state", i5);
            jSONObject.put("layout", jSONObject2);
            ej.b(jSONObject);
        }
    }
}
