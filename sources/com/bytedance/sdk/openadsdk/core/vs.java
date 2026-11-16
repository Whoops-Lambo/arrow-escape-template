package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.openadsdk.ApmHelper;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class vs {
    private boolean ahm;
    private final com.bytedance.sdk.openadsdk.utils.kgy kgy = new com.bytedance.sdk.openadsdk.utils.kgy();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private static final vs kgy = new vs();
    }

    public com.bytedance.sdk.openadsdk.utils.kgy ct() {
        return this.kgy;
    }

    public boolean kgy(boolean z) {
        return this.kgy.kgy(z);
    }

    public boolean rz() {
        return this.ahm;
    }

    public boolean uq() {
        return this.kgy.kgy();
    }

    public void ahm() {
        try {
            Context contextKgy = xh.kgy();
            if (contextKgy instanceof Application) {
                ((Application) contextKgy).registerActivityLifecycleCallbacks(this.kgy);
                this.ahm = true;
            } else if (contextKgy != null && contextKgy.getApplicationContext() != null) {
                ((Application) contextKgy.getApplicationContext()).registerActivityLifecycleCallbacks(this.kgy);
                this.ahm = true;
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("registerActivityLifecycleError", "registerActivityLifecycle", th);
        }
    }

    public static vs kgy() {
        return kgy.kgy;
    }
}
