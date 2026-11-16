package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.dk2;
import defpackage.dt1;
import defpackage.du;
import defpackage.qh1;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Wf {

    @NotNull
    public static final Wf a = new Wf();

    @NotNull
    public final String a(@NotNull String str) {
        str.getClass();
        try {
            if (!dk2.O(str, "-", false)) {
                return !dk2.O(str, "_", false) ? str : (String) du.a0(dk2.n0(str, new String[]{"_"}, 0, 6));
            }
            String str2 = (String) du.h0(dk2.n0(str, new String[]{"-"}, 0, 6));
            return !dk2.O(str2, "_", false) ? str2 : (String) du.a0(dk2.n0(str2, new String[]{"_"}, 0, 6));
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.getMessage());
            return str;
        }
    }

    @NotNull
    public final LevelPlayAdSize b(@Nullable String str, int i, int i2) {
        if (str == null || str.length() == 0 || str.equals(com.ironsource.mediationsdk.j.f)) {
            return LevelPlayAdSize.Companion.createCustomSize(i, i2);
        }
        return str.equals(com.ironsource.mediationsdk.j.c) ? LevelPlayAdSize.MEDIUM_RECTANGLE : LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(str);
    }

    @NotNull
    public final ConcurrentHashMap<String, List<String>> d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(com.ironsource.mediationsdk.c.c().e());
        concurrentHashMap.putAll(C4992ta.b().c());
        return concurrentHashMap;
    }

    private Wf() {
    }

    public final void e() {
        com.ironsource.mediationsdk.p.g().G();
    }

    @NotNull
    public final JSONObject c() {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> concurrentHashMapF = com.ironsource.mediationsdk.c.c().f();
            concurrentHashMapF.getClass();
            for (Map.Entry<String, AdapterBaseWrapper> entry : concurrentHashMapF.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    Wf wf = a;
                    String key = entry.getKey();
                    key.getClass();
                    String strA = wf.a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    adapterBaseInterface.getClass();
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    adapterVersion.getClass();
                    jSONObjectJsonObjectInit.putOpt(strA, wf.a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
            return jSONObjectJsonObjectInit;
        } catch (Exception e) {
            C4950r4.d().a(e);
            return jSONObjectJsonObjectInit;
        }
    }

    @NotNull
    public final JSONObject b() throws JSONException {
        JSONObject jSONObjectB = O6.a().b();
        jSONObjectB.getClass();
        return jSONObjectB;
    }

    @Nullable
    public final String b(@NotNull Context context) {
        context.getClass();
        return M1.b(context, c(context));
    }

    public final void b(@NotNull String str) {
        str.getClass();
        IronLog.INTERNAL.error(str);
    }

    @NotNull
    public final JSONObject a(boolean z) {
        JSONObject jSONObjectB = IronSourceUtils.b(z);
        jSONObjectB.getClass();
        return jSONObjectB;
    }

    public final void a(@Nullable InterfaceC4779hb interfaceC4779hb) {
        C4776h8.a().b(interfaceC4779hb);
    }

    public final void a(@Nullable InterfaceC4993tb interfaceC4993tb) {
        Od.a().b(interfaceC4993tb);
    }

    public final void a(@Nullable Ia ia) {
        F2.a().b(ia);
    }

    public final int a() {
        return Pb.w.d().a().c();
    }

    @NotNull
    public final String a(@Nullable C4870md c4870md) {
        String strC;
        return (c4870md == null || (strC = c4870md.c()) == null) ? new String() : strC;
    }

    @NotNull
    public final String a(@NotNull NetworkSettings networkSettings) {
        networkSettings.getClass();
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    public final boolean a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.a aVar) {
        networkSettings.getClass();
        aVar.getClass();
        return networkSettings.isBidder(aVar);
    }

    @NotNull
    public final ISBannerSize a(@Nullable String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    @NotNull
    public final com.ironsource.mediationsdk.o a(@NotNull Activity activity, @NotNull ISBannerSize iSBannerSize) {
        activity.getClass();
        iSBannerSize.getClass();
        com.ironsource.mediationsdk.o oVarB = com.ironsource.mediationsdk.p.g().b(activity, iSBannerSize);
        oVarB.getClass();
        return oVarB;
    }

    public final void a(@NotNull D5 d5, @NotNull JSONObject jSONObject) {
        d5.getClass();
        jSONObject.getClass();
        C4835ke.i().a(new C5(d5, jSONObject));
    }

    private final JSONObject a(String str, String str2) {
        return new JSONObject(qh1.Y(new dt1(Pf.b, str), new dt1("sdkVersion", str2)));
    }

    @Nullable
    public final String c(@NotNull Context context) {
        context.getClass();
        return M1.g(context);
    }

    @Nullable
    public final String a(@NotNull Context context) {
        context.getClass();
        return M1.a(context, c(context));
    }
}
