package com.tiktok.appevents.edp.proxy;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyOnTouchListener implements View.OnTouchListener {
    ITouchListener listener;
    View.OnTouchListener originOnTouchListener;

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.originOnTouchListener;
        boolean zOnTouch = onTouchListener != null ? onTouchListener.onTouch(view, motionEvent) : false;
        try {
            ITouchListener iTouchListener = this.listener;
            if (iTouchListener != null) {
                iTouchListener.onTouch(view, motionEvent);
            }
        } catch (Throwable unused) {
        }
        return zOnTouch;
    }

    public ProxyOnTouchListener(ITouchListener iTouchListener, View.OnTouchListener onTouchListener) {
        this.listener = iTouchListener;
        this.originOnTouchListener = onTouchListener;
    }
}
