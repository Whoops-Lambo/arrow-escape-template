package defpackage;

import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rd0 implements TextOutput {
    @Override // com.google.android.exoplayer2.text.TextOutput
    public final void onCues(CueGroup cueGroup) {
        DownloadHelper.lambda$getRendererCapabilities$0(cueGroup);
    }
}
