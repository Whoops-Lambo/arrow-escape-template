package io.p071bidmachine;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.k;
import defpackage.lu0;
import io.p071bidmachine.AdListener;
import io.p071bidmachine.AdRequest;
import io.p071bidmachine.IAd;
import io.p071bidmachine.core.j;
import io.p071bidmachine.models.a;
import io.p071bidmachine.models.b;
import io.p071bidmachine.models.c;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.utils.i;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class BidMachineAd<SelfType extends IAd, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends a, AdObjectParamsType extends b, UnifiedAdRequestParamsType extends d, AdListenerType extends AdListener<SelfType>> implements IAd<SelfType, AdRequestType> {

    @Nullable
    @VisibleForTesting
    AdRequestType adRequest;

    @NonNull
    private final AdsType adsType;

    @NonNull
    private final ContextProvider contextProvider;

    @Nullable
    private AdListenerType listener;

    @Nullable
    protected RendererConfiguration rendererConfiguration;
    private final i tag = new i("BidMachineAd");

    @NonNull
    private f0 currentState = f0.a;
    private final AdRequest.AdRequestListener<AdRequestType> adRequestListener = new z(this);
    private final h internalAdRequestListener = new a0(this);

    @VisibleForTesting
    final AdProcessCallback adProcessCallback = new e0(this);

    @NonNull
    @VisibleForTesting
    final BidMachineTrackingObject trackingObject = new BidMachineTrackingObject();

    @NonNull
    protected final AtomicBoolean isFinishTracked = new AtomicBoolean(false);

    @NonNull
    protected final AtomicBoolean isCloseTracked = new AtomicBoolean(false);

    public abstract AdObjectType createAdObject(@NonNull ContextProvider contextProvider, @NonNull AdRequestType adrequesttype, @NonNull NetworkAdapter networkAdapter, @NonNull b bVar, @NonNull AdProcessCallback adProcessCallback);

    public abstract boolean isDuplicateShowDisabled();

    private void attachRequest(@Nullable AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.addListener(this.adRequestListener);
            adrequesttype.addInternalListener(this.internalAdRequestListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyAdRequest() {
        AdRequestType adrequesttype = this.adRequest;
        this.adRequest = null;
        if (adrequesttype != null) {
            detachRequest(adrequesttype);
            adrequesttype.destroy();
        }
    }

    private void detachRequest(@Nullable AdRequestType adrequesttype) {
        if (adrequesttype != null) {
            adrequesttype.removeListener(this.adRequestListener);
            adrequesttype.removeInternalListener(this.internalAdRequestListener);
        }
    }

    private boolean isNetworkAvailableDuringShow() {
        if (k.a) {
            return true;
        }
        NetworkInfo activeNetworkInfo = null;
        try {
            ConnectivityManager connectivityManagerG = j.g(getContext());
            if (connectivityManagerG != null) {
                activeNetworkInfo = connectivityManagerG.getActiveNetworkInfo();
            }
        } catch (Throwable th) {
            io.p071bidmachine.core.a.i(th);
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String lambda$log$0(String str) {
        StringBuilder sb = new StringBuilder(this.adsType.name());
        c auctionResult = getAuctionResult();
        if (auctionResult != null) {
            sb.append(" (");
            sb.append(((i1) auctionResult).g);
            sb.append(")");
        }
        return ((Object) sb) + " - " + str;
    }

    private void processRequest(@NonNull AdRequestType adrequesttype) {
        log("process request start");
        if (getAuctionResult() != null) {
            processRequestSuccess(adrequesttype);
        } else {
            this.currentState = f0.b;
            adrequesttype.request(getContext());
        }
    }

    private void trackEvent(@NonNull TrackEventType trackEventType, @Nullable io.p071bidmachine.utils.a aVar) {
        this.trackingObject.eventFinish(trackEventType, false, getAdsType(), getAdResponse(), aVar);
    }

    @Override // io.p071bidmachine.IAd
    public void destroy() {
        this.adProcessCallback.processDestroy();
        this.trackingObject.clear();
    }

    @Nullable
    public final AdResponse getAdResponse() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAdResponse();
        }
        return null;
    }

    @NonNull
    public AdsType getAdsType() {
        return this.adsType;
    }

    @Override // io.p071bidmachine.IAd
    @Nullable
    public c getAuctionResult() {
        AdRequestType adrequesttype = this.adRequest;
        if (adrequesttype != null) {
            return adrequesttype.getAuctionResult();
        }
        return null;
    }

    @NonNull
    public Context getContext() {
        return this.contextProvider.getApplicationContext();
    }

    @NonNull
    public ContextProvider getContextProvider() {
        return this.contextProvider;
    }

    @Override // io.p071bidmachine.IAd
    public boolean isDestroyed() {
        return this.currentState == f0.f;
    }

    @Override // io.p071bidmachine.IAd
    public boolean isExpired() {
        return this.currentState == f0.g;
    }

    @Override // io.p071bidmachine.IAd
    public boolean isLoading() {
        f0 f0Var = this.currentState;
        return f0Var == f0.b || f0Var == f0.c;
    }

    @Override // io.p071bidmachine.IAd
    @NonNull
    public SelfType load(AdRequestType adrequesttype) {
        log("load requested");
        this.trackingObject.eventStart(TrackEventType.Load);
        if (!p1.d().c.get()) {
            processRequestFail(io.p071bidmachine.utils.a.c("BidMachine not initialized"));
            return this;
        }
        if (this.currentState != f0.a) {
            log("request process abort because it's already processing");
            return this;
        }
        if (adrequesttype == null) {
            processRequestFail(io.p071bidmachine.utils.a.d("AdRequest"));
            return this;
        }
        detachRequest(this.adRequest);
        this.adRequest = adrequesttype;
        attachRequest(adrequesttype);
        processRequest(adrequesttype);
        return this;
    }

    public final void log(@NonNull String str) {
        io.p071bidmachine.core.a.b(this.tag, new lu0(26, this, str));
    }

    public void processPrepareShow() {
        trackEvent(TrackEventType.ImpressionOpportunity, null);
    }

    @VisibleForTesting
    public void processRequestFail(@NonNull io.p071bidmachine.utils.a aVar) {
        if (this.currentState.ordinal() > 2) {
            return;
        }
        trackEvent(TrackEventType.Load, aVar);
        this.adProcessCallback.processLoadFail(aVar);
    }

    @VisibleForTesting
    public void processRequestSuccess(@NonNull AdRequestType adrequesttype) {
        if (this.currentState.ordinal() > 2) {
            return;
        }
        this.currentState = f0.c;
        AdResponse adResponse = adrequesttype.getAdResponse();
        this.trackingObject.setAdResponse(adResponse);
        if (adResponse == null) {
            processRequestFail(io.p071bidmachine.utils.a.b("AdResponse is null"));
        } else {
            log("start loading");
            adResponse.loadAdObject(this.contextProvider, adrequesttype, this, this.adProcessCallback);
        }
    }

    public void processShowFail(@NonNull io.p071bidmachine.utils.a aVar) {
        trackEvent(TrackEventType.Show, aVar);
        this.adProcessCallback.processShowFail(aVar);
    }

    @NonNull
    public SelfType setListener(@Nullable AdListenerType adlistenertype) {
        this.listener = adlistenertype;
        return this;
    }

    @Override // io.p071bidmachine.IAd
    @NonNull
    public SelfType setRendererConfiguration(@Nullable RendererConfiguration rendererConfiguration) {
        this.rendererConfiguration = rendererConfiguration;
        return this;
    }

    @NonNull
    public String toString() {
        return this.tag + ", state - " + this.currentState + ", auctionResult - " + getAuctionResult();
    }

    public BidMachineAd(@NonNull Context context, @NonNull AdsType adsType) {
        this.contextProvider = new SimpleContextProvider(context);
        this.adsType = adsType;
    }

    @Nullable
    private AdObjectType prepareShow(boolean z) {
        processPrepareShow();
        if (!isNetworkAvailableDuringShow()) {
            processShowFail(io.p071bidmachine.utils.a.e);
            return null;
        }
        if (isDestroyed()) {
            processShowFail(io.p071bidmachine.utils.a.n);
            return null;
        }
        if (isExpired()) {
            processShowFail(io.p071bidmachine.utils.a.m);
            return null;
        }
        if (!isLoaded()) {
            processShowFail(io.p071bidmachine.utils.a.c("Ad not loaded"));
            return null;
        }
        if (z && !isCanShowAd()) {
            processShowFail(io.p071bidmachine.utils.a.l);
            return null;
        }
        return (AdObjectType) getLoadedAdObject();
    }

    @Override // io.p071bidmachine.IAd
    public boolean canShow() {
        if (isLoaded() && isCanShowAd() && isNetworkAvailableDuringShow()) {
            return true;
        }
        return false;
    }

    @Nullable
    public final AdObjectType getLoadedAdObject() {
        AdResponse adResponse = getAdResponse();
        if (adResponse == null) {
            return null;
        }
        try {
            return (AdObjectType) adResponse.getAdObject();
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean isCanShowAd() {
        AdResponse adResponse = getAdResponse();
        if (adResponse != null && !adResponse.wasShown()) {
            return true;
        }
        return false;
    }

    @Override // io.p071bidmachine.IAd
    public boolean isLoaded() {
        if (getLoadedAdObject() != null && this.currentState == f0.d) {
            return true;
        }
        return false;
    }

    @Nullable
    public AdObjectType prepareShow() {
        return (AdObjectType) prepareShow(isDuplicateShowDisabled());
    }
}
