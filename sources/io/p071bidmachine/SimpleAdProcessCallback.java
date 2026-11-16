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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J#\u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010!\u001a\u00020\u00042\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010&J!\u0010'\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b'\u0010&¨\u0006("}, d2 = {"Lio/bidmachine/SimpleAdProcessCallback;", "Lio/bidmachine/AdProcessCallback;", "<init>", "()V", "Laz2;", "processLoadSuccess", "Lio/bidmachine/utils/a;", "bmError", "processLoadFail", "(Lio/bidmachine/utils/a;)V", "processFillAd", "processShowFail", "processShown", "processVisibilityTrackerShown", "Lio/bidmachine/util/m;", "systemComponent", "Lio/bidmachine/rendering/model/q;", "clickData", "processClicked", "(Lio/bidmachine/util/m;Lio/bidmachine/rendering/model/q;)V", "processClickVerified", "processFinished", "processClosed", "processExpired", "processDestroy", "Lio/bidmachine/core/k;", "visibilitySource", "setVisibilitySource", "(Lio/bidmachine/core/k;)V", "", "", "", "params", "onBrokenCreativeEvent", "(Ljava/util/Map;)V", "Lio/bidmachine/util/viewabilitytracker/model/a;", "actionEvent", "onNetworkViewabilityEvent", "(Lio/bidmachine/util/viewabilitytracker/model/a;Lio/bidmachine/utils/a;)V", "onVisibilityTrackerViewabilityEvent", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class SimpleAdProcessCallback implements AdProcessCallback {
    @Override // io.p071bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(@Nullable Map<String, ? extends Object> params) {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processClickVerified(@Nullable m systemComponent, @Nullable q clickData) {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processClicked(@Nullable m systemComponent, @Nullable q clickData) {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processClosed() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processDestroy() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processExpired() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processFillAd() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processFinished() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processLoadSuccess() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processShown() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processVisibilityTrackerShown() {
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void onNetworkViewabilityEvent(@NotNull a actionEvent, @Nullable io.p071bidmachine.utils.a bmError) {
        actionEvent.getClass();
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void onVisibilityTrackerViewabilityEvent(@NotNull a actionEvent, @Nullable io.p071bidmachine.utils.a bmError) {
        actionEvent.getClass();
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processLoadFail(@NotNull io.p071bidmachine.utils.a bmError) {
        bmError.getClass();
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processShowFail(@NotNull io.p071bidmachine.utils.a bmError) {
        bmError.getClass();
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void setVisibilitySource(@NotNull k visibilitySource) {
        visibilitySource.getClass();
    }
}
