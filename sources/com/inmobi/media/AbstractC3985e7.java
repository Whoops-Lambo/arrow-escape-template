package com.inmobi.media;

import android.content.res.ColorStateList;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.inmobi.media.e7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3985e7 {
    public static final void a(ProgressBar progressBar, Xh xh, float f) {
        progressBar.getClass();
        xh.getClass();
        progressBar.setProgressTintList(ColorStateList.valueOf(AbstractC3871a4.a(xh.c)));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(AbstractC3871a4.a(xh.d)));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (int) (xh.e * f));
        layoutParams.addRule(12);
        progressBar.setLayoutParams(layoutParams);
    }
}
