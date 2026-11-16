package defpackage;

import com.ecffri.arrows.R;
import com.usercentrics.sdk.ui.components.UCButton;
import com.usercentrics.sdk.ui.components.UCTextView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class yu2 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ zu2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yu2(zu2 zu2Var, int i) {
        super(0);
        this.i = i;
        this.j = zu2Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        zu2 zu2Var = this.j;
        switch (i) {
            case 0:
                return (UCButton) zu2Var.findViewById(R.id.ucExemptActionButton);
            case 1:
                return (UCTextView) zu2Var.findViewById(R.id.ucExemptActionDescription);
            default:
                return (UCTextView) zu2Var.findViewById(R.id.ucExemptActionTitle);
        }
    }
}
