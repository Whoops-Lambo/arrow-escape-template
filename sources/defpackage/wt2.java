package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.content.res.AppCompatResources;
import com.ecffri.arrows.R;
import com.usercentrics.sdk.ui.components.UCButton;
import com.usercentrics.sdk.ui.components.UCTextView;
import com.usercentrics.sdk.ui.components.UCToggle;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wt2 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ yt2 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wt2(yt2 yt2Var, int i) {
        super(0);
        this.i = i;
        this.j = yt2Var;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        yt2 yt2Var = this.j;
        switch (i) {
            case 0:
                return Integer.valueOf((int) yt2Var.getContext().getResources().getDimension(R.dimen.ucCardVerticalMargin));
            case 1:
                Context context = yt2Var.getContext();
                context.getClass();
                return AppCompatResources.a(context, R.drawable.uc_ic_expand);
            case 2:
                return yt2Var.findViewById(R.id.ucCardBottomSpacing);
            case 3:
                return (UCTextView) yt2Var.findViewById(R.id.ucCardDescription);
            case 4:
                return yt2Var.findViewById(R.id.ucCardDividerExpandedContent);
            case 5:
                return (UCTextView) yt2Var.findViewById(R.id.ucCardExemptLabel);
            case 6:
                return (ViewGroup) yt2Var.findViewById(R.id.ucCardExpandableContent);
            case 7:
                return yt2Var.findViewById(R.id.ucCardHeader);
            case 8:
                return (UCButton) yt2Var.findViewById(R.id.ucCardIcon);
            case 9:
                return (UCTextView) yt2Var.findViewById(R.id.ucCardMandatoryLabel);
            case 10:
                return (UCToggle) yt2Var.findViewById(R.id.ucCardSwitch);
            case 11:
                return (ViewGroup) yt2Var.findViewById(R.id.ucCardSwitchList);
            case 12:
                return yt2Var.findViewById(R.id.ucCardSwitchListDivider);
            default:
                return (UCTextView) yt2Var.findViewById(R.id.ucCardTitle);
        }
    }
}
