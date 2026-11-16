package defpackage;

import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.signals.UpdateSignalsRequest;
import android.app.ApplicationStartInfo;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class pz1 {
    public static /* synthetic */ ReportEventRequest.Builder d() {
        return new ReportEventRequest.Builder(0L, (String) null, (String) null, 0);
    }

    public static /* synthetic */ ReportImpressionRequest g() {
        return new ReportImpressionRequest(0L);
    }

    public static /* synthetic */ UpdateSignalsRequest.Builder h() {
        return new UpdateSignalsRequest.Builder((Uri) null);
    }

    public static /* bridge */ /* synthetic */ ApplicationStartInfo j(Object obj) {
        return (ApplicationStartInfo) obj;
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void x() {
    }
}
