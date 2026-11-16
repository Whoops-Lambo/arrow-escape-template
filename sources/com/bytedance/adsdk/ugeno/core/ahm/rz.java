package com.bytedance.adsdk.ugeno.core.ahm;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.twf;
import com.bytedance.adsdk.ugeno.core.vs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class rz {
    private float ahm;
    private boolean ct;
    private float kgy;
    private final int noq;
    private twf rz;
    private Context uq;

    public rz(Context context, twf twfVar) {
        this.uq = context;
        this.rz = twfVar;
        this.noq = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean kgy(vs vsVar, com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.ct = false;
                    }
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (Math.abs(x - this.kgy) >= this.noq || Math.abs(y - this.ahm) >= this.noq) {
                        this.ct = true;
                    }
                }
            } else {
                if (this.ct) {
                    this.ct = false;
                    return false;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (Math.abs(x2 - this.kgy) < this.noq && Math.abs(y2 - this.ahm) < this.noq) {
                    if (vsVar != null) {
                        vsVar.kgy(this.rz, rzVar, rzVar);
                        return true;
                    }
                } else {
                    this.ct = false;
                }
            }
        } else {
            this.kgy = motionEvent.getX();
            this.ahm = motionEvent.getY();
        }
        return true;
    }
}
