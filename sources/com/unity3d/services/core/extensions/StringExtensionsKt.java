package com.unity3d.services.core.extensions;

import com.unity3d.services.UnityAdsConstants;
import defpackage.n30;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001¨\u0006\u0002"}, d2 = {"toUnityMessage", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StringExtensionsKt {
    @NotNull
    public static final String toUnityMessage(@Nullable String str) {
        return (str == null || str.length() == 0) ? "[Unity Ads] Internal error" : n30.y(UnityAdsConstants.Messages.MSG_UNITY_BASE, str);
    }
}
