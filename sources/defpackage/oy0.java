package defpackage;

import android.adservices.common.AdData;
import android.adservices.customaudience.TrustedBiddingData;
import android.adservices.measurement.MeasurementManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class oy0 {
    public static /* synthetic */ AdData.Builder a() {
        return new AdData.Builder();
    }

    public static /* synthetic */ TrustedBiddingData.Builder j() {
        return new TrustedBiddingData.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager o(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class s() {
        return MeasurementManager.class;
    }
}
