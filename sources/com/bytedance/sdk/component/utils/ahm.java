package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class ahm {
    private static kgy kgy;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ahm$ahm, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0219ahm {
        void kgy();

        void kgy(Throwable th);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        boolean ahm();

        boolean kgy();

        ExecutorService rz();
    }

    public static Activity kgy(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rz(Context context, Intent intent, InterfaceC0219ahm interfaceC0219ahm) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                if (interfaceC0219ahm == null) {
                    return true;
                }
                interfaceC0219ahm.kgy();
                return true;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "eu05nBW1fd61Xt5R", "X+EegQKufeaDXt5LhQW5", 67);
                if (interfaceC0219ahm != null) {
                    interfaceC0219ahm.kgy(th);
                }
            }
        }
        return false;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivity(p1);
    }

    public static void kgy(final Context context, final Intent intent, final InterfaceC0219ahm interfaceC0219ahm) {
        ExecutorService executorServiceRz;
        kgy kgyVar = kgy;
        if (kgyVar != null && kgyVar.ahm() && (executorServiceRz = kgy.rz()) != null) {
            executorServiceRz.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.ahm.1
                @Override // java.lang.Runnable
                public void run() {
                    ahm.rz(context, intent, interfaceC0219ahm);
                }
            });
        } else {
            rz(context, intent, interfaceC0219ahm);
        }
    }

    public static boolean kgy(final Context context, final Intent intent, final InterfaceC0219ahm interfaceC0219ahm, boolean z) {
        kgy kgyVar;
        ExecutorService executorServiceRz;
        if (z && (kgyVar = kgy) != null && kgyVar.kgy() && (executorServiceRz = kgy.rz()) != null) {
            executorServiceRz.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.ahm.2
                @Override // java.lang.Runnable
                public void run() {
                    ahm.rz(context, intent, interfaceC0219ahm);
                }
            });
            return true;
        }
        return rz(context, intent, interfaceC0219ahm);
    }

    public static void kgy(kgy kgyVar) {
        kgy = kgyVar;
    }

    public static boolean kgy(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
