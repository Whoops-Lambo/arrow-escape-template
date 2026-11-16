package com.bytedance.sdk.openadsdk.um.rz;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.gm;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class kgy {
    private final SharedPreferences kgy;

    public void ahm(long j) {
        SharedPreferences.Editor editorEdit = this.kgy.edit();
        editorEdit.putLong("last_high_upload_time", j);
        editorEdit.apply();
    }

    public void kgy(long j) {
        SharedPreferences.Editor editorEdit = this.kgy.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }

    public kgy(Context context) {
        if (gm.kgy(context)) {
            this.kgy = context.getSharedPreferences("pag_monitor_record", 0);
            return;
        }
        this.kgy = context.getSharedPreferences("pag_monitor_record_" + gm.rz(context), 0);
    }

    public long ahm() {
        return this.kgy.getLong("last_high_upload_time", 0L);
    }

    public long kgy() {
        return this.kgy.getLong("last_upload_time", 0L);
    }
}
