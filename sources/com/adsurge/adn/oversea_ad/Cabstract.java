package com.adsurge.adn.oversea_ad;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.adsurge.adn.oversea_ad.abstract, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class Cabstract implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ Window a;
    public final /* synthetic */ Ccontinue b;
    public final /* synthetic */ String c;

    public Cabstract(Window window, Ccontinue ccontinue, String str) {
        this.a = window;
        this.b = ccontinue;
        this.c = str;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Object objB;
        Object objA;
        try {
            View decorView = this.a.getDecorView();
            decorView.getViewTreeObserver().removeOnPreDrawListener(this);
            Object objB2 = Hickory.b(View.class, "getViewRootImpl", decorView);
            if (objB2 == null || (objB = Hickory.b(objB2.getClass(), "getAccessibilityInteractionController", objB2)) == null || (objA = Hickory.a(objB.getClass(), "mHandler", objB)) == null) {
                return true;
            }
            Object objA2 = Hickory.a(Handler.class, "mCallback", objA);
            if (objA2 instanceof Celse) {
                return true;
            }
            Celse celse = new Celse((Handler.Callback) objA2, this.b, this.c);
            Field fieldA = Hickory.a(Handler.class, "mCallback");
            if (fieldA != null) {
                fieldA.set(objA, celse);
            }
        } catch (Throwable unused) {
        }
        return true;
    }
}
