package defpackage;

import android.content.Context;
import androidx.appcompat.content.res.AppCompatResources;
import com.ecffri.arrows.R;
import com.usercentrics.sdk.ui.components.UCImageView;
import com.usercentrics.sdk.ui.components.UCTextView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class pu2 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ qu2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pu2(qu2 qu2Var, int i) {
        super(0);
        this.i = i;
        this.j = qu2Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        qu2 qu2Var = this.j;
        switch (i) {
            case 0:
                Context context = qu2Var.getContext();
                context.getClass();
                return AppCompatResources.a(context, R.drawable.uc_ic_check_circle_outline);
            case 1:
                Context context2 = qu2Var.getContext();
                context2.getClass();
                return AppCompatResources.a(context2, R.drawable.uc_ic_copy);
            case 2:
                return (UCImageView) qu2Var.findViewById(R.id.ucControllerIdCopy);
            case 3:
                return (UCTextView) qu2Var.findViewById(R.id.ucControllerIdLabel);
            default:
                return (UCTextView) qu2Var.findViewById(R.id.ucControllerIdValue);
        }
    }
}
