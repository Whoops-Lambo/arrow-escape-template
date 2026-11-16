package defpackage;

import com.usercentrics.sdk.ui.components.UCToggle;
import java.util.ArrayList;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ey1 implements wv1 {
    public static final /* synthetic */ KProperty[] d;
    public wr0 a = x4.t;
    public final ArrayList b = new ArrayList();
    public final dy1 c;

    static {
        jp1 jp1Var = new jp1(ey1.class, "currentState", "getCurrentState()Z", 0);
        p32.a.getClass();
        d = new KProperty[]{jp1Var};
    }

    public final void a(UCToggle uCToggle) {
        ArrayList arrayList = this.b;
        arrayList.getClass();
        if (!arrayList.contains(uCToggle) ? arrayList.add(uCToggle) : false) {
            if (getCurrentState() != uCToggle.getCurrentState()) {
                uCToggle.setCurrentState(getCurrentState());
            }
            uCToggle.setListener(new k4(1, this, ey1.class, "onStateChange", "onStateChange(Z)V", 0, 4));
        }
    }

    @Override // defpackage.wv1
    public final void dispose() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wv1) obj).dispose();
        }
        arrayList.clear();
        this.a = x4.s;
    }

    @Override // defpackage.wv1
    public final boolean getCurrentState() {
        return ((Boolean) this.c.getValue(this, d[0])).booleanValue();
    }

    @Override // defpackage.wv1
    public final void setCurrentState(boolean z) {
        this.c.setValue(this, d[0], Boolean.valueOf(z));
    }

    @Override // defpackage.wv1
    public final void setListener(wr0 wr0Var) {
        if (wr0Var == null) {
            wr0Var = x4.u;
        }
        this.a = wr0Var;
    }

    public ey1(boolean z) {
        this.c = new dy1(Boolean.valueOf(z), this);
    }
}
