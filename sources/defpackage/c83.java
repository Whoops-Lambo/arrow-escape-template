package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class c83 extends WebView {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c83(Context context) {
        super(context);
        this.a = 1;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                super.onTouchEvent(motionEvent);
                return false;
            case 1:
            default:
                return super.onTouchEvent(motionEvent);
            case 2:
                super.onTouchEvent(motionEvent);
                return false;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z) {
        switch (this.a) {
            case 1:
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                    return;
                }
                break;
            default:
                super.onWindowFocusChanged(z);
                break;
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        switch (this.a) {
            case 0:
                super.performClick();
                return false;
            case 1:
            default:
                return super.performClick();
            case 2:
                super.performClick();
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c83(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.a = i;
    }
}
