package defpackage;

import android.content.Context;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class bp2 {
    public float c;
    public float d;
    public final WeakReference f;
    public xo2 g;
    public final TextPaint a = new TextPaint(1);
    public final or b = new or(this, 1);
    public boolean e = true;

    public final void a(String str) {
        TextPaint textPaint = this.a;
        float fAbs = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            fAbs = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = fAbs;
        this.e = false;
    }

    public final void b(xo2 xo2Var, Context context) {
        if (this.g != xo2Var) {
            this.g = xo2Var;
            WeakReference weakReference = this.f;
            if (xo2Var != null) {
                TextPaint textPaint = this.a;
                or orVar = this.b;
                xo2Var.f(context, textPaint, orVar);
                ap2 ap2Var = (ap2) weakReference.get();
                if (ap2Var != null) {
                    textPaint.drawableState = ap2Var.getState();
                }
                xo2Var.e(context, textPaint, orVar);
                this.e = true;
            }
            ap2 ap2Var2 = (ap2) weakReference.get();
            if (ap2Var2 != null) {
                ap2Var2.a();
                ap2Var2.onStateChange(ap2Var2.getState());
            }
        }
    }

    public bp2(ap2 ap2Var) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(ap2Var);
    }
}
