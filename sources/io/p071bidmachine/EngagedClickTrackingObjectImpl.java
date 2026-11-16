package io.p071bidmachine;

import com.explorestack.protobuf.Value;
import io.p071bidmachine.iab.mraid.m;
import io.p071bidmachine.rendering.model.engagedclick.d;
import io.p071bidmachine.unified.c;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lio/bidmachine/EngagedClickTrackingObjectImpl;", "Lio/bidmachine/unified/c;", "unifiedAdCallback", "<init>", "(Lio/bidmachine/unified/c;)V", "Lio/bidmachine/rendering/model/engagedclick/d;", "engagedClickReport", "Laz2;", "reportEngagedClick", "(Lio/bidmachine/rendering/model/engagedclick/d;)V", "Lio/bidmachine/unified/c;", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EngagedClickTrackingObjectImpl {

    @NotNull
    private final c unifiedAdCallback;

    public EngagedClickTrackingObjectImpl(@NotNull c cVar) {
        cVar.getClass();
        this.unifiedAdCallback = cVar;
    }

    public void reportEngagedClick(@NotNull d engagedClickReport) {
        engagedClickReport.getClass();
        Value contextValue = EngagedClickTrackingObjectImplKt.toContextValue(engagedClickReport);
        if (contextValue == null) {
            return;
        }
        c cVar = this.unifiedAdCallback;
        Map<String, ? extends Object> mapSingletonMap = Collections.singletonMap("engaged_click_context", contextValue);
        mapSingletonMap.getClass();
        m mVar = (m) cVar;
        mVar.getClass();
        ((AdProcessCallback) mVar.a).onEngagedClick(mapSingletonMap);
    }
}
