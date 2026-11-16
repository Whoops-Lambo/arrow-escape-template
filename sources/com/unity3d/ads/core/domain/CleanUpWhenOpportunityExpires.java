package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.adload.PreShowWebViewStrategy;
import com.unity3d.ads.core.log.Logger;
import defpackage.az2;
import defpackage.c91;
import defpackage.cz;
import defpackage.d;
import defpackage.h00;
import defpackage.kc2;
import defpackage.li2;
import defpackage.tb5;
import defpackage.u12;
import defpackage.uy;
import defpackage.vy;
import defpackage.wy;
import defpackage.yr;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "", "Luy;", "defaultDispatcher", "Lcom/unity3d/ads/core/log/Logger;", "logger", "Lcom/unity3d/ads/core/domain/adload/PreShowWebViewStrategy;", "preShowStrategy", "<init>", "(Luy;Lcom/unity3d/ads/core/log/Logger;Lcom/unity3d/ads/core/domain/adload/PreShowWebViewStrategy;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Laz2;", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "Lcom/unity3d/ads/core/log/Logger;", "Lcom/unity3d/ads/core/domain/adload/PreShowWebViewStrategy;", "Lwy;", "coroutineExceptionHandler", "Lwy;", "Lcz;", "coroutineScope", "Lcz;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CleanUpWhenOpportunityExpires {

    @NotNull
    private final wy coroutineExceptionHandler;

    @NotNull
    private final cz coroutineScope;

    @NotNull
    private final Logger logger;

    @NotNull
    private final PreShowWebViewStrategy preShowStrategy;

    /* JADX INFO: Access modifiers changed from: private */
    public static final az2 invoke$lambda$2(c91 c91Var, Throwable th) {
        c91Var.cancel(null);
        return az2.a;
    }

    public CleanUpWhenOpportunityExpires(@NotNull uy uyVar, @NotNull Logger logger, @NotNull PreShowWebViewStrategy preShowWebViewStrategy) {
        uyVar.getClass();
        logger.getClass();
        preShowWebViewStrategy.getClass();
        this.logger = logger;
        this.preShowStrategy = preShowWebViewStrategy;
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(vy.a, this);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = kc2.a(h00.o(tb5.a(), uyVar).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    public final void invoke(@NotNull AdObject adObject) {
        cz adScope;
        adObject.getClass();
        if (adObject.getAdScope() != null) {
            li2 li2VarT = tb5.t(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, this, null), 3);
            AdPlayer adPlayer = adObject.getAdPlayer();
            if (adPlayer == null || (adScope = adPlayer.getScope()) == null) {
                adScope = adObject.getAdScope();
            }
            u12.j(adScope.getA()).invokeOnCompletion(new yr(li2VarT, 0));
            return;
        }
        d.r("AdObject does not have an adScope.");
    }
}
