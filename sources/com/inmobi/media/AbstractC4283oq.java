package com.inmobi.media;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.inmobi.media.oq, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC4283oq {
    public static final FrameLayout a(Context context, byte[] bArr, float f) {
        context.getClass();
        bArr.getClass();
        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        bitmapDrawable.setTileModeXY(tileMode, tileMode);
        bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setBackground(bitmapDrawable);
        frameLayout.setElevation(Float.MAX_VALUE);
        frameLayout.setAlpha(f);
        frameLayout.setClickable(false);
        frameLayout.setFocusable(false);
        return frameLayout;
    }
}
