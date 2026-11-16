package com.google.unity.ads.nextgen;

import android.app.Activity;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationConfig;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationStatus;
import com.google.android.libraries.ads.mobile.sdk.initialization.OnAdapterInitializationCompleteListener;
import com.unity3d.services.UnityAdsConstants;
import defpackage.e32;
import defpackage.jc1;
import defpackage.oz2;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class UnityMobileAds {
    private static final String APPLICATION_ID_KEY = "com.google.android.gms.ads.APPLICATION_ID";
    private static final String TAG = "UnityMobileAds";
    private static MobileAdsWrapper mobileAdsWrapper = new MobileAdsWrapper();
    private static final Object stateLock = new Object();
    private static volatile boolean isMobileAdsInitialized = false;
    private static volatile RequestConfiguration requestConfiguration = new RequestConfiguration.Builder().build();
    private static volatile float userVolume = -1.0f;
    private static volatile boolean isMuted = false;
    private static volatile boolean isPublisherFirstPartyIdEnabled = false;

    @Nullable
    private static String getApplicationMetaData(Activity activity, String str) {
        if (activity == null) {
            Log.e(TAG, "Unity Activity is null. Cannot read Application ID.");
            return null;
        }
        try {
            Bundle bundle = activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData;
            if (bundle != null && bundle.containsKey(str)) {
                return bundle.getString(str);
            }
            Log.e(TAG, "Application ID not found in manifest!");
            return null;
        } catch (Exception e) {
            jc1.x("Error reading application ID from manifest: ", e.getMessage(), TAG);
        }
    }

    public static RequestConfiguration getRequestConfiguration() {
        synchronized (stateLock) {
            try {
                if (isMobileAdsInitialized) {
                    return mobileAdsWrapper.getRequestConfiguration();
                }
                return requestConfiguration;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String getSdkVersionString() {
        return mobileAdsWrapper.getVersionString();
    }

    private static /* synthetic */ void lambda$initialize$0(OnAdapterInitializationCompleteListener onAdapterInitializationCompleteListener, InitializationStatus initializationStatus) {
        synchronized (stateLock) {
            try {
                isMobileAdsInitialized = true;
                requestConfiguration = null;
                if (isPublisherFirstPartyIdEnabled) {
                    mobileAdsWrapper.putPublisherFirstPartyIdEnabled(true);
                    isPublisherFirstPartyIdEnabled = false;
                }
                if (userVolume >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    mobileAdsWrapper.setUserControlledAppVolume(userVolume);
                    userVolume = -1.0f;
                }
                if (isMuted) {
                    mobileAdsWrapper.setUserMutedApp(isMuted);
                    isMuted = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        onAdapterInitializationCompleteListener.onAdapterInitializationComplete(initializationStatus);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        synchronized (stateLock) {
            try {
                if (isMobileAdsInitialized) {
                    return mobileAdsWrapper.putPublisherFirstPartyIdEnabled(z);
                }
                isPublisherFirstPartyIdEnabled = z;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setApplicationMuted(boolean z) {
        synchronized (stateLock) {
            try {
                if (isMobileAdsInitialized) {
                    mobileAdsWrapper.setUserMutedApp(z);
                } else {
                    isMuted = z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public static void setMobileAdsWrapper(MobileAdsWrapper mobileAdsWrapper2) {
        mobileAdsWrapper = mobileAdsWrapper2;
    }

    public static void setRequestConfiguration(RequestConfiguration requestConfiguration2) {
        synchronized (stateLock) {
            try {
                if (isMobileAdsInitialized) {
                    mobileAdsWrapper.setRequestConfiguration(requestConfiguration2);
                } else {
                    requestConfiguration = requestConfiguration2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setUserControlledAppVolume(float f) {
        synchronized (stateLock) {
            try {
                if (isMobileAdsInitialized) {
                    mobileAdsWrapper.setUserControlledAppVolume(f);
                } else {
                    userVolume = f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private UnityMobileAds() {
    }

    public static void initialize(Activity activity, OnAdapterInitializationCompleteListener onAdapterInitializationCompleteListener) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            String applicationMetaData = getApplicationMetaData(activity, APPLICATION_ID_KEY);
            if (applicationMetaData == null) {
                Log.e(TAG, "Application ID is null. Cannot initialize the Google Mobile Ads SDK.");
                return;
            }
            InitializationConfig.Builder builder = new InitializationConfig.Builder(applicationMetaData);
            synchronized (stateLock) {
                try {
                    if (requestConfiguration != null) {
                        builder = builder.setRequestConfiguration(requestConfiguration);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            mobileAdsWrapper.initialize(activity, builder.build(), new oz2());
            return;
        }
        e32.i("Initialize must not be called on the UI thread.");
    }
}
