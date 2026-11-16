package com.facebook.ads.internal.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Message;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.proguard.annotations.DoNotStripAny;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@DoNotStripAny
@UiThread
@Nullsafe(Nullsafe.Mode.LOCAL)
public interface AudienceNetworkRemoteServiceApi {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @DoNotStripAny
    public interface HorizonWorldUrlLauncher {
        boolean launchUrl(Context context, Uri uri);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @DoNotStripAny
    public interface MessageHandler {
        boolean handleMessage(Message message);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Keep
    @DoNotStripAny
    public interface PackageVerifier {
        @Nullable
        String verifyPackage(Context context, Message message, @Nullable String str);
    }

    @Nullable
    IBinder onBind(Intent intent);

    void onCreate();

    void onDestroy();

    void setHorizonWorldUrlLauncher(HorizonWorldUrlLauncher horizonWorldUrlLauncher);

    void setMessageHandler(MessageHandler messageHandler);

    void setPackageVerifier(PackageVerifier packageVerifier);
}
