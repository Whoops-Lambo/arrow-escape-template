package io.p071bidmachine;

import io.p071bidmachine.core.k;
import io.p071bidmachine.rendering.model.q;
import io.p071bidmachine.util.m;
import io.p071bidmachine.util.viewabilitytracker.model.a;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0004J#\u0010\u0011\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0002H&¢\u0006\u0004\b\u0015\u0010\u0004J\u000f\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0004J\u000f\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0004J\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u00020\u00022\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001cH&¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\u00022\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010 J!\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b&\u0010%ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006'À\u0006\u0001"}, d2 = {"Lio/bidmachine/AdProcessCallback;", "", "Laz2;", "processLoadSuccess", "()V", "Lio/bidmachine/utils/a;", "bmError", "processLoadFail", "(Lio/bidmachine/utils/a;)V", "processFillAd", "processShowFail", "processShown", "processVisibilityTrackerShown", "Lio/bidmachine/util/m;", "systemComponent", "Lio/bidmachine/rendering/model/q;", "clickData", "processClicked", "(Lio/bidmachine/util/m;Lio/bidmachine/rendering/model/q;)V", "processClickVerified", "processFinished", "processClosed", "processExpired", "processDestroy", "Lio/bidmachine/core/k;", "visibilitySource", "setVisibilitySource", "(Lio/bidmachine/core/k;)V", "", "", "params", "onBrokenCreativeEvent", "(Ljava/util/Map;)V", "onEngagedClick", "Lio/bidmachine/util/viewabilitytracker/model/a;", "actionEvent", "onNetworkViewabilityEvent", "(Lio/bidmachine/util/viewabilitytracker/model/a;Lio/bidmachine/utils/a;)V", "onVisibilityTrackerViewabilityEvent", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface AdProcessCallback {
    void onBrokenCreativeEvent(@Nullable Map<String, ? extends Object> params);

    void onNetworkViewabilityEvent(@NotNull a actionEvent, @Nullable io.p071bidmachine.utils.a bmError);

    void onVisibilityTrackerViewabilityEvent(@NotNull a actionEvent, @Nullable io.p071bidmachine.utils.a bmError);

    void processClickVerified(@Nullable m systemComponent, @Nullable q clickData);

    void processClicked(@Nullable m systemComponent, @Nullable q clickData);

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(@NotNull io.p071bidmachine.utils.a bmError);

    void processLoadSuccess();

    void processShowFail(@NotNull io.p071bidmachine.utils.a bmError);

    void processShown();

    void processVisibilityTrackerShown();

    void setVisibilitySource(@NotNull k visibilitySource);

    default void onEngagedClick(@NotNull Map<String, ? extends Object> params) {
        params.getClass();
    }
}
