package defpackage;

import android.widget.LinearLayout;
import com.ecffri.arrows.R;
import com.usercentrics.sdk.ui.components.UCTextView;
import com.usercentrics.sdk.ui.components.UCToggle;
import com.usercentrics.sdk.ui.secondLayer.component.footer.UCSecondLayerFooter;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class qw2 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ UCSecondLayerFooter j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw2(UCSecondLayerFooter uCSecondLayerFooter, int i) {
        super(0);
        this.i = i;
        this.j = uCSecondLayerFooter;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        UCSecondLayerFooter uCSecondLayerFooter = this.j;
        switch (i) {
            case 0:
                return (LinearLayout) uCSecondLayerFooter.findViewById(R.id.ucFooterButtonsContainer);
            case 1:
                return uCSecondLayerFooter.findViewById(R.id.ucFooterDivider);
            case 2:
                return (UCToggle) uCSecondLayerFooter.findViewById(R.id.ucFooterSwitch);
            case 3:
                return (UCTextView) uCSecondLayerFooter.findViewById(R.id.ucFooterSwitchText);
            default:
                return (UCTextView) uCSecondLayerFooter.findViewById(R.id.ucFooterTextProvider);
        }
    }
}
