package com.bytedance.sdk.openadsdk.uq.kgy;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class ct implements com.bytedance.sdk.component.yo.kgy.kgy.ct {
    public static final ct kgy = new ct();
    private volatile SQLiteDatabase ahm;

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.ct
    public String noq() {
        return null;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.ct
    public String rz() {
        return null;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.ct
    public String ahm() {
        return "adevent";
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.ct
    public String ct() {
        return "logstatsbatch";
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.ct
    public SQLiteDatabase kgy(Context context) {
        if (this.ahm == null) {
            synchronized (this) {
                try {
                    if (this.ahm == null) {
                        this.ahm = com.bytedance.sdk.openadsdk.core.noq.ahm.kgy(context).noq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.ahm;
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.ct
    public String uq() {
        return "logstats";
    }

    @Override // com.bytedance.sdk.component.yo.kgy.kgy.ct
    public String kgy() {
        return "loghighpriority";
    }
}
