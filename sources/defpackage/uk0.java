package defpackage;

import com.unity3d.player.C5281u0;
import com.unity3d.player.ISoftInputListener;
import com.unity3d.player.P0;
import com.unity3d.player.RunnableC5283v0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uk0 implements jg3 {
    public C5281u0 a;
    public ISoftInputListener b;

    @Override // defpackage.jg3
    public final boolean isConsumeOutsideTouchesEnabled() {
        return false;
    }

    @Override // defpackage.jg3
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.show(str, i, z, z2, z3, z4, str2, i2, z5, z6);
        } else {
            uj2.a(6, "Soft input listener is not set, cannot setup soft input");
        }
    }

    @Override // defpackage.jg3
    public final void hide() {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener == null) {
            uj2.a(6, "Soft input listener is not set, cannot hide soft input");
            return;
        }
        iSoftInputListener.hide();
        C5281u0 c5281u0 = this.a;
        if (c5281u0 != null) {
            RunnableC5283v0 runnableC5283v0 = c5281u0.a;
            runnableC5283v0.a = true;
            if (runnableC5283v0.b) {
                runnableC5283v0.c.release();
            }
        }
    }

    @Override // defpackage.jg3
    public final void setCharacterLimit(int i) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setCharacterLimit(i);
        } else {
            uj2.a(6, "Soft input listener is not set, cannot set soft input character limit");
        }
    }

    @Override // defpackage.jg3
    public final void setHideInputField(boolean z) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setHideInputField(z);
        } else {
            uj2.a(6, "Soft input listener is not set, cannot set soft input field hidden");
        }
    }

    @Override // defpackage.jg3
    public final void setSelection(int i, int i2) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setSelection(i, i2);
        } else {
            uj2.a(6, "Soft input listener is not set, cannot set soft input selection");
        }
    }

    @Override // defpackage.jg3
    public final void setText(String str) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setText(str);
        } else {
            uj2.a(6, "Soft input listener is not set, cannot set soft input text");
        }
    }

    @Override // defpackage.jg3
    public final void a(C5281u0 c5281u0) {
        this.a = c5281u0;
    }

    @Override // defpackage.jg3
    public final void a() {
    }

    @Override // defpackage.jg3
    public final void a(P0 p0) {
    }
}
