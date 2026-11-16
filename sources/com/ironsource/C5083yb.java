package com.ironsource;

import android.content.Context;
import androidx.annotation.MainThread;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.unity3d.mediation.LevelPlay;
import defpackage.du;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class C5083yb {
    public final void a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, int i, @Nullable String str2) throws JSONException {
        str.getClass();
        adFormat.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("placement", str);
        jSONObjectJsonObjectInit.put(C4671bb.f, adFormat.getValue());
        jSONObjectJsonObjectInit.put("adf", If.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        If.a(D5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void b(@NotNull String str, int i, @Nullable String str2) throws JSONException {
        str.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("mediationAdUnitId", str);
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        If.a(D5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void c(boolean z) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        If.a(D5.GDPR_CONSENT, jSONObjectJsonObjectInit);
    }

    public final void b(@MainThread @NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @NotNull
    public final C4978se b(@NotNull C4978se c4978se) {
        c4978se.getClass();
        return c4978se.c() == 2080 ? new C4978se(c4978se.c(), "serverResponseIsNotValid") : c4978se;
    }

    public final void b(boolean z) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        If.a(D5.SET_COPPA, jSONObjectJsonObjectInit);
    }

    public final void b() {
        If.a(D5.TROUBLESHOOTING_SET_COPPA_AFTER_INIT, IronSourceNetworkBridge.jsonObjectInit());
    }

    public static /* synthetic */ void a(C5083yb c5083yb, Runnable runnable, long j, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: postOnUIThread");
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        c5083yb.a(runnable, j);
    }

    public final void a(@MainThread @NotNull Runnable runnable, long j) {
        runnable.getClass();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(com.ironsource.environment.thread.a.a.a(runnable), j);
    }

    public final void a(@NotNull Context context) {
        context.getClass();
        C5081y9.a aVar = C5081y9.a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        aVar.a(applicationContext);
    }

    @NotNull
    public final IronSource.a[] a(@NotNull LevelPlay.AdFormat... adFormatArr) {
        adFormatArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormatArr) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    @NotNull
    public final IronSource.a a(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        return com.unity3d.mediation.a.a(adFormat);
    }

    public final boolean a(@NotNull AdapterBaseInterface adapterBaseInterface, @NotNull IronSource.a aVar, @NotNull String str) {
        adapterBaseInterface.getClass();
        aVar.getClass();
        str.getClass();
        return If.a(adapterBaseInterface, aVar, str);
    }

    public static /* synthetic */ void a(C5083yb c5083yb, long j, Ue.a aVar, long j2, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
            return;
        }
        if ((i & 8) != 0) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        c5083yb.a(j, aVar, j2, jSONObject);
    }

    public final void a(long j, @NotNull Ue.a aVar, long j2, @NotNull JSONObject jSONObject) {
        aVar.getClass();
        jSONObject.getClass();
        try {
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j);
            String strB = aVar.b();
            strB.getClass();
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(strB, j2));
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        If.a(D5.SDK_INIT_SUCCESS, jSONObject);
    }

    @NotNull
    public final C4978se a(@NotNull C4978se c4978se) {
        c4978se.getClass();
        int iC = c4978se.c();
        if (iC != 2070) {
            return iC != 2110 ? c4978se : new C4978se(c4978se.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return new C4978se(c4978se.c(), "noServerResponse");
    }

    private final String a(String str, long j) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j;
    }

    public static /* synthetic */ void a(C5083yb c5083yb, C4978se c4978se, long j, JSONObject jSONObject, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
            return;
        }
        if ((i & 4) != 0) {
            jSONObject = IronSourceNetworkBridge.jsonObjectInit();
        }
        c5083yb.a(c4978se, j, jSONObject);
    }

    public final void a(@NotNull C4978se c4978se, long j, @NotNull JSONObject jSONObject) {
        c4978se.getClass();
        jSONObject.getClass();
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, c4978se.c());
            jSONObject.put("reason", c4978se.d());
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j);
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        If.a(D5.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(@InterfaceC5065xb @NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.INSTANCE.getLevelPlayThread().a(runnable);
    }

    public final void a(@NotNull String str, int i, @Nullable String str2) throws JSONException {
        str.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("mediationAdUnitId", str);
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        If.a(D5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void a(@NotNull Map<String, Boolean> map) throws JSONException {
        map.getClass();
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, du.g0(map.entrySet(), ";", null, null, new com.moloco.sdk.internal.publisher.d(29), 30));
        If.a(D5.GDPR_CONSENTS, jSONObjectJsonObjectInit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence a(Map.Entry entry) {
        entry.getClass();
        return ((String) entry.getKey()) + "=" + ((Boolean) entry.getValue()).booleanValue();
    }

    public final void a(boolean z) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_EXT1, String.valueOf(z));
        If.a(D5.SET_CCPA, jSONObjectJsonObjectInit);
    }

    public final boolean a() {
        return Pb.w.d().f().c();
    }
}
