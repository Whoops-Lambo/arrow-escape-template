package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.e80;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/APIFailedStatusCodeError;", "Lcom/vungle/ads/VungleError;", "message", "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class APIFailedStatusCodeError extends VungleError {
    public APIFailedStatusCodeError(@Nullable String str) {
        super(Sdk.SDKError.Reason.API_FAILED_STATUS_CODE, d.a("Failed to get a successful response: ", str), null);
    }

    public /* synthetic */ APIFailedStatusCodeError(String str, int i, e80 e80Var) {
        this((i & 1) != 0 ? null : str);
    }

    public APIFailedStatusCodeError() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
