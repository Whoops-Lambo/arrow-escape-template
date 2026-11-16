package com.adsurge.adn.p053r;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.adsurge.adn.Y0.d;
import com.adsurge.adn.u1.c;
import com.adsurge.adn.w1.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a extends FrameLayout {
    public PointF a;
    public PointF b;
    public InterfaceC0134a c;

    /* JADX INFO: renamed from: com.adsurge.adn.r.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface InterfaceC0134a {
        void c();

        void e();
    }

    public PointF getCurrentPoint() {
        return this.b;
    }

    public PointF getDownPoint() {
        return this.a;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        InterfaceC0134a interfaceC0134a = this.c;
        if (interfaceC0134a == null) {
            return;
        }
        if (i == 0) {
            interfaceC0134a.c();
        } else {
            interfaceC0134a.e();
        }
    }

    public void setVisibilityChangedListener(InterfaceC0134a interfaceC0134a) {
        this.c = interfaceC0134a;
    }

    public a(Context context) {
        super(context);
    }

    public final void a(MotionEvent motionEvent, Throwable th) {
        c cVarC;
        com.adsurge.adn.Y0.c cVar;
        int actionMasked;
        int pointerCount;
        String stackTraceString;
        try {
            com.adsurge.adn.p010c.a aVarD = com.adsurge.adn.p007b.a.d().d(this);
            if (aVarD != null) {
                cVarC = aVarD.c();
            } else {
                cVarC = null;
            }
            if (cVarC != null) {
                cVar = com.adsurge.adn.Y0.c.a(cVarC);
            } else {
                cVar = new com.adsurge.adn.Y0.c();
            }
            d dVarA = new d().a("view_class", getClass().getName());
            if (motionEvent != null) {
                actionMasked = motionEvent.getActionMasked();
            } else {
                actionMasked = -1;
            }
            d dVarA2 = dVarA.a("action_masked", Integer.valueOf(actionMasked));
            if (motionEvent != null) {
                pointerCount = motionEvent.getPointerCount();
            } else {
                pointerCount = 0;
            }
            d dVarA3 = dVarA2.a("pointer_count", Integer.valueOf(pointerCount)).a("child_count", Integer.valueOf(getChildCount())).a("attached", Boolean.valueOf(isAttachedToWindow())).a("win_visibility", Integer.valueOf(getWindowVisibility())).a("visibility", Integer.valueOf(getVisibility()));
            if (th != null) {
                stackTraceString = Log.getStackTraceString(th);
            } else {
                stackTraceString = "";
            }
            b.a(6001600, cVar, (Integer) null, (Integer) null, dVarA3.a("exp_msg", stackTraceString));
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a = new PointF(motionEvent.getX(), motionEvent.getY());
            a(motionEvent);
        } else if (action == 1) {
            a(motionEvent);
        } else if (action == 3) {
            this.a = null;
            this.b = null;
        } else {
            PointF pointF = this.b;
            if (pointF == null) {
                this.b = new PointF(motionEvent.getX(), motionEvent.getY());
            } else {
                pointF.set(motionEvent.getX(), motionEvent.getY());
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            a(motionEvent, th);
            return false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void a(MotionEvent motionEvent) {
        com.adsurge.adn.p010c.a aVarD = com.adsurge.adn.p007b.a.d().d(this);
        if (aVarD != null) {
            aVarD.a(motionEvent);
        }
    }
}
