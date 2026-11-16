package io.p071bidmachine;

import androidx.annotation.VisibleForTesting;
import defpackage.lu0;
import defpackage.o5;
import defpackage.oi;
import defpackage.qj0;
import defpackage.wr0;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import io.p071bidmachine.core.a;
import io.p071bidmachine.core.k;
import io.p071bidmachine.rendering.model.q;
import io.p071bidmachine.util.m;
import io.p071bidmachine.utils.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\bJ'\u0010\u0014\u001a\u00020\u00062\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001c\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\bJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u000f\u0010 \u001a\u00020\u0006H\u0016¢\u0006\u0004\b \u0010\bJ\u0017\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J%\u0010)\u001a\u00020\u00062\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0018\u00010%H\u0016¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\u00020\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0016¢\u0006\u0004\b+\u0010*J!\u0010.\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b0\u0010/J!\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b2\u00103J\r\u00105\u001a\u000204¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u000204¢\u0006\u0004\b7\u00106J\r\u00108\u001a\u000204¢\u0006\u0004\b8\u00106J\r\u00109\u001a\u000204¢\u0006\u0004\b9\u00106J\u0015\u0010;\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0001¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0001¢\u0006\u0004\b=\u0010<J#\u0010?\u001a\u00020\u00062\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\u0012H\u0007¢\u0006\u0004\b?\u0010\u0015J\r\u0010@\u001a\u00020\u0006¢\u0006\u0004\b@\u0010\bJ\u000f\u0010A\u001a\u000204H\u0007¢\u0006\u0004\bA\u00106J\u000f\u0010B\u001a\u000204H\u0007¢\u0006\u0004\bB\u00106J\u000f\u0010C\u001a\u000204H\u0007¢\u0006\u0004\bC\u00106R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR#\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002040G8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u00105\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010OR\u0014\u00107\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010OR\u0014\u0010P\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u00109\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010OR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010OR\u0014\u0010R\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010OR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010\"\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010Y¨\u0006Z"}, d2 = {"Lio/bidmachine/AdResponseAdProcessCallback;", "Lio/bidmachine/AdProcessCallback;", "Lio/bidmachine/AdResponse;", "adResponse", "<init>", "(Lio/bidmachine/AdResponse;)V", "Laz2;", "processLoadSuccess", "()V", "Lio/bidmachine/utils/a;", "bmError", "processLoadFail", "(Lio/bidmachine/utils/a;)V", "processFillAd", "processShowFail", "processShown", "processNetworkVisibilityEventShown", "processVisibilityTrackerShown", "Lkotlin/Function1;", "postback", "processResultShown", "(Lwr0;)V", "Lio/bidmachine/util/m;", "systemComponent", "Lio/bidmachine/rendering/model/q;", "clickData", "processClicked", "(Lio/bidmachine/util/m;Lio/bidmachine/rendering/model/q;)V", "processClickVerified", "processFinished", "processClosed", "processExpired", "processDestroy", "Lio/bidmachine/core/k;", "visibilitySource", "setVisibilitySource", "(Lio/bidmachine/core/k;)V", "", "", "", "params", "onBrokenCreativeEvent", "(Ljava/util/Map;)V", "onEngagedClick", "Lio/bidmachine/util/viewabilitytracker/model/a;", "actionEvent", "onNetworkViewabilityEvent", "(Lio/bidmachine/util/viewabilitytracker/model/a;Lio/bidmachine/utils/a;)V", "onVisibilityTrackerViewabilityEvent", "processViewabilityEvent", "getAdResponse", "()Lio/bidmachine/AdResponse;", "", "isLoaded", "()Z", "isLoading", "onLoading", "isShownTracked", "adProcessCallback", "appendCallback", "(Lio/bidmachine/AdProcessCallback;)V", "removeCallback", "action", "executeOnCallback", "destroy", "canSendShownCallback", "isBidMachineShowTracked", "isNetworkShowTracked", "Ljava/lang/ref/WeakReference;", "weakAdResponse", "Ljava/lang/ref/WeakReference;", "", "adProcessCallbackMap", "Ljava/util/Map;", "getAdProcessCallbackMap", "()Ljava/util/Map;", "mutexCallback", "Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoadTracked", "isVisibilityTrackerShownTracked", "isResultShownTracked", "", "Lio/bidmachine/TrackEventType;", "trackedEvents", "Ljava/util/Set;", "isFinished", "Z", "Lio/bidmachine/core/k;", "bidmachine-android-sdk_ba_3_8_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdResponseAdProcessCallback implements AdProcessCallback {

    @NotNull
    private final Map<AdProcessCallback, Boolean> adProcessCallbackMap;
    private volatile boolean isFinished;

    @NotNull
    private final AtomicBoolean isLoadTracked;

    @NotNull
    private final AtomicBoolean isLoaded;

    @NotNull
    private final AtomicBoolean isLoading;

    @NotNull
    private final AtomicBoolean isResultShownTracked;

    @NotNull
    private final AtomicBoolean isShownTracked;

    @NotNull
    private final AtomicBoolean isVisibilityTrackerShownTracked;

    @NotNull
    private final Object mutexCallback;

    @NotNull
    private final Set<TrackEventType> trackedEvents;

    @NotNull
    public volatile k visibilitySource;

    @NotNull
    private final WeakReference<AdResponse> weakAdResponse;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void processResultShown$default(AdResponseAdProcessCallback adResponseAdProcessCallback, wr0 wr0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            wr0Var = null;
        }
        adResponseAdProcessCallback.processResultShown(wr0Var);
    }

    @VisibleForTesting
    public final boolean canSendShownCallback() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.visibilitySource.ordinal()];
        if (i == 1) {
            return isBidMachineShowTracked();
        }
        if (i == 2) {
            return isNetworkShowTracked();
        }
        if (i == 3) {
            return isBidMachineShowTracked() && isNetworkShowTracked();
        }
        e.b();
        return false;
    }

    public final void destroy() {
        this.weakAdResponse.clear();
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.clear();
        }
    }

    @NotNull
    public final Map<AdProcessCallback, Boolean> getAdProcessCallbackMap() {
        return this.adProcessCallbackMap;
    }

    @Nullable
    public final AdResponse getAdResponse() {
        return this.weakAdResponse.get();
    }

    @VisibleForTesting
    public final boolean isBidMachineShowTracked() {
        return this.isVisibilityTrackerShownTracked.get();
    }

    public final boolean isLoaded() {
        return this.isLoaded.get();
    }

    public final boolean isLoading() {
        return this.isLoading.get();
    }

    @VisibleForTesting
    public final boolean isNetworkShowTracked() {
        return this.isShownTracked.get();
    }

    public final boolean isShownTracked() {
        return this.isResultShownTracked.get();
    }

    public final boolean onLoading() {
        return this.isLoading.compareAndSet(false, true);
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processDestroy() {
        executeOnCallback(j.k);
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new c(14, adResponse));
            adResponse.destroy();
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processLoadSuccess() {
        if (this.isLoadTracked.compareAndSet(false, true)) {
            this.isLoaded.set(true);
            this.isLoading.set(false);
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                a.b(adResponse.tag, new c(16, adResponse));
                adResponse.processLoadSuccess();
            }
            UserAgentManager.updateWebViewUserAgent();
            executeOnCallback(j.o);
        }
    }

    @VisibleForTesting
    public final void processNetworkVisibilityEventShown() {
        if (this.isShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown$default(this, null, 1, null);
        }
    }

    @VisibleForTesting
    public final void processResultShown(@Nullable wr0 postback) {
        if (this.isResultShownTracked.compareAndSet(false, true)) {
            AdResponse adResponse = getAdResponse();
            if (adResponse != null) {
                a.b(adResponse.tag, new c(15, adResponse));
                adResponse.processShown();
                if (postback != null) {
                    postback.invoke(adResponse);
                }
            }
            executeOnCallback(j.p);
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processShown() {
        if (this.isShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown(new o5(this, 16));
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processVisibilityTrackerShown() {
        if (this.isVisibilityTrackerShownTracked.compareAndSet(false, true) && canSendShownCallback()) {
            processResultShown$default(this, null, 1, null);
        }
    }

    public AdResponseAdProcessCallback(@NotNull AdResponse adResponse) {
        adResponse.getClass();
        this.weakAdResponse = new WeakReference<>(adResponse);
        this.adProcessCallbackMap = new WeakHashMap();
        this.mutexCallback = new Object();
        this.isLoaded = new AtomicBoolean(false);
        this.isLoading = new AtomicBoolean(false);
        this.isLoadTracked = new AtomicBoolean(false);
        this.isShownTracked = new AtomicBoolean(false);
        this.isVisibilityTrackerShownTracked = new AtomicBoolean(false);
        this.isResultShownTracked = new AtomicBoolean(false);
        this.trackedEvents = new CopyOnWriteArraySet();
        this.visibilitySource = k.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onBrokenCreativeEvent$lambda$22$lambda$21(AdResponse adResponse) {
        adResponse.getClass();
        return "onBrokenCreativeEvent - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onEngagedClick$lambda$24$lambda$23(AdResponse adResponse) {
        adResponse.getClass();
        return "onEngagedClick - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processClickVerified$lambda$12$lambda$11(AdResponse adResponse) {
        adResponse.getClass();
        return "processClickVerified - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processClosed$lambda$16$lambda$15(AdResponseAdProcessCallback adResponseAdProcessCallback, AdResponse adResponse) {
        adResponseAdProcessCallback.getClass();
        adResponse.getClass();
        return "processClosed (" + adResponseAdProcessCallback.isFinished + ") - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processDestroy$lambda$20$lambda$19(AdResponse adResponse) {
        adResponse.getClass();
        return "processDestroy - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processExpired$lambda$18$lambda$17(AdResponse adResponse) {
        adResponse.getClass();
        return "processExpired - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processFillAd$lambda$5$lambda$4(AdResponse adResponse) {
        adResponse.getClass();
        return "processFillAd - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processFinished$lambda$14$lambda$13(AdResponse adResponse) {
        adResponse.getClass();
        return "processFinished - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processLoadFail$lambda$3$lambda$2(io.p071bidmachine.utils.a aVar) {
        aVar.getClass();
        return "processLoadFail - " + aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processLoadSuccess$lambda$1$lambda$0(AdResponse adResponse) {
        adResponse.getClass();
        return "processLoadSuccess - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processResultShown$lambda$9$lambda$8(AdResponse adResponse) {
        adResponse.getClass();
        return "processShown - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processShowFail$lambda$7$lambda$6(io.p071bidmachine.utils.a aVar) {
        aVar.getClass();
        return "processShowFail - " + aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$25(int i, AdResponse adResponse) {
        adResponse.getClass();
        return "processViewabilityEvent (Unknown action code - " + i + ") - " + adResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$26(io.p071bidmachine.util.viewabilitytracker.model.a aVar, io.p071bidmachine.utils.a aVar2) {
        aVar.getClass();
        return "processViewabilityEvent (" + aVar + "), error - " + aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String processViewabilityEvent$lambda$27(io.p071bidmachine.util.viewabilitytracker.model.a aVar, AdResponse adResponse) {
        aVar.getClass();
        adResponse.getClass();
        return "processViewabilityEvent (" + aVar + ") - " + adResponse;
    }

    public final void appendCallback(@NotNull AdProcessCallback adProcessCallback) {
        adProcessCallback.getClass();
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.put(adProcessCallback, Boolean.TRUE);
        }
    }

    @VisibleForTesting
    public final void executeOnCallback(@NotNull wr0 action) {
        action.getClass();
        synchronized (this.mutexCallback) {
            ArrayList arrayList = new ArrayList(this.adProcessCallbackMap.keySet());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AdProcessCallback adProcessCallback = (AdProcessCallback) obj;
                adProcessCallback.getClass();
                action.invoke(adProcessCallback);
            }
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void onBrokenCreativeEvent(@Nullable Map<String, ? extends Object> params) {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new c(9, adResponse));
            adResponse.eventFinish(TrackEventType.BrokenCreativeDetector, false, (Map<String, Object>) params);
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void onEngagedClick(@NotNull Map<String, ? extends Object> params) {
        params.getClass();
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new c(13, adResponse));
            adResponse.eventFinish(TrackEventType.EngagedClick, false, (Map<String, Object>) params);
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void onNetworkViewabilityEvent(@NotNull io.p071bidmachine.util.viewabilitytracker.model.a actionEvent, @Nullable io.p071bidmachine.utils.a bmError) {
        actionEvent.getClass();
        processViewabilityEvent(actionEvent, bmError);
        if (actionEvent.b && bmError == null) {
            processNetworkVisibilityEventShown();
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void onVisibilityTrackerViewabilityEvent(@NotNull io.p071bidmachine.util.viewabilitytracker.model.a actionEvent, @Nullable io.p071bidmachine.utils.a bmError) {
        actionEvent.getClass();
        processViewabilityEvent(actionEvent, bmError);
        if (actionEvent.b && bmError == null) {
            processVisibilityTrackerShown();
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processClickVerified(@Nullable m systemComponent, @Nullable q clickData) {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new c(10, adResponse));
            adResponse.processClickVerified(systemComponent, clickData);
        }
        executeOnCallback(new oi(16, systemComponent, clickData));
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processClicked(@Nullable m systemComponent, @Nullable q clickData) {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            if (adResponse.processClicked()) {
                processClickVerified(systemComponent, clickData);
                return;
            }
            return;
        }
        processClickVerified(systemComponent, clickData);
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processClosed() {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new lu0(23, this, adResponse));
            adResponse.processClosed(this.isFinished);
        }
        executeOnCallback(j.j);
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processExpired() {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new c(8, adResponse));
            adResponse.processExpired();
        } else {
            adResponse = null;
        }
        executeOnCallback(j.l);
        if (adResponse != null) {
            adResponse.notifyExpired(false);
        }
        processDestroy();
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processFillAd() {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new c(11, adResponse));
            adResponse.processFillAd();
        }
        executeOnCallback(j.m);
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processFinished() {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new c(12, adResponse));
            adResponse.processFinished();
            this.isFinished = true;
        }
        executeOnCallback(j.n);
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processLoadFail(@NotNull io.p071bidmachine.utils.a bmError) {
        bmError.getClass();
        int i = 0;
        if (!this.isLoadTracked.compareAndSet(false, true)) {
            return;
        }
        this.isLoaded.set(false);
        this.isLoading.set(false);
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            a.b(adResponse.tag, new e(bmError, 2));
            adResponse.processLoadFail(bmError);
        }
        executeOnCallback(new k(bmError, i));
        processDestroy();
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void processShowFail(@NotNull io.p071bidmachine.utils.a bmError) {
        bmError.getClass();
        AdResponse adResponse = getAdResponse();
        int i = 1;
        if (adResponse != null) {
            a.b(adResponse.tag, new e(bmError, i));
            adResponse.processShowFail(bmError);
        }
        executeOnCallback(new k(bmError, i));
    }

    @VisibleForTesting
    public final void processViewabilityEvent(@NotNull io.p071bidmachine.util.viewabilitytracker.model.a actionEvent, @Nullable io.p071bidmachine.utils.a bmError) {
        actionEvent.getClass();
        AdResponse adResponse = getAdResponse();
        if (adResponse != null) {
            int i = actionEvent.a;
            TrackEventType trackEventTypeFromNumber = TrackEventType.fromNumber(i);
            if (trackEventTypeFromNumber == null) {
                a.f(adResponse.tag, new qj0(i, adResponse));
                return;
            }
            if (!this.trackedEvents.add(trackEventTypeFromNumber)) {
                return;
            }
            i iVar = adResponse.tag;
            if (bmError != null) {
                a.f(iVar, new lu0(21, actionEvent, bmError));
            } else {
                a.b(iVar, new lu0(22, actionEvent, adResponse));
            }
            adResponse.eventFinish(trackEventTypeFromNumber, actionEvent.b, bmError);
        }
    }

    public final void removeCallback(@NotNull AdProcessCallback adProcessCallback) {
        adProcessCallback.getClass();
        synchronized (this.mutexCallback) {
            this.adProcessCallbackMap.remove(adProcessCallback);
        }
    }

    @Override // io.p071bidmachine.AdProcessCallback
    public void setVisibilitySource(@NotNull k visibilitySource) {
        visibilitySource.getClass();
        this.visibilitySource = visibilitySource;
    }
}
