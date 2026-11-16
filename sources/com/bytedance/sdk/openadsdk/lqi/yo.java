package com.bytedance.sdk.openadsdk.lqi;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class yo implements noq {
    private noq ahm;
    Handler kgy = null;

    private Context gf() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE58FsilP6yqM", "aPo/lBe5bt6kT8dYghWXOlr+PZAR", "XOs5pwa6ZcKDXvRSggWlME8=", Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public Context ahm() {
        noq noqVar = this.ahm;
        return (noqVar == null || noqVar.ahm() == null) ? gf() : this.ahm.ahm();
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public String ct() {
        noq noqVar = this.ahm;
        if (noqVar != null) {
            return noqVar.ct();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public boolean fi() {
        noq noqVar = this.ahm;
        if (noqVar != null) {
            return noqVar.fi();
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public ExecutorService kgy() {
        noq noqVar = this.ahm;
        return (noqVar == null || noqVar.kgy() == null) ? Executors.newCachedThreadPool() : this.ahm.kgy();
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public JSONObject noq() {
        noq noqVar = this.ahm;
        if (noqVar != null) {
            return noqVar.noq();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public String rz() {
        noq noqVar = this.ahm;
        return (noqVar == null || TextUtils.isEmpty(noqVar.rz())) ? "null" : this.ahm.rz();
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public Handler uq() {
        noq noqVar = this.ahm;
        if (noqVar != null && noqVar.yo() != null) {
            return this.ahm.uq();
        }
        Handler handler = new Handler(kgy("pag_strategy", -1).getLooper());
        this.kgy = handler;
        return handler;
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public Map<String, String> yo() {
        noq noqVar = this.ahm;
        return (noqVar == null || noqVar.yo() == null) ? new HashMap() : this.ahm.yo();
    }

    public yo(noq noqVar) {
        this.ahm = noqVar;
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public JSONObject kgy(JSONObject jSONObject) {
        noq noqVar = this.ahm;
        return noqVar != null ? noqVar.kgy(jSONObject) : jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.lqi.noq
    public HandlerThread kgy(String str, int i) {
        HandlerThread handlerThreadKgy;
        noq noqVar = this.ahm;
        if (noqVar != null && (handlerThreadKgy = noqVar.kgy(str, i)) != null) {
            return handlerThreadKgy;
        }
        HandlerThread handlerThread = new HandlerThread("pag_strategy", -1);
        handlerThread.start();
        return handlerThread;
    }
}
