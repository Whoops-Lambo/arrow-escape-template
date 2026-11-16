package defpackage;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.adservices.adselection.GetAdSelectionDataOutcome;
import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.PersistAdSelectionResultRequest;
import android.adservices.customaudience.FetchAndJoinCustomAudienceRequest;
import android.net.Uri;
import android.os.ProfilingManager;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class w3 {
    public static /* synthetic */ void A() {
        new GetAdSelectionDataRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetAdSelectionDataOutcome d(Object obj) {
        return (GetAdSelectionDataOutcome) obj;
    }

    public static /* synthetic */ PersistAdSelectionResultRequest.Builder e() {
        return new PersistAdSelectionResultRequest.Builder();
    }

    public static /* synthetic */ FetchAndJoinCustomAudienceRequest.Builder h() {
        return new FetchAndJoinCustomAudienceRequest.Builder((Uri) null);
    }

    public static /* bridge */ /* synthetic */ ProfilingManager l(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return ProfilingManager.class;
    }

    public static /* synthetic */ void n() {
        new AdSelectionFromOutcomesConfig.Builder();
    }
}
