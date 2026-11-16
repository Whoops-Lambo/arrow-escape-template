package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.ecffri.arrows.R;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fu1 extends yg0 {
    public final int e;
    public EditText f;
    public final a7 g;

    @Override // defpackage.yg0
    public final boolean j() {
        return true;
    }

    @Override // defpackage.yg0
    public final int d() {
        return this.e;
    }

    @Override // defpackage.yg0
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.yg0
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.yg0
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.yg0
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.yg0
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public fu1(xg0 xg0Var, int i) {
        super(xg0Var);
        this.e = R.drawable.design_password_eye;
        this.g = new a7(this, 20);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.yg0
    public final void b() {
        p();
    }

    @Override // defpackage.yg0
    public final int c() {
        return R.string.password_toggle_content_description;
    }
}
