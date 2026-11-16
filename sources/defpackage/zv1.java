package defpackage;

import android.content.DialogInterface;
import com.applovin.impl.adview.a;
import com.applovin.impl.l;
import com.usercentrics.sdk.PredefinedUIAlertDialogFactory;
import com.vungle.ads.internal.presenter.w;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zv1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zv1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PredefinedUIAlertDialogFactory.create$lambda$1$lambda$0((sr0) obj, dialogInterface);
                break;
            case 1:
                ((a) obj).a(dialogInterface);
                break;
            case 2:
                ((l) obj).a(dialogInterface);
                break;
            default:
                w.a((w) obj, dialogInterface);
                break;
        }
    }
}
