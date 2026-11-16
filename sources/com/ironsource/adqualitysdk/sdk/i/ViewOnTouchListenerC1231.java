package com.ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ﯧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1231 extends AbstractC1224 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static final String f3738 = StringFog.decrypt("QTCHxGdAb+FnLafOfEZ16Ws9vNlzV2jf\n", "Dl7TqxIjB60=\n");

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final InterfaceC1235 f3739;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            this.f3739.mo458(this, view, motionEvent);
        } catch (Throwable th) {
            AbstractC1290.m905(f3738, StringFog.decrypt("C6ddoThI+HduuHusBgHibSu7SrxqB/9NIaBMpg==\n", "TtUvzkpokRk=\n"), th, false);
        }
        Object obj = this.f3723;
        if (obj != null) {
            return ((View.OnTouchListener) obj).onTouch(view, motionEvent);
        }
        return false;
    }

    public ViewOnTouchListenerC1231(View.OnTouchListener onTouchListener, InterfaceC1235 interfaceC1235) {
        super(onTouchListener);
        this.f3739 = interfaceC1235;
    }
}
