package defpackage;

import android.view.View;
import com.ecffri.arrows.R;
import com.usercentrics.sdk.ui.components.UCTextView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class iy extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ View j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iy(View view, int i) {
        super(0);
        this.i = i;
        this.j = view;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        int i = this.i;
        View view = this.j;
        switch (i) {
            case 0:
                return (UCTextView) view.findViewById(R.id.ucCardContent);
            case 1:
                return (UCTextView) view.findViewById(R.id.ucCookieCardTitle);
            case 2:
                return view.findViewById(R.id.ucCookieCardTitleDivider);
            case 3:
                return "Start tracking - " + view;
            case 4:
                return "Stop tracking - " + view;
            case 5:
                return "Start tracking - " + view;
            case 6:
                return "Stop tracking - " + view;
            case 7:
                return "Check failed: view visibility (false), must be true - " + view;
            case 8:
                return "Check failed: view window focus (false), must be true - " + view;
            case 9:
                return "Check failed: view is completely clipped - " + view;
            case 10:
                return "Check failed: content or root layout not found - " + view;
            case 11:
                return "Check failed: view is out of current window - " + view;
            case 12:
                return "Start tracking - " + view;
            default:
                return "Stop tracking - " + view;
        }
    }
}
