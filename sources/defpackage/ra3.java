package defpackage;

import android.graphics.Typeface;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import android.text.style.TypefaceSpan;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class ra3 {
    public static /* bridge */ /* synthetic */ AnimatedImageDrawable A(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ boolean B(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable h(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable i(Object obj) {
        return (AnimatedImageDrawable) obj;
    }

    public static /* synthetic */ SessionConfiguration l(List list, bf3 bf3Var, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(0, list, bf3Var, stateCallback);
    }

    public static /* synthetic */ TypefaceSpan m(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ boolean u(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }
}
