package com.google.android.play.core.hsdp.service;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class HsdpLoadingPanelContainer extends FrameLayout {
    public Runnable a;

    public void setOnConfigurationChangedListener(@NonNull Runnable runnable) {
        this.a = runnable;
    }

    public HsdpLoadingPanelContainer(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
            post(this.a);
        }
    }
}
