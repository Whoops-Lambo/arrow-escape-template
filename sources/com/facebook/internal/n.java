package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.p003activity.result.contract.ActivityResultContract;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class n extends ActivityResultContract {
    @Override // androidx.p003activity.result.contract.ActivityResultContract
    public final Intent a(Context context, Object obj) {
        Intent intent = (Intent) obj;
        intent.getClass();
        return intent;
    }

    @Override // androidx.p003activity.result.contract.ActivityResultContract
    public final Object c(int i, Intent intent) {
        Pair pairCreate = Pair.create(Integer.valueOf(i), intent);
        pairCreate.getClass();
        return pairCreate;
    }
}
