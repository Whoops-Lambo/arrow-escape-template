package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.safedk.android.utils.Logger;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class zan extends zao {
    final /* synthetic */ Intent zaa;
    final /* synthetic */ LifecycleFragment zab;

    public static void safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(LifecycleFragment p0, Intent p1, int p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Lcom/google/android/gms/common/api/internal/LifecycleFragment;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p1 == null) {
            return;
        }
        p0.startActivityForResult(p1, p2);
    }

    public zan(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.zaa = intent;
        this.zab = lifecycleFragment;
    }

    @Override // com.google.android.gms.common.internal.zao
    public final void zaa() {
        Intent intent = this.zaa;
        if (intent != null) {
            safedk_LifecycleFragment_startActivityForResult_7c538ba54b141748a728237c5bc5be87(this.zab, intent, 2);
        }
    }
}
