package com.applovin.sdk;

import android.content.Context;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.AppLovinSdkInitializationConfigurationImpl;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface AppLovinSdkInitializationConfiguration {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface Builder {
        AppLovinSdkInitializationConfiguration build();

        List<String> getAdUnitIds();

        @Nullable
        String getMediationProvider();

        @Nullable
        String getPluginVersion();

        String getSdkKey();

        @Nullable
        MaxSegmentCollection getSegmentCollection();

        List<String> getTestDeviceAdvertisingIds();

        boolean isExceptionHandlerEnabled();

        Builder setAdUnitIds(List<String> list);

        Builder setExceptionHandlerEnabled(boolean z);

        Builder setMediationProvider(@Nullable String str);

        Builder setPluginVersion(@Nullable String str);

        Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection);

        Builder setTestDeviceAdvertisingIds(List<String> list);
    }

    List<String> getAdUnitIds();

    @Nullable
    String getAxonEventKey();

    @Nullable
    String getMediationProvider();

    @Nullable
    String getPluginVersion();

    @Nullable
    String getSdkKey();

    @Nullable
    MaxSegmentCollection getSegmentCollection();

    List<String> getTestDeviceAdvertisingIds();

    boolean isExceptionHandlerEnabled();

    static Builder builder(String str) {
        return builder(str, "");
    }

    static Builder builder(String str, String str2) {
        return new AppLovinSdkInitializationConfigurationImpl.BuilderImpl(str, str2);
    }

    @Deprecated
    static Builder builder(String str, Context context) {
        return builder(str, "");
    }
}
