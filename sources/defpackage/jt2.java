package defpackage;

import com.ecffri.arrows.R;
import com.usercentrics.sdk.ui.components.UCButton;
import com.usercentrics.sdk.ui.components.UCImageView;
import com.usercentrics.sdk.ui.components.UCTextView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class jt2 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ UCButton j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jt2(UCButton uCButton, int i) {
        super(0);
        this.i = i;
        this.j = uCButton;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        UCButton uCButton = this.j;
        switch (i) {
            case 0:
                return (UCImageView) uCButton.findViewById(R.id.ucButtonBackground);
            default:
                return (UCTextView) uCButton.findViewById(R.id.ucButtonText);
        }
    }
}
