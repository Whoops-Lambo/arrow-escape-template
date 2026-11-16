package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.http.HttpEngine;
import android.net.http.NetworkException;
import android.net.http.UrlResponseInfo;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class mb0 {
    public static /* bridge */ /* synthetic */ MeasurementManager e(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ HttpEngine g(Object obj) {
        return (HttpEngine) obj;
    }

    public static /* bridge */ /* synthetic */ NetworkException h(Object obj) {
        return (NetworkException) obj;
    }

    public static /* bridge */ /* synthetic */ UrlResponseInfo m(Object obj) {
        return (UrlResponseInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof NetworkException;
    }
}
