package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.ironsource.Z5;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"unityAdsDataStoreFile", "Ljava/io/File;", "Landroid/content/Context;", Z5.c.b, "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ContextExtensionsKt {
    @NotNull
    public static final File unityAdsDataStoreFile(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), UnityAdsConstants.Cache.DATASTORE_PATH.concat(str));
    }
}
