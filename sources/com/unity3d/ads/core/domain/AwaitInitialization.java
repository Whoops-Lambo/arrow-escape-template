package com.unity3d.ads.core.domain;

import defpackage.d;
import defpackage.dy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦B¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/core/domain/AwaitInitialization;", "", "", "timeout", "Lcom/unity3d/ads/core/data/model/InitializationState;", "invoke", "(JLdy;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AwaitInitialization {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(AwaitInitialization awaitInitialization, long j, dy dyVar, int i, Object obj) {
            if (obj != null) {
                d.u("Super calls with default arguments not supported in this target, function: invoke");
                return null;
            }
            if ((i & 1) != 0) {
                j = Long.MAX_VALUE;
            }
            return awaitInitialization.invoke(j, dyVar);
        }
    }

    @Nullable
    Object invoke(long j, @NotNull dy dyVar);
}
