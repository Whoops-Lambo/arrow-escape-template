package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.core.xh;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class uq {
    private static volatile String ahm = "";
    private static volatile String kgy = "";
    private static String rz;
    private static volatile int uq;

    public static String ahm() {
        if (uq != 0) {
            return kgy;
        }
        kgy();
        return kgy;
    }

    public static String rz() {
        if (uq != 0) {
            return ahm;
        }
        kgy();
        return ahm;
    }

    public static String uq() {
        if (TextUtils.isEmpty(rz)) {
            rz = xh.kgy().getPackageManager().getInstallerPackageName(ftg.noq());
        }
        if (rz == null) {
            rz = "";
        }
        return rz;
    }

    public static void kgy() {
        try {
            AppSet.getClient(xh.kgy()).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener<AppSetIdInfo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.AppSetIdAndScope$1
                @Override // com.google.android.gms.tasks.OnSuccessListener
                @Keep
                public void onSuccess(AppSetIdInfo appSetIdInfo) {
                    String unused = uq.kgy = Integer.toString(appSetIdInfo.getScope());
                    String unused2 = uq.ahm = appSetIdInfo.getId();
                    int unused3 = uq.uq = 1;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V/SiBF7VnwJM=", "ev49pgaoQMOhRNNujx6wLQ==", "XOs5vAedZ8OzSdhNiQ==", 48);
            uq = 2;
        }
    }
}
