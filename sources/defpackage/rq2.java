package defpackage;

import android.content.DialogInterface;
import android.net.Uri;
import com.applovin.impl.v0;
import com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder;
import com.google.android.exoplayer2.ui.TrackSelectionView;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rq2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rq2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ((TrackSelectionDialogBuilder) obj2).lambda$setUpDialogView$1((TrackSelectionView) obj, dialogInterface, i);
                break;
            default:
                ((v0) obj2).a((Uri) obj, dialogInterface, i);
                break;
        }
    }
}
