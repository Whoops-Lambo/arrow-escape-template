package io.p071bidmachine.rendering.internal.view.privacy;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.ecffri.arrows.R;
import defpackage.rc1;
import defpackage.sr0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i) {
        super(0);
        this.i = i;
        this.j = fVar;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        f fVar = this.j;
        switch (i) {
            case 0:
                return (LinearLayout) fVar.findViewById(R.id.bmPrivacySheetActionButtonsContainer);
            case 1:
                return fVar.findViewById(R.id.bmPrivacySheetClose);
            case 2:
                return (LinearLayout) fVar.findViewById(R.id.bmPrivacySheetFooterContainer);
            case 3:
                return (TextView) fVar.findViewById(R.id.bmPrivacySheetFooterText);
            case 4:
                return (TextView) fVar.findViewById(R.id.bmPrivacySheetFooterTitle);
            case 5:
                return (TextView) fVar.findViewById(R.id.bmPrivacySheetSubtitle);
            default:
                return (TextView) fVar.findViewById(R.id.bmPrivacySheetTitle);
        }
    }
}
