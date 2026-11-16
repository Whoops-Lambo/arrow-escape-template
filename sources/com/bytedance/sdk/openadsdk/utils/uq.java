package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class uq {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy implements View.OnLayoutChangeListener {
        private int ahm;
        private final Drawable kgy;
        private int rz;

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.ahm && i10 == this.rz) {
                return;
            }
            this.ahm = i9;
            this.rz = i10;
            this.kgy.setBounds(0, 0, i9, i10);
        }

        public kgy(Drawable drawable) {
            this.kgy = drawable;
        }
    }

    public static void kgy(Activity activity, com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (activity == null || ioyVar == null || TextUtils.isEmpty(ioyVar.vg())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i = xh.kp;
            if (decorView.getTag(i) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i, Integer.valueOf(i));
            Drawable drawableKgy = kgy(activity.getResources(), ioyVar);
            if (drawableKgy == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(drawableKgy);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euogmgGTf8KSRtZEpBSsOF78", "T/w0tAe4RtGFWNtclQ==", 116);
            com.bytedance.sdk.component.utils.sx.rz("add overlay fail", th.getMessage());
        }
    }

    public static void kgy(ViewGroup viewGroup, com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        if (viewGroup == null || ioyVar == null || TextUtils.isEmpty(ioyVar.vg())) {
            return;
        }
        try {
            int i = xh.kp;
            if (viewGroup.getTag(i) != null) {
                return;
            }
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable drawableKgy = kgy(viewGroup.getResources(), ioyVar);
            if (drawableKgy == null) {
                return;
            }
            viewGroup.setForeground(drawableKgy);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euogmgGTf8KSRtZEpBSsOF78", "T/w0tAe4RtGFWNtclQ==", 71);
            com.bytedance.sdk.component.utils.sx.rz("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    private static Drawable kgy(Resources resources, com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        try {
            String strVg = ioyVar.vg();
            if (TextUtils.isEmpty(strVg)) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strVg, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "euogmgGTf8KSRtZEpBSsOF78", "XOs5uhW5e8uBU/NPjQahKlfr", 138);
            return null;
        }
    }
}
