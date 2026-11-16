package io.p071bidmachine;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.p071bidmachine.unified.d;
import io.p071bidmachine.utils.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class HeaderBiddingAdapter extends NetworkAdapter {
    @WorkerThread
    public abstract void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable;

    public HeaderBiddingAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i, adsTypeArr);
    }

    @WorkerThread
    public final void collectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        int adapterMinDeviceApiVersion = getAdapterMinDeviceApiVersion();
        if (Build.VERSION.SDK_INT < adapterMinDeviceApiVersion) {
            headerBiddingCollectParamsCallback.onCollectFail(a.a("minSdkVersion is " + adapterMinDeviceApiVersion));
        } else if (!isInitialized(contextProvider)) {
            headerBiddingCollectParamsCallback.onCollectFail(a.a("Adapter SDK not initialized"));
        } else {
            onCollectHeaderBiddingParams(contextProvider, dVar, networkAdUnit, headerBiddingAdRequestParams, headerBiddingCollectParamsCallback);
        }
    }
}
