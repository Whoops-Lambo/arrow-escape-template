package com.bytedance.sdk.openadsdk.um;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.gf.kgy.noq;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public interface ahm {
    boolean allowHighUploadReport();

    Context getContext();

    noq getHandler();

    int getHighUploadIntervalTime();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.um.ahm.kgy> list);

    boolean useNewDb();
}
