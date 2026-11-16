package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.inmobi.media.core.config.models.CrashConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class kgy implements Application.ActivityLifecycleCallbacks {
    public static long ahm;
    public static boolean kgy;
    public static long rz;
    private final ct fi;
    private final ct gf;
    private volatile WeakReference<Activity> kus;
    private final AtomicBoolean uq = new AtomicBoolean(false);
    private final RunnableC0293kgy ct = new RunnableC0293kgy();
    private final yo noq = new yo();
    private final noq yo = new noq();
    private int ra = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.kgy>> nu = new CopyOnWriteArrayList<>();
    private HandlerThread at = null;
    private Handler twf = null;
    private final LinkedList<Activity> vs = new LinkedList<>();
    private volatile CopyOnWriteArrayList<WeakReference<ahm>> dg = new CopyOnWriteArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
        void ahm();

        void kgy();
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class fi implements Runnable {
        private long ahm;
        private long rz;
        private boolean uq;

        public fi(long j, long j2, boolean z) {
            this.ahm = j;
            this.rz = j2;
            this.uq = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.uq) {
                com.bytedance.sdk.openadsdk.dg.uq.kgy().kgy(this.ahm / 1000, this.rz / 1000);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class RunnableC0293kgy implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            mw.ahm(new com.bytedance.sdk.component.gf.ahm.rz("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.kgy.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class noq implements Runnable {
        public noq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerAhm = com.bytedance.sdk.openadsdk.core.kus.ahm();
                Message messageObtain = Message.obtain(handlerAhm, kgy.this.ct);
                messageObtain.what = 1001;
                handlerAhm.sendMessageDelayed(messageObtain, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class yo implements Runnable {
        public yo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.kus.ahm().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.xh.kgy();
        }
    }

    public boolean ahm(ahm ahmVar) {
        int i = 0;
        if (ahmVar == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<ahm>> it = this.dg.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<ahm> next = it.next();
            ahm ahmVar2 = next != null ? next.get() : null;
            if (ahmVar2 == null || ahmVar2 == ahmVar) {
                arrayList.add(next);
                if (ahmVar2 == ahmVar) {
                    z = true;
                }
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            WeakReference weakReference = (WeakReference) obj;
            Objects.toString(weakReference.get());
            ahmVar.toString();
            this.dg.remove(weakReference);
        }
        this.dg.size();
        return z;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (gbb.ahm() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.kgy.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(@NonNull View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (gbb.ct(activity)) {
                                gbb.kgy(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(@NonNull View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                } else if (gbb.ct(activity)) {
                    gbb.kgy(true);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eu05nBW1fd6sQ9FYjwijJF7CJIYXuWfCkg==", "VOAMlhe1f86UU+RJjQO0LV8=", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            com.bytedance.sdk.component.utils.sx.kgy("TTAD.ActivityLifecycle", th);
        }
        this.ra++;
        if (this.uq.get()) {
            this.twf.removeCallbacks(this.gf);
            this.twf.removeCallbacks(this.fi);
            kgy(this.gf);
            if (this.dg != null) {
                for (WeakReference<ahm> weakReference : this.dg) {
                    if (weakReference != null && weakReference.get() != null) {
                        weakReference.get().kgy();
                    }
                }
            }
        }
        this.uq.set(false);
    }

    public boolean rz(com.bytedance.sdk.component.adexpress.kgy kgyVar) {
        int i = 0;
        if (kgyVar == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<WeakReference<com.bytedance.sdk.component.adexpress.kgy>> it = this.nu.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<com.bytedance.sdk.component.adexpress.kgy> next = it.next();
            com.bytedance.sdk.component.adexpress.kgy kgyVar2 = next != null ? next.get() : null;
            if (kgyVar2 == null || kgyVar2 == kgyVar) {
                arrayList.add(next);
                if (kgyVar2 == kgyVar) {
                    z = true;
                }
            }
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            this.nu.remove((WeakReference) obj);
        }
        return z;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class ct implements Runnable {
        private ct() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.uq.kgy.at atVarQjb = com.bytedance.sdk.openadsdk.core.settings.nu.ahm().qjb();
            if (atVarQjb != null && !atVarQjb.kgy() && com.bytedance.sdk.component.utils.um.fi(com.bytedance.sdk.openadsdk.core.xh.kgy())) {
                com.bytedance.sdk.openadsdk.uq.kgy.ahm.kgy(com.bytedance.sdk.openadsdk.core.at.kgy(com.bytedance.sdk.openadsdk.core.xh.kgy()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class rz extends ct {
        private rz() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.kgy.ct, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.noq.ahm.kgy().ahm();
            com.bytedance.sdk.openadsdk.utils.ct.ahm();
            com.bytedance.sdk.openadsdk.component.yo.kgy.kgy(3);
            com.bytedance.sdk.openadsdk.um.rz.kgy(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class uq extends ct {
        private uq() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.kgy.ct, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.ct.kgy();
        }
    }

    public boolean kgy(boolean z) {
        Window window;
        if (this.kus != null) {
            try {
                Activity activity = this.kus.get();
                if (activity != null && (window = activity.getWindow()) != null) {
                    return window.getDecorView().hasWindowFocus();
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eu05nBW1fd6sQ9FYjwijJF7CJIYXuWfCkg==", "U+8+ogqybciXbNhemQI=", 426);
                return z;
            }
        }
        return z;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.vs.addFirst(activity);
        com.bytedance.sdk.openadsdk.core.widget.ct.kgy(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.ra - 1;
        this.ra = i;
        if (i < 0) {
            this.ra = 0;
        }
        if (ApmHelper.isIsInit()) {
            kgy(this.yo);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kgy(this.noq);
        if (!kgy) {
            ahm = System.currentTimeMillis();
            kgy = true;
        }
        this.kus = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.ra <= 0) {
            this.uq.set(true);
        }
        if (kgy()) {
            kgy = false;
            com.bytedance.sdk.openadsdk.core.kus.ahm.set(false);
            rz = System.currentTimeMillis();
            this.twf.removeCallbacks(this.gf);
            this.twf.removeCallbacks(this.fi);
            kgy(this.fi);
            if (this.dg != null) {
                for (WeakReference<ahm> weakReference : this.dg) {
                    if (weakReference != null && weakReference.get() != null) {
                        weakReference.get().ahm();
                    }
                }
            }
        }
        kgy(new fi(ahm, rz, kgy()));
    }

    public kgy() {
        this.fi = new rz();
        this.gf = new uq();
        rz();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        com.bytedance.sdk.openadsdk.core.widget.ct.ahm(activity);
        if (this.nu != null && this.nu.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.kgy> weakReference : this.nu) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().kgy(activity);
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "eu05nBW1fd6sQ9FYjwijJF7CJIYXuWfCkg==", "VOAMlhe1f86UU/NYnwWyJ0LrKQ==", 388);
                    }
                }
            }
        }
        if (this.kus != null && this.kus.get() == activity) {
            this.kus = null;
        }
        this.vs.remove(activity);
    }

    private void kgy(Runnable runnable) {
        if (!this.at.isAlive()) {
            rz();
        }
        this.twf.postDelayed(runnable, 1000L);
    }

    public void kgy(ahm ahmVar) {
        this.dg.add(new WeakReference<>(ahmVar));
        this.dg.size();
        Objects.toString(ahmVar);
    }

    public void kgy(com.bytedance.sdk.component.adexpress.kgy kgyVar) {
        this.nu.add(new WeakReference<>(kgyVar));
    }

    public boolean kgy() {
        return this.uq.get();
    }

    private void rz() {
        this.at = com.bytedance.sdk.component.utils.fi.kgy("lifecycle", 10);
        this.twf = new Handler(this.at.getLooper());
    }

    public boolean ahm(com.bytedance.sdk.component.adexpress.kgy kgyVar) {
        return this.nu.remove(new WeakReference(kgyVar));
    }

    public Activity ahm() {
        if (this.vs.isEmpty()) {
            return null;
        }
        return this.vs.getFirst();
    }
}
