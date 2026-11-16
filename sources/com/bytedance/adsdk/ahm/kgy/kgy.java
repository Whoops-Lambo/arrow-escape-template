package com.bytedance.adsdk.ahm.kgy;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.ahm.noq.ct;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy extends Paint {
    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(ct.kgy(i, 0, 255));
        } else {
            setColor((ct.kgy(i, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public kgy(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public kgy(int i) {
        super(i);
    }

    public kgy() {
    }

    public kgy(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
