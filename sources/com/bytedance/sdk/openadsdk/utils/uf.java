package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import defpackage.ra3;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uf implements com.bytedance.sdk.component.noq.dg {
    private final WeakReference<ImageView> kgy;

    @Override // com.bytedance.sdk.component.noq.dg
    public void kgy(com.bytedance.sdk.component.noq.nu nuVar) {
        ImageView imageView = this.kgy.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objAhm = nuVar.ahm();
            if (objAhm instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objAhm);
                return;
            }
            if (!(objAhm instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && ra3.B((Drawable) objAhm)) {
                ra3.h((Drawable) objAhm).start();
            }
            imageView.setImageDrawable((Drawable) objAhm);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5kFqSRI", "aO8rkCqxaMCFZthciDKhJFfsLJYI", "VOAegAC/bNST", 45);
            imageView.setVisibility(8);
        }
    }

    public uf(ImageView imageView) {
        this.kgy = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.noq.dg
    public void kgy(int i, String str, @Nullable Throwable th) {
        ImageView imageView = this.kgy.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
