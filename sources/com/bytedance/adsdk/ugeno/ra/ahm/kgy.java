package com.bytedance.adsdk.ugeno.ra.ahm;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.core.twf;
import com.bytedance.adsdk.ugeno.ct;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy extends FrameLayout {
    private Map<Integer, twf> ahm;
    private ct kgy;

    public void kgy(ct ctVar) {
        this.kgy = ctVar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Map<Integer, twf> map = this.ahm;
        if (map == null || !map.containsKey(4)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.noq();
        }
        super.onLayout(z, i, i2, i3, i4);
        ct ctVar2 = this.kgy;
        if (ctVar2 != null) {
            ctVar2.kgy(i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        ct ctVar = this.kgy;
        if (ctVar != null) {
            int[] iArrKgy = ctVar.kgy(i, i2);
            super.onMeasure(iArrKgy[0], iArrKgy[1]);
        } else {
            super.onMeasure(i, i2);
        }
        ct ctVar2 = this.kgy;
        if (ctVar2 != null) {
            ctVar2.ct();
        }
    }

    public void setEventMap(Map<Integer, twf> map) {
        this.ahm = map;
    }

    public kgy(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.yo();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.fi();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.ahm(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ct ctVar = this.kgy;
        if (ctVar != null) {
            ctVar.kgy(z);
        }
    }
}
