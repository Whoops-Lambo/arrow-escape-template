package io.p071bidmachine;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.facebook.ads.a;
import io.p071bidmachine.unified.e;
import io.p071bidmachine.unified.g;
import io.p071bidmachine.unified.j;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class NetworkAdapter {
    private final int adapterMinDeviceApiVersion;

    @NonNull
    private final String adapterVersion;

    @NonNull
    private final String compiledNetworkSdkVersion;

    @NonNull
    private final String key;

    @Nullable
    private String networkSdkVersion;

    @NonNull
    private final AdsType[] supportedTypes;

    @NonNull
    private final AtomicBoolean isInitializing = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @NonNull
    private final Set<InternalNetworkInitializationCallback> initializeCallbackSet = new CopyOnWriteArraySet();

    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
    }

    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        return null;
    }

    @AnyThread
    public abstract boolean isNetworkInitializationStatusCheckSupported();

    @WorkerThread
    public abstract boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable;

    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
    }

    @WorkerThread
    public abstract void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable;

    public void onWinAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
    }

    public void setLogging(boolean z) throws Throwable {
    }

    public static boolean isSkipInitialization(@NonNull NetworkConfigParams networkConfigParams) {
        return Boolean.parseBoolean(networkConfigParams.getFromNetworkParams("skip_initialization"));
    }

    public e createBanner() {
        throw new IllegalArgumentException(getKey() + " adapter does not support banner");
    }

    public g createInterstitial() {
        throw new IllegalArgumentException(getKey() + " adapter does not support static interstitial");
    }

    public j createNativeAd() {
        throw new IllegalArgumentException(getKey() + " adapter does not support native ads");
    }

    public g createRewarded() {
        throw new IllegalArgumentException(getKey() + " adapter does not support rewarded interstitial");
    }

    public int getAdapterMinDeviceApiVersion() {
        return this.adapterMinDeviceApiVersion;
    }

    @NonNull
    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    @NonNull
    public String getKey() {
        return this.key;
    }

    @NonNull
    public AdsType[] getSupportedTypes() {
        return this.supportedTypes;
    }

    @WorkerThread
    public final void initialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull InternalNetworkInitializationCallback internalNetworkInitializationCallback) throws Throwable {
        if (Build.VERSION.SDK_INT < this.adapterMinDeviceApiVersion) {
            internalNetworkInitializationCallback.onFail(this, "minSdkVersion is " + this.adapterMinDeviceApiVersion);
        } else {
            if (isInitialized(contextProvider)) {
                internalNetworkInitializationCallback.onSuccess(this);
                return;
            }
            if (!isSkipInitialization(networkConfigParams)) {
                this.initializeCallbackSet.add(internalNetworkInitializationCallback);
                if (this.isInitializing.compareAndSet(false, true)) {
                    onNetworkInitialize(contextProvider, initializationParams, networkConfigParams, new a(this, 19));
                    return;
                }
                return;
            }
            if (!isNetworkInitializationStatusCheckSupported()) {
                io.p071bidmachine.core.a.c(getKey(), "Network initialization status check is not supported, force initialization to true");
                this.isInitialized.set(true);
            }
            io.p071bidmachine.core.a.c(getKey(), "Network initialization is skipped");
            internalNetworkInitializationCallback.onSuccess(this);
        }
    }

    public boolean isAdsTypeSupported(@NonNull AdsType adsType) {
        for (AdsType adsType2 : this.supportedTypes) {
            if (adsType2 == adsType) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInitialized(@NonNull ContextProvider contextProvider) {
        if (this.isInitialized.get()) {
            return true;
        }
        try {
            boolean zIsNetworkInitialized = isNetworkInitialized(contextProvider);
            this.isInitialized.compareAndSet(false, zIsNetworkInitialized);
            return zIsNetworkInitialized;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean isInitializing() {
        return this.isInitializing.get();
    }

    @NonNull
    public final String obtainNetworkSdkVersion() {
        if (!TextUtils.isEmpty(this.networkSdkVersion)) {
            return this.networkSdkVersion;
        }
        try {
            String networkSdkVersion = getNetworkSdkVersion();
            this.networkSdkVersion = networkSdkVersion;
            if (!TextUtils.isEmpty(networkSdkVersion)) {
                return this.networkSdkVersion;
            }
        } catch (Throwable unused) {
        }
        return this.compiledNetworkSdkVersion;
    }

    public NetworkAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i, @NonNull AdsType[] adsTypeArr) {
        this.key = str;
        this.compiledNetworkSdkVersion = str2;
        this.adapterVersion = str3;
        this.adapterMinDeviceApiVersion = i;
        this.supportedTypes = adsTypeArr;
    }

    public final boolean isInitialized(@NonNull Context context) {
        return isInitialized(new SimpleContextProvider(context));
    }
}
