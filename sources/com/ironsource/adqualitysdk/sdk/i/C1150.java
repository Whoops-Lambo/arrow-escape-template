package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.StringFog;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ノ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C1150 {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static final EnumSet f3333 = EnumSet.of(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET, ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK, ISAdQualityInitError.NO_NETWORK_CONNECTION, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, ISAdQualityInitError.EXCEPTION_ON_INIT);

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final C0684 f3338;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final CopyOnWriteArraySet f3339 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public long f3337 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final AtomicBoolean f3336 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public volatile boolean f3335 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public volatile boolean f3334 = false;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m845(Set set, ISAdQualityInitError iSAdQualityInitError, String str) {
        long j;
        if (set == null) {
            return;
        }
        if (set == this.f3339 && this.f3335 && f3333.contains(iSAdQualityInitError)) {
            String strDecrypt = StringFog.decrypt("pbuKZhgVXzubuZpQHSRVLqizmVgSEA==\n", "xN/7OXF7Nk8=\n");
            String strName = iSAdQualityInitError.name();
            JSONObject jSONObjectJsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
            try {
                jSONObjectJsonObjectInit.put(StringFog.decrypt("UdKfM2A=\n", "NKDyQAcpwU4=\n"), strName);
                String strDecrypt2 = StringFog.decrypt("Fgdq\n", "f2MexyK+ptI=\n");
                synchronized (this) {
                    j = this.f3337;
                }
                if (j > 0) {
                    String str2 = AbstractC0388.f814;
                    jSONObjectJsonObjectInit.put(strDecrypt2, SystemClock.elapsedRealtime() - j);
                }
            } catch (JSONException unused) {
            }
            if (this.f3336.compareAndSet(false, true)) {
                AbstractC4631n.m405(new C1164(this, strDecrypt, jSONObjectJsonObjectInit));
            }
        }
        AbstractC4631n.m401(new C1165(set, iSAdQualityInitError, str));
    }

    public C1150(C0684 c0684) {
        this.f3338 = c0684;
    }
}
