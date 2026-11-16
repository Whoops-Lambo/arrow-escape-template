package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.gf.kgy.noq;
import com.bytedance.sdk.openadsdk.fpz.rz;
import com.bytedance.sdk.openadsdk.um.ahm;
import com.bytedance.sdk.openadsdk.um.ahm.kgy;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.jc1;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class BusMonitorDependWrapper implements ahm {
    private noq ahm;
    private ahm kgy;

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable th) {
            rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07c", "efs+uAyyYNOPWPNYnBSuLGz8LIUTuXs=", "XOs5pwa6ZcKDXvRSggWlME8=", Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public boolean allowHighUploadReport() {
        ahm ahmVar = this.kgy;
        if (ahmVar != null) {
            return ahmVar.allowHighUploadReport();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public Context getContext() {
        ahm ahmVar = this.kgy;
        return (ahmVar == null || ahmVar.getContext() == null) ? getReflectContext() : this.kgy.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public noq getHandler() {
        ahm ahmVar = this.kgy;
        if (ahmVar != null && ahmVar.getHandler() != null) {
            return this.kgy.getHandler();
        }
        if (this.ahm == null) {
            this.ahm = new noq(new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper())) { // from class: com.bytedance.sdk.openadsdk.BusMonitorDependWrapper.1
                @Override // com.bytedance.sdk.component.gf.kgy.noq
                public boolean kgy() {
                    return false;
                }
            };
        }
        return this.ahm;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public int getHighUploadIntervalTime() {
        int highUploadIntervalTime;
        ahm ahmVar = this.kgy;
        if (ahmVar == null || (highUploadIntervalTime = ahmVar.getHighUploadIntervalTime()) < 600000) {
            return 600000;
        }
        return highUploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public int getOnceLogCount() {
        ahm ahmVar = this.kgy;
        if (ahmVar != null) {
            return ahmVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public int getOnceLogInterval() {
        ahm ahmVar = this.kgy;
        if (ahmVar != null) {
            return ahmVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public HandlerThread getSafeHandlerThread(String str, int i) {
        HandlerThread safeHandlerThread;
        ahm ahmVar = this.kgy;
        return (ahmVar == null || (safeHandlerThread = ahmVar.getSafeHandlerThread(str, i)) == null) ? jc1.h("pag_monitor") : safeHandlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        ahm ahmVar = this.kgy;
        return (ahmVar == null || (uploadIntervalTime = ahmVar.getUploadIntervalTime()) < 3600000) ? BrandSafetyUtils.g : uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public boolean isMonitorOpen() {
        ahm ahmVar = this.kgy;
        if (ahmVar != null) {
            return ahmVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public void onMonitorUpload(List<kgy> list) {
        ahm ahmVar = this.kgy;
        if (ahmVar != null) {
            ahmVar.onMonitorUpload(list);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.um.ahm
    public boolean useNewDb() {
        ahm ahmVar = this.kgy;
        if (ahmVar != null) {
            return ahmVar.useNewDb();
        }
        return false;
    }

    public BusMonitorDependWrapper(ahm ahmVar) {
        this.kgy = ahmVar;
    }
}
