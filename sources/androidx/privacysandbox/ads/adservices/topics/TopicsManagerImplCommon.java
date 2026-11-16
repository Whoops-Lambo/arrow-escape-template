package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import defpackage.dy;
import defpackage.wz2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresExtension.Container
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManager;", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;", "request", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/GetTopicsRequest;Ldy;)Ljava/lang/Object;", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi"})
@RestrictTo
public class TopicsManagerImplCommon extends TopicsManager {
    public GetTopicsResponse c() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission
    @DoNotInline
    public static Object d(TopicsManagerImplCommon topicsManagerImplCommon, GetTopicsRequest getTopicsRequest, dy dyVar) {
        TopicsManagerImplCommon$getTopics$1 topicsManagerImplCommon$getTopics$1;
        if (dyVar instanceof TopicsManagerImplCommon$getTopics$1) {
            topicsManagerImplCommon$getTopics$1 = (TopicsManagerImplCommon$getTopics$1) dyVar;
            int i = topicsManagerImplCommon$getTopics$1.t;
            if ((i & Integer.MIN_VALUE) != 0) {
                topicsManagerImplCommon$getTopics$1.t = i - Integer.MIN_VALUE;
            } else {
                topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, dyVar);
            }
        } else {
            topicsManagerImplCommon$getTopics$1 = new TopicsManagerImplCommon$getTopics$1(topicsManagerImplCommon, dyVar);
        }
        Object obj = topicsManagerImplCommon$getTopics$1.r;
        int i2 = topicsManagerImplCommon$getTopics$1.t;
        if (i2 == 0) {
            wz2.a0(obj);
            topicsManagerImplCommon.b(getTopicsRequest);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wz2.a0(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission
    @DoNotInline
    @Nullable
    public Object a(@NotNull GetTopicsRequest getTopicsRequest, @NotNull dy dyVar) {
        return d(this, getTopicsRequest, dyVar);
    }

    public void b(GetTopicsRequest getTopicsRequest) {
        getTopicsRequest.getClass();
        throw new RuntimeException("Stub!");
    }
}
