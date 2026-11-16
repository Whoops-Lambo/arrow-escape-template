package defpackage;

import android.app.ApplicationExitInfo;
import android.media.MediaParser;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class ea0 {
    public static /* bridge */ /* synthetic */ ApplicationExitInfo c(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ MediaParser.SeekPoint e(Object obj) {
        return (MediaParser.SeekPoint) obj;
    }

    public static /* bridge */ /* synthetic */ MediaRouter2 j(Object obj) {
        return (MediaRouter2) obj;
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder k(y32 y32Var) {
        return new RouteDiscoveryPreference.Builder(y32Var, false);
    }

    public static /* synthetic */ void q() {
    }
}
