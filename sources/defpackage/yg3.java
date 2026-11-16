package defpackage;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.kus.ahm.ct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yg3 extends SurfaceView implements SurfaceHolder.Callback, ab3 {
    public static final ArrayList c = new ArrayList();
    public WeakReference a;
    public of3 b;

    @Override // defpackage.ab3
    public View getView() {
        return this;
    }

    public void setWindowVisibilityChangedListener(ua3 ua3Var) {
    }

    @Override // defpackage.ab3
    public final void a(ct ctVar) {
        this.a = new WeakReference(ctVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            of3 of3Var = (of3) it.next();
            if (of3Var != null && ((SurfaceHolder.Callback) of3Var.a.get()) == null) {
                holder.removeCallback(of3Var);
                it.remove();
            }
        }
        holder.addCallback(this.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((ke3) this.a.get()).kgy(surfaceHolder, i, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((ke3) this.a.get()).kgy(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference weakReference = this.a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((ke3) this.a.get()).ahm(surfaceHolder);
    }

    @Override // defpackage.ab3
    public final void kgy(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }
}
