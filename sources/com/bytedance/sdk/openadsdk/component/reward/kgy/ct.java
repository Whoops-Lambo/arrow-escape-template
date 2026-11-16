package com.bytedance.sdk.openadsdk.component.reward.kgy;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ct {
    private final ioy ahm;
    private final Activity ct;
    com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz kgy;
    private boolean noq;
    private final String rz;
    private final Context uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface kgy {
        void kgy(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> sparseArray, int i, int i2, int i3);

        void kgy(String str, JSONObject jSONObject);
    }

    private void rz() {
        if (this.ahm.any() == 4) {
            this.kgy = com.bytedance.sdk.openadsdk.gm.kgy.kgy.uq.kgy(this.uq, this.rz);
        }
        if (this.kgy == null) {
            this.kgy = com.bytedance.sdk.openadsdk.gm.kgy.kgy.uq.kgy(this.ct, this.rz);
        }
    }

    public com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz ahm() {
        return this.kgy;
    }

    public void kgy(View view, float f, float f2, float f3, float f4, SparseArray<com.bytedance.sdk.openadsdk.core.ahm.rz.kgy> sparseArray, int i, int i2, int i3, kgy kgyVar) {
        if (this.kgy == null) {
            kgyVar.kgy(view, f, f2, f3, f4, sparseArray, i, i2, i3);
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.xh.yo) {
            kgyVar.kgy("click_play_star_level", null);
            return;
        }
        if (id == com.bytedance.sdk.openadsdk.utils.xh.noq) {
            kgyVar.kgy("click_play_star_nums", null);
        } else if (id == com.bytedance.sdk.openadsdk.utils.xh.ct) {
            kgyVar.kgy("click_play_source", null);
        } else if (id == com.bytedance.sdk.openadsdk.utils.xh.uq) {
            kgyVar.kgy("click_play_logo", null);
        }
    }

    public ct(ioy ioyVar, String str, Context context, Activity activity) {
        this.ahm = ioyVar;
        this.rz = str;
        this.uq = context;
        this.ct = activity;
    }

    public void kgy() {
        if (this.noq) {
            return;
        }
        this.noq = true;
        rz();
    }
}
