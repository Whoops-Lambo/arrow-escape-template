package defpackage;

import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.ad.b;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TrackInfo$Factory;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ja0 implements DefaultTrackSelector$TrackInfo$Factory, Function {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ja0(boolean z, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        return ((b) this.b).a((MotionEvent) this.c, this.a, (m5) obj);
    }

    @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector$TrackInfo$Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return ((DefaultTrackSelector) this.b).lambda$selectAudioTrack$3((DefaultTrackSelector.Parameters) this.c, this.a, i, trackGroup, iArr);
    }
}
