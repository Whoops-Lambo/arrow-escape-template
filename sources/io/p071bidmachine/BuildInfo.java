package io.p071bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.p071bidmachine.utils.lazy.a;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class BuildInfo {

    @Nullable
    private static volatile BuildInfo instance;

    @NonNull
    private final a isDebuggable;

    @Nullable
    private volatile String sha1Signature = null;

    @Nullable
    private volatile String sha256Signature = null;

    @NonNull
    public static BuildInfo obtain(@NonNull Context context) {
        BuildInfo buildInfo;
        BuildInfo buildInfo2 = instance;
        if (buildInfo2 != null) {
            return buildInfo2;
        }
        synchronized (BuildInfo.class) {
            try {
                buildInfo = instance;
                if (buildInfo == null) {
                    buildInfo = new BuildInfo(context.getApplicationContext());
                    instance = buildInfo;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return buildInfo;
    }

    @Nullable
    public String getSha1Signature(@NonNull Context context) {
        String str = this.sha1Signature;
        if (str != null) {
            return str;
        }
        String strD = t1.D(context, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        this.sha1Signature = strD;
        return strD;
    }

    @Nullable
    public String getSha256Signature(@NonNull Context context) {
        String str = this.sha256Signature;
        if (str != null) {
            return str;
        }
        String strD = t1.D(context, "SHA-256");
        this.sha256Signature = strD;
        return strD;
    }

    public boolean isDebuggable() {
        return ((Boolean) this.isDebuggable.mo1394get()).booleanValue();
    }

    private BuildInfo(@NonNull Context context) {
        this.isDebuggable = new a(new k0(context, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$new$0(Context context) {
        boolean z;
        if ((context.getApplicationInfo().flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
