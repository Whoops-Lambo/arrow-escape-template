package com.applovin.mediation.adapter.parameters;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public interface MaxAdapterParameters {
    String getAdUnitId();

    @Nullable
    String getConsentString();

    Bundle getCustomParameters();

    Map<String, Object> getLocalExtraParameters();

    Bundle getServerParameters();

    @Nullable
    Boolean hasUserConsent();

    @Nullable
    @Deprecated
    Boolean isAgeRestrictedUser();

    @Nullable
    Boolean isDoNotSell();

    boolean isTesting();
}
