package com.unity3d.ads.core.domain.adload;

import com.ironsource.Hd;
import com.ironsource.Ue;
import com.unity3d.ads.core.data.model.AdObject;
import defpackage.cz;
import defpackage.dy;
import defpackage.zr0;
import gatewayprotocol.v1.AdResponseOuterClass;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001JT\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH¦@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/domain/adload/PreShowWebViewStrategy;", "", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "url", "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", Ue.n, "Lcz;", "adScope", "Lkotlin/Function2;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "Ldy;", "Lcom/unity3d/ads/core/domain/adload/PreloadedWebView;", "loadWebView", "Laz2;", Hd.f, "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/lang/String;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcz;Lzr0;Ldy;)Ljava/lang/Object;", "adPlayerScope", "Lcom/unity3d/ads/core/domain/adload/WebViewContainerResult;", "acquireForShow", "(Lcz;Lcom/unity3d/ads/core/data/model/AdObject;Ldy;)Ljava/lang/Object;", "onShowComplete", "(Lcom/unity3d/ads/core/data/model/AdObject;Ldy;)Ljava/lang/Object;", "onAdExpired", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PreShowWebViewStrategy {
    @Nullable
    Object acquireForShow(@NotNull cz czVar, @NotNull AdObject adObject, @NotNull dy dyVar);

    @Nullable
    Object onAdExpired(@NotNull AdObject adObject, @NotNull dy dyVar);

    @Nullable
    Object onLoadSuccess(@NotNull AdObject adObject, @NotNull String str, @NotNull AdResponseOuterClass.AdResponse adResponse, @NotNull cz czVar, @NotNull zr0 zr0Var, @NotNull dy dyVar);

    @Nullable
    Object onShowComplete(@NotNull AdObject adObject, @NotNull dy dyVar);
}
