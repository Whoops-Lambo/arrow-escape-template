package com.bytedance.adsdk.ugeno.core.ahm;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class kgy {
    public String kgy = "GesThrough_";
    private List<MotionEvent> ahm = new ArrayList();
    private Set<String> rz = Collections.synchronizedSet(new HashSet());

    public void kgy(View view) {
        if (this.ahm.isEmpty() || this.rz == null) {
            Log.d(this.kgy, "motionEvents is empty or mockUniqueId is null");
            return;
        }
        if (view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        Log.d(this.kgy, "Re-dispatch motionEvents.size(): " + this.ahm.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.ahm.kgy.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : kgy.this.ahm) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        kgy.this.rz.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                kgy.this.kgy();
            }
        }, 300L);
    }

    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent) {
        if (rzVar == null || motionEvent == null || this.ahm == null) {
            return;
        }
        kgy(rzVar.nu(), rzVar.uxe(), motionEvent);
    }

    public void kgy(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.ahm == null) {
            return;
        }
        this.kgy = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (motionEvent.getAction() == 0) {
            kgy();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i, i2);
        this.ahm.add(motionEventObtain);
    }

    public boolean kgy(MotionEvent motionEvent) {
        if (motionEvent == null || this.rz == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.rz.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar) {
        if (!this.ahm.isEmpty() && this.rz != null) {
            if (rzVar == null || rzVar.nu() == null || rzVar.nu().getRootView() == null) {
                return;
            }
            kgy(rzVar.nu());
            return;
        }
        Log.d(this.kgy, "motionEvents is empty or mockUniqueId is null");
    }

    public void kgy() {
        Log.d(this.kgy, "clear all recorded motionEvents");
        List<MotionEvent> list = this.ahm;
        if (list != null) {
            list.clear();
        }
    }
}
