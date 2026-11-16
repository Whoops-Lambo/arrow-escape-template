package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ecffri.arrows.R;
import com.usercentrics.sdk.PurposeListStyle;
import com.usercentrics.sdk.ui.components.UCButton;
import com.usercentrics.sdk.ui.components.UCTextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zu2 extends ConstraintLayout {

    @NotNull
    public static final xu2 Companion = new xu2();
    public final cm2 s;
    public final cm2 t;
    public final cm2 u;
    public boolean v;

    public zu2(Context context) {
        super(context, null, 0);
        this.s = new cm2(new yu2(this, 2));
        this.t = new cm2(new yu2(this, 1));
        this.u = new cm2(new yu2(this, 0));
        LayoutInflater.from(context).inflate(R.layout.uc_exempt_action, this);
    }

    private final UCButton getUcExemptActionButton() {
        Object value = this.u.getValue();
        value.getClass();
        return (UCButton) value;
    }

    private final UCTextView getUcExemptActionDescription() {
        Object value = this.t.getValue();
        value.getClass();
        return (UCTextView) value;
    }

    private final UCTextView getUcExemptActionTitle() {
        Object value = this.s.getValue();
        value.getClass();
        return (UCTextView) value;
    }

    public final void k(av2 av2Var) {
        getUcExemptActionTitle().setText("Allow exempted services");
        getUcExemptActionDescription().setText(av2Var.a);
        this.v = av2Var.b;
        p();
        getUcExemptActionButton().setOnClickListener(new ol0(3, this, av2Var));
    }

    public final void m(qx2 qx2Var) {
        qx2Var.getClass();
        ju2 ju2Var = qx2Var.a;
        Context context = getContext();
        context.getClass();
        setBackground(s71.o(ju2Var, context, PurposeListStyle.b));
        UCTextView.s(getUcExemptActionTitle(), qx2Var, 12);
        UCTextView.s(getUcExemptActionDescription(), qx2Var, 14);
    }

    public final void p() {
        String str;
        UCButton ucExemptActionButton = getUcExemptActionButton();
        if (this.v) {
            str = "Opt in all";
        } else {
            str = "Opt out all";
        }
        ucExemptActionButton.setText(str);
    }
}
