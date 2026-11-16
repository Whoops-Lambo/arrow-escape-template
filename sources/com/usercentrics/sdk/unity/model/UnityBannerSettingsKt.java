package com.usercentrics.sdk.unity.model;

import android.graphics.Color;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dk2;
import defpackage.e32;
import defpackage.kk2;
import defpackage.pv1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u0001H\u0002¢\u0006\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"optionalValueOrNull", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "parseColor", "", "", "(Ljava/lang/String;)Ljava/lang/Integer;", "usercentrics-ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UnityBannerSettingsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T optionalValueOrNull(T t) {
        if (t == 0) {
            return null;
        }
        if (t instanceof Float) {
            if (((Number) t).floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return null;
            }
        } else {
            if (!(t instanceof Integer)) {
                e32.o(t, " - reason: unknown type", "[USERCENTRICS] error when parsing optional value ");
                return null;
            }
            if (((Number) t).intValue() <= 0) {
                return null;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer parseColor(String str) {
        if (str == null || dk2.Z(str)) {
            return null;
        }
        try {
            return Integer.valueOf(kk2.L(str, "#", false) ? Color.parseColor(str) : Color.parseColor("#".concat(str)));
        } catch (Exception e) {
            throw new IllegalArgumentException(pv1.n("[USERCENTRICS] error when parsing color with HEX<", str, ">"), e);
        }
    }
}
