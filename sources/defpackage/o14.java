package defpackage;

import android.media.AudioManager;
import com.google.android.gms.internal.ads.e0;
import com.google.android.gms.internal.ads.zzcd;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o14 implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ zzcd a;

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        zzcd zzcdVar = this.a;
        zzcdVar.getClass();
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzcdVar.e(4);
                return;
            }
            e0 e0Var = zzcdVar.c;
            if (e0Var != null) {
                e0Var.g.zze(33, 0, 0).a();
            }
            zzcdVar.e(3);
            return;
        }
        if (i == -1) {
            e0 e0Var2 = zzcdVar.c;
            if (e0Var2 != null) {
                e0Var2.g.zze(33, -1, 0).a();
            }
            zzcdVar.d();
            zzcdVar.e(1);
            return;
        }
        if (i != 1) {
            rl3.q(new StringBuilder(String.valueOf(i).length() + 27), "Unknown focus change type: ", i, "AudioFocusManager");
            return;
        }
        zzcdVar.e(2);
        e0 e0Var3 = zzcdVar.c;
        if (e0Var3 != null) {
            e0Var3.g.zze(33, 1, 0).a();
        }
    }
}
