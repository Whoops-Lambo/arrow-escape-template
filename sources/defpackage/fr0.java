package defpackage;

import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class fr0 implements gs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fr0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gs0
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((FragmentedMp4Extractor) obj2).modifyTrack((Track) obj);
            default:
                return ((com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor) obj2).modifyTrack((com.google.android.exoplayer2.extractor.mp4.Track) obj);
        }
    }
}
