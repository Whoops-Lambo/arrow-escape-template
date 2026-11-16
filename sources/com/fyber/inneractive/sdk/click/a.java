package com.fyber.inneractive.sdk.click;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public abstract b a(Context context, Uri uri, List list);

    public abstract void a();

    public abstract boolean a(Uri uri, r rVar);

    public static q a(Uri uri, q qVar) {
        if (uri != null) {
            String host = uri.getHost();
            String scheme = uri.getScheme();
            if ("market".equalsIgnoreCase(scheme) || ((com.safedk.android.analytics.brandsafety.creatives.g.e.equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) && ("play.google.com".equalsIgnoreCase(host) || "market.android.com".equalsIgnoreCase(host)))) {
                return q.OPEN_GOOGLE_STORE;
            }
        }
        return qVar;
    }
}
