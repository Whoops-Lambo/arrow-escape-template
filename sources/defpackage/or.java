package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class or extends yo2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    private final void c(int i) {
    }

    public /* synthetic */ or(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yo2
    public final void a(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                bp2 bp2Var = (bp2) this.b;
                bp2Var.e = true;
                ap2 ap2Var = (ap2) bp2Var.f.get();
                if (ap2Var != null) {
                    ap2Var.a();
                }
                break;
        }
    }

    @Override // defpackage.yo2
    public final void b(Typeface typeface, boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Chip chip = (Chip) obj;
                rr rrVar = chip.e;
                chip.setText(rrVar.D0 ? rrVar.F : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z) {
                    bp2 bp2Var = (bp2) obj;
                    bp2Var.e = true;
                    ap2 ap2Var = (ap2) bp2Var.f.get();
                    if (ap2Var != null) {
                        ap2Var.a();
                    }
                    break;
                }
                break;
        }
    }
}
