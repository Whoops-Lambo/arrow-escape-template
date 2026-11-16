package com.bytedance.adsdk.ugeno.ct.uq;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class twf extends rz implements com.bytedance.adsdk.ugeno.fi.gf.kgy {
    private boolean at;
    private int nu;
    private Handler twf;

    public twf(Context context) {
        super(context);
        this.nu = 500;
        this.twf = new com.bytedance.adsdk.ugeno.fi.gf(Looper.getMainLooper(), this);
    }

    private boolean kgy(com.bytedance.adsdk.ugeno.ahm.rz rzVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.ugeno.ct.at atVar;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    Handler handler = this.twf;
                    if (handler != null) {
                        handler.removeMessages(1102);
                    }
                    this.at = false;
                }
            } else {
                if (this.at && (atVar = this.kgy) != null) {
                    atVar.kgy(this.ahm, this.noq, this.rz.ahm(), this.rz);
                    this.at = false;
                    Handler handler2 = this.twf;
                    if (handler2 != null) {
                        handler2.removeMessages(1102);
                    }
                    return true;
                }
                Handler handler3 = this.twf;
                if (handler3 != null) {
                    handler3.removeMessages(1102);
                }
                this.at = false;
                return false;
            }
        } else {
            this.twf.sendEmptyMessageDelayed(1102, this.nu);
        }
        return true;
    }

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

    @Override // com.bytedance.adsdk.ugeno.fi.gf.kgy
    public void kgy(Message message) {
        if (message.what != 1102) {
            return;
        }
        this.at = true;
        Handler handler = this.twf;
        if (handler != null) {
            handler.removeMessages(1102);
        }
    }
}
