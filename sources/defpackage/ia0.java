package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ia0 implements ly1 {
    public final /* synthetic */ DefaultTrackSelector a;

    @Override // defpackage.ly1
    public final boolean apply(Object obj) {
        return this.a.isAudioFormatWithinAudioChannelCountConstraints((Format) obj);
    }

    public /* synthetic */ ia0(DefaultTrackSelector defaultTrackSelector) {
        this.a = defaultTrackSelector;
    }
}
