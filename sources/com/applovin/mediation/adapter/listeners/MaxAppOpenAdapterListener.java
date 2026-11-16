package com.applovin.mediation.adapter.listeners;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.mediation.adapter.MaxAdapterError;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface MaxAppOpenAdapterListener extends MaxAdapterListener {
    void onAppOpenAdClicked();

    void onAppOpenAdClicked(@Nullable Bundle bundle);

    void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError);

    void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError, @Nullable Bundle bundle);

    void onAppOpenAdDisplayed();

    void onAppOpenAdDisplayed(@Nullable Bundle bundle);

    void onAppOpenAdHidden();

    void onAppOpenAdHidden(@Nullable Bundle bundle);

    void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError);

    void onAppOpenAdLoaded();

    void onAppOpenAdLoaded(@Nullable Bundle bundle);
}
