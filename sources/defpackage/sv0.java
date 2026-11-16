package defpackage;

import android.content.DialogInterface;
import com.unity3d.player.F;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class sv0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ F a;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }

    public sv0(F f) {
        this.a = f;
    }
}
