package com.vungle.ads;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vungle/ads/VungleMediationLogger;", "", "Lcom/vungle/ads/VungleAdType;", "ad", "", "message", "Laz2;", "logError", "(Lcom/vungle/ads/VungleAdType;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleMediationLogger {

    @NotNull
    public static final VungleMediationLogger INSTANCE = new VungleMediationLogger();

    public static final void logError(@Nullable VungleAdType ad, @NotNull String message) {
        s sVarAccess$getAdLogEntry;
        message.getClass();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        Sdk.SDKError.Reason reason = Sdk.SDKError.Reason.MEDIATION_ERROR;
        if (ad != null) {
            sVarAccess$getAdLogEntry = VungleMediationLoggerKt.access$getAdLogEntry(ad);
        } else {
            sVarAccess$getAdLogEntry = null;
        }
        analyticsClient.c(reason, message, sVarAccess$getAdLogEntry);
    }
}
