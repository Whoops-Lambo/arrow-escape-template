package androidx.privacysandbox.ads.adservices.internal;

import android.content.Context;
import android.util.Log;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/privacysandbox/ads/adservices/internal/BackCompatManager;", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackCompatManager {
    public static Object a(Context context, String str, wr0 wr0Var) {
        context.getClass();
        try {
            return wr0Var.invoke(context);
        } catch (NoClassDefFoundError unused) {
            Log.d(str, "Unable to find adservices code, check manifest for uses-library tag, versionS=" + AdServicesInfo.b());
            return null;
        }
    }
}
