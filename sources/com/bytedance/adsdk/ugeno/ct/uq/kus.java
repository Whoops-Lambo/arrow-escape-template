package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import io.p071bidmachine.protobuf.EventTypeExtended;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kus extends rz implements com.bytedance.adsdk.ugeno.fi.gf.kgy {
    private Handler at;
    private int nu;

    @Override // com.bytedance.adsdk.ugeno.ct.uq.rz
    public boolean kgy(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        Object obj = this.ct.get("delay");
        if (obj == null) {
            this.nu = 500;
        } else {
            this.nu = com.bytedance.adsdk.ugeno.fi.rz.kgy(String.valueOf(obj), 500);
        }
        return kgy(this.ahm, motionEvent);
    }

    public kus(Context context) {
        super(context);
        this.nu = 500;
        this.at = new com.bytedance.adsdk.ugeno.fi.gf(Looper.getMainLooper(), this);
    }

    private boolean kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.at.sendEmptyMessageDelayed(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE, this.nu);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        this.at.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.fi.gf.kgy
    public void kgy(Message message) {
        if (message.what != 1101) {
            return;
        }
        com.bytedance.adsdk.ugeno.ct.at atVar = this.kgy;
        if (atVar != null) {
            atVar.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
        }
        Handler handler = this.at;
        if (handler != null) {
            handler.removeMessages(EventTypeExtended.EVENT_TYPE_CLICK_BY_SOURCE_VALUE);
        }
    }
}
