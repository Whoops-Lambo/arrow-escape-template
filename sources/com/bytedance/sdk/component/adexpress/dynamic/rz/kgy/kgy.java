package com.bytedance.sdk.component.adexpress.dynamic.rz.kgy;

import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class kgy implements View.OnTouchListener {
    private static int rz = 10;
    private float ahm;
    private int ct;
    private float kgy;
    private com.bytedance.sdk.component.adexpress.dynamic.rz.fi uq;
    private RectF noq = new RectF();
    private long yo = 0;
    private final int fi = 200;
    private final int gf = 3;
    private SoftReference<ViewGroup> ra = new SoftReference<>(null);

    private RectF kgy(View view) {
        if (view == null) {
            return new RectF();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
    }

    public kgy(com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar, int i, final ViewGroup viewGroup) {
        this.ct = rz;
        this.uq = fiVar;
        if (i > 0) {
            this.ct = i;
        }
        if (viewGroup != null) {
            viewGroup.post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.rz.kgy.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    kgy.this.ra = new SoftReference(viewGroup);
                }
            });
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                RectF rectF = this.noq;
                if (rectF != null && !rectF.contains(this.kgy, this.ahm)) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                float fAbs = Math.abs(rawX - this.kgy);
                float fAbs2 = Math.abs(rawY - this.ahm);
                int i = this.ct;
                if (fAbs >= i && fAbs2 >= i) {
                    com.bytedance.sdk.component.adexpress.dynamic.rz.fi fiVar2 = this.uq;
                    if (fiVar2 != null) {
                        fiVar2.kgy();
                    }
                } else if ((System.currentTimeMillis() - this.yo < 200 || (fAbs < 3.0f && fAbs2 < 3.0f)) && (fiVar = this.uq) != null) {
                    fiVar.kgy();
                }
            }
        } else {
            this.noq = kgy(this.ra.get());
            this.kgy = motionEvent.getRawX();
            this.ahm = motionEvent.getRawY();
            this.yo = System.currentTimeMillis();
        }
        return true;
    }
}
