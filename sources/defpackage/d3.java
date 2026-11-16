package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ironsource.C4699d3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ d3(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        View view = this.b;
        switch (i) {
            case 0:
                Rect rect = new Rect();
                view.getHitRect(rect);
                Context context = view.getContext();
                context.getClass();
                float fApplyDimension = TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
                int i3 = rect.bottom;
                int i4 = rect.top;
                float f = i3 - i4;
                if (fApplyDimension > f) {
                    int i5 = ((int) ((fApplyDimension - f) / 2.0f)) + 1;
                    rect.top = i4 - i5;
                    rect.bottom = i3 + i5;
                }
                int i6 = rect.right;
                int i7 = rect.left;
                float f2 = i6 - i7;
                if (fApplyDimension > f2) {
                    int i8 = ((int) ((fApplyDimension - f2) / 2.0f)) + 1;
                    rect.left = i7 - i8;
                    rect.right = i6 + i8;
                }
                Object parent = view.getParent();
                View view2 = parent instanceof View ? (View) parent : null;
                if (view2 != null) {
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }
                break;
            case 1:
                h00.c(4, view);
                break;
            case 2:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 3:
                view.post(new d3(view, i2));
                break;
            case 4:
                yt2.setCardClickable$lambda$6$lambda$5(view);
                break;
            case 5:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            default:
                C4699d3.a.a(view);
                break;
        }
    }
}
