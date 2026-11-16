package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public enum e0 {
    XmlParsing(100),
    Wrapper(300),
    WrapperTimeout(Sdk.SDKError.Reason.MRAID_ERROR_VALUE),
    WrapperLimit(Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE),
    WrapperNoAds(303),
    Linear(400),
    LinearFileNotFound(401),
    LinearNotSupportedMedia(403),
    Companion(600),
    /* JADX INFO: Fake field, exist only in values array */
    Undefined(900);

    public final int a;

    e0(int i) {
        this.a = i;
    }
}
