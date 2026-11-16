package com.facebook.ads.internal.dynamicloading;

import android.app.Activity;
import android.app.Service;
import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.internal.api.AudienceNetworkExportedActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.proguard.annotations.DoNotStripAny;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@DoNotStripAny
@UiThread
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface RemoteRenderingApi {
    AudienceNetworkExportedActivityApi createAudienceNetworkExportedActivityApi(Activity activity);

    AudienceNetworkRemoteServiceApi createAudienceNetworkRemoteService(Service service);
}
