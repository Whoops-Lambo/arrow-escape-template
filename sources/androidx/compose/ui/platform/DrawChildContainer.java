package androidx.compose.ui.platform;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import com.ecffri.arrows.R;
import defpackage.d;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "", "getChildCount", "()I", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class DrawChildContainer extends ViewGroup {
    public boolean a;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.a) {
            return super.getChildCount();
        }
        return 0;
    }

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(Canvas canvas, ViewLayer viewLayer, long j) {
        canvas.getClass();
        android.graphics.Canvas canvas2 = AndroidCanvas_androidKt.a;
        super.drawChild(((AndroidCanvas) canvas).a, viewLayer, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        canvas.getClass();
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                if (((ViewLayer) childAt).isInvalidated) {
                    this.a = true;
                    try {
                        super.dispatchDraw(canvas);
                        return;
                    } finally {
                        this.a = false;
                    }
                }
            } else {
                d.w("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                return;
            }
        }
    }
}
