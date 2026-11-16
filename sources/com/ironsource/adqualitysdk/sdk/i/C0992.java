package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.UnityAdsConstants;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ᴽ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class C0992 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static C0992 f2826;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2827 = StringFog.decrypt("Hv+rUyqvQNss8Kx9IrBg0Tf2tmIusWLdOvY=\n", "WZPEMUvDFLQ=\n");

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public C1079 f2830;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final WeakHashMap f2829 = new WeakHashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public C4648w f2828 = new C4648w(-1, -1, -1, -1);

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m746() {
        try {
            if (this.f2830 != null) {
                for (ViewGroup viewGroup : this.f2829.keySet()) {
                    ViewParent parent = viewGroup.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(viewGroup);
                    }
                }
                this.f2829.clear();
                C0883.m637().m638(this.f2830);
                this.f2830 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m747() {
        if (this.f2830 == null) {
            this.f2830 = new C1079(this);
            C0883.m637().m639(this.f2830);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized C4648w m748() {
        return this.f2828;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m745(C0992 c0992, ViewGroup viewGroup, ViewOnLayoutChangeListenerC1061 viewOnLayoutChangeListenerC1061) {
        JSONObject jSONObject;
        c0992.getClass();
        if (viewGroup != null) {
            try {
                if (viewGroup.getChildCount() != 0) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        if (viewGroup.getChildAt(i) instanceof TextView) {
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                String str = f2827;
                AbstractC0509.m497(str, str, StringFog.decrypt("LxPjbVTTWyAPAvprSJQYIQxBx2tDhH86BRThIkWcVjwLCP9xBpxWJBNBxWdeh24hDxbi\n", "amGRAibzOEg=\n"), th, null, false);
            }
            C1082 c1082 = (C1082) AbstractC1081.m765();
            synchronized (c1082) {
                jSONObject = c1082.f2544;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("bunM\n", "HYa79E74CtQ=\n"), false)) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof WindowManager.LayoutParams) {
                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                    int i2 = layoutParams2.type;
                    if ((layoutParams2.flags & 16) != 0 || i2 == 2005 || i2 == 2003 || i2 == 2038) {
                        return;
                    }
                }
            }
            Activity activityM420 = AbstractC4634o0.m420(viewGroup);
            if (C4646v.m442().m445(activityM420)) {
                if (viewGroup.findViewById(160766228) == null) {
                    c0992.m749(viewGroup, viewOnLayoutChangeListenerC1061);
                }
            } else if (C4646v.m442().m443(activityM420)) {
                new Handler(Looper.getMainLooper()).post(new C1043(c0992, viewGroup, new C1046(c0992), viewOnLayoutChangeListenerC1061));
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m744(C0992 c0992, MotionEvent motionEvent) {
        c0992.getClass();
        try {
            AbstractC4631n.m402(new C1038(c0992, MotionEvent.obtain(motionEvent)));
        } catch (Throwable th) {
            AbstractC1290.m905(f2827, StringFog.decrypt("zCWUHfaVSqT9I48c45VZrvw0jlL21FqZqTiUUvbUWpg=\n", "iVfmcoS1LcE=\n"), th, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized C0992 m743() {
        try {
            if (f2826 == null) {
                f2826 = new C0992();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2826;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m749(ViewGroup viewGroup, ViewOnLayoutChangeListenerC1061 viewOnLayoutChangeListenerC1061) {
        C1053 c1053 = new C1053(this, viewGroup.getContext(), AbstractC1081.m765().mo771());
        c1053.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        synchronized (this) {
            this.f2829.put(c1053, new Object());
        }
        c1053.setId(160766228);
        new Handler(Looper.getMainLooper()).post(new C1050(viewGroup, c1053, viewOnLayoutChangeListenerC1061));
    }
}
