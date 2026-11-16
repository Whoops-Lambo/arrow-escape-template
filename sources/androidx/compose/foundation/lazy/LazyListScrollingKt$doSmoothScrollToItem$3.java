package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dy;
import defpackage.rc1;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@t50(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", l = {Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 205}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollScope;", "Laz2;", "<anonymous>", "(Landroidx/compose/foundation/gestures/ScrollScope;)V"}, k = 3, mv = {1, 6, 0})
final class LazyListScrollingKt$doSmoothScrollToItem$3 extends ul2 implements zr0 {

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Laz2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass2 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/AnimationScope;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "Laz2;", "invoke", "(Landroidx/compose/animation/core/AnimationScope;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass4 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            AnimationScope animationScope = (AnimationScope) obj;
            animationScope.getClass();
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = animationScope.e;
            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                ((Number) parcelableSnapshotMutableState.getA()).floatValue();
            }
            throw null;
        }
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        throw null;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        throw null;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }
}
