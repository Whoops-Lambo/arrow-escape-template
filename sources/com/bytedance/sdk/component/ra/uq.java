package com.bytedance.sdk.component.ra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.sx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class uq extends rz {
    private final int ahm;
    private final fi ct;
    private float fi;
    private float gf;
    private final View.OnTouchListener kgy;
    private View.OnTouchListener noq;
    private String ra;
    private final long rz;
    private final Context uq;
    private long yo = -1;

    private void kgy(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i);
            jSONObject2.put("click_x", f);
            jSONObject2.put("click_y", f2);
            jSONObject.put("lp_click_type", this.ahm);
            jSONObject.put("lp_click_interval", this.rz);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "d/4OmQq/Yu6OXtJPmhCsHFT7Lp0vtXrThUTSTw==", "SOsjkS+sSsuJSdx0ggWlOljrPYEmqmzJlA==", 109);
            sx.kgy("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.ra.kgy.kgy.kgy().ahm() != null) {
            com.bytedance.sdk.component.ra.kgy.ahm ahmVarAhm = com.bytedance.sdk.component.ra.kgy.kgy.kgy().ahm();
            fi fiVar = this.ct;
            ahmVarAhm.kgy(fiVar != null ? fiVar.getMaterialMeta() : null, this.ra, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public uq(Context context, View.OnTouchListener onTouchListener, int i, long j, fi fiVar) {
        this.uq = context;
        this.kgy = onTouchListener;
        this.ahm = i;
        this.rz = j;
        this.ct = fiVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        uq uqVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                uqVar = this;
            } else {
                uqVar = this;
                if (uqVar.kgy(x, y, this.fi, this.gf, this.uq)) {
                    if (uqVar.kgy(SystemClock.elapsedRealtime())) {
                        motionEvent.setAction(3);
                        uqVar.kgy(1, x, y);
                    } else {
                        uqVar.kgy(0, x, y);
                    }
                }
            }
        } else {
            uqVar = this;
            uqVar.fi = x;
            uqVar.gf = y;
        }
        View.OnTouchListener onTouchListener = uqVar.kgy;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = uqVar.noq;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private boolean kgy(long j) {
        long j2 = this.yo;
        if (j2 == -1) {
            this.yo = j;
            return false;
        }
        int i = this.ahm;
        if (i == 1) {
            if (j - j2 <= this.rz) {
                return true;
            }
            this.yo = j;
            return false;
        }
        if (i == 2) {
            if (j - j2 <= this.rz) {
                this.yo = j;
                return true;
            }
            this.yo = j;
        }
        return false;
    }

    public void kgy(String str) {
        this.ra = str;
    }

    @Override // com.bytedance.sdk.component.ra.rz
    public void kgy(View.OnTouchListener onTouchListener) {
        this.noq = onTouchListener;
    }
}
