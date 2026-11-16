package com.bytedance.sdk.component.yo.kgy.kgy.kgy;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public class kgy extends ahm {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile kgy kgy;

    public static kgy kgy(Context context) {
        if (kgy == null) {
            synchronized (kgy.class) {
                try {
                    if (kgy == null) {
                        kgy = new kgy(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return kgy;
    }

    private kgy(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.kgy.ahm
    public /* bridge */ /* synthetic */ ahm.C0222ahm kgy() {
        return super.kgy();
    }
}
