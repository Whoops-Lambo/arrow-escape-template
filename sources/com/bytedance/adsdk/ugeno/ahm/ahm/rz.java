package com.bytedance.adsdk.ugeno.ahm.ahm;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class rz {
    private ahm ahm;
    private View ct;
    private boolean gf;
    private final Context kgy;
    private boolean noq;
    private ct rz;
    private com.bytedance.adsdk.ugeno.ahm.ahm.kgy uq;
    private Application vs;
    private boolean yo;
    private boolean fi = true;
    private final Rect ra = new Rect();
    private final View.OnLayoutChangeListener nu = new View.OnLayoutChangeListener() { // from class: com.bytedance.adsdk.ugeno.ahm.ahm.rz.1
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (rz.this.uq != null) {
                rz.this.uq.setBounds(0, 0, i3 - i, i4 - i2);
            }
            rz.this.fi();
        }
    };
    private final ViewTreeObserver.OnScrollChangedListener at = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.adsdk.ugeno.ahm.ahm.rz.2
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            rz.this.fi();
        }
    };
    private final ViewTreeObserver.OnWindowFocusChangeListener twf = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.adsdk.ugeno.ahm.ahm.rz.3
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public void onWindowFocusChanged(boolean z) {
            rz.this.fi();
        }
    };
    private final View.OnAttachStateChangeListener kus = new View.OnAttachStateChangeListener() { // from class: com.bytedance.adsdk.ugeno.ahm.ahm.rz.4
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            rz.this.ct();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            rz.this.noq();
        }
    };
    private final Application.ActivityLifecycleCallbacks dg = new kgy() { // from class: com.bytedance.adsdk.ugeno.ahm.ahm.rz.5
        @Override // com.bytedance.adsdk.ugeno.ahm.ahm.rz.kgy, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (activity == rz.this.dg()) {
                rz.this.fi = false;
                rz.this.fi();
            }
        }

        @Override // com.bytedance.adsdk.ugeno.ahm.ahm.rz.kgy, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (activity == rz.this.dg()) {
                rz.this.fi = true;
                rz.this.fi();
            }
        }
    };

    private static boolean vs() {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class kgy implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        private kgy() {
        }
    }

    private void at() {
        if (this.ct == null || this.ahm == null || !vs()) {
            return;
        }
        gf();
        if (this.uq == null) {
            this.uq = new com.bytedance.adsdk.ugeno.ahm.ahm.kgy(this.rz);
        }
        int width = this.ct.getWidth();
        int height = this.ct.getHeight();
        if (width > 0 && height > 0) {
            this.uq.setBounds(0, 0, width, height);
        }
        this.ct.getOverlay().add(this.uq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ct() {
        if (this.noq || this.ct == null || this.ahm == null || !vs()) {
            return;
        }
        ra();
        this.noq = true;
        at();
        ViewTreeObserver viewTreeObserver = this.ct.getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnScrollChangedListener(this.at);
            ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.twf;
            if (onWindowFocusChangeListener != null) {
                viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
            }
        }
        xh();
        fi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity dg() {
        View view = this.ct;
        if (view == null) {
            return null;
        }
        return kgy(view.getContext());
    }

    private void gf() {
        ahm ahmVar = this.ahm;
        if (ahmVar == null) {
            return;
        }
        if (this.rz == null) {
            this.rz = new ct(ahmVar);
        }
        View view = this.ct;
        if (view != null) {
            this.rz.kgy(view.getWidth(), this.ct.getHeight());
        }
    }

    private void kus() {
        com.bytedance.adsdk.ugeno.ahm.ahm.kgy kgyVar = this.uq;
        if (kgyVar != null) {
            kgyVar.ahm();
        }
        ct ctVar = this.rz;
        if (ctVar != null) {
            ctVar.noq();
            this.rz = null;
        }
        this.uq = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void noq() {
        View view = this.ct;
        if (view == null) {
            this.noq = false;
            this.yo = false;
            um();
            this.gf = false;
            return;
        }
        if (this.noq) {
            this.noq = false;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(this.at);
                ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = this.twf;
                if (onWindowFocusChangeListener != null) {
                    viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
                }
            }
            kgy(false);
            twf();
        }
        nu();
        um();
    }

    private void nu() {
        View view = this.ct;
        if (view == null || !this.gf) {
            return;
        }
        view.removeOnLayoutChangeListener(this.nu);
        this.ct.removeOnAttachStateChangeListener(this.kus);
        this.gf = false;
    }

    private void ra() {
        View view = this.ct;
        if (view == null || this.gf) {
            return;
        }
        view.addOnLayoutChangeListener(this.nu);
        this.ct.addOnAttachStateChangeListener(this.kus);
        this.gf = true;
    }

    private void twf() {
        if (this.ct == null || this.uq == null || !vs()) {
            return;
        }
        this.ct.getOverlay().remove(this.uq);
    }

    private void um() {
        Application application = this.vs;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.dg);
            this.vs = null;
        }
    }

    private void xh() {
        Activity activityDg;
        Application application;
        if (this.vs != null || (activityDg = dg()) == null || (application = activityDg.getApplication()) == null) {
            return;
        }
        this.vs = application;
        application.registerActivityLifecycleCallbacks(this.dg);
    }

    private boolean yo() {
        View view;
        return this.noq && (view = this.ct) != null && this.fi && view.getVisibility() == 0 && this.ct.getWindowVisibility() == 0 && this.ct.getWidth() > 0 && this.ct.getHeight() > 0 && this.ct.getAlpha() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.ct.getGlobalVisibleRect(this.ra) && this.ra.width() > 1 && this.ra.height() > 1;
    }

    public void kgy(String str) {
        ahm ahmVarKgy = ahm.kgy(this.kgy, str);
        if (ahmVarKgy == null || !ahmVarKgy.rz()) {
            if (this.ahm != null) {
                twf();
                kus();
                this.ahm = null;
                return;
            }
            return;
        }
        if (this.ahm == ahmVarKgy) {
            return;
        }
        twf();
        kus();
        this.ahm = ahmVarKgy;
        if (!this.noq || this.ct == null) {
            return;
        }
        at();
        boolean z = this.yo;
        this.yo = false;
        kgy(z || yo());
    }

    public rz(Context context) {
        Context applicationContext;
        if (context != null) {
            applicationContext = context.getApplicationContext();
        } else {
            applicationContext = null;
        }
        this.kgy = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fi() {
        kgy(yo());
    }

    public void ahm() {
        noq();
        this.ct = null;
        kus();
    }

    public void rz() {
        ct();
    }

    public void uq() {
        noq();
    }

    public boolean kgy() {
        return this.ahm != null;
    }

    public void kgy(View view) {
        if (this.ct == view) {
            return;
        }
        ahm();
        this.ct = view;
        if (view == null || this.ahm == null || !vs()) {
            return;
        }
        ra();
        if (this.ct.getWindowToken() != null) {
            ct();
        }
    }

    private void kgy(boolean z) {
        if (this.yo == z) {
            return;
        }
        this.yo = z;
        if (z) {
            gf();
            ct ctVar = this.rz;
            if (ctVar != null) {
                ctVar.uq();
            }
            com.bytedance.adsdk.ugeno.ahm.ahm.kgy kgyVar = this.uq;
            if (kgyVar != null) {
                kgyVar.kgy();
                return;
            }
            return;
        }
        com.bytedance.adsdk.ugeno.ahm.ahm.kgy kgyVar2 = this.uq;
        if (kgyVar2 != null) {
            kgyVar2.ahm();
        }
        ct ctVar2 = this.rz;
        if (ctVar2 != null) {
            ctVar2.ct();
        }
    }

    private static Activity kgy(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext == context) {
                return null;
            }
            context = baseContext;
        }
        return null;
    }
}
